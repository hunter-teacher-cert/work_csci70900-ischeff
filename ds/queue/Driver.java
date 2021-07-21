public class Driver{
  public static void main(String[] args){
    //System.out.println("Hello, world!");
    Queue queue = new Queue();
    System.out.println(queue);//should print out null
    System.out.println("isEmpty: " + queue.isEmpty());//should be true
    System.out.println("Size: " + queue.size());//should be 0
    System.out.println("Head: " + queue.head());//should be null
    System.out.println();
    queue.enqueue("Apple");
    System.out.println(queue);//should print out "Apple --> null"
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 1
    System.out.println("Head: " + queue.head());//should be apple
    System.out.println();
    queue.enqueue("Banana");
    System.out.println(queue);//should print out "Apple --> Banana --> null"
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 2
    System.out.println("Head: " + queue.head());//should be Apple
    System.out.println();
    queue.enqueue("Pear");
    System.out.println(queue);//should print out "Apple --> Banana --> Pear --> null "
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 3
    System.out.println("Head: " + queue.head());//should be apple
    System.out.println();
    queue.enqueue("Raspberry");
    System.out.println(queue);//should print out "Apple --> Banana --> Pear --> Raspeberry --> null "
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 4
    System.out.println("Head: " + queue.head());//should be Apple
    System.out.println();
    System.out.println("You just dequeued: " + queue.dequeue());
    System.out.println(queue);//should print out "Banana --> Pear --> Raspeberry --> null "
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 3
    System.out.println("Head: " + queue.head());//should be Banana
    System.out.println();
    System.out.println("You just dequeued: " + queue.dequeue());
    System.out.println(queue);//should print out "Pear --> Raspeberry --> null "
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 2
    System.out.println("Head: " + queue.head());//should be Pear
    System.out.println();
    System.out.println("You just dequeued: " + queue.dequeue());
    System.out.println(queue);//should print out "Raspberry --> null "
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 1
    System.out.println("Head: " + queue.head());//should be Raspberry
    System.out.println();
    System.out.println("You just dequeued: " + queue.dequeue());
    System.out.println(queue);//should print out "null "
    System.out.println("isEmpty: " + queue.isEmpty());//should be true
    System.out.println("Size: " + queue.size());//should be 0
    System.out.println("Head: " + queue.head());//should be null
    System.out.println();
    System.out.println("You just dequeued: " + queue.dequeue());
    System.out.println(queue);//should print out "null"
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 0
    System.out.println("Head: " + queue.head());//should be null
  }//end of main
}//end of class
