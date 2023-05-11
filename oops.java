 

// import java.util.*;
// public class oops {
//     public static void main(String []args) {
//         pen p1 = new pen();
//         p1.setColor("Blue");
//         System.out.println(p1.getColor());
//         p1.setTip(5);
//         System.out.println(p1.getTip());
//         //p1.setcolour"yellow
//         p1.setColor("Yellow");
//         System.out.println(p1.getColour());
//         }
//     }                                                                   // 4 error in this program
// class pen {
//     private String Color;
//     private int tip;
//     String getcolour(){
//         return this.Color;
//     }
//     int getTip(){
//         return this.tip;

// }
// void setcolor(String newColor){
//     this.Color = newColor;
// }
// void setTip (int tip) {
//     this.tip = tip;
// }
// }






// public class oops{
//     public static void main(String[] args){
//         student s1 = new student ("suraj");
//         System.out.println(s1.name);
//     }
// }
// class student{
//     String name;
//     int roll;

//     student (String name) {
//         this. name = name;
//     }
// }



// public class oops{
//     public static void main(String[] args){
//         Fish shark = new Fish();
//         shark.eat();
//     }
// }
// class Animal {
//     String color;
//     void eat() {
//         System.out.println("eats");
// }
// void breathe(){
//     System.out.println("breathes");

// }
// }
// //Dreived class /subclass
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swims in water");
//     }
// }


// public class oops{
//     public static void main(String[] args){
//         calculator calc = new calculator();
//         System.out.println(calc.sum(1,2));
//         System.out.println(calc.sum((float)1.5,(float)2.5));
//         System.out.println(calc.sum(1,2,3));
//     }

// }
// class calculator {
//     int sum (int a,int b){
//         return a+b;
//     }
//     float sum (float a,float b){
//         return a+b;
//     }
//     int sum (int a , int b , int c){
//         return a+b+c;
//     }
// }


// public class oops{
//     public static void main(String[] args){
//          Horse h= new Horse();
//          h.eat();
//          h.walk();

//          chicken c= new chicken();
//          c.eat();
//          c.walk();
//     }


// abstract class Animal {
//     void eat(){
//         System.out.println("animal eat");                                                // 1 error in this program

//     }
//     abstract void walk();
// }
// class Horse extends Animal {
//     void walk() {
//         System.out.println("walks on 4 Legs");
//     }
// }
//     class chicken extends Animal {
//         void walk() {
//             System.out.println("walks on 2 Legs");
//         }
//     }

// }





// public class oops{
//     public static void main(String[] args){
//         Queen a = new Queen();
//         a.moves();
//         }
// }
//     interface chessplayer{
//         void moves ();
//     }
//     class Queen implements chessplayer{
//         public void moves() {
//             System.out.println(" up, down, left,righat,diagonal");

            
//         }
//     }
//     class Rook implements chessplayer{
//         public void moves() {
//             System.out.println(" up, down, left,righat ");

            
//         }
//     }
//     class King implements chessplayer{
//         public void moves() {
//             System.out.println(" up, down, left,righat ");

            
//         }
//     }






// public class oops{
//     public static void main(String[] args){
//         Horse h = new Horse();
//     }
// }

// class Animal {
//     Animal(){
//     System.out.println("animal constructer is called ");
// }                                                                            // 2 errors in this program
// }
// class Horse extends Animal{
//     Hors Animal.Animal();
//     super();
//     System.out.print("animal costemer is called ");
// }
// }










