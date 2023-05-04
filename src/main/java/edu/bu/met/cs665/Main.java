/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.adapter.Adapter;
import edu.bu.met.cs665.adapter.Service;
import edu.bu.met.cs665.bridge.ConcreteDatabase1;
import edu.bu.met.cs665.bridge.ConcreteFileSystem1;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    String data = "Sample query.";

    Service oldSystem1 = new Service(new ConcreteFileSystem1(
        new ConcreteDatabase1("authenticationInfo")));
    Adapter oldSystem1Adapter = new Adapter(oldSystem1);

    System.out.println("************ Read **********");
    oldSystem1Adapter.readRequest(data);
    System.out.println("************ Write **********");
    oldSystem1Adapter.writeRequest(data);
  }

}
