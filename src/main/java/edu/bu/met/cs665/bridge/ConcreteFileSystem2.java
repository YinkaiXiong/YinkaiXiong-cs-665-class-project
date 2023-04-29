package edu.bu.met.cs665.bridge;

/**
 * Name: Yinkai Xiong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: ConcreteFileSystem2.java
 * Description: This is a class represents a concrete file system.
 * It has methods that represent read and write operation.
 * And this is the Refined Abstraction component in bridge pattern.
 * */
public class ConcreteFileSystem2 implements FileSystem {
  Database database;

  /**
   * Constructor method.
   * @param database database object
   */
  public ConcreteFileSystem2(Database database) {
    this.database = database;
  }

  /**
   * read file operation. Call database's method to perform connect and read operation.
   * @return message indicate operations performed.
   */
  @Override
  public String readFile(String data) {
    //Read data from database.
    return "File System 2 read file.\n" + database.connect() + "\n"
        + database.read(data);
  }

  /**
   * write file operation. Call database's method to perform connect and insert operation.
   * @return message indicate operations performed.
   */
  @Override
  public String writeFile(String data) {
    //Insert read data into database.
    return "File System 2 write file.\n" + database.connect() + "\n"
        + database.insert(data);
  }

  /**
   * get what database is used with this file system.
   * @return database object
   */
  @Override
  public Database getDatabase() {
    return database;
  }
}
