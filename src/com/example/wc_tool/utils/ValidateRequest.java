package com.example.wc_tool.utils;

import java.util.HashSet;
import java.util.Set;

/**
 * a small validation class implementation for validating all the args passed in the main method
 */
public class ValidateRequest {
    /**
     *
     * @return
     *
     * return list of actions requried
     */
    public static Set<String> getActionSet() {
        Set<String> actionSet = new HashSet<>();
        actionSet.add("-c");
        actionSet.add("-l");
        actionSet.add("-m");
        actionSet.add("-w");
        return actionSet;
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
        Set<String> actionSet = getActionSet();

        if(args==null)
            throw new Exception("invalid command!!");

        if(args.length<1){
            throw new Exception("invalid command!!");
        }

        String action = args[0];
        //System.out.println(action);
        if(!actionSet.contains(action)){

            if(args.length==2){
                throw new Exception("Invalid action!!");
            }
//            if(!new File(action).exists()) {
//                throw new Exception("File does not exists!!");
//            }
        }


    }
}
