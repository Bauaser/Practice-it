//Write a method named showTwos that shows the factors of 2 in a given integer. For example, the following calls:

//showTwos(7);
//showTwos(18);
//showTwos(68);
//showTwos(120);

//should produce this output:

//7 = 7
//18 = 2 * 9
//68 = 2 * 2 * 17
//120 = 2 * 2 * 2 * 15

public static void showTwos (int x) {
int y = x;
    int count=0;
    while (y%2==0) {
count++;
    y=y/2;}
    System.out.print(x+ " = ");
    for (int i =0; i<count; i++) {
    System.out.print("2 * ");
    }
    System.out.print(y);
}
