package com.example.wc_tool.objects;

/**
 * Object class for file which is designed to containe the details related to a file
 */
public class FileClass {
    String fileName;
    long numberOfLines;
    long numberOfWords;
    long numberOfBytes;
    long numberOfCharacters;

    FileClass(){/* deafult constructor*/}

    public FileClass(String fileName, long numberOfBytes, long numberOfCharacters, long numberOfWords, long numberOfLines){
        this.fileName=fileName;
        this.numberOfLines=numberOfLines;
        this.numberOfBytes=numberOfBytes;
        this.numberOfCharacters=numberOfCharacters;
        this.numberOfWords=numberOfWords;
    }

    public String getFileName() {
        return fileName;
    }

    public long getNumberOfLines() {
        return numberOfLines;
    }

    public long getNumberOfWords() {
        return numberOfWords;
    }

    public long getNumberOfBytes() {
        return numberOfBytes;
    }

    public long getNumberOfCharacters() {
        return numberOfCharacters;
    }
}
