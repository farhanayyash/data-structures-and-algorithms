/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test public void testInsert (){
    LinkedList list = new LinkedList();
    list.insert(6);
    list.insert(7);
    list.insert(8);
    assertEquals("expected{8}->{7}->{6}->NULL","{8}->{7}->{6}->NULL",list.toString());
    assertEquals("The head = 20",20,list.insert(20));
  }
  @Test public void testIncludes(){
    LinkedList list = new LinkedList();
    list.insert(10);
    list.includes(10);
    assertTrue(list.includes(10));
    assertFalse(list.includes(11));
  }

}