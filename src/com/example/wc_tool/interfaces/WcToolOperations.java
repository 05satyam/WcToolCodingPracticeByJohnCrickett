package com.example.wc_tool.interfaces;

import com.example.wc_tool.utils.FileClass;

public interface WcToolOperations {

    long countBytes(FileClass fc);
    long countLines(FileClass fc);
    long countWords(FileClass fc);
    long countCharacters(FileClass fc);

}
