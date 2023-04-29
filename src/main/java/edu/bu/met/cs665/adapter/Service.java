package edu.bu.met.cs665.adapter;

import edu.bu.met.cs665.bridge.ConcreteDatabase1;
import edu.bu.met.cs665.bridge.ConcreteFileSystem1;
import edu.bu.met.cs665.bridge.FileSystem;
/**
 * Name: Yinkai Xiong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: Adapter.java
 * Description: This is a class represents legacy system that need to be adapted.
 * And this is the Adaptee component in adapter pattern.
 * */

public class Service {
  final private FileSystem  oldSystem;

  /**
   * Constructor method, take a FileSystem object to perform specific requests.
   * @param oldSystem file system object
   */
  public Service(FileSystem oldSystem) {
    this.oldSystem = oldSystem;
  }

  /**
   * Default constructor, created a legacy system object that use fileSystem type 1 and
   * database type 1.
   */
  public Service() {
    this(new ConcreteFileSystem1(new ConcreteDatabase1("pass")));
  }

  /**
   * Calling legacy system read operation request.
   * @return String that legacy system readFile operation returns.
   */
  public String specificReadRequest(String data) {
    return oldSystem.readFile(data);
  }

  /**
   * Calling legacy system write operation request.
   * @return String that legacy system writeFile operation returns.
   */
  public String specificWriteRequest(String data) {
    return oldSystem.writeFile(data);
  }
}
