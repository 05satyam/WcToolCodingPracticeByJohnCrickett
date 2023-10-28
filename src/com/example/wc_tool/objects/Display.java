package com.example.wc_tool.objects;

public class Display {

    public void display(String ...arg){
        StringBuilder sb = new StringBuilder();
        sb.append(arg[0]);
        for(int i=1 ;i<arg.length;i++){
            sb.append(" "+ arg[i]);
        }

        System.out.println(sb.toString());
    }
}
