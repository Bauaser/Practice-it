//Write a method named consecutive that accepts three integers as parameters and returns true if they are three consecutive numbers; that is, if the numbers can be arranged 
//into an order such that there is some integer k such that the parameters' values are k, k+1, and k+2. Your method should return false if the integers are not consecutive. 
//Note that order is not significant; your method should return the same result for the same three integers passed in any order.

//For example, the calls consecutive(1, 2, 3), consecutive(3, 2, 4), and consecutive(-10, -8, -9) would return true. The calls consecutive(3, 5, 7), consecutive(1, 2, 2), and consecutive(7, 7, 9) would return false.

public boolean consecutive(int x, int y, int z) {
    int max = Math.max(x, Math.max(y, z));
    int min = Math.min(x, Math.min(y, z));
    int mid = x + y + z - max - min;
    
    return max == mid + 1 && mid == min + 1;
}
