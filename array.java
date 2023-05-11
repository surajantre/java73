 
// import java.util.*;
// public class array {
//     public static void main(String args[]){
//         //class name object name = new class name ();
//         ArrayList<Integer>List=new ArrayList<>();
//         ArrayList<String>List2=new ArrayList<>();
//         ArrayList<Boolean>List3=new ArrayList<>();

//         // add elements 


//         List.add(1); //O(1)
//         List.add(2);
//         List.add(3);
//         List.add(4);
//         List.add(5);
//         List.add(6);

//         System.out.println(List);




//         // get elements
//         int elements = List.get(2);
//         System.out.println(elements);



//         // remove elements - O(1)

//         List.remove(2);
//         System.out.println(List);



//         // set elements at index - O(n)

//         List.set(2,10);
//         System.out.println(List);



//         //contains elements - O(n)
//         // cheking elements

//         System.out.println(List.contains(1));
//         System.out.println(List.contains(11));


//        // add any index any number for ex index 1 par 9
//        List.add(1,9); // - O(n)
//        System.out.println(List);

//     }
// }





// import java.util.*;
// public class array {
//     public static void main(String args[]){
//         //class name object name = new class name ();
//         ArrayList<Integer>List=new ArrayList<>();
//         ArrayList<String>List2=new ArrayList<>();
//         ArrayList<Boolean>List3=new ArrayList<>();

//         // add elements 


//         List.add(1); //O(1)
//         List.add(2);
//         List.add(3);
//         List.add(4);
//         List.add(5);
//         List.add(6);

//         System.out.println(List.size());
//     }
// }









// import java.util.*;
// public class array {
//     public static void main(String args[]){
//         //class name object name = new class name ();
//         ArrayList<Integer>List=new ArrayList<>();
//         ArrayList<String>List2=new ArrayList<>();
//         ArrayList<Boolean>List3=new ArrayList<>();

//         // add elements 


//         List.add(1); //O(1)
//         List.add(2);
//         List.add(3);
//         List.add(4);
//         List.add(5);
//         List.add(6);

//         System.out.println(List.size());

//         // print the array
//         for(int i=0; i<List.size(); i++){
//             System.out.print(List.get(i)+" ");
//         }
//         System.out.println();
//     }
// }







// import java.util.*;
// public class array {
//     public static void main(String args[]){
//         //class name object name = new class name ();
//         ArrayList<Integer>List=new ArrayList<>();
//         ArrayList<String>List2=new ArrayList<>();
//         ArrayList<Boolean>List3=new ArrayList<>();

//         // add elements 


//         List.add(1); //O(1)
//         List.add(2);
//         List.add(3);
//         List.add(4);
//         List.add(5);
//         List.add(6);
//                            // for reverce arraylist-O(n)
//         for (int i=List.size()-1; i>=0;i--){
//             System.out.print(List.get(i)+" ");
//         }
//         System.out.println();
//     }
// }












// import java.util.*;
// public class array {
//     public static void main(String args[]){
//         //class name object name = new class name ();
//         ArrayList<Integer>List=new ArrayList<>();
//         ArrayList<String>List2=new ArrayList<>();
//         ArrayList<Boolean>List3=new ArrayList<>();

//         // add elements 


//         List.add(2); //O(1)
//         List.add(5);
//         List.add(9);
//         List.add(6);
//         List.add(8);
         

//          int max= Integer.MIN_VALUE;
//          for(int i=0; i<List.size();i++){
//             if(max<List.get(i)){
//                 max=List.get(i);
//             }

//          }
//          System.out.println("max element =" + max);

//     }
// }







 
// import java.util.*;
// public class array {
//     public static void swap(ArrayList<Integer>list,int idx1,int idx2){
//         int temp = list.get(idx1);
//         list.set(idx1,list.get(idx2));
//         list.set(idx2,temp);
//     }
//     public static void main(String args[]){
//         //class name object name = new class name ();
//         ArrayList<Integer>list=new ArrayList<>();
         
//         // add elements 


//         list.add(2); //O(1)
//         list.add(5);
//         list.add(9);
//         list.add(3);
    
//         list.add(6);

//         int idx1=1, idx2=3;
//         System.out.println(list);
//         swap(list,idx1,idx2);
//         System.out.println(list);
//     }
// }



















// import java.util.*;
// public class array {
    
//     public static void main(String args[]){
//         //class name object name = new class name ();
//         ArrayList<Integer>list=new ArrayList<>();
         
//         // add elements 


//         list.add(2); //O(1)
//         list.add(5);
//         list.add(9);
//         list.add(3);
    
//         list.add(6);

//          System.out.println(list);
//          Collections.sort(list); // assending order
//          System.out.println(list);




//          Collections.sort(list,Collections.reverseOrder()); // dissending order
//          System.out.println(list);
//     }
// }









 
// import java.util.*;
//    public class array {
//     public static void main(String args[]){
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 =new ArrayList<>();
//         ArrayList<Integer> list2 =new ArrayList<>();
//         ArrayList<Integer> list3 =new ArrayList<>();

