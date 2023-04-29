package edu.bu.met.cs665.adapter;

/**
 * Name: Yinkai Xiong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: Adapter.java
 * Description: This is a class represents implementation of ClientInterface interface.
 * And this is the Adapter component in adapter pattern.
 * */
public class Adapter implements ClientInterface {
  private final Service service;

  public Adapter(Service service) {
    this.service = service;
  }

  /**
   * Read operation request. Client call this method to access legacy system
   * read operation.
   * @return String that legacy system's specificReadRequest returns.
   */
  @Override
  public String readRequest(String data) {
    return service.specificReadRequest(data);
  }

  /**
   * Write operation request. Client call this method to access legacy system
   * write operation.
   * @return String that legacy system's specificWriteRequest returns.
   */
  @Override
  public String writeRequest(String data) {
    return service.specificWriteRequest(data);
  }
}
