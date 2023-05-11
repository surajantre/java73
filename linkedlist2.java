// import java.util.LinkedList;

// public class linkedlist2 {
   
//         public void zigZag() {
//             // find mid 
//             Node slow = head;
//             Node fast = head.next;
//             while(fast != null && fast.next != null){
//                 slow=slow.next;
//                 fast = fast.next.next;
//             } 
//             Node mid = slow;

//             //reverse 2nd half
//             Node curr = mid.next;
//             mid.next=null;
//             Node prev= null;
//             Node next;


//             while (curr != null){
//                 next = curr.next;
//                 curr.next=prev;
//                 prev=curr;
//                 curr=next;

//             }
//             Node left=head;
//             Node right=prev;
//             Node nextL,nextR;
//             //alt merge / zig-zag merge

//             while(left != null&& right != null){
//                 nextL = left.next;
//                 left.next=right;
//                 nextR=right.next;
//                 right.next=nextL;


//                 left = nextL;
//                 right = nextR;

//             }

//         }
//         public static void main (String args[]){
//             LinkedList ll = new LinkedList();
//             ll.addLast(1);
//             ll.addLast(2);
//             ll.addLast(3);
//             ll.addLast(4);
//             ll.addLast(5);

//             // 1-2-3-4-5
//             ll.print();
//             ll.zigZag();
//             ll.print();
            
//         }
//     }
    









// public java.util.*;
// public class linkedlist2 {
//     public class Node {
//         int data;
//         Node next;
//         Node prev;


//         public Node (int data){
//             this . data=data;
//             this . next=null;
//             this.prev=null;

//         }
//     }
//     public static Node head ;
//     public static Node tail;
//     public static int size;
//                                                                                  // 4 errors
//     // add
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head == null){
//             head= tail= newNode;
//             return;
//         }
//         newNode.next=head;
//         head.prev=newNode;
//         head=newNode;
//     }
//     // print
//     public void print(){
//         Node temp= head;
//         while(temp != null){
//             System.out.print(temp.data+<->);

//         }
//         System.out.println("null");
//     }
//     //remove - removeLast
//     public int removeFirst(){
//         if(head==null){
//             System.out.println("dll is empty");
//             return Integer . MIN_VALUE;

//         }
//         if(size==1){
//             int val = head.data;
//             head=tail=null;
//             size--;
//             return val;
//         }
//         int val= head. data;
//         head= head.next;
//         head.prev=null;
//         size--;
//         return val;

//     }
//     // add reverse code 
//     public static void main (String args[]){
//                     DoubleLL dll = new  DoubleLL();
//                      dll.addFirst(3);
//                      dll.addFirst(2);
//                      dll.addFirst(1);

//                      dll.print();
//                      System.out.println(dll.size);

//                      dll.removeFirst();
//                      dll.print();
//                      System.out.println(dll.size);


                    
// }
// }





















// import java.util.*;
// public class linkedlist2 {
//     public class Node {
//         int data;
//         Node next;
//         Node prev;


//         public Node (int data){
//             this . data=data;
//             this . next=null;
//             this.prev=null;

//         }
//     }
//     public static Node head ;
//     public static Node tail;
//     public static int size;
//                                                                                  // 4 errors
//     // add
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head == null){
//             head= tail= newNode;
//             return;
//         }
//         newNode.next=head;
//         head.prev=newNode;
//         head=newNode;
//     }
//     // print
//     public void print(){
//         Node temp= head;
//         while(temp != null){
//             System.out.print(temp.data+"<->");

//         }
//         System.out.println("null");
//     }
//     //remove - removeLast
//     public int removeFirst(){
//         if(head==null){
//             System.out.println("dll is empty");
//             return Integer . MIN_VALUE;

//         }
//         if(size==1){
//             int val = head.data;
//             head=tail=null;
//             size--;
//             return val;
//         }
//         int val= head. data;
//         head= head.next;
//         head.prev=null;
//         size--;
//         return val;

//     }

//     // add reverse code 
//     public void reverse(){
//         Node curr = head;
//         Node prev = null;                                                    // 2 errors
//         Node next;

//         while(curr != null){
//             next=curr.next;
//             curr.next=prev;
//             curr.prev=next;

//             prev= curr;
//             curr = next;

//         }
//         head= prev;
//     }

//     public static void main (String args[]){
//                     DoubleLL dll = new  DoubleLL();
//                      dll.addFirst(3);
//                      dll.addFirst(2);
//                      dll.addFirst(1);

//                      dll.print();
//                     //  System.out.println(dll.size);

//                     //  dll.removeFirst();
//                     //  dll.print();
//                     //  System.out.println(dll.size);
//                     dll.reverse();
//                     dll.print();


                    
// }
// }









