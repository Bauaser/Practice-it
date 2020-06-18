//Write a method called printIndexed that accepts a String as its parameter and prints the String's characters in order followed by their 
//indexes in reverse order. For example, the call of printIndexed("ZELDA"); should print Z4E3L2D1A0 to the console. 

public static void printIndexed (String a) {
int x =a.length();
    for (int i=x-1; i>=0; i--){
    System.out.print(a.charAt(x-i-1));
System.out.print(i);
}
}
