//  Write a method largestAbsVal that accepts three integers as parameters and returns the largest of their three absolute values. 
//  For example, a call of largestAbsVal(7, -2, -11) would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5. 

public static int largestAbsVal (int a, int b, int c){
int d=Math.abs(a);
    int e=Math.abs(b);
    int f=Math.abs(c);
    if (d>=e && d>=f){
    return d;
    } else if (e>=d && e>=f) {
    return e;
    } else return f;
}
