/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(100);
    list.insert(7);
    list.insert(500);
    list.insert(500);
    list.insert(8);
    System.out.println(list.includes(9));
    System.out.println(list.toString());
  }
}