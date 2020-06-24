//Write a method named digitSum that accepts an integer as a parameter and returns the sum of the digits of that number. 
//For example, digitSum(29107) returns 2+9+1+0+7 or 19. For negative numbers, return the same value that would result if the number were positive. 
//For example, digitSum(-456) returns 4+5+6 or 15. 

public static int digitSum(int x) {
    x = Math.abs(x);
    int sum =0;
    int digit;
    while (x!=0){
    digit=x%10;
    sum+=digit;
        x=x/10;
    }
    return sum;
}

//this will also work if we remove integer digit and directly increase sum by the x%10. The code then looks like this:

public static int digitSum(int x) {
    x = Math.abs(x);
    int sum =0;
    while (x!=0){
    sum+=x%10;
        x=x/10;
    }
    return sum;
}
