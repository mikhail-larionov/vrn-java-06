package ru.dataart.academy.java;

import java.io.*;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Calculator {
    /**
     * @param zipFilePath -  path to zip archive with text files
     * @param character   - character to find
     * @return - how many times character is in files
     */
    public Integer getNumberOfChar(String zipFilePath, char character) {
        int count = 0;
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
            while ((zipInputStream.getNextEntry()) != null) {
                int c;
                while ((c = zipInputStream.read()) != -1) {
                    if ((char) c == character)
                        count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * @param zipFilePath - path to zip archive with text files
     * @return - max length
     */

    public Integer getMaxWordLength(String zipFilePath) {
        int maxLen = 0;
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
            while ((zipInputStream.getNextEntry()) != null) {
                int currCharIndex;
                int curLen = 0;
                while ((currCharIndex = zipInputStream.read()) != -1) {
                    char curr = (char) currCharIndex;
                    if (curr != ' ' && curr != '\r') {
                        curLen++;
                    } else {
                        maxLen = Math.max(curLen, maxLen);
                        curLen = 0;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maxLen;
    }
}
