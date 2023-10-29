package com.example.wc_tool.interfaceImpl;

import com.example.wc_tool.interfaces.WcToolOperations;
import com.example.wc_tool.utils.FileClass;

/**
 * this is an implemetation of WC tool interface class which is designed to separate the functionlity of WC tool.
 * If in future ssomne tool specific features needs to be modified before returning results to user
 * we can change here
 * the functions designed are dedicated to separate action done by WC tool.
 */
public class WcToolOperationsImpl implements WcToolOperations {
    @Override
    public long countBytes(FileClass fc) {
        return fc.getNumberOfBytes();
    }

    @Override
    public long countLines(FileClass fc) {
       return fc.getNumberOfLines();
    }

    @Override
    public long countWords(FileClass fc) {
       return fc.getNumberOfWords();
    }

    @Override
    public long countCharacters(FileClass fc) {
       return fc.getNumberOfCharacters();
    }

}
