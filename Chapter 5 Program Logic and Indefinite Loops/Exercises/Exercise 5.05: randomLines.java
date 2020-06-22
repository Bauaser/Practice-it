//Write a method called randomLines that prints between 5 and 10 random strings of letters (between "a" and "z"), one per line. 
//Each string should have random length of up to 80 characters.

//rlcuhubm
//ilons
//ahidbxonunonheuxudxrcgdp
//xmkmkmmmmwmwqjbaeeeerceheelciheihcreidercdeehiuhhhn
//hdcrphdidcrydxgtkdhoendgcidgxfidgfufdgfuuuuuu

//(Because this problem uses random numbers, our test cases check only the general format of your output. 
//You must still examine the output yourself to make sure the answer is correct.)


public static void randomLines (){
Random r = new Random();
    int x = r.nextInt(6)+5;
    String letters = "abcdefghijklmnopqrstuvwxyz";
for (int i =1; i<x; i++){
int y = r.nextInt(80)+1;
    for (int j=1; j<y; j++){
int k = r.nextInt(26);
        System.out.print(letters.charAt(k));
    }
    System.out.println();
}
}
