//Write a method called printAcronym that accepts a String as its parameter and prints the first letter of each word of the string as an acronym. 
//For example, the call of printAcronym("Breath of the Wild") should print "BotW". 
//You may assume that the string contains at least one word and does not have any surrounding whitespace at its start or end. 

public static  void printAcronym (String str)  
    { 
        String result = ""; 
  
        // Traverse the string.  
        boolean v = true; 
        for (int i = 0; i < str.length(); i++)  
        { 
            // If it is space, set v as true.  
            if (str.charAt(i) == ' ')  
            { 
                v = true; 
            }  
              
            // Else check if v is true or not.  
            // If true, copy character in output  
            // string and set v as false.  
            else if (str.charAt(i) != ' ' && v == true)  
            { 
                result += (str.charAt(i)); 
                v = false; 
            } 
        } 
  
       System.out.print(result); 
    
}
