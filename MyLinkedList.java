class MyLinkedList{
  private int size;
  private Node start,end;
  private int length;
 
  MyLinkedList(){
    size = 0;
    start = new Node(null,null,null);
  }
  
  public int size(){
    return size;
  }
 
  public boolean add(int value){  //IF IT'S BLANK MAKE IT SET START TO THE VALUE?!?!?!?!?!?
    Node current = start;
    Node newNode = new Node(value, null, null);
    while (current.next() != null){
      current = current.next();
    }
    current.setNext(newNode);
    newNode.setPrev(current);
    size++;
    if(start.getData() == null){
      start = current;
      start.setPrev(null);
    }
    return true;
  }
    
  
 
  public String toString(){
    String str = "[";
    Node current = start;
    while (current != null){
      if(current.getData() != null){
      str += current.getData();
      if(current.next() != null){
        str+= ", ";
      }
      }
      current = current.next();
      
    }
    str += "]";
    return str;
  }
  
  public Node getNthNode(int index){  //PRIVATE THIS!!!!!
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
  
  public boolean contains(Integer value){
    Node current = start;
    while (current != null){
      if(value == current.getData()){
        return true;
      }
      current = current.next();
    }
    return false;
  }
  
  public int indexOf(Integer value){
    int count = 0;
    Node current = start;
    while (current != null){
      if(value == current.getData()){
        return count;
      }
      count++;
      current = current.next();
    }
    return -1;
  }
  
  public void add(int index,Integer value){
    Node newNode = new Node(value, getNthNode(index), getNthNode(index).next());
    getNthNode(index).next().setPrev(newNode);
    getNthNode(index).setNext(newNode);
  }

  public Integer remove(int index){
    Integer removeReturn = getNthNode(index).getData();
    getNthNode(index-1).setNext(getNthNode(index+1));
    getNthNode(index+1).setPrev(getNthNode(index-1));
    return removeReturn;
  }
  
  public boolean remove(Integer value){
    int i = 0;
    Node current = start;
    while (current != null){
      if(value == current.getData()){
        remove(i);
        return true;
      }
      i++;
      current = current.next();
    }
    return false;
  }
    
}
