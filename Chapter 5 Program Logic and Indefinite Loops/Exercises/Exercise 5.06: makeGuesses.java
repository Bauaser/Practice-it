//Write a method named makeGuesses that will guess numbers between 1 and 50 inclusive until it makes a guess of at least 48. 
//It should report each guess and at the end should report the total number of guesses made. Below is a sample execution:

//guess = 43
//guess = 47
//guess = 45
//guess = 27
//guess = 49
//total guesses = 5

//(Because this problem uses random numbers, our test cases check only the general format of your output. 
//You must still examine the output yourself to make sure the answer is correct.)


public static void makeGuesses (){
Random r = new Random();
    int count =1;
    for (int i =1; i<=count; i++){
       int y = r.nextInt(50)+1;
        System.out.println("guess = "+y);
        if (y<48) {
        count++;
        } else {
        System.out.println("total guesses = "+count);
        }
    }
}
