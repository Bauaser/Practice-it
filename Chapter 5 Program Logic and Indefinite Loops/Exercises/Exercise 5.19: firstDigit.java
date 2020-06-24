//Write a method named firstDigit that returns the first digit of an integer. For example, firstDigit(3572) should return 3. It should work for negative numbers as well. For example, firstDigit(-947) should return 9.

//Call 	            Value Returned
//firstDigit(3572)    	3
//firstDigit(-947)     	9
//firstDigit(6) 	      6
//firstDigit(35)      	3
//firstDigit(123456)  	1

//(Hint: Use a while loop. You may not use a String to solve this problem.)

public static int firstDigit (int x) {
x=Math.abs(x);
while (x>9){
    x=x/10;
}
    return x;
}
