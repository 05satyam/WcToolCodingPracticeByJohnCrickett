package com.example.wc_tool.objects;

/**
 * this is a display class so that we can have all the display operations in one single class.
 * Var args are used in the function so that any number of arguments can be accepted and just displayed by concatinating
 */
public class Display {

    public void display(String ...arg){
        StringBuilder sb = new StringBuilder();
        sb.append(arg[0]);
        for(int i=1 ;i<arg.length;i++){
            sb.append(" "+ arg[i]);
        }

        System.out.println(sb.toString()); // final ouput display
    }
}
