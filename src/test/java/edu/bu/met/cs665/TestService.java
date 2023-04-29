package edu.bu.met.cs665;

import edu.bu.met.cs665.adapter.Adapter;
import edu.bu.met.cs665.adapter.Service;
import edu.bu.met.cs665.bridge.ConcreteDatabase1;
import edu.bu.met.cs665.bridge.ConcreteDatabase2;
import edu.bu.met.cs665.bridge.ConcreteFileSystem1;
import edu.bu.met.cs665.bridge.ConcreteFileSystem2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestService {

  @Test
  public void testFirstTypeOldSystemRead(){
    //Given:A file system object and adding adapter class to it.
    Service oldSystem1 = new Service(new ConcreteFileSystem1(new ConcreteDatabase1("pass")));
    Adapter oldSystem1Adapter = new Adapter(oldSystem1);

    //When: Calling request method
    oldSystem1Adapter.readRequest("Sample query.");

    //Then: Confirm the output is same as readRequest method.
    assertEquals("File System 1 read file.\n" +
        "DB 1 connected.\n" +
        "Read from database 1.",oldSystem1Adapter.readRequest("Sample query."));
  }

  @Test
  public void testFirstTypeOldSystemWrite(){
    //Given:A file system object and adding adapter class to it.
    Service oldSystem1 = new Service(new ConcreteFileSystem1(new ConcreteDatabase1("pass")));
    Adapter oldSystem1Adapter = new Adapter(oldSystem1);

    //When: Calling request method
    oldSystem1Adapter.writeRequest("Sample query.");

    //Then: Confirm the output is same as writeRequest method.
    assertEquals("File System 1 write file.\n" +
        "DB 1 connected.\n" +
        "Insert to database 1.",oldSystem1Adapter.writeRequest("Sample query."));
  }

  @Test
  public void testSecondTypeOldSystemRead(){
    //Given:A file system object and adding adapter class to it.
    Service oldSystem2 = new Service(new ConcreteFileSystem1(new ConcreteDatabase2("pass")));
    Adapter oldSystem2Adapter = new Adapter(oldSystem2);

    //When: Calling request method
    oldSystem2Adapter.readRequest("Sample query.");

    //Then: Confirm the output is same as readRequest method.
    assertEquals("File System 1 read file.\n" +
        "DB 2 connected.\n" +
        "Read from database 2.",oldSystem2Adapter.readRequest("Sample query."));
  }

  @Test
  public void testSecondTypeOldSystemWrite(){
    //Given:A file system object and adding adapter class to it.
    Service oldSystem2 = new Service(new ConcreteFileSystem1(new ConcreteDatabase2("pass")));
    Adapter oldSystem2Adapter = new Adapter(oldSystem2);

    //When: Calling request method
    oldSystem2Adapter.writeRequest("Sample query.");

    //Then: Confirm the output is same as writeRequest method.
    assertEquals("File System 1 write file.\n" +
        "DB 2 connected.\n" +
        "Insert to database 2.",oldSystem2Adapter.writeRequest("Sample query."));
  }

  @Test
  public void testThirdTypeOldSystemRead(){
    //Given:A file system object and adding adapter class to it.
    Service oldSystem3 = new Service(new ConcreteFileSystem2(new ConcreteDatabase1("pass")));
    Adapter oldSystem3Adapter = new Adapter(oldSystem3);

    //When: Calling request method
    oldSystem3Adapter.readRequest("Sample query.");

    //Then: Confirm the output is same as readRequest method.
    assertEquals("File System 2 read file.\n" +
        "DB 1 connected.\n" +
        "Read from database 1.",oldSystem3Adapter.readRequest("Sample query."));
  }

  @Test
  public void testThirdTypeOldSystemWrite(){
    //Given:A file system object and adding adapter class to it.
    Service oldSystem3 = new Service(new ConcreteFileSystem2(new ConcreteDatabase1("pass")));
    Adapter oldSystem3Adapter = new Adapter(oldSystem3);

    //When: Calling request method
    oldSystem3Adapter.writeRequest("Sample query.");

    //Then: Confirm the output is same as writeRequest method.
    assertEquals("File System 2 write file.\n" +
        "DB 1 connected.\n" +
        "Insert to database 1.",oldSystem3Adapter.writeRequest("Sample query."));
  }

  @Test
  public void testForthTypeOldSystemRead(){
    //Given:A file system object and adding adapter class to it.
    Service oldSystem4 = new Service(new ConcreteFileSystem2(new ConcreteDatabase2("pass")));
    Adapter oldSystem4Adapter = new Adapter(oldSystem4);

    //When: Calling request method
    oldSystem4Adapter.readRequest("Sample query.");

    //Then: Confirm the output is same as readRequest method.
    assertEquals("File System 2 read file.\n" +
        "DB 2 connected.\n" +
        "Read from database 2.",oldSystem4Adapter.readRequest("Sample query."));
  }

  @Test
  public void testForthTypeOldSystemWrite(){
    //Given:A file system object and adding adapter class to it.
    Service oldSystem4 = new Service(new ConcreteFileSystem2(new ConcreteDatabase2("pass")));
    Adapter oldSystem4Adapter = new Adapter(oldSystem4);

    //When: Calling request method
    oldSystem4Adapter.writeRequest("Sample query.");

    //Then: Confirm the output is same as writeRequest method.
    assertEquals("File System 2 write file.\n" +
        "DB 2 connected.\n" +
        "Insert to database 2.",oldSystem4Adapter.writeRequest("Sample query."));
  }
}
