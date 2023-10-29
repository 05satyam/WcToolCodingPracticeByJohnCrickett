package com.example.wc_tool.factory;

import com.example.wc_tool.interfaceImpl.FileOperationsImpl;
import com.example.wc_tool.interfaceImpl.WcToolOperationsImpl;
import com.example.wc_tool.interfaces.FileOperations;
import com.example.wc_tool.interfaces.WcToolOperations;
import com.example.wc_tool.utils.Display;
import com.example.wc_tool.utils.FileClass;

/**
 * implemenation class of ProcessUserRequest
 */

public class ProcessUserRequestImpl implements ProcessUserRequest{
    FileOperations fco = new FileOperationsImpl();
    WcToolOperations wco = new WcToolOperationsImpl();

    /**
     *
     * @param action
     * @param fileName
     * @throws Exception
     *
     * this is a factory method which is acepting an action,
     * --> performing the operation on file accepted
     * --> returning results on the basis of action given by user
     */
    @Override
    public void processUserRequestWithParam(String action, String fileName) throws Exception {

        FileClass fc = fco.processFile(fileName);
        String fileNameToDisplay=null;
        if(fileName!=null)
            fileNameToDisplay = fco.getFileNameFromGivenPath(fileName);
        //System.out.println(fileNameToDisplay);
        if(fc!=null) {
            if (action != null && action.equalsIgnoreCase("-c")) {
                Display.display(Long.toString(wco.countBytes(fc)), fileNameToDisplay);
            } else if (action != null && action.equalsIgnoreCase("-l")) {
                Display.display(Long.toString(wco.countLines(fc)), fileNameToDisplay);
            } else if (action != null && action.equalsIgnoreCase("-w")) {
                Display.display(Long.toString(wco.countWords(fc)), fileNameToDisplay);
            } else if (action != null && action.equalsIgnoreCase("-m")) {
                Display.display(Long.toString(wco.countCharacters(fc)), fileNameToDisplay);
            } else {
                Display.display(Long.toString(wco.countBytes(fc)), Long.toString(wco.countLines(fc)),
                        Long.toString(wco.countWords(fc)), fileNameToDisplay);
            }
        }

    }

}
