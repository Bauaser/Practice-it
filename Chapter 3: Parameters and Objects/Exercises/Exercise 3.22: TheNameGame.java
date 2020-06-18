//Write a complete program called "TheNameGame", where the user inputs a first and last name and a song in the following format is 
//printed about their first, then last, name. Use a method to avoid redundancy.

//What is your name? Fifty Cent
//Fifty Fifty, bo-Bifty
//Banana-fana fo-Fifty
//Fee-fi-mo-Mifty
//FIFTY!

//Cent Cent, bo-Bent
//Banana-fana fo-Fent
//Fee-fi-mo-Ment
//CENT!

public class TheNameGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.print("What is your name? ");
        String first = scan.next();
        String last = scan.next();
        String newFirst = first.substring(1);
        String newLast = last.substring(1);

        playGame(first, newFirst);
        System.out.println();
        playGame(last, newLast);
    }

public static void playGame(String name, String nn) {
    System.out.println(name + " " + name + ", " + "bo-B" + nn);
    System.out.println("Banana-fana fo-F" + nn);
    System.out.println("Fee-fi-mo-M" + nn);
    System.out.println(name.toUpperCase() + "!");
  }
}
