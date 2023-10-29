#!/bin/bash
#java -jar /Users/satyammittal/IdeaProjects/WcToolCodingPracticeByJohnCrickett/src/com/example/wc_tool/ccwc.jar "$@"

#!/bin/bash
# Path to your JAR
JAR_PATH="/Users/satyammittal/IdeaProjects/WcToolCodingPracticeByJohnCrickett/src/com/example/wc_tool/ccwc.jar"

# Check if an input file is provided as an argument
if [ "$#" -eq 2 ]; then
    java -jar $JAR_PATH "$@"
else
    # If no file argument, pass data from stdin to your Java application
    java -jar $JAR_PATH "$@" < /dev/stdin
fi
