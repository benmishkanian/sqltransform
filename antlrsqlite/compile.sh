echo "Note: this script only works on OS X"
java -Xmx500M -cp "/Library/Java/Extensions/antlr-4.5-complete.jar:$CLASSPATH" org.antlr.v4.Tool ./SQLite.g4
javac ./SQLite*.java
