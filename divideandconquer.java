






                                   // merge sort code

// public class divideandconquer {
//     public static void printArr(int arr[]){
//         for (int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void mergrsort(int arr[],int si,int ei){
//         if (si>=ei){
//             return;
//         }
//                   // kassm
//                   int mid = si +(ei - si)/2;
//                   mergrsort(arr, si, mid);
//                   mergrsort(arr, mid+1, ei);
//                   merge(arr, si,mid, ei);

//     }
//     public static void merge(int arr[],int si,int mid,int ei){
//         int temp[]= new int[ei-si+1];
//         int i = si;
//         int j = mid +1;
//         int k = 0;

//         while (i<=mid && j<=ei){
//             if (arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++;

//             }else{
//                 temp [k] = arr[j];
//                 j++;

//             }
//             k++;
//         }

//         // left part 
//         while(i<=mid){
//             temp[k++]=arr[i++];
        
//         }
//         //righat part
//         while (j<=ei){
//             temp [k++]=arr[j++];

//         }
//         //copy temp to orignal arr 
//         for(k=0,i=si;k<temp.length;k++,i++){
//             arr[i]=temp[k];
//         }

//     }

//     public static void main(String args[]){
//         int arr []={6,3,9,5,2,8};
//         mergrsort(arr,0,arr.length-1);
//         printArr(arr);
//     }

// }





// public class divideandconquer {
//     public static void printArr( int arr[]){
//         for(int i=0; i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void quickSort(int arr[],int si,int ei){
//         if(si>ei){
//             return;
//         }
//         // last element
//         int pIdx = partition (arr,si,ei);
//         quickSort(arr,si,pIdx-1); //left
//         quickSort( arr,pIdx+1,ei);  // righat
    
//     }
//     public static int partition (int arr[],int si,int ei) {
//         int pivot = arr [ei];
//         int i=si-1;

//         for (int j=si; j<ei; j++){
//             if (arr [j] <= pivot){
//                 i++;
//                 // swap
//                 int temp = arr [j];
//                 arr [j] = arr [i];
//                 arr [i] = temp;

//             }

//         }
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i];
//         arr[i] = temp;
//         return i ;

//     }



//     public static void main(String[] args) {
//         int arr[]={6,3,9,8,2,5};
//         quickSort(arr,0,arr.length-1);
//         printArr(arr);

        
//     }

//     }








// public class divideandconquer {
//     public static int search(int arr[],int tar, int si,int ei){
//         if (si>ei){
//             return-1;

//         }
//         // kaam
//         int mid = si + (ei-si)/2;

//         //case found 
//         if(arr[mid] == tar){
//             return mid;

//         }

//         //mid on L1
//         if(arr[si]<= arr[mid]){
//             // case a : lleft
//             if(arr[si]<= tar && tar <=arr[mid]) {
//                 return search(arr,tar,si,mid-1);

//             }else{
//                 //case b ; right
//                 return search(arr,tar,mid+1,ei);

//             }
//         }
//         // mid on l2
//         else {
//             //case c right
//             if(arr[mid] <= tar && tar<= arr[ei]){
//                 return search(arr,tar,mid+1,ei);
//             }else{
//                 //case d ; left
//                 return search(arr,tar,si,mid-1);
//             }
//         }


//     }
//     public static void main (String args[]){
//         int arr[]={4,5,6,0,1,2};
//         int target = 6;
//         int tarIdx = search(arr ,target,0, arr.length-1);
//         System.out.println(tarIdx);
//     }
// }