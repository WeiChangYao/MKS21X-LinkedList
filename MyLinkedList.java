class MyLinkedList{
  private int size;
  public Node start,end;
  private int length;
 
  MyLinkedList(){
    size = 0;                       //makes list with size 0        
    start = new Node(null,null,null);//starting node with nothing
  }
  
  public int size(){
    return size;
  }
 
  public boolean add(Integer value){  //IF IT'S BLANK MAKE IT SET START TO THE VALUE?!?!?!?!?!?
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
    int i = 0;
    Node current = start;
    while (current != null){
      if (i == index){
        return current;
      }
      current = current.next();
      i++;
      
    }
    return current;
  }

  public Integer get(int index){
    if(index < 0) throw new IndexOutOfBoundsException();
    if(index > size-1) throw new IndexOutOfBoundsException();
    return getNthNode(index).getData();
  }
  
  public Integer set(int index, Integer value){
    if(index < 0) throw new IndexOutOfBoundsException();
    if(index > size-1) throw new IndexOutOfBoundsException();
    Integer a = getNthNode(index).getData();
    getNthNode(index).setData(value);
    return a;
  }
  
  public boolean contains(Integer value){
    Node current = start;
    while (current != null){
      if(value.equals(current.getData())){
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
      if(value.equals(current.getData())){
        return count;
      }
      count++;
      current = current.next();
    }
    return -1;
  }
  
  public void add(int index,Integer value){
    if(index < 0) throw new IndexOutOfBoundsException();
    if(index > size) throw new IndexOutOfBoundsException();
    if (index == 0){
      addFirst(value);
    } 
  //  if (index == size){
  //    addLast(value);
  //  }
    else{
    size++;
    Node newNode = new Node(value, null, null);
    newNode.setNext(getNthNode(index));
	  getNthNode(index-1).setNext(newNode); 
    }
  }
  
 /* public void addLast(Integer value){
    size++;
    Node newNode = new Node(value, null, end);
    if(end != null) {
      end.setNext(newNode);
    }
    end = newNode;
  } */
  
  public void addFirst(Integer value){
    size++;
    Node newNode = new Node(value, start, null);
    if (start != null){
      start.setPrev(newNode);
    }
    start = newNode;
  }

  public Integer remove(int index){
    if(index < 0) throw new IndexOutOfBoundsException();
    if(index > size-1) throw new IndexOutOfBoundsException();
    if(index == size-1){
        return removeLast();
     }
    if(index == 0){
      return removeFirst();
    }
    else{
    Integer removeReturn = getNthNode(index).getData();
    getNthNode(index+1).setPrev(getNthNode(index-1));
    getNthNode(index-1).setNext(getNthNode(index+1));
    size--;
    return removeReturn;
    }
  }
  
  public boolean remove(Integer value){
   if (contains(value) == true){
      if(indexOf(value) == size-1){
        removeLast();
        return true;
      }
     else{
      remove(indexOf(value));
      return true;
     }
    }
    else{return false;} 
  } 
  
  public Integer removeLast(){
    Node current = getNthNode(size-1);
    Integer val = current.getData();
    current = getNthNode(size-2);
    current.setNext(null);
    end = current;
    size--;
    return val;
  }
  
  public Integer removeFirst(){
    Node current = start;
    Integer val = start.getData();
    current = start.next();
    current.setPrev(null);
    start = current;
    size--;
    return val;
  }
    
}
