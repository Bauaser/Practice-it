// Write a complete Java program in a class named EggStop that generates the following output. 
// Use static methods to show structure and eliminate redundancy in your solution.

  //  ______
 //  /      \
 // /        \
 // \        /
 //  \______/

//    ______
//   /      \
//  /        \
//  \        /
//   \______/
//  +--------+

//    ______
//   /      \
//  /        \
//  |  STOP  |
//  \        /
//   \______/
//  +--------+

public class EggStop {
public static void main (String [] args){
    top();
    bottom();
    space();
    top();
    bottom();
    diameter();
    space();
    top();
    stop();
    bottom();
    diameter();
    
}
public static void top() {
System.out.println("  ______  ");
System.out.println(" /      \\ ");
System.out.println("/        \\");
}
    public static void bottom(){
System.out.println("\\        /");
System.out.println(" \\______/ ");
}
    public static void diameter(){
    System.out.println("+--------+");
}
    public static void stop(){
    System.out.println("|  STOP  |");
    }
    public static void space(){
    System.out.println("");
    }
}
