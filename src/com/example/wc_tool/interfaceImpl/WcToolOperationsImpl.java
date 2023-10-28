package com.example.wc_tool.interfaceImpl;

import com.example.wc_tool.factory.ProcessUserRequest;
import com.example.wc_tool.interfaces.WcToolOperations;
import com.example.wc_tool.objects.FileClass;

public class WcToolOperationsImpl implements WcToolOperations {
    @Override
    public int countBytes(FileClass fc) {
        return fc.getNumberOfBytes();
    }

    @Override
    public int countLines(FileClass fc) {
       return fc.getNumberOfLines();
    }

    @Override
    public int countWords(FileClass fc) {
       return fc.getNumberOfWords();
    }

    @Override
    public int countCharacters(FileClass fc) {
       return fc.getNumberOfCharacters();
    }

}
