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
 
  public String toString(){
    String str = "";
    Node current = start;
    while (current != null){
      str += current.getData();
      current = current.next();
    }
    return str;
  }
  
  private Node getNthNode(int index){
    int i = index;
    Node current = start;
    while (i > 0){
      current.next();
      i--;
    }
    return current;
  }

  public Integer get(int index){
    return getNthNode(index).getData();
  }
  
  public Integer set(int index, Integer value){
    Integer a = getNthNode(index).getData();
    getNthNode(index).setData(value);
    return a;
  }
    
}
