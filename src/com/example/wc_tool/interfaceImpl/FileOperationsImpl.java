package com.example.wc_tool.interfaceImpl;

import com.example.wc_tool.interfaces.FileOperations;
import com.example.wc_tool.utils.FileClass;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperationsImpl implements FileOperations {

    /**
     *
     * @param fileName
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws Exception
     *
     * this method process the file and caculates the basic operation done by WC tool.
     * --> reading file using scanner
     */
    @Override
    public FileClass processFile(String fileName) throws FileNotFoundException, IOException, Exception {
        //File file = new File(fileName);

        long lineCount = 0;
        int wordCount = 0;
        long byteCount = 0;
        int charCount = 0;

        //Scanner scanner = new Scanner(file);
        BufferedReader reader = (fileName == null)? new BufferedReader(new InputStreamReader(System.in))
                :   new BufferedReader(new FileReader(fileName));
//        while(scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                lineCount++;
//                charCount += line.length();
//                if(!line.isEmpty()) {
//                    String[] words = line.split("\\s+");
//                    for (String word : words) {
//                        if (!word.trim().isEmpty()) {
//                            wordCount++;
//                        }
//                    }
//                }
//        }

        String line;
        while ((line = reader.readLine()) != null) {
            lineCount++;
            charCount += line.length();
            byteCount += line.getBytes().length;
            if (!line.isEmpty()) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.trim().isEmpty()) {
                        wordCount++;
                    }
                }
            }
        }
        return new FileClass(fileName, byteCount, charCount, wordCount, lineCount - 1);
    }


    /**
     *
     * @param pathName
     * @return
     *
     * this method is designed to take the actual file name with path given by user and then return just the file name
     * with file extension
     * Using Path jar file
     */
    @Override
    public String getFileNameFromGivenPath(String pathName) {
        Path path = Paths.get(pathName);
        return path.getFileName().toString();
    }

    /**
     *
     * @param fileName
     * @return
     * @throws Exception
     *
     * this method validates the file extension
     * as of now only txt extension are supported.
     * more extensions handling can be done here
     */
    @Override
    public boolean validateFileName(String fileName) throws Exception {

        if(!fileName.split("\\.")[1].equalsIgnoreCase("txt")){
            throw new Exception("Only text files are supported as of now");
        }
        return true;
    }
}
