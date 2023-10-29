/**
 * this project is tested using commaond line arguments only
 *
 */
package com.example.wc_tool.main;

import com.example.wc_tool.factory.ProcessUserRequest;
import com.example.wc_tool.factory.ProcessUserRequestImpl;
import com.example.wc_tool.utils.Display;
import com.example.wc_tool.utils.ValidateRequest;

import java.util.HashSet;
import java.util.Set;

public class CCWC {
    static ProcessUserRequest purq = new ProcessUserRequestImpl();

    public static void main(String[] args){
        //System.out.println(args.length);
        String action = null;
        String fileName = "src/com/example/wc_tool/main/test.txt";//args[1];
        try {
            ValidateRequest.validateRequestParams(args);

            if(args.length==2){
                action=args[0];
                fileName=args[1];
            }else if(args.length==1 && !ValidateRequest.getActionSet().contains(args[0])){
                action=null;
                fileName=args[0];
            }else if(args.length==1 && ValidateRequest.getActionSet().contains(args[0])){
                action = args[0];
                fileName=null;
            }

            purq.processUserRequestWithParam(action, fileName);

        }catch (Exception e){
            //e.printStackTrace();
            Display.display(e.getMessage());
            return;
        }
    }
}
