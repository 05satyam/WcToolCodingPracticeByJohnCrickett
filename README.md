# WcToolCodingPracticeByJohnCrickett
Project description url: https://codingchallenges.fyi/challenges/challenge-wc

To run the code as a tool :
1. copy the run.sh  under src folder to your local folder
2. copy the ccwc.jar  under src/com/example/wc_tool folder to your local folder when run.sh is copied
3. change jar file path in run.sh

4. run below commands to give permission to shell file:
   chmod +x run.sh 
   
5. ./run.sh  test.txt
6. ./run.sh  -l test.txt
7. cat test.txt | ./run.sh -l


project structure:
 com/example/wc_tool
    factor
    interface
    interfaceImpl
    main--Entry point CCWC
    utils
   