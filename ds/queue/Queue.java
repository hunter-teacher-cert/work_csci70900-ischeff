public class Queue{

  //instance Variables
  private Node head; //the start of the queue --> where nodes are removed
  private Node tail; //the end of the queue --> where nodes are added

  //make constructors --> head points to tail? both are null?
  public Queue(){
    head = null;
    tail = null;
  }
  //make value constructor
    //what should it include?

  public String toString(){
    Node currentNode = head;
    String result = "";
    while (currentNode != null){
        result = result + currentNode + " --> ";
        currentNode = currentNode.getNext();
    }
    result = result + "null";
    return result;
  }//end of toString

  // enqueue(value) <-- add value to the end of the queue
  public void enqueue(String data){
    Node newNode = new Node(data); //create a new node
    //if the list is empty, the new (sole) node is BOTH head and tail.
    if (head == null){
      head = newNode;
      tail = newNode;
    } else {
      tail.setNext(newNode);
      tail = newNode;
    }

  }
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
