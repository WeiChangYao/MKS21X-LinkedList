public class backwards {
  
  
  
 
  
  
    public static void main(String[] args) {
        //test printing backwards and test if end works
      
         MyLinkedList list = new MyLinkedList();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list.end.getData());
        System.out.println(list);
        System.out.println(list.toBackString());
    }
}