import subprocess
import sys
import call

def exit(code):
	sys.exit(code)

def appendToFile(directory, fileName, content):
	if not(content.isspace()) and content: #not empty or spaces
		with call.cd(directory):
			with open(fileName, "a") as f:
				f.write('\n' + content.strip() + '\n\n')

def errorDump(message, output):
	if not(output.isspace()) and output:
		combinedOutput = message + '\n-----\n' + output.strip()
		appendToFile("errors", seed, combinedOutput)

try:
	seed = sys.argv[1]
except IndexError:
	seed = "0"

#clean temporary logs
call.cmd(["rm original_log mutated_log"])

#generate a basic query
out = call.cmd(["python gen-query.py " + seed])
errorDump("error in query generation", out[1])
appendToFile("queries", seed, out[0])

#run sqlite on original
out = call.cmd(["sqlite3 db.sqlite < queries/" + seed])
errorDump("error in sqlite", out[1])
appendToFile(".", "original_log", out[0])

#mutate query
queryFile = "./queries/" + seed
out = call.cmd(["java antlrsqlite.Main " + queryFile])
errorDump("error in query mutating", out[1])
appendToFile("mutated", seed, out[0])

#run sqlite on mutated
out = call.cmd(["sqlite3 db.sqlite < mutated/" + seed])
errorDump("error running mutated query", out[1])
appendToFile(".", "mutated_log", out[0])

#compare
out = call.cmd(["cmp original_log mutated_log"])
errorDump("error in cmp", out[1])
appendToFile("cmp", seed, out[0])
