package edu.bu.met.cs665.bridge;

/**
 * Name: Yinkai Xiong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: Database.java
 * Description: This is an interface class represents a type of database, like MySQL.
 * It has some methods that represent basic database operations.
 * And this is the Implementation component in bridge pattern.
 * */
public interface Database {
  String connect();

  String read(String data);

  String insert(String data);

  String delete(String data);
}
