package com.java_comeback.working_with_files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class WritingFiles {
  public static void main(String[] args) {

    Path path = Path.of("files/debug.log");

    try(BufferedWriter writer1 = Files.newBufferedWriter(path);
        BufferedWriter writer2 = new BufferedWriter(writer1);
        PrintWriter pw = new PrintWriter(writer2)) {

      writer1.write("Hello World!");
      pw.printf("\ni = %d\n", 12);

    } catch (IOException ex) {
      ex.printStackTrace();
    }

    System.out.println("Done!");

  }
}
