package com.java_comeback.working_with_files;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;

public class ReadingFiles {
  public static void main(String[] args) {

    Path path = Path.of("files/sonnet-ISO.txt");
    boolean doesFileExist = Files.exists(path);

    System.out.println("Does file exist: " + doesFileExist);

    try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)) {
      String line = reader.readLine();

      while (line != null) {
        System.out.println(line);
        line = reader.readLine();
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
