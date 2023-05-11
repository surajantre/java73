// public class linkedlist {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }

//     public static Node head;
//     public static Node tail;

//     public void addfirst(int data){
//         // crerte new node step 1
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;

//         }
//         // step 2 isnew node next = head
//         newNode.next=head;

//         // step 3 is head = new Node
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;

// }

// public void print(){
//     if(head==null){
//         System.out.println("LL is empty");
//         return;
//     }                                                                    // 4 errors in this program
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//     }
//     System.out.println();
// }
// public static void main(String args[]){
//     linkedlist ll = new linkedlist();
//     ll.print();
//     ll.addfirst(2);
//     ll.print();
//     ll.addfirst(1);
//     ll.print();
//     ll.addlast(3);
//     ll.print();
//     ll.addlast(4);
//     ll.print();
// }

// }










// public class linkedlist {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }

//     public static Node head;
//     public static Node tail;

//     public void addfirst(int data){
//         // crerte new node step 1
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;

//         }
//         // step 2 isnew node next = head
//         newNode.next=head;

//         // step 3 is head = new Node
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;

// }

// public void print(){
//     if(head==null){
//         System.out.println("LL is empty");
//         return;
//     }                                                                    // 5 errors in this program
//                                                                          // same essue upper code
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//     }
//     System.out.println();
// }
 
//     public void add(int idx,int data){
//         if (idx==0){
//             addfirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         Node temp = head;
//         int i=0;

//         while(i<idx-1){                                                 
//             temp=temp.next;
//             i++;
//         }

//         // i=idx-1;temp->prev
//         newNode.next=temp.next;
//         temp.next=newNode;



//     }
//     public static void main(String[] args){
//         linkedlist ll = new linkedlist();
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.add(2,9);

//         ll.print();
//     }

// }























// public class linkedlist {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // crerte new node step 1
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;

//         }
//         // step 2 isnew node next = head
//         newNode.next=head;

//         // step 3 is head = new Node
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;

// }

// public void print(){
//     if(head==null){
//         System.out.println("LL is empty");
//         return;
//     }                                                                    // 5 errors in this program
//                                                                          // same essue upper code
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//     }
//     System.out.println();
// }
 
//     public void add(int idx,int data){
//         if (idx==0){
//             addfirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         size++;
//         Node temp = head;
//         int i=0;

//         while(i<idx-1){                                                 
//             temp=temp.next;
//             i++;
//         }

//         // i=idx-1;temp->prev
//         newNode.next=temp.next;
//         temp.next=newNode;



//     }
//     public static void main(String[] args){
//         linkedlist ll = new linkedlist();
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.add(2,9);

//         ll.print();
//         System.out.println(ll.size);
//     }

// }














// public class linkedlist {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // crerte new node step 1
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;

//         }
//         // step 2 isnew node next = head
//         newNode.next=head;

//         // step 3 is head = new Node
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;

// }

// public void print(){
//     if(head==null){
//         System.out.println("LL is empty");
//         return;
//     }                                                                    // 5 errors in this program
//                                                                          // same essue upper code
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//     }
//     System.out.println();
// }
 
//     public void add(int idx,int data){
//         if (idx==0){
//             addfirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         size++;
//         Node temp = head;
//         int i=0;

//         while(i<idx-1){                                                 
//             temp=temp.next;
//             i++;
//         }

//         // i=idx-1;temp->prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeFirst(){
//         if (size == 0){
//             System.out.println(" LL is empty");
//             return Integer.MIN_VALUE;
//         }else if (size ==1){
//             int val = head.data;
//             head = tail= null;
//             size = 0;
//             return val;
//         }
//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }
//     public static void main(String[] args){
//         linkedlist ll = new linkedlist();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.add(2,9);

//         ll.print();
//         //System.out.println(ll.size);
//         ll.removeFirst();
//         ll.print();

//     }

// }














// public class linkedlist {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // crerte new node step 1
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;

//         }
//         // step 2 isnew node next = head
//         newNode.next=head;

//         // step 3 is head = new Node
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;

// }

// public void print(){
//     if(head==null){
//         System.out.println("LL is empty");
//         return;
//     }                                                                    // 5 errors in this program
//                                                                          // same essue upper code
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//     }
//     System.out.println();
// }
 
//     public void add(int idx,int data){
//         if (idx==0){
//             addfirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         size++;
//         Node temp = head;
//         int i=0;

