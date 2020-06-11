// Write a complete Java program in a class named Lanterns that generates the following three figures of output.
// Use static methods to show structure and eliminate redundancy in your solution.
// In particular, make sure that main contains no System.out.println statements except for blank lines, 
// that any System.out.println statement(s) repeated are captured in a method that is called just once, 
// and that the same System.out.println statement never appears in two places in the code. 
//      *****
//    *********
//  *************

//      *****
//    *********
//  *************
//  * | | | | | *
//  *************
//      *****
//    *********
//  *************

//      *****
//    *********
//  *************
//      *****
//  * | | | | | *
//  * | | | | | *
//      *****
//      *****

public class Lanterns {
public static void main (String []args){
top();
    space();
    top();
    body();
    down();
    top();
    space();
        top();
    shor();
    body();
    body();
    shor();
    shor();
}
    public static void top(){
            System.out.println("    *****    ");
            System.out.println("  *********  ");
            System.out.println("*************");
    }
    public static void body() {
    System.out.println("* | | | | | *");
                       }
    public static void down(){
        System.out.println("*************");
    }
    public static void shor(){
        System.out.println("    *****    ");
    }
    public static void space(){
        System.out.println("");
    }
}