//         for(int i=1; i<=5; i++){
//             list1.add(i*1);//12345
//             list2.add(i*2);//2 4 6 8 10
//             list3.add(i*3);// 3 6 9 12 15

//         }
//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);

//         System.out.println(mainList);


//         // nested loop
//         for(int i=0; i<mainList.size();i++) {
//             ArrayList<Integer>currList=mainList.get(i);

//             for(int j=0; j<currList.size();j++){
//                 System.out.print(currList.get(j)+" ");
//             }
//             System.out.println();
//         }

//     }
//    }

















// import java.util.*;
//     public class array {
//         public static int storewater(ArrayList<Integer>height){
//         int maxwater = 0;
//         // brute force.
//         for(int i=0; i<height.size();i++){
//             for(int j=i+1; j<height.size();j++){
//                 int nt= Math.min(height.get(i),height.get(j));
//                 int width = j-i;
//                 int currwater=nt*width;
//                 maxwater=Math.max(maxwater,(currwater));


//         }
//     }
//     return maxwater;
//     }

//     public static void main(String args[]){
//                ArrayList<Integer>height=new ArrayList<>();
//                //1 ,8,6,2,5,4,8,3,7
//                height.add(1);
//                height.add(8);
//                height.add(6);
//                height.add(2);
//                height.add(5);
//                height.add(4);
//                height.add(8);
//                height.add(3);
//                height.add(7);

//                System.out.println(storewater(height));
                 
         
//     }
// }







// import java.util.*;
//     public class array {
//         public static int storewater(ArrayList<Integer>height){
//         int maxwater = 0;
//         int lp=0;
//         int rp=height.size()-1;
        
//         while(lp<rp){
//             //calculate water area
//             int ht=Math.min(height.get(lp),height.get(rp));
//             int width=rp-lp;
//             int currwater=ht*width;
//             maxwater=Math.max(maxwater,currwater);

//             // update ptr.
//             if(height.get(lp)<height.get(rp)){
//                 lp++;
//             }else{
//                 rp--;
//             }
//         }
//     return maxwater;
//     }

//     public static void main(String args[]){
//                ArrayList<Integer>height=new ArrayList<>();
//                //1 ,8,6,2,5,4,8,3,7
//                height.add(1);
//                height.add(8);
//                height.add(6);
//                height.add(2);
//                height.add(5);
//                height.add(4);
//                height.add(8);
//                height.add(3);
//                height.add(7);

//                System.out.println(storewater(height));
                 
         
//     }
// }


















// import java.util.*;
//     public class array {
//         public static boolean pairsum1(ArrayList<Integer>list,int target){

//             for(int i=0; i<list.size(); i++){
//                 for(int j=i+1;j<list.size(); j++){
//                     if(list.get(i)+list.get(j)==target){
//                         return true;
//                     }
//                 }
//             }
//             return false;
//         }
//         public static void main(String args[]){
//                            ArrayList<Integer>list=new ArrayList<>();
                            
//                             list.add(1);
//                             list.add(2);
//                             list.add(3);
//                             list.add(4);
//                             list.add(5);
//                              list.add(6);
//                             int target=5;
//                             System.out.println(pairsum1(list, target));
                             
//         }
// }




















// import java.util.*;
//     public class array {
//         public static boolean pairsum1(ArrayList<Integer>list,int target){
//             int lp=0;
//             int rp=list.size()-1;

//             while(lp != rp){
//                 // case1
//                 if(list.get(lp)+list.get(rp)==target){
//                     return true;
//                 }
//                 //case 2
//                 if(list.get(lp)+list.get(rp)<target){
//                     lp++;

//             }else{
//                 // case3 
//                 rp--;
//             }

//         }
//             return false;
//         }
//         public static void main(String args[]){
//                            ArrayList<Integer>list=new ArrayList<>();
                            
//                             list.add(1);
//                             list.add(2);
//                             list.add(3);
//                             list.add(4);
//                             list.add(5);
//                              list.add(6);
//                             int target=5;
//                             System.out.println(pairsum1(list, target));
                             
//         }
// }





















// import java.util.*;
//     public class array {
//         public static boolean pairsum2(ArrayList<Integer>list,int target){
//             int bp=0;
//             int n=list.size();
//              for(int i=0;i<n;i++){
//                 if(list.get(i)>list.get(i+1)){// breking point

//                     bp=i;
//                     break;

//                 }
//              }

//              int lp=bp+1; // samallest
//              int rp=bp;  // largest


//              while(lp!=rp){
//                  //case 1
//                  if(list.get(lp)+list.get(rp)==target){
//                     return true;
//                  }
//                  //case2 
//                  if(list.get(lp)+list.get(rp)<target){
//                     lp=(lp+1)%n;

//                  }else{
//                     // case 3
//                     rp=(n+rp-1)%n;
//                  }
                 
//              }
//              return false;
//         }
//         public static void main(String args[]){
//                            ArrayList<Integer>list=new ArrayList<>();
                            
//                             list.add(11);
//                             list.add(15);
//                             list.add(6);
//                             list.add(8);
//                             list.add(9);
//                              list.add(10);
//                             int target=16;
//                             System.out.println(pairsum2(list, target));
                             
//         }
//     }




