//         while(i<idx-1){                                                 
//             temp=temp.next;
//             i++;
//         }

//         // i=idx-1;temp->prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeLast(){
//         if (size == 0){
//             System.out.println(" LL is empty");
//             return Integer.MIN_VALUE;
//         }else if (size ==1){
//             int val = head.data;
//             head = tail= null;
//             size = 0;
//             return val;
//         }
//          // prev : i=size-2
//          Node prev = head;
//          for(int i=0;i<size-2;i++){
//             prev = prev.next;
//          }
//          int val = prev.next.data;//tail.data
//          prev.next= null;
//          tail=prev;
//          size--;
//          return val;
//     }
    
//     public static void main(String[] args){
//         linkedlist ll = new linkedlist();
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.add(2,9);

//         ll.print();
//         //System.out.println(ll.size);
//         ll.removeLast();
//         ll.print();
//         System.out.println(ll.size);

//     }

// }










































// public class linkedlist {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // crerte new node step 1
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;

//         }
//         // step 2 isnew node next = head
//         newNode.next=head;

//         // step 3 is head = new Node
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;

// }

// public void print(){
//     if(head==null){
//         System.out.println("LL is empty");
//         return;
//     }                                                                    // 5 errors in this program
//                                                                          // same essue upper code
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//     }
//     System.out.println();
// }
 
//     public void add(int idx,int data){
//         if (idx==0){
//             addfirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         size++;
//         Node temp = head;
//         int i=0;

//         while(i<idx-1){                                                 
//             temp=temp.next;
//             i++;
//         }

//         // i=idx-1;temp->prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeLast(){
//         if (size == 0){
//             System.out.println(" LL is empty");
//             return Integer.MIN_VALUE;
//         }else if (size ==1){
//             int val = head.data;
//             head = tail= null;
//             size = 0;
//             return val;
//         }
//          // prev : i=size-2
//          Node prev = head;
//          for(int i=0;i<size-2;i++){
//             prev = prev.next;
//          }
//          int val = prev.next.data;//tail.data
//          prev.next= null;
//          tail=prev;
//          size--;
//          return val;
//     }
//     public int itrSearch(int key){
//         Node temp = head;
//         int i=0;

//         while(temp != null){
//             if (temp.data == key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         // key not found
//         return -1;

//     }
    
//     public static void main(String[] args){
//         linkedlist ll = new linkedlist();
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.add(2,9);

//         ll.print();
//         //System.out.println(ll.size);
//         ll.removeLast();
//         ll.print();
//         System.out.println(ll.size);

//         System.out.println(ll.itrSearch(3));
//         System.out.println(ll.itrSearch(10));

//     }

// }






























// public class linkedlist {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // crerte new node step 1
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;

//         }
//         // step 2 isnew node next = head
//         newNode.next=head;

//         // step 3 is head = new Node
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;

// }

// public void print(){
//     if(head==null){
//         System.out.println("LL is empty");
//         return;
//     }                                                                    // 5 errors in this program
//                                                                          // same essue upper code
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//     }
//     System.out.println();
// }
 
//     public void add(int idx,int data){
//         if (idx==0){
//             addfirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         size++;
//         Node temp = head;
//         int i=0;

//         while(i<idx-1){                                                 
//             temp=temp.next;
//             i++;
//         }

//         // i=idx-1;temp->prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeLast(){
//         if (size == 0){
//             System.out.println(" LL is empty");
//             return Integer.MIN_VALUE;
//         }else if (size ==1){
//             int val = head.data;
//             head = tail= null;
//             size = 0;
//             return val;
//         }
//          // prev : i=size-2
//          Node prev = head;
//          for(int i=0;i<size-2;i++){
//             prev = prev.next;
//          }
//          int val = prev.next.data;//tail.data
//          prev.next= null;
//          tail=prev;
//          size--;
//          return val;
//     }
//     public int recSearch(int key){
//         Node temp = head;
//         int i=0;

//         while(temp != null){
//             if (temp.data == key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         // key not found
//         return -1;

