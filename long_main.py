from call import cd, cmd

#pre processing
#cmd(["./clear-all"])	#clear old logs.
#with cd("/home/calli/project/antlr4/"):
	#cmd(["./compile-fuzzer.sh"])

seed = 1962
while True:
	cmd(["python ~/project/sqltransform/main.py " + str(seed)])
	seed = seed + 1
