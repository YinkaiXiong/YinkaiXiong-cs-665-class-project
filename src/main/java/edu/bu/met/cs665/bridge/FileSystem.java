package edu.bu.met.cs665.bridge;

/**
 * Name: Yinkai Xiong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: FileSystem.java
 * Description: This is an interface class represents a type of file system, like FAT.
 * It has methods that represent read and write operation.
 * And this is the Abstraction component in bridge pattern.
 * */

public interface FileSystem {
  String readFile(String data);

  String writeFile(String data);

  Database getDatabase();
}
