package com.example.wc_tool.utils;

/**
 * this is a display class so that we can have all the display operations in one single class.
 * Var args are used in the function so that any number of arguments can be accepted and just displayed by concatinating
 */
public class Display {

    public static void display(String ...arg){
        StringBuilder sb = new StringBuilder();
        sb.append(arg[0]);
        for(int i=1 ;i<arg.length;i++){
            if(arg[i]!=null)
                sb.append(" "+ arg[i]);
        }

        System.out.println(sb.toString()); // final ouput display
    }
}
