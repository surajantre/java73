// import java.util.*;

// import javax.sound.sampled.SourceDataLine;
// public class stacks {
//     static class Stack{
//         static ArrayList<Integer>list=new ArrayList<>();
//         public static boolean isEmpty(){
//             return list.size()==0;
//         }
//         //push
//         public static void push(int data){
//             list.add(data);
//         }
//         //pop
//         public static int pop(){
//             int top=list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;

//         }
//         //peek
//         public static int peek(){
//             return list.get(list.size()-1);

//         }
//     }
//     public static void main(String[] args){
//         Stack s = new Stack();
//         s.push(1); 
//         s.push(2);
//         s.push(3);
//         while(!s .isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
    
// }













// import java.util.*;


// public class stacks {
//     static class Node{
//         int data;
//         Node next;
//         Node (int data){
//             this.data=data;
//             this.next=null;

//         }
//         }
//     static class stack {
//         static Node head=null;
//         public static boolean isEmpty(){
//             return head==null;
//         }
//             //push
//             public static void push(int data) {
//                 Node newNode=new Node(data);

//                 if(isEmpty()){
//                     head=newNode;
//                     return;
//                 }
//                 newNode.next=head;
//                 head=newNode;

//             }
//             //pop
//             public static int pop(){
//                 if (isEmpty()){
//                     return -1;


//             }
//             int top = head.data;
//             head=head.next;
//             return top;

//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }
    
//     public static void main(String[] args){
//         Stack s = new Stack();
//         s.push(1); 
//         s.push(2);
//         s.push(3);
//         while(!s .isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
    
// }








// import java.util.*;
// public class stacks {
//     public static void main(String[] args){
//         Stack<Integer>s=new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s .isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

        
//     }
    
// }








// import java.util.*;
// public class stacks{
//     public static void pushAtBottom(Stack<Integer>s,int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;

//         }
//         int top=s.pop();
//         pushAtBottom(s,data);
//         s.push(top);

//     }
//     public static void main(String args[]){
//         Stack<Integer>s=new Stack<>();
//         s.push(1);
//          s.push(2);
//          s.push(3);

//          pushAtBottom(s, 4);

//          while(!s .isEmpty()){
//              System.out.println(s.pop());
//          }
            

//     }
// }





// import java.util.*;
//  public class stacks{
//     public static String reverseString(String str){
//         Stack<Character>s=new Stack<>();
//         int idx=0;
//         while(idx<str.length()){
//             s.push(str.charAt(idx));
//             idx++;

//         }
//         StringBuilder result=new StringBuilder(" ");
//         while(!s.isEmpty()){
//             char curr = s.pop();
//             result.append(curr);

//         }
//         return result.toString();


//     }
//     public static void main(String args[]){
//         String str = "abc";
//         String result = reverseString(str);
//         System.out.println(result);
//     }
//  }








// import java.util.*;
// public class stacks{
//     public static void pushAtBottom(Stack<Integer>s,int data) {
//         if(s.isEmpty()){
//             s.push(data);
//             return;

//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);


// }
// public static void reverseStack(Stack<Integer>s){
//     if(s.isEmpty()){
//         return;
// }
// int top=s.pop();
// reverseStack(s);
// pushAtBottom(s, top);                                // 1 error

// }
// public static void printStack(Stack<Integer>s){
//     while(!s.isEmpty()){
//         System.out.println(s.app());
//     }
// }
// public static void main(String[] args){
//     Stack<Integer>s=new Stack<>();
//         s.push(1);
//           s.push(2);
//           s.push(3);//321
//           reverseStack(s);
//           printStack(s);


// }
// }








// import java.util.*;
// public class stacks{
//     public static void Stackspan(int Stack[],int span[]){
//         Stack<Integer>S=new Stack<>();
//         span[0]=1;
//         S.push(0);

//         for (int i=0;i<Stack.length;i++){
//             int currprice=Stack[i];
//             while(!S.isEmpty()&&currprice>Stocks[s.peek()]){
                
//                     S.pop();

//                 }
//                 if(S.isEmpty()){
//                     span[i]=i+1;

//                 }else{
//                     int prevHigh=S.peek();
//                     span[i]=i-prevHigh;

//                 }
//                 S.push(i);

//         }
//     }
        
//         public static void main (String args[]){
//             int Stocks[] = (100,80,60,70,60,85,100);
//             int Span[]=new int [Stocks.length];
//             Stackspan(Stocks, Span);

//             for(int i=0; i<Span.length;i++){
//                 System.out.println(Span[i]+" ");

//             }

        
    
// }

// }
 







// import java.util.*;

// import javax.sound.sampled.SourceDataLine;
// public class stacks{
//     public static void main(String[] args){
//         int arr[] = {6,8,0,1,3};
//         Stack<Integer>s=new Stack<>();
//         int nxtGreater[]=new int[arr.length];

//         for (int i=arr.length-1; i>=0;i--){
//             while (!s.isEmpty()&& arr[s.peek()]<=arr[i]){
//                 s.pop();
//             }

//             if(s.isEmpty()){
//                 nxtGreater[i]=-1;
//             }else{
//                 nxtGreater[i]=arr[s.peek()];
//             }

//             //3 push in s
//             s.push(i);
//         }
//         for(int i=0; i<nxtGreater.length;i++){
//         System.out.println(nxtGreater[i]+" ");

//     }
//     System.out.println();
// }

// }





