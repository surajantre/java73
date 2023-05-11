 
//public class bitmanupulation {
//     public static void main(String[] args){
//     System.out.println((5 & 6));
//     }
// }





// public class bitmanupulation {
//     public static void main(String[] args){
//     System.out.println((5 | 6));
//     }
// }





// public class bitmanupulation {
//     public static void main(String[] args){
//     System.out.println((5 ^ 6));
//     }
// }



// public class bitmanupulation {
//     public static void main(String[] args){
//     System.out.println((~5));
//     }
// }





// public class bitmanupulation {
//         public static void main(String[] args){
//         System.out.println((5<<6));
//         }
//     }
    




// public class bitmanupulation {
//     public static void main(String[] args){
//     System.out.println((5>>6));
//     }
// }





// public static void oddOrEven(int n){
//     int bitMask =1;
//     if ((n & bitMask)==0){
//         // even numbers 
//         System.out.println("even number");

//     }
//     else {
//         System.out.println("odd number");
//     }

// }

// public static void main(String[] args){
//     oddOrEven(3);
//     oddOrEven(11);
//     oddOrEven(14);
// }

// }



// public static int grtithbit(int n, int i){
//     int bitmask = 1<<i;
//     if((n& bitmask)==0){
//     return 0;
    
// } else {
//     return 1;
// }
// }
// public static void main(String[] args){
//     System.out.println(grtithbit(10,9));
// }
// }




// public static int setithbit(int n, int i){
//          int bitmask = 1<<i;
//          return n | bitmask;
// }

// public static void main (String[] args){
//     System.out.println(setithbit(10,2));
// }
// }




// public static int setithbit(int n, int i){
//     int bitmask = ~(1<<i);
//     return n & bitmask;
// }

// public static void main (String[] args){
// System.out.println(setithbit(10,1));
// }
// }



// public static int updateIthBit(int n, int i,int newbit){
//     //  if(newbit == 0) {
//     //     return clearItBit(n,i);

//     //  }else{
//     //     return setItBit(n,i);

//     //  }
//     // }


//                                                                                   //1 error
//     n = clearIthBit(n, i);
//     int BitMask = newbit<<i;
//     return n | BitMask;
// }
// public static void main (String[] args){
// System.out.println(updateIthBit(10,2,1));
// }
// }







//  public static int clearIBit(int n,int i){
//     int bitMask = (~0)<<i;
//     return n & bitMask;


//  }
//  public static void main (String[] args){
//     System.out.println(clearIBit(15,2));
//  }
// }


// public static int clearIBits(int n,int i,int j){
//     int a = ((-0)<<(j+1));
//     int b = (1<<i)-1;
//     int bitMask = a|b;
//     return n & bitMask;
// }
// public static void main (String[] args){
//     System.out.println(clearIBits(10,2,4));
// }
// }



// public static boolean isPowerOfTwo(int n){
//     return (n & n-1) ==0;

// }
// public static void main(String[] args){
//     System.out.println(isPowerOfTwo(16));
// }
// }







// public static int countSetBit(int n) {
//     int count = 0;
//     while (n>0){
//         if ((n&1)!=0){
//             count++;
//     }    
//     n=n>>1;
// }
// return count;
// }
// public static void main(String[] args){
//     System.out.println(countSetBit(50));
// }
// }




// public static int fastExpo(int a,int n){
//     int ans=1;
//     while(n>0){
//         if ((n&1)!=0){
//             ans = ans*a;
//         }
//         a=a*a;
//         n=n>>1;

//     }
//     return ans;
// }
// public static void main(String[] args){
//     System.out.println(fastExpo(5,3));
// }
// }








