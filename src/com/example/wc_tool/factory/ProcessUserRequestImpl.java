package com.example.wc_tool.factory;

import com.example.wc_tool.interfaceImpl.FileOperationsImpl;
import com.example.wc_tool.interfaceImpl.WcToolOperationsImpl;
import com.example.wc_tool.interfaces.FileOperations;
import com.example.wc_tool.interfaces.WcToolOperations;
import com.example.wc_tool.objects.Display;
import com.example.wc_tool.objects.FileClass;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * implemenation class of ProcessUserRequest
 */

public class ProcessUserRequestImpl implements ProcessUserRequest{
    FileOperations fco = new FileOperationsImpl();
    WcToolOperations wco = new WcToolOperationsImpl();
    Display display = new Display();

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
        String fileNameToDisplay = fco.getFileNameFromGivenPath(fileName);

        if(fco.validateFileName(fileNameToDisplay)) {
            if (action != null && action.equalsIgnoreCase("-c")) {
                display.display(Long.toString(wco.countBytes(fc)), fileNameToDisplay);
            } else if (action != null && action.equalsIgnoreCase("-l")) {
                display.display(Long.toString(wco.countLines(fc)), fileNameToDisplay);
            } else if (action != null && action.equalsIgnoreCase("-w")) {
                display.display(Long.toString(wco.countWords(fc)), fileNameToDisplay);
            } else if (action != null && action.equalsIgnoreCase("-m")) {
                display.display(Long.toString(wco.countCharacters(fc)), fileNameToDisplay);
            } else {
                display.display(Long.toString(wco.countBytes(fc)), Long.toString(wco.countLines(fc)),
                        Long.toString(wco.countWords(fc)), fileNameToDisplay);
            }
        }

    }

}
