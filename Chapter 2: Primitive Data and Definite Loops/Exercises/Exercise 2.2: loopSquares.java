//Write a for loop that produces the following output:

//1 4 9 16 25 36 49 64 81 100 

//For added challenge, try to modify your code so that it does not need to use the * multiplication operator. 
//(It can be done! Hint: Look at the differences between adjacent numbers.)

int x;
for (x=1; x<=10; x++) {
    int y = x*x;
    System.out.print(y +" ");
}
