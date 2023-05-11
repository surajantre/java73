

/*public class advancepatterns {
    public static void hollow_rectangle(int totrows,int totcols){
        // outer loop
        for(int i=1; i<=totrows; i++){
            // inner loop
            for(int j = 1; j<=totcols; j++){
                // cell (i,j)
                if (i == 1|| i == totrows|| j ==  1|| j== totcols){
                    System.out.print("*");

                }else {
                    System.out.print(" ");

                }
            }
            System.out.println();
    }

    }
    public static void main(String[] args){
        hollow_rectangle(4,5);
    }
    
}*/


// public class advancepatterns {
//     public static void INVERTED_ROTETED_HALF_PIRAYMID(int  n){
        
//         for(int i=1; i<=n; i++){
            
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i;j++)
//             System.out.print("*");

                    

//                 }
//                 System.out.println( );
//             }
            
        

// 
// 
// 
// 



// public class advancepatterns {
//     public static void   zero_one_triangle(int  n){

         
//         for(int i=1; i<=n; i++){
            
//             for(int j = 1; j<=i; j++){
//                 if ((i+j)%2==0){

//                 System.out.print( "1");
//                 } else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
        
//             }
//         }
//             public static void main(String[] args){
//                 zero_one_triangle(5);
//             }
// }    



// 

// 
    





// 




// public class advancepatterns {
//     public static void    solid_rhombus(int  n){

         
//         for(int i=1; i<=n; i++){
            
//             for(int j = 1; j<=(n-i); j++){
                 

//                 System.out.print( " ");
//                 }
//                   for(int j=1; j<=n; j++){
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
        
//             }
        
//             public static void main(String[] args){
//                 solid_rhombus(5);
//             }

//         }




// 



// public class advancepatterns {
//     public static void     hollow_rhombus(int  n){

         
//         for(int i=1; i<=n; i++){
            
//             for(int j = 1; j<=(n-i); j++){
                 

//                 System.out.print( " ");
//                 }
//                   for(int j=1; j<=n; j++){
//                     if(i==1 ||i==n ||j==1 ||j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
        
//             }
//     }
//             public static void main(String[] args){
//                 hollow_rhombus(5);
//             }

//         }




// public class advancepatterns {
//     public static void   diamond (int n) {

         
//         for(int i=1; i<=n; i++){
            
//             for(int j = 1; j<=(n-i); j++){
                 

//                 System.out.print( " ");
//                 }
//                   for(int j=1; j<=(2*i-1); j++){
                     
//                     System.out.print("*");
                 
//                 }
//             }
//             System.out.println();
    

//         for(int i=n; i<=1; i--){
            
//             for(int j = 1; j<=(n-i); j++){
                 

//                 System.out.print( " ");
//                 }
//                   for(int j=1; j<=(2*i-1); j++){
                     
//                     System.out.print("*");
                 
//                 }
//             }
//             System.out.println();
        
            
//     }

        
//             public static void main(String[] args){
//                diamond(4);
//             }
        
//         }
        



// public class advancepatterns {
//     public static void   diamond (int n) {

         
//         for(int i=1; i<=n; i++){
            
//             for(int j = 1; j<=(n-i); j++){
                 

//                 System.out.println( " ");
//                 }
//                   for(int j=1; j<=(2*i-1); j++){
                     
//                     System.out.print("*");
                 
//                 }
//             }
//             System.out.println();
    

//         for(int i=n; i<=1; i--){
            
//             for(int j = 1; j<=(n-i); j++){
                 

//                 System.out.print( " ");
//                 }
//                   for(int j=1; j<=(2*i-1); j++){
                     
//                     System.out.print("*");
                 
//                 }
//             }
//             System.out.println();
        
            
//     }

        
//             public static void main(String[] args){
//                diamond(4);
//             }
        
//         }




public class str
{
  public static void main(String args[])
  {
      String var_name = "Harry";
      System.out.println(var_name.indexOf("a"));    
  }
}