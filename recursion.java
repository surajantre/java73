// public class recursion {
//     public static void printDec(int n){
//         if (n==1){
//             System.out.print( 1+" ");
//             return;
//         }
//         System.out.print( n+" ");
//         printDec(n-1);
//     }
//     public static void main(String[] args){
//         int n=10;
//         printDec(n);
//     }
// }




// public class recursion {
//     public static void printInc(int n){
//         if (n==1){
//             System.out.print(n+" ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print( n+" ");
        
//     }
//     public static void main(String[] args){
//         int n=10;
//         printInc(n);
//     }
// }



// public class recursion {
//     public static int fact(int n){
//         if (n==0){
            
//             return 1;
//         }
//         int fnm1 = fact(n-1);
//         int fn = n*fact(n-1);
//         return fn;
         
        
//     }
//     public static void main(String[] args){
//         int n=9;
//     System.out.println(fact(n));
//     }
// }




// public class recursion {
//     public static int calcsum(int n){
//         if (n==1){
            
//             return 1;
//         }
//         int snm1 = calcsum(n-1);
//         int sn=n+snm1;
//         return sn;
         
        
//     }
//     public static void main(String[] args){
//         int n=25;
//     System.out.println(calcsum(n));
//     }
//}


// public class recursion {
//     public static int fib(int n){
//         if (n==0 || n==1){
            
//             return n;
//         }
//          int fnm1 = fib(n-1);
//          int fnm2=fib(n-2);
//          int fn = fnm1 + fnm2;
//          return fn;

         
        
//     }
//     public static void main(String[] args){
//         int n=25;
//     System.out.println(fib(n));
//     }
// }





// public class recursion {
//     public static boolean isSorted(int arr[],int i){

//         if (i==arr.length-1 ){
            
//             return true;
//         }
//         if (arr[i]>arr[i+1]){
//             return false;

//         } 
//         return isSorted(arr,i+1);
         
         
        
//     }
//     public static void main(String[] args){
//         int arr[]={1,2,9,4,};
//     System.out.println(isSorted(arr,0) );
//     }
// }



// public class recursion {
//     public static int  Occurence(int arr[],int key,int i){

//         if (i==arr.length ){
            
//             return -1;
//         }
//         if (arr[i]== key){
//             return i;

//         } 
//         return Occurence(arr,key,i+1);
         
         
        
//     }
//     public static void main(String[] args){
//         int arr[]={8,3,6,9,5,10,2,5,3};
//     System.out.println(Occurence(arr,9,0) );
//     }
// }



// public class recursion {
//     public static int lastOccurence(int arr[],int key,int i){

//         if (i==arr.length ){
            
//             return -1;
//         }
//         int isfound= lastOccurence(arr, key, i+1);
//         if(isfound ==-1 && arr[i] == key){
//             return i;
//         }
//         return isfound;

//         } 
//     public static void main(String[] args){
//         int arr[]={8,3,6,9,5,10,2,5,3};
//     System.out.println(lastOccurence(arr,5,0) );
//     }
// }





// public class recursion {
//     public static int power( int x,int n){

//         if (n== 0){
            
//             return 1;
//         }
//         int xnm1=  power( x, n-1);
//         int xn = (x*xnm1 );
//             return xn;
//         }
         
//     public static void main(String[] args){
         
//     System.out.println( power(2,10) );
//     }
// }



// public class recursion {
//     public static int optimizedpower( int a,int n){

//         if (n== 0){
            
//             return 1;
//         }
//         int  halfpowersa = optimizedpower(a, n/2)*optimizedpower(a, n/2);
//         // n is odd
//         if(n%2!=0){
//             halfpowersa= a* halfpowersa;
//         }
//         return halfpowersa;
//         }

         
//     public static void main(String[] args){
//         int a=2;
//         int n=5;
         
//     System.out.println(  optimizedpower(a,n) );
//     }
// }










// public class recursion{
//     public static int  tilingproblem(  int n){

//         if (n== 0 || n==1){
            
//             return 1;
//         }
//         //kaam
//         //vertical choice
//         int   fnm1 =  tilingproblem(n-1);
//         //horizontal choice
//         int   fnm2 =  tilingproblem(n-2);

//         int   totways =   fnm1+fnm2;
//         return totways;
//         }

         
//     public static void main(String[] args){
        
//     System.out.println(   tilingproblem(2) );
//     }
// }




// public class recursion{
//     public static  void removeduplicates(String srt,int idx,StringBuider newstr,boolean map[]){


//         if (idx == str.length() ){
//             System.out.println(newstr);
//             return;
//         }
//         //kaam
//         char currchar = srt.charAt(idx);
//         if (map[currchar -'a']== true){                                                 // 3 errors in this program
//             //duplicate duplicate
//         removeduplicates(srt, idx+1, newstr, map);

        
//     }else{
//         map[currchar - 'a'] = true;
//         removeduplicates(srt, idx+1, newstr.append(currchar),map);
//     }
// }    
//     public static void main(String[] args){
//         String str = "appnnacolllege";
//         removeduplicates(str, 0,new StringBuilder(" "), new boolean[26]);
//     }
// }


// public class recursion{
//          public static  void frindspairing(int n){
//              if (n == 1|| n==2 ){
//                  return n;
//              }
//              //choice
//              //single
//             //  int fnm1 = frindspairing(n-1);

//             //  //pair
//             //  int fnm2 = frindspairing(n-2);                                          // 3 errors in this program
//             //  int pairways = (n-1)*fnm2;
              

//             //  //ways
//             //  int totways = fnm1 + pairways;
//             //  return totways;
//             return frindspairing(n-1)+(n-1)* frindspairing(n-2);
//             }
       
//          public static void main(String[] args){
//              System.out.println(frindspairing(3));
//          }
//      }




// public class recursion{
//     public static void printbinstrings(int n, int lastplace, String str){
//         // base case
//         if (n==0){
//             System.out.println(str);
//             return;
//         }
//         //kaam
//         printbinstrings(n-1,0, str+"0");
//         if( lastplace == 0){
//             printbinstrings(n-1,1,   str+"1");
//         }
//     }
//     public static void main(String args[]){
//         printbinstrings(3, 0, " ");
//     }
// }











