package linkedList;

import java.util.ArrayList;


public class LinkedList {
  Node head;

  public int insert(int NodeVale) {
    Node currentNode = head;
    head = new Node(NodeVale);
    head.next = currentNode;
    return head.NodeVale;
  }

  public boolean includes(int searchValue) {
    Node currentNode = head;
    while (currentNode != null) {
      if (searchValue == currentNode.NodeVale) {return true;}
      currentNode = currentNode.next;
    }
    return false;
  }
  public String toString() {
    String results = "";
    Node currentNode = head;
    while (currentNode != null) {
      results += "{" + currentNode.NodeVale + "}->";
      currentNode = currentNode.next;
    }
    if (head != null) {results += "NULL";}
    return results;
  }
}
