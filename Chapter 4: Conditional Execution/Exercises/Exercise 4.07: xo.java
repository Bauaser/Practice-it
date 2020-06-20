//Write a static method named xo that accepts an integer size as a parameter and prints a square of size by size characters, 
//where all characters are "o" except that an "x" pattern of "x" characters has been drawn from the corners of the square. 
//In other words, on the first line, the first and last characters are "x"; on the second line, the second and second-from-last characters are
//"x"; and so on. If 0 or less is passed for the size, no output should be produced.

//The following table lists some calls to your method and their expected output: 

//Call    	xo(5);    	xo(8);     	xo(3);    	xo(1); 	    xo(0);    	xo(12);     	xo(11);
//Output 	 xooox      xoooooox      xox            x                xoooooooooox      xooooooooox
//         oxoxo      oxooooxo      oxo                             oxooooooooxo      oxoooooooxo
//         ooxoo      ooxooxoo      xox                             ooxooooooxoo      ooxoooooxoo
//         oxoxo      oooxxooo                                      oooxooooxooo      oooxoooxooo 
//         xooox      oooxxooo                                      ooooxooxoooo      ooooxoxoooo
//                    ooxooxoo                                      oooooxxooooo      oooooxooooo
//                    oxooooxo                                      oooooxxooooo      ooooxoxoooo
//                    xoooooox                                      ooooxooxoooo      oooxoooxooo                           
//                                                                  oooxooooxooo      ooxoooooxoo
//                                                                  ooxooooooxoo      oxoooooooxo                          
//                                                                  oxooooooooxo      xooooooooox                          
//                                                                  xoooooooooox                                 
                                                                                                  
                                                                                                  
    public void xo(int size) {
    int front = 0;
    int back = size - 1;
    
    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            if(j == front || j == back)
                System.out.print("x");
            else
                System.out.print("o");
        }
        System.out.println();
        front++;
        back--;
    }
}                                                                                              
