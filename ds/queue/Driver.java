public class Driver{
  public static void main(String[] args){
    //System.out.println("Hello, world!");
    Queue queue = new Queue();
    System.out.println(queue);//should print out null
    queue.enqueue("Apple");
    System.out.println(queue);//should print out "Apple --> null"
    queue.enqueue("Banana");
    System.out.println(queue);//should print out "Apple --> Banana --> null"
    queue.enqueue("Pear");
    System.out.println(queue);//should print out "Apple --> Banana --> Pear --> null "
    queue.enqueue("Raspberry");
    System.out.println(queue);//should print out "Apple --> Banana --> Pear --> Raspeberry --> null "
  }//end of main
}//end of class
