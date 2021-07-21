public class Queue{

  //instance Variables
  private Node head; //the start of the queue --> where nodes are removed
  private Node tail; //the end of the queue --> where nodes are added

  //make constructors
  public Queue(){
    head = null;
  }

  //make value constructor
    //what should it include?

  // enqueue(value) <-- add value to the end of the queue

  // x = dequeue() <-- remove and return the value at the front of the queue

  // x = front() <-- return but don't remove the value at the front

  // isEmpty() <-- returns true if the queue is empty
  public boolean isEmpty(){
    return(head == null); // this will return true if the list points to null
  }

  // size() <-- returns the number of items in the queue
  public int size(){
    Node currentNode = head;
    int counter = 0;
    while (currentNode != null){
        counter++;
        currentNode = currentNode.getNext();
    }
    return counter;
  }

}//end of class
