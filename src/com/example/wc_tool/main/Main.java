/**
 * this project is tested using commaond line arguments only
 *
 */
package com.example.wc_tool.main;

import com.example.wc_tool.factory.ProcessUserRequest;
import com.example.wc_tool.factory.ProcessUserRequestImpl;
import com.example.wc_tool.objects.Display;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static ProcessUserRequest purq = new ProcessUserRequestImpl();
    static Display display = new Display();
    public static void main(String[] args){
        System.out.println(args.length);
        try {
            validateRequestParams(args);
        }catch(Exception e){
            e.printStackTrace();
          display.display(e.getMessage());
            return;
        }
        String action = null;
        String fileName = "src/com/example/wc_tool/main/test.txt";//args[1];

        if(args.length==2){
            action=args[0];
            fileName=args[1];
        }else if(args.length==1){
            action=null;
            fileName=args[0];
        }

        try {
            purq.processUserRequestWithParam(action, fileName);

            /**
             * this is the 3rd case to implement--step 7 handling needs to be done
             if()
             **/
        }catch (Exception e){
            e.printStackTrace();
            display.display(e.getMessage());
            return;
        }


    }

    /**
     *
     * @param args
     * @throws Exception
     *
     * this method perform validation of the incoming request
     * checks basic validation on args length, valid action and valid file
     */
    public static void validateRequestParams(String[] args) throws Exception {
        //handle below cases:
        Set<String> actionSet = new HashSet<>();
        actionSet.add("-c"); actionSet.add("-l");actionSet.add("-m"); actionSet.add("-w");

        if(args==null)
            throw new Exception("invalid command!!");

        if(args.length<1){
            throw new Exception("invalid command!!");
        }

        String action = args[0];
        System.out.println(action);
        if(!actionSet.contains(action)){

            if(args.length==2){
                throw new Exception("Invalid action!!");
            }
            if(!new File(action).exists()) {
                throw new Exception("File does not exists!!");
            }
        }


    }
}
