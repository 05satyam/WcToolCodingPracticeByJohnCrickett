package com.example.wc_tool.main;

import com.example.wc_tool.factory.ProcessUserRequest;
import com.example.wc_tool.factory.ProcessUserRequestImpl;
import com.example.wc_tool.objects.Display;

public class Main {
    static ProcessUserRequest purq = new ProcessUserRequestImpl();
    static Display display = new Display();
    public static void main(String[] args){

        try {
            validateRequestParams(args);
        }catch(Exception e){

          display.display(e.getMessage());
            return;
        }
        String action = args[0];
        String fileName = args[1];
        try {
            purq.processUserRequestWithParam(action, fileName);

            /**
             * this is the 3rd case to implement--step 7 handling needs to be done
             if()
             **/
        }catch (Exception e){
            display.display(e.getMessage());
            return;
        }


    }

    public static void validateRequestParams(String[] args) throws Exception {
        //handle below cases:
        if(args==null)
            throw new Exception();

        if(args.length<1){
            throw new Exception();
        }

        String action = args[0];
        String fileName = args[1];

        if(action==null && fileName==null){
            throw new Exception();
        }

    }
}
