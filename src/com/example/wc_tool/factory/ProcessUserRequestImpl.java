package com.example.wc_tool.factory;

import com.example.wc_tool.interfaceImpl.FileOperationsImpl;
import com.example.wc_tool.interfaceImpl.WcToolOperationsImpl;
import com.example.wc_tool.interfaces.FileOperations;
import com.example.wc_tool.interfaces.WcToolOperations;
import com.example.wc_tool.objects.Display;
import com.example.wc_tool.objects.FileClass;

public class ProcessUserRequestImpl implements ProcessUserRequest{
    FileOperations fco = new FileOperationsImpl();
    WcToolOperations wco = new WcToolOperationsImpl();
    Display display = new Display();

    @Override
    public void processUserRequestWithParam(String action, String fileName) {
        FileClass fc = fco.processFile(fileName);

        int c = 0;

        if(action=="-c"){
            display.display(Integer.toString(wco.countBytes(fc)), fileName);
        }else if(action=="-l"){
            display.display(Integer.toString(wco.countLines(fc)), fileName);
        }else if(action=="-w"){
            display.display(Integer.toString(wco.countWords(fc)), fileName);
        }else if(action=="-m"){
            display.display(Integer.toString(wco.countCharacters(fc)), fileName);
        }else{
            display.display(Integer.toString(wco.countBytes(fc)),Integer.toString(wco.countLines(fc)),
                    Integer.toString(wco.countWords(fc)), fileName);
        }


    }

}
