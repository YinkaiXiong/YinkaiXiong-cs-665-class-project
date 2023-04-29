package edu.bu.met.cs665.adapter;

/**
 * Name: Yinkai Xiong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: ClientInterface.java
 * Description: This is an interface class represents program entry point.
 * And this is the Target Interface component in adapter patter.
 * */
public interface ClientInterface {
   String readRequest(String data);
   String writeRequest(String data);
}
