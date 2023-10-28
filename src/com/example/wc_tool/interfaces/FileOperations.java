package com.example.wc_tool.interfaces;

import com.example.wc_tool.objects.FileClass;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileOperations {
    FileClass processFile(String fileName) throws FileNotFoundException, IOException, Exception;
}
