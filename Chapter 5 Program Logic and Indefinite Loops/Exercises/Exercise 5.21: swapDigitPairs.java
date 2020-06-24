//Write a method named swapDigitPairs that accepts a positive integer n as a parameter and returns a new integer whose value is similar to n's but with each pair of digits swapped in order. 
//For example, the call of swapDigitPairs(482596) would return 845269. 
//Notice that the 9 and 6 are swapped, as are the 2 and 5, and the 4 and 8. 
//If the number contains an odd number of digits, leave the leftmost digit in its original place. For example, the call of swapDigitPairs(1234567) would return 1325476. 
//You should solve this problem without using a String. 

public int swapDigitPairs(int n) {
    int result = 0;
    int m = 1;
    while(n > 0) {
        int d1 = n % 10;
        n /= 10;    
        if(n == 0) {
            result += m * d1;
            break;
        }
        int d2 = n % 10;
        result = result + m * 10 * d1 + m * d2;
        n /= 10;
        m *= 100;
    }
    return result;
}