//     }
//     public int helper(Node head,int key){
//         if (head == null){
//             return -1;
//         }
//         if (head.data == key){
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if (idx ==-1){
//             return-1;
//         }
//         return idx +1;
    
//     }
    
//     public static void main(String[] args){
//         linkedlist ll = new linkedlist();
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.add(2,9);

//         ll.print();
//         //System.out.println(ll.size);
//         ll.removeLast();
//         ll.print();
//         System.out.println(ll.size);

//         System.out.println(ll.recSearch(3));
//         System.out.println(ll.recSearch(10));

//     }

// }






















// public class linkedlist {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // crerte new node step 1
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;

//         }
//         // step 2 isnew node next = head
//         newNode.next=head;

//         // step 3 is head = new Node
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;

// }

// public void print(){
//     if(head==null){
//         System.out.println("LL is empty");
//         return;
//     }                                                                    // 5 errors in this program
//                                                                          // same essue upper code
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//     }
//     System.out.println();
// }
 
//     public void add(int idx,int data){
//         if (idx==0){
//             addfirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         size++;
//         Node temp = head;
//         int i=0;

//         while(i<idx-1){                                                 
//             temp=temp.next;
//             i++;
//         }

//         // i=idx-1;temp->prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeLast(){
//         if (size == 0){
//             System.out.println(" LL is empty");
//             return Integer.MIN_VALUE;
//         }else if (size ==1){
//             int val = head.data;
//             head = tail= null;
//             size = 0;
//             return val;
//         }
//          // prev : i=size-2
//          Node prev = head;
//          for(int i=0;i<size-2;i++){
//             prev = prev.next;
//          }
//          int val = prev.next.data;//tail.data
//          prev.next= null;
//          tail=prev;
//          size--;
//          return val;
//     }
//     public int recSearch(int key){
//         Node temp = head;
//         int i=0;

//         while(temp != null){
//             if (temp.data == key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         // key not found
//         return -1;

//     }
//     public int helper(Node head,int key){
//         if (head == null){
//             return -1;
//         }
//         if (head.data == key){
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if (idx ==-1){
//             return-1;
//         }
//         return idx +1;
    
//     }

// public void reverse(){
//     Node prev=null;
//     Node curr= tail=head;
//     Node next;
//     while (curr != null){
//         next = curr.next;
//         curr.next=prev;
//         prev=curr;
//         curr = next;
//     }
//     head=prev;
// }
    
//     public static void main(String[] args){
//         linkedlist ll = new linkedlist();
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.add(2,9);

//         ll.print();
//         //System.out.println(ll.size);
//         ll.removeLast();
//         ll.print();
//         System.out.println(ll.size);

//         System.out.println(ll.recSearch(3));
//         System.out.println(ll.recSearch(10));

//         ll.reverse();
//         ll.print();

//     }

// }






















// public class linkedlist {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // crerte new node step 1
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;

//         }
//         // step 2 isnew node next = head
//         newNode.next=head;

//         // step 3 is head = new Node
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;

// }

// public void print(){
//     if(head==null){
//         System.out.println("LL is empty");
//         return;
//     }                                                                    // 5 errors in this program
//                                                                          // same essue upper code
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//     }
//     System.out.println();
// }
 
//     public void add(int idx,int data){
//         if (idx==0){
//             addfirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         size++;
//         Node temp = head;
//         int i=0;

//         while(i<idx-1){                                                 
//             temp=temp.next;
//             i++;
//         }

//         // i=idx-1;temp->prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeLast(){
//         if (size == 0){
//             System.out.println(" LL is empty");
//             return Integer.MIN_VALUE;
//         }else if (size ==1){
//             int val = head.data;
//             head = tail= null;
//             size = 0;
//             return val;
//         }
//          // prev : i=size-2
//          Node prev = head;
//          for(int i=0;i<size-2;i++){
//             prev = prev.next;
//          }
//          int val = prev.next.data;//tail.data
//          prev.next= null;
//          tail=prev;
//          size--;
//          return val;
//     }
//     public int recSearch(int key){
//         Node temp = head;
//         int i=0;

//         while(temp != null){
//             if (temp.data == key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         // key not found
//         return -1;

//     }
//     public int helper(Node head,int key){
//         if (head == null){
//             return -1;
//         }
//         if (head.data == key){
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if (idx ==-1){
//             return-1;
//         }
//         return idx +1;
    
//     }

// public void reverse(){
//     Node prev=null;
//     Node curr= tail=head;
//     Node next;
//     while (curr != null){
//         next = curr.next;
//         curr.next=prev;
//         prev=curr;
//         curr = next;
//     }
//     head=prev;
// }
// public void deleteNthFormEnd(int n){
//     //calculate size
//     int sz=0;
//     Node temp = head;
//     while (temp != null){
//         temp=temp.next;
//         sz++;
//     }
//     if (n==sz){
//         head=head.next;
//         return;
//     }
//     // sz-n
//     int i=1;
//     int itoFind=sz-n;
//     Node prev=head;
//     while(i<itoFind){
//         prev=prev.next;
//         i++;
//     }
//     prev.next=prev.next.next;
//     return;
// }
    
//     public static void main(String[] args){
//         linkedlist ll = new linkedlist();
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.add(2,9);

//         ll.print();
//         //System.out.println(ll.size);
//         ll.removeLast();
//         ll.print();
//         System.out.println(ll.size);

//         System.out.println(ll.recSearch(3));
//         System.out.println(ll.recSearch(10));

//         ll.reverse();
//         ll.print();

//         // in last code
//         ll.deleteNthFormEnd(3);
//         ll.print();

//     }

// }

















// public class linkedlist {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // crerte new node step 1
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;

//         }
//         // step 2 isnew node next = head
//         newNode.next=head;

//         // step 3 is head = new Node
//         head=newNode;
//     }
//     public void addlast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;

// }

// public void print(){
//     if(head==null){
//         System.out.println("LL is empty");
//         return;
//     }                                                                    // 5 errors in this program
//                                                                          // same essue upper code
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//     }
//     System.out.println();
// }
 
//     public void add(int idx,int data){
//         if (idx==0){
//             addfirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         size++;
//         Node temp = head;
//         int i=0;

//         while(i<idx-1){                                                 
//             temp=temp.next;
//             i++;
//         }

//         // i=idx-1;temp->prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeLast(){
//         if (size == 0){
//             System.out.println(" LL is empty");
//             return Integer.MIN_VALUE;
//         }else if (size ==1){
//             int val = head.data;
//             head = tail= null;
//             size = 0;
//             return val;
//         }
//          // prev : i=size-2
//          Node prev = head;
//          for(int i=0;i<size-2;i++){
//             prev = prev.next;
//          }
//          int val = prev.next.data;//tail.data
//          prev.next= null;
//          tail=prev;
//          size--;
//          return val;
//     }
//     public int recSearch(int key){
//         Node temp = head;
//         int i=0;

//         while(temp != null){
//             if (temp.data == key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         // key not found
//         return -1;

//     }
//     public int helper(Node head,int key){
//         if (head == null){
//             return -1;
//         }
//         if (head.data == key){
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if (idx ==-1){
//             return-1;
//         }
//         return idx +1;
    
//     }

// public void reverse(){
//     Node prev=null;
//     Node curr= tail=head;
//     Node next;
//     while (curr != null){
//         next = curr.next;
//         curr.next=prev;
//         prev=curr;
//         curr = next;
//     }
//     head=prev;
// }
// public void deleteNthFormEnd(int n){
//     //calculate size
//     int sz=0;
//     Node temp = head;
//     while (temp != null){
//         temp=temp.next;
//         sz++;
//     }
//     if (n==sz){
//         head=head.next;
//         return;
//     }
//     // sz-n
//     int i=1;
//     int itoFind=sz-n;
//     Node prev=head;
//     while(i<itoFind){
//         prev=prev.next;
//         i++;
//     }
//     prev.next=prev.next.next;
//     return;
// }

// public Node findMid(Node head){//helper
//     Node slow=head;
//     Node fast=head;

//     while(fast != null && fast.next != null){
//         slow = slow.next; //+1
//         fast= fast.next.next;  //+2
//     }
//     return slow;//slow is my midnode

// }
// public boolean Checkpalidrome(){
//     if(head==null||head.next==null){
//         return true;
//     }
//     // step 1 - find mid
//     Node midnode = findMid(head);

//     // step 2 - reverse 2nd half
//     Node prev = null;
//     Node curr = midnode;
//     Node next;
//     while(curr != null){
//         next=curr.next;
//         curr.next=prev;
//         prev=curr;
//         curr=next;
//     }
//     Node right = prev; //right half head
//     Node left = head;

//     //step3-check left half & right half

//     while(right != null){
//         if (left.data != right.data){
//             return false;

//         }
//         left = left.next;
//         right = right.next;
//     }
//     return true;


// }
//     public static void main(String[] args){
//         linkedlist ll = new linkedlist();
       
//         ll.addlast(1);
//         ll.addlast(2);
//         ll.addlast(2);
//         ll.addlast(1);

//         // ll.print();
//         // //System.out.println(ll.size);
//         // ll.removeLast();
//         // ll.print();
//         // //System.out.println(ll.size);

//         // System.out.println(ll.recSearch(3));
//         // System.out.println(ll.recSearch(10));

//         // ll.reverse();
//         // ll.print();

//         // // in last code
//         // ll.deleteNthFormEnd(3);
//         // ll.print();

//         ll.print();//1-2-2-1
//         System.out.println(ll.Checkpalidrome());

//     }

// }





























//  public class linkedlist {
//     public static boolean isCycle(){
//         Node slow= head;
//         Node fast= head;

//         while(fast != null && fast.next !=null){
//             slow = slow.next; //+1
//             fast = fast.next.next;//+2
//             if(slow==fast){
//                 return true;//cycle exist

//             }


//         }
//         return false;//cycle doesnit exist                              // so many errors
//     }
//     public static void main (String atgs[]){
//         head = new Node(1);
//         head.next=new Node(2);
//         head.next.next=new Node(3);
//         head.next.next.next=head;
//         //1-2-3-1
//         System.out.println(isCycle());
        
//     }
//  }

















// public class linkedlist {
//     public static void removeCycle(){
//         // detect cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle=false;
//         while(fast !=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(fast==slow){
//                 cycle=true;
//                 break;
//             }
//         }
//         if(cycle==false){
//             return;
//         }
//         // find meeting point 
//         slow= head;
//         Node prev = null; //last node
//         while(slow!=fast){
//             prev=fast;                         //so many errors
//             slow=slow.next;
//             fast=fast.next;
//         }
//         //remove Cycle->laSt .next=null
//         prev.next=null;
//     }
//     public static void main(System args[]){
//         head=new Node(1);
//         Node.temp=new Node(2);
//         head.next=temp;
//         head.next.next.next=temp;
//         //1-2-3-2
//         System.out.println(isCycle());
//         removeCycle();
//         System.out.println(isCycle());
//     }
// }














// import java .util.*;
// public class linkedlist {
//     public static void main(String args[]){
//         //crete
//         LinkedList<Integer>ll=new LinkedList<>();

//         //add
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addLast(0);
//         //0-1-2
//         System.out.println(ll);
//         //remove
//         ll.remove();
//         ll.removeFirst();
//         System.out.println(ll);

//     }

// }











// import java .util.*;
// public class linkedlist {
//     private Node getMid(Node head){
//         Node slow = head;
//         Node fast = head.next;

//         while(fast != null && fast.next != null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;//mid node
//     }
//     private Node merge (Node head1,Node head2){
//         Node mergedLL= new Node(-1);
//         Node temp=mergedLL;


//         while(head1 !=null && head2 != null){
//             if(head1.data<=head2.data){
//                 temp.next=head1;
//                 head1=head1.next;                                      //so many errors
//                 temp=temp.next;
//             }else{
//                 temp.next=head2;
//                 head2=head2.next;
//                 temp=temp.next;
//             }
//         }
//         while(head1 != null){
//             temp.next=head1;
//             head1=head1.next;
//             temp=temp.next;
//         }
//         while()(head2 != null){
//             temp.next=head2;
//             head2=head2.next;
//             temp=temp.next;
//     }
//     return mergedLL.next;

// }
// public Node mergesort (Node head){
//     if(head == null||head.data== null){
//         return head;
//     }
//     // find mid 
//     Node mid = getMid(head);
//              //left and righat ms
//              Node rightMead=mid.next;
//              mid.next=null;
//              Node newLift = mergeSort(head);
//              Node newRight = mergesort(rightMead);

//              //merge
//              return merge(newLift, newRight);
// }
// public static void main(String args[]){
//     LinkedList ll= new LinkedList();
//     ll.addFirst(1);
//     ll.addFirst(2);
//     ll.addFirst(3);
//     ll.addFirst(4);
//     ll.addFirst(5);
//     //5-4-3-2-1
//     ll.print();
//     ll.head = ll.mergeSort(ll.head);
//     ll.print();

// }
// }











