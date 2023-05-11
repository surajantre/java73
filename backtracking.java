//import javax.sound.sampled.SourceDataLine;

// public class backtracking {
//     public static void changeArr(int arr[], int i,int val){
//         // base case
//         if(i==arr.length){
//             printArr(arr);
//             return;
//         }
//         //recurtion 
//         arr[i]=val;
//         changeArr(arr,i+1,val+1);
//         arr[i] = arr[i]-2;

//     }

//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length;i++){
//             System.out.print(arr[i]+" ");

//         }

//         System.out.println();
//     }
//     public static void main (String[] args){
//         int arr[] = new int[5];
//         changeArr(arr,0,1);
//         printArr(arr);
//     }
// }












// public class backtracking {
//     public static void findsubsetes(String str,String ans,int i){

//         // base case
//         if(i==str.length()){
//             System.out.println(ans);
//             return;
//         }
//         //yes choise
//         findsubsetes(str, ans+str.charAt(i),i+1);

    
//             //no choice
//         findsubsetes(str,ans,i+1);
        

// }

         
//     public static void main (String[] args){
//         String str = "abc";
//         findsubsetes(str," ", 0);
//     }

// }















// public class backtracking {
//     public static void findpermutation(String str,String ans){

//         // base case
//         if(str.length()==0){
//             System.out.println(ans);
//             return;
//         }
//         //recursion
//          for(int i=0;i<str.length();i++){
//             char curr=str.charAt(i);
//             //"abcde"="ab"+"de"="abde"
//             //is simple example of remove

//             String newstr=str.substring(0,i)+str.substring(i+1);
//             findpermutation(newstr, ans+curr);
//         }
//     }
         
//     public static void main (String[] args){
//         String str = "abc";
//         findpermutation(str," ");
//     }

// }











// public class backtracking {
//     public static void nqueens(char board[][],int row){
//         //base 
//         if(row==board.length){
//             printBoard(board);
//             return;
//         }
//         //column loop 
//         for(int j=0;j<board.length;j++){
//             board[row][j]='Q';

//             nqueens(board, row+1);//function call
//             board[row][j]='x'; //backtraking step
//         }
//     }

//     public static void printBoard(char board[][]){
//         for(int i=0; i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
        
//     } 
//     public static void main(String args[]){
//     int n=2;
//     char board[][] = new char[n][n];
//     //intielize 
//     for(int i=0; i<n; i++){
//         for(int j=0;j<n;j++){
//         board[i][j]='x';
//     }
// } 

// nqueens(board, 0);
    
  
// }
// }













// public class backtracking {


//     public static boolean issafe(char board[][],int row,int col){
//         //verticalup

//         for (int i=row-1; i>=0; i--){
//             if(board [i][col]=='q'){
//                 return false;
//             }
//         }
//         //diag left up 
//         for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
//             if(board [i][j]=='o'){
//                 return false;
//             }
//         }

//         //diag righat up 
//         for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
//             if(board [i][j]=='q'){
//                 return false;
//             }
//         }
//         return true;

//     }

//     public static void nqueens(char board[][],int row){
//         //base 
//         if(row==board.length){
//             printBoard(board);
//             return;
//         }
//         //column loop 
//         for(int j=0;j<board.length;j++){
//             if(issafe(board, row, j)){
//             board[row][j]='Q';

//             nqueens(board, row+1);//function call
//             board[row][j]='x'; //backtraking step
//         }
//     }
//     }

//     public static void printBoard(char board[][]){
//         System.out.println("-----------------chess board------------------");
//         for(int i=0; i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
        
//     } 
//     public static void main(String args[]){
//     int n=2;
//     char board[][] = new char[n][n];
//     //intielize 
//     for(int i=0; i<n; i++){
//         for(int j=0;j<n;j++){
//         board[i][j]='x';
//     }
// } 

// nqueens(board, 0);
    
  
// }
// }

















// public class backtracking {


//     public static boolean issafe(char board[][],int row,int col){
//         //verticalup

//         for (int i=row-1; i>=0; i--){
//             if(board [i][col]=='q'){
//                 return false;
//             }
//         }
//         //diag left up 
//         for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
//             if(board [i][j]=='q'){
//                 return false;
//             }
//         }

//         //diag righat up 
//         for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
//             if(board [i][j]=='q'){
//                 return false;
//             }
//         }
//         return true;

//     }

//     public static void nqueens(char board[][],int row){
//         //base 
//         if(row == board.length){
//             //printBoard(board);
//             Count++;
//             return;
//         }
//         //column loop 
//         for(int j=0;j<board.length;j++){
//             if(issafe(board, row, j)){
//             board[row][j]='Q';

//             nqueens(board, row+1);//function call
//             board[row][j]='x'; //backtraking step
//         }
//     }
//     }

