package com.example.wc_tool.objects;

public class FileClass {
    String fileName;
    int numberOfLines;
    int numberOfWords;
    int numberOfBytes;
    int numberOfCharacters;

    FileClass(){/* deafult constructor*/}

    public FileClass(String fileName, int numberOfBytes, int numberOfCharacters, int numberOfWords, int numberOfLines){
        this.fileName=fileName;
        this.numberOfLines=numberOfLines;
        this.numberOfBytes=numberOfBytes;
        this.numberOfCharacters=numberOfCharacters;
        this.numberOfWords=numberOfWords;
    }

    public String getFileName() {
        return fileName;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public int getNumberOfBytes() {
        return numberOfBytes;
    }

    public int getNumberOfCharacters() {
        return numberOfCharacters;
    }
}
