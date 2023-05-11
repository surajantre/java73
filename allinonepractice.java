/*public class allinonepractice {
    public static void main(String[] args){
        System.out.println("allinonepractice");
    }
    
}*/
/*import java.util.*;
public class allinonepractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name =sc.next ();
        System.out.println(name);


    }
}    */
/* 
import java.util.*;
public class allinonepractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product =  a*b;
        System.out.println(product);

    }

}*/


/*import java.util.*;
public class allinonepractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println(area);
    }
}*/
/* 
import java.util.*;
public class allinonepractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt ();
        if (number % 2 ==0){
            System.out.println("EVEN");

        }else {
            System.out.println("ODD");
        }
        




    }
}

*/

/* 

//import java.util.*;
public class allinonepractice {
    public static void main(String[] args){
     //
     //   Scanner sc = new Scanner(System.in);
     int age = 12;
     if (age >= 18){
        System.out.println("aduit");
     }
     else if (age >= 13 && age <18){
        System.out.println("teenager");
     }
     else {
        System.out.println("child");
     }

    }
}
*/

/*public class allinonepractice {
    public static void main(String[] args){
        int A = 34;
        int B = 3345;
        int C = 6;
        if ((A>=B)&& (A>=C)){
            System.out.println("A");
        }

        else if (B>=C){
            System.out.println("B");
        }
        else 
        System.out.println("C");

    

    
}
}*/


/* 
public class allinonepractice {
    public static void main(String[] args){
        float number =  12;
        String type = ((number % 2)==0)?"even":"odd";
        System.out.println(type);
    }
}
*/

/*public class allinonepractice {
    public static void main(String[] args){
        int marks = 79;
        String status = marks >= 33 ? "pass": "fail";
        System.out.println(status);

    }
    
}
*/

/*public class allinonepractice {
    public static void main(String[] args){
        int number =    234; 
        switch (number) {
            case 1 : System.out.println("samosa");
            break;
            case 2 : System.out.println("borger");
            break;
            case 3 : System.out.println("mango shake");
            break;
            default : System.out.println("we realize we are dreaming");
        }
    }
}*/

/* 
import java.util.*;
public class allinonepractice {
    public static void main(String[] args){
        System.out.println("my first carculater");
        Scanner Sc = new Scanner(System.in);
        System.out.println("Entre a : ");
        int a = Sc.nextInt();
        System.out.println("Entre b : ");
        int b = Sc.nextInt();
        System.out.println("Entre operater :");
        char operater = Sc.next().charAt(0);
        switch (operater) {
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;
            default : System.out.println("wrong operater");



        }



    }

}*/


/*public class allinonepractice {
    public static void main(String[] args){
        int counter = 0;
        while (counter < 12){
            System.out.println("suraj dattatray antre");
            counter++;
        }

    }
}*/
/*import java.util.*;
public class allinonepractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int range = sc .nextInt ();
        int counter = 1;
        while (counter <= range){
            System.out.println(counter+ " ");
            counter++;

        }
        System.out.println();
    }
}*/

/*public class allinonepractice {
    public static void main(String[] args){
        int counter = 1;
        while (counter <=14){
            System.out.println(counter);
            counter++;
        }
        System.out.println();

    }
}*/

/*public class allinonepractice {
    public static void main(String[] args){
        for (int i = 0; i <= 2; i++) {
            System.out.println("suraj antre");

    }
}
}*/

/*public class allinonepractice {
    public static void main(String[] args){
        for(int i = 1; i<=4;i++){
            System.out.println("* * * *");
        }

    
    }
}*/
/*import java.util.*;
public class allinonepractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        int i = 1;
        while (i<=n){
            sum += i;
            i++;
        }
        System.out.println(  sum  );


        }


    }
*/

// do while loop
/*public class allinonepractice {
    public static void main(String[] args){
        int counter = 1 ;
        do{
            System.out.println("h  w");
            counter++;

        }
        while (counter <=5);

    }
}*/


// reverce of number

/*public class allinonepractice {
    public static void main(String[] args){
        int n = 1234567890;
        while (n>0){
            int lastdigit = n % 10;
            System.out.print(lastdigit );
            n= n/10;
        }
        System.out.println();
    }
}*/


/*import java.util.*;
public class allinonepractice {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);    
        do{
            System.out.println("enter your number");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("number was : "+n);
        }while (true);
}
}
*/


/* 
import java.util.*;
public class allinonepractice {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); 
        do{ System.out.println("enter your number :");
        int n = sc.nextInt();
        if (n%10==0){
            break;

    
    
    }System.out.println(n);

    }while (true);
}
}
*/


// star pattern for


/*public class allinonepractice {
    public static void main(String[] args){
        int n = 4;
        for(int line = 1; line <=4; line++) {
            for (int star = 1;star <= line ; star++ ){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}*/

/*public class allinonepractice {
    public static void main(String[] args){
        int n = 4;
        for(int line = 1; line <=4; line++) {
            for (int star = 1;star<=4-line+1 ; star++ ){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
*/


/* 
public class allinonepractice {
    public static void main(String[] args){
        int n = 5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print( j);
            }
            System.out.println();

        }

    }
}
*/


/*public class allinonepractice {
    public static void main(String[] args){
        int n=5;
        char ch = 'A';
        for(int line = 1; line <=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(chars);
                ch++;
            }
            System.out.println();
        }


    }
} */












































































/*public class allinonepractice {
    public static void main(String[] args){
        int n=5;
        char ch = 'A';
        for(int line = 1; line <=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(chars);
                ch++;
            }
            System.out.println();
        }


    }
} */













































