// public class Arraysac {
//     public static void  countingsort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             largest=Math.max(largest,arr[i]);

//         }
//         int count[] = new int[largest + 1];
//         for (int i=0; i<arr.length; i++){
//             count[arr[i]]++;
//         }
//         // sorting
//         int j=0;
//         for(int i=0; i<arr.length; i++){
//             while(count[i]>0){
//                 arr[j] =i;                                                                   //1
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//     public static void main(String[] args){
//         int arr[]= {5,4,1,3,2};
//         countingsort(arr);
//         //
//          printArr(arr);
//     }
// }






// import java.util.Arrays;
// public class Arraysac {
//     public static void main(String[] args){                                          //1
//         int arr[]= {5,4,1,3,2};
//         Arrays.sort(arr);
//         printArr(arr);
//     }

// }





// basicshorting
// import java.util.*;
// public class Arraysac {
//     public static void bubbblesort( int arr[]){
      
//         for(int turn=0;turn<arr.length-1;turn++){
//             for(int j=0; j<arr.length-1-turn; j++){
//                 if (arr[j]>arr[j+1]){
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
                
//                 }
//             }
//         }


//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");

//             }
//             System.out.println();
//         }
//          public static void main(String args[]){
//             int arr[] ={5,4,1,3,2};
//             bubbblesort(arr);
//             printArr(arr);

//          }

//     }


