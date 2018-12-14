class MyLinkedList{
  private int size;
  private Node start,end;
  private int length;
 

  public int size(){
    return size;
  }
 
  public boolean add(int value){
    size++;                       //size goes up
    Node newEnd = new Node (value, end, null);
    end.setNext(newEnd);
    end = newEnd; 
    return true;                 
  }
 
  /*public String toString(){
    
  }*/
  
}