//     public static void printBoard(char board[][]){
//         System.out.println("-----------------chess board------------------");
//         for(int i=0; i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
        
        
//     } 
//     static int Count = 0;
//     public static void main(String args[]){
//     int n=5;
//     char board[][] = new char[n][n];
//     //intielize 
//     for(int i=0; i<n; i++){
//         for(int j=0;j<n;j++){
//         board[i][j]='x';
//     }
// } 

// nqueens(board, 0);
    
//   System.out.println("total ways to solve n queens =" + Count);
// }


// }
















// public class backtracking {


//     public static boolean issafe(char board[][],int row,int col){
//         //verticalup

//         for (int i=row-1; i>=0; i--){
//             if(board [i][col]=='q'){
//                 return false;
//             }
//         }
//         //diag left up 
//         for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
//             if(board [i][j]=='q'){
//                 return false;
//             }
//         }

//         //diag righat up 
//         for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
//             if(board [i][j]=='q'){
//                 return false;
//             }
//         }
//         return true;

//     }

//     public static boolean nqueens(char board[][],int row){
//         //base 
//         if(row == board.length){
//             //printBoard(board);
//             Count++;
//             return true;
//         }
//         //column loop 
//         for(int j=0;j<board.length;j++){
//             if(issafe(board, row, j)){
//             board[row][j]='Q';

//            if(nqueens(board, row+1)){
//             return true;
//            }//function call
//             board[row][j]='x'; //backtraking step
//         }
//     }
//     return false;
//     }

//     public static void printBoard(char board[][]){
//         System.out.println("-----------------chess board------------------");
//         for(int i=0; i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
        
        
//     } 
//     static int Count = 0;
//     public static void main(String args[]){
//     int n=1;
//     char board[][] = new char[n][n];
//     //intielize 
//     for(int i=0; i<n; i++){
//         for(int j=0;j<n;j++){
//         board[i][j]='x';
//     }
// } 

// if(nqueens(board, 0)){
//     System.out.println("solution is possible");
//     printBoard(board);
// } else {
//     System.out.println("solution is not possible");

// }
    
//  // System.out.println("total ways to solve n queens =" + Count);
// }


// }




                  







// in upper all queens all code one big mistake sighan chenge condition






























// public class backtracking {
//     public static int gridways(int i, int j , int n, int m){
//         // base case
//         if(i==n-1 && j==m-1){
//             return 1;
//         }else if(i==n || j==n){
//             return 0;
//         }
//         int w1 = gridways(i+1, j, n, m);
//         int w2 = gridways(i, j+1, n, m);
//         return w1+w2;


//     }
//     public static void main (String args[]){
//         int n=3,m=3;
//         System.out.println(gridways(0, 0, n, m));
//     }
// }





















                        


// public class backtracking{
//     public static boolean isSafe(int sudoku[][], int col,int digit){
//         // column
//         for(int i=0; i<=8; i++){
//             if(sudoku[i][col]==digit){
//                 return false;
//         }
//     }
//     //row
//     for(int j=0; j<=8; j++){
//         if(sudoku[row][j]==digit){
//             return false;

//     }
// }
// //grid
// int sr = (row/3)*3;
// int sc = (col/3)*3;
// //3*3 grid
// for(int i=sr; i<sr+3;i++){
//     for(int j=sc; j<sc+3; j++){
//         if (sudoku[i][j]==digit){
//             return false;
//     }

// }
// }
// return true;
//                                                                                                         // 3 error
// }

// public static boolean sudokusolver(int sudoku[][],int row,int col){
//     //base case
//     if (row==9){
//     return true;
// }
// //recursion case
// int nextRow = row, nextCol= col+1;
// if(col+1==9){
//     nextRow= row+1;
//     nextCol=0;
// }
// if(sudoku[row][col]!=0){
//     return sudokusolver(sudoku,nextRow,nextCol);
// }

// for (int digit=1 ; digit<=9; digit++){
//     if(isSafe(sudoku, row, col, digit)){
//         sudoku[row][col]=digit;
//         if(sudokusolver(sudoku, nextRow, nextCol)){// solution exist
//             return true;
//         }
//         sudoku[row][col] = 0;

//         }
//     }
//     return false;
// }

// public static void printSudoku(int sudoku[][]){
//     for(int i=0; i<9;i++){
//         for(int j=0;j<9;j++){
//             System.out.print(sudoku[i][j]+" ");
//         }
//         System.out.println();
//     }
// }
// public static void main(String args[]){
//     int sudoku[][] = {{0,0,8,0,0,0,0,0,0,},
// {4,9,0,1,5,7,0,0,2},
// {0,0,3,0,0,4,1,9,0},
// {1,8,5,0,6,0,0,2,0},
// {0,0,0,0,2,0,0,6,0},
// {9,6,0,4,0,5,3,0,0},
// {0,3,0,0,7,2,0,0,4},
// {0,4,9,0,3,0,0,5,7},
// {8,2,7,0,0,9,0,1,3}};

// if(sudokusolver(sudoku, 0, 0)){
//     System.out.println("solution exists");
//     printSudoku(sudoku);
// }else{
//     System.out.println("solution does not exists");
// }
// }
// }

