package com.example.wc_tool.interfaces;

import com.example.wc_tool.utils.FileClass;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * interface desgined to perfrom operation on file which is given by user
 */
public interface FileOperations {
    FileClass processFile(String fileName) throws FileNotFoundException, IOException, Exception;

    String getFileNameFromGivenPath(String path);

    boolean validateFileName(String fileName) throws Exception;
}
