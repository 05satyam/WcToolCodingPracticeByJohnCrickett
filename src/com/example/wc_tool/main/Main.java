package com.example.wc_tool.main;

import com.example.wc_tool.factory.ProcessUserRequest;
import com.example.wc_tool.factory.ProcessUserRequestImpl;

public class Main {
    static ProcessUserRequest purq = new ProcessUserRequestImpl();

    public static void main(String[] args){
        if(args.length<1){
            //error point
            return ;//with a message
        }

        if(args.length==2){
            /**
             * 1. check whether you have file name or not
             * 2. check
             */
            String action = args[0];
            String fileName = args[1];
            purq.processUserRequestWithParam(args[0],args[1]);
        }
        if(args.length==3){
            //prcoess the request
            String fileName = args[0];
            purq.processUserRequestWithParam(null, fileName);
        }
        /**
         * this is the 3rd case to implement
        if()
         **/
    }
}
