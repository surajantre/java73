// public class Strings{
//     public static float getshortestpath(String path){ {
//         int x=0,y=0;
//         for(int i=0; i<path.length(); i++){
//             char dir = path.charAt(i);
//             // south
//             if(dir =='s'){
//                 y--;
//             }
//             //north
//             else if(dir == 'n'){
//                 y++;
//             }
//             //WEst
//             else if(dir == 'w'){
//                 x--;
//             }
//             //East
//             else{
//                 x++;
//             }


//         }

//         int x2 = x*x;
//         int y2 = y*y;
//         return (float)Math.sqrt(x2+y2);
//     }
//     }
//     public static void main(String args[]) {
//         String path ="wneenesennn";
//         System.out.println(getshortestpath(path));
        
//     }

// }


                                  //substring 


// public class Strings{
//     public static String substring(String str,int si,int ei) {
//         String substr =" ";
//         for(int i=si; i<=ei; i++){
//             substr += str.  charAt(i);
        
 
//         }
//         return substr;        
//     }
//     public static void main(String[] args) {
//         // substring
//         String str = "Helloworld";
//         System.out.println(substring(str,0,3));
//     }
// }



                                 // find largest strinpublic class Strings
    
// public class Strings{   
//     public static void main(String args[]){
//         String fruits[]= {"apple", "mango","banana","orange"};
//         String largest = fruits[0];
//         for(int i=1; i<fruits.length; i++){
//             if(largest.compareTo(fruits[i]) < 0){
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);

//     }
// }




// public class Strings{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("");
//         for(char ch='a'; ch<='z'; ch++){
//             sb.append(ch);
//         }
//         System.out.println(sb);
//     }
// }



// public class Strings{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("");
//         for(char ch='a'; ch<='z'; ch++){
//             sb.append(ch);
//         }
//         System.out.println(sb.length());
//     }
// }






// public class Strings{
//     public static String toUppercase(String str){
//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i=1; i<str.length(); i++){
//             if(str.charAt(i)==' '&& i<str.length()-1) {
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));

//             } else {
//                 sb.append(str.charAt(i));

//             }
//         }
//         return sb.toString();
//     }
//     public static void main (String args[]){
//         String str = "hi, i am shradha";
//         System.out.println(toUppercase(str));
//     }
// }





// public class Strings{
//     public static String compress(String Str){
//         String newStr = "";
        
//         for(int i=0; i<Str.length(); i++  ){
//             Integer count = 1;
//             while(i<Str.length()-1&& Str.charAt(i) == Str.charAt(i+1)) {
//                 count++;
//                 i++;


//             }
//             newStr  += Str.charAt(i);
//             if(count> 1){
//                 newStr += count.toString();

//             }

//         }
//         return newStr;
//     }
//     public static void main(String args[]) {
//         String Str ="aaabbcccdd";
//         System.out.println(compress(Str));
        
//     }
// }











