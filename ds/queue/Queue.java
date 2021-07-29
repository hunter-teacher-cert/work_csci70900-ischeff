/**
* Queue is a class that instantiates queues.
*/


public class Queue{

  /**
  * Instance variables. Each queue object instantiates with two nodes, a head and a tail.
  * Each queue also contains its own size as an int.
  */
  private Node head; //the start of the queue --> where nodes are removed
  private Node tail; //the end of the queue --> where nodes are added
  private int size; //the size (length) of the queue

  /**
  * Class constructor. Each queue object is intialized to point head and tail to null,
  * and to assign size to zero.
  */
  public Queue(){
    head = null;
    tail = null;
    size = 0;
  }

  /**
  * Returns a string representing the queue. Traverses the queue and adds the data from each
  * node to an initially empty string; then appends an "-->" between nodes.
  *
  * @return the string to be printed.
  */
  public String toString(){
    Node currentNode = head;
    String result = "";
    while (currentNode != null){
        result = result + currentNode + " --> ";
        currentNode = currentNode.getNext();
    }
    result = result + "null";
    return result;
  }

  /**
  * Creates and adds a node to the queue, following the principle of FIFO, aka "First In, Last Out."
  * Consequently, the enqueued node is added to the tail of the queue.
  * If the queue is empty, then the newly created node is both head and tail.
  * This method also increments the size of the queue.
  *
  * @param data - the String that you wish to add to the queue.
  * @return void
  */
  public void enqueue(String data){
    Node newNode = new Node(data);
    if (this.isEmpty()){
      head = newNode;
      tail = newNode;
      size++;
    } else {
      tail.setNext(newNode);
      tail = newNode;
      size++;
    }
  }

  /**
  * Deletes a node from the queue, following the principle of FIFO, aka "First In, Last Out."
  * Consequently, the dequeued node is removed from the head of the queue.
  * The method also returns the data of the node that was dequeued.
  * If the queue is empty, throws a NullPointerException.
  * This method also decrements the size of the queue.
  *
  * @return the String data contained by the node that you just deleted from the queue.
  */
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

  /**
  * If the queue is not empty, this method returns the data of the node at the head,
  * allowing you to see what the head of the queue contains.
  * If the queue is empty, throws a NullPointerException.
  *
  * @return the String data contained by the node at the head of the queue.
  */
  public String head(){
    if(!this.isEmpty()){
      return head.getData();
    } else {
      throw new NullPointerException("Queue is empty!");
    }
  }

  /**
  * This method returns true if the list is empty. This is true if the head points to null.
  *
  * @return true if head points to null, otherwise false.
  */
  public boolean isEmpty(){
    return(head == null); // this will return true if the list points to null
  }

  /**
  * This method returns the size of the queue. Commented out is a version of size
  * that traverses the queue and counts the number of nodes; the constructor was revised
  * to include size as an instance variable to amortize the cost of this operation.
  *
  * @return the size of the queue, as an integer.
  */
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
