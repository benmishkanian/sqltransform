import call
import subprocess
import sys
import os

seed = sys.argv[1]

call.cmd(["cp sqlite.yy ~/project/randgen/grammars/"])

with call.cd("~/project/randgen"):
	o = call.cmd(["../sqltransform/gensql.sh " + seed])
	print o[0]
	print >>sys.stderr, o[1]
