//Write a method named printAverage that accepts a Scanner for the console as a parameter and repeatedly prompts the user for numbers. 
//Once any number less than zero is typed, the average of all non-negative numbers typed is displayed. Display the average as a double, and do not round it. 
//For example, a call to your method might look like this:

//Scanner console = new Scanner(System.in);

//printAverage(console);

//The following is one example log of execution for your method:

//Type a number: 7
//Type a number: 4
//Type a number: 16
//Type a number: -4
//Average was 9.0

//If the first number typed is negative, do not print an average. For example:

//Type a number: -2

public void printAverage(Scanner console) {
    System.out.print("Type a number: ");
    int num = console.nextInt();
    
    if(num < 0)
        return;
    
    int sum = 0;
    int count = 0;
    
    while(num >= 0) {
        sum += num;
        count++;
        System.out.print("Type a number: ");
        num = console.nextInt();
    }
    
    System.out.println("Average was " + ((double) sum / count));
}
