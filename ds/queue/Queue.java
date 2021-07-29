public class Queue{

  //instance Variables
  private Node head; //the start of the queue --> where nodes are removed
  private Node tail; //the end of the queue --> where nodes are added
  private int size; //the size (length) of the queue

  /**
  * This is the default constructor;
  */
  public Queue(){
    head = null;
    tail = null;
    size = 0;
  }
  //make value constructor
    //what should it include?

  //custom toString method to print queue
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
      size++;
    } else {
      tail.setNext(newNode);
      tail = newNode;
      size++;
    }
  }//end of enqueue

  // x = dequeue() <-- remove and return the value at the front of the queue
  public String dequeue(){
    Node currentNode = head;
    if (this.isEmpty()){
      throw new NullPointerException("Queue is empty!");
    } else{
      size--;
      head = currentNode.getNext();
      return currentNode.getData();
    }
  }

  // x = front() <-- return but don't remove the value at the front
  public String head(){
    if(!this.isEmpty()){
      return head.getData();
    } else {
      throw new NullPointerException("Queue is empty!");
    }
  }

  // isEmpty() <-- returns true if the queue is empty
  public boolean isEmpty(){
    return(head == null); // this will return true if the list points to null
  }

  // size() <-- returns the number of items in the queue
  public int size(){
    return size;
    // Node currentNode = head;
    // int counter = 0;
    // while (currentNode != null){
    //     counter++;
    //     currentNode = currentNode.getNext();
    // }
    // return counter;
  }

}//end of class
