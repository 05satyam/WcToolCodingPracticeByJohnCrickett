package com.example.wc_tool.interfaceImpl;

import com.example.wc_tool.interfaces.FileOperations;
import com.example.wc_tool.objects.FileClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileOperationsImpl implements FileOperations {

    @Override
    public FileClass processFile(String fileName) throws FileNotFoundException, IOException, Exception {
        File file = new File(fileName);

        int lineCount = 0;
        int wordCount = 0;
        int byteCount = 0;
        int charCount = 0;

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                byteCount += line.getBytes().length; // Count bytes for the line
                charCount += line.length(); // Count characters for the line
                lineCount++;
                wordCount += line.split("\\s+").length; // Split line into words and count them
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        return new FileClass(fileName, byteCount,charCount,wordCount,lineCount);
    }
}
