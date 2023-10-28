package com.example.wc_tool.interfaces;

import com.example.wc_tool.objects.FileClass;

public interface WcToolOperations {

    int countBytes(FileClass fc);
    int countLines(FileClass fc);
    int countWords(FileClass fc);
    int countCharacters(FileClass fc);

}
