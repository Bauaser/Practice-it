// Write a complete Java program in a class named StarFigures that generates the following output.
// Use static methods to show structure and eliminate redundancy in your solution.

//  *****
//  *****
//   * *
//    *
//   * *

//  *****
//  *****
//   * *
//    *
//   * *
//  *****
//  *****

//    *
//    *
//    *
//  *****
//  *****
//   * *
//    *
//   * *

public class StarFigures{
public static void main (String [] args) {
rows();
    cross();
    System.out.println("");
    rows();
    cross();
    rows();
        System.out.println("");
    line();
    rows();
    cross();
}
    public static void rows () {
    System.out.println("*****\n*****");
    }
    public static void cross () {
    System.out.println(" * * \n  *  \n * * ");
    }
    public static void line () {
    System.out.println("  *  \n  *  \n  *  ");
    }
}
