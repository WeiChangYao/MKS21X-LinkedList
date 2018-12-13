class Node{
 private int data;
 private Node next,prev;
 public Node(int num, Node nextNum, Node prevNum){
   data = num;
   next = nextNum;
   prev = prevNum;
 }
}