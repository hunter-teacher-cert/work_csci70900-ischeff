public class Driver{
  public static void main(String[] args){
    //System.out.println("Hello, world!");
    Queue queue = new Queue();
    System.out.println(queue);//should print out null
    System.out.println("isEmpty: " + queue.isEmpty());//should be true
    System.out.println("Size: " + queue.size());//should be 0
    System.out.println();
    queue.enqueue("Apple");
    System.out.println(queue);//should print out "Apple --> null"
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 1
    System.out.println();
    queue.enqueue("Banana");
    System.out.println(queue);//should print out "Apple --> Banana --> null"
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 2
    System.out.println();
    queue.enqueue("Pear");
    System.out.println(queue);//should print out "Apple --> Banana --> Pear --> null "
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 3
    System.out.println();
    queue.enqueue("Raspberry");
    System.out.println(queue);//should print out "Apple --> Banana --> Pear --> Raspeberry --> null "
    System.out.println("isEmpty: " + queue.isEmpty());//should be false
    System.out.println("Size: " + queue.size());//should be 4
  }//end of main
}//end of class
