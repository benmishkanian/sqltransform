 #!/bin/bash
 python ../gen-query.py $1 | java org.antlr.v4.runtime.misc.TestRig SQLite parse -tree
