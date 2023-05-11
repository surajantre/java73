/*public class functions {
    public static void printHW() {
        System.out.println("H W");
        System.out.println("H W");
        System.out.println("H W");
        
    }
    public static void main(String[] args){
        printHW();
    }
    
}
*/


/*import java.util.*;
public class functions {
     public static int calculatesum(int num1,int num2) {
        int sum = num1 + num2;
        return sum;
     }
     
     public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a,b);
        System.out.println("sum is : " + sum);
     }
    }
    */



     /* 
          public class functions {
            public static int multiply(int a,int b) {
                int product = a * b;
                return product;
            }

         public static void main(String[] args){
            int a = 500;
            int b = 3;
            int prod = multiply(a, b);
            System.out.println("a  *  b = " + prod);
        


    }
          }
          */ 

          // for ncr = n!/r!(n_r)!
        
           /*  public class functions {
            public static int factorial(int n) {
                int f = 1;

                for (int i=1; i<=n;i++){
                    f=f*i;
                }
                return f;

            }
             



 
            public static int bincoeff(int n,int r) {
                int fact_n = factorial(n);
                int fact_r = factorial(r);
                int fact_nmr = factorial(n-r);

                int bincoeff = fact_n/(fact_r * fact_nmr);
                return bincoeff;
            }
            public static void main(String args[]){
                System.out.println(bincoeff(5,1));
            }
        }
*/

/*public class functions {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b,int c ){
        return a+b+c;
}
public static void main(String args[]){
    System.out.println(sum(2,3));
    System.out.println(sum(1,3,5));
}
}*/


/*public class functions {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b,float c ){
        return a+b+c;
}
public static void main(String args[]){
    System.out.println(sum(2,3));
    System.out.println(sum(1.2f,3.3f,5.4f));
}
}
*/


/*public class functions {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i <= n-1; i++) {
            if (n % i==0){
                isPrime = false;
                break;
            }
        }
            return isPrime;


    
}
    public static void main(String[] args){
        System.out.println(isPrime(3));
    }


}*/


/*public class functions {
    public static boolean isPrime(int n){
        if (n==2) {
            return true;

        }
        for(int i=2; i <=Math.sqrt(n); i++) {
            if (n %1==0){
                return false;

    }

}     
return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(10));

    }
}*/

/*public class functions {
    public static void PrimesInRange(int n){
        for(int i=2; i<=n; i++){
            if (isPrime =(i)){
                System.out.println(i+"");                         // one error in code above
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PrimesInRange (20);


}

}   */

/*public class functions {
    public static void bintodec(int bin num){
        int myNum = binnum;
        int pow = 0;
        int decNum = 0;

        while ( binnum>0){
            int lastDigit = binnum %10;
            decNum = decNum + (lastDigit +(int)Math.pow(2,pow));              // one error in code above
            pow++;
            bin num = binnum/10;

        }
        System.out.println("decimal of" +MyNum+"="+decNum);
 
    }
    public static void main(String[] args){
        bintodec(7);

    }
}

*/



/*public class functions {
    public static void dectobin(int n){
        int MyNum = n;
        int pow = 0;
        int binNum = 0;

        while ( n>0){
            int rem = n % 2;
            binNum = binNum + (rem *(int)Math.pow(10,pow));              
            pow++;
            n = n/2;

        }
        System.out.println("binary form of" + MyNum + "="+binNum);
 
    }
    public static void main(String[] args){
        dectobin(123);

    }
}

*/




/*public class functions {
    public static void dectobin(int n){
        int MyNum = n;
        int pow = 0;
        int binNum = 0;

        while ( n>0){
            int rem = n % 2;
            binNum = binNum + (rem *(int)Math.pow(10,pow));              
            pow++;
            n = n/2;

        }
        System.out.println("binary form of" + MyNum + "="+binNum);
 
    }
    public static void main(String[] args){
        dectobin(123);

    }
}

*/



























