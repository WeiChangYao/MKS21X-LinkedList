class Node{
  private int data;
  private Node next,prev;
  public Node(int num, Node nextNum, Node prevNum){
    data = num;
    next = nextNum;
    prev = prevNum;
  }
  public Node next(){
    return next;
  }
  public Node prev(){
    return prev;
  }
  public void setNext(Node other){
    next = other;
  }
  public void setPrev(Node other){
    prev = other;
  }
  public Integer getData(){
    return data;
  }
  public Integer setData(Integer i){
    return data;
    data = i;
  }
  public String toString(){
    String str = "";
    return str += data;
  }
}
