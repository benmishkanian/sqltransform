import sqlite3
import re
import argparse
import sys

parser = argparse.ArgumentParser()
parser.add_argument('dbfile', help="An SQLite database file")
parser.add_argument('-o', '--outfile', type=argparse.FileType('w'), default=sys.stdout,
                    help="The file to write to (defaults to stdout)", dest="outfile")
args = parser.parse_args()
conn = sqlite3.connect(args.dbfile)
c = conn.cursor()

matcher = re.compile('"(\w+)"')
# Get list of tables
c.execute("select name from sqlite_master where type = 'table';")
# For each table...
for tableTuple in c.fetchall():
    tableName = tableTuple[0]
    c.execute("select sql from sqlite_master where type = 'table' and name = ?;", tableName)
    columns = c.fetchone()[0].split('\n')
    # For each column...
    for columnDeclaration in columns:
        if 'CREATE' in columnDeclaration:
            continue
        if 'int' in columnDeclaration:
            match = matcher.search(columnDeclaration)
            assert match, "Failed to parse column name"
            # Get max value
            colName = match.group(1)
            c.execute("SELECT MAX({colNameParam}) FROM {tableNameParam};".format(colNameParam=colName,
                                                                                 tableNameParam=tableName))
            maxValue = str(c.fetchone()[0])
            # Output invariant
            print("{tableNameParam}.{colNameParam} <= {maxValueParam}".format(tableNameParam=tableName,
                                                                              colNameParam=colName,
                                                                              maxValueParam=maxValue),
                  file=args.outfile)

conn.commit()
conn.close()
