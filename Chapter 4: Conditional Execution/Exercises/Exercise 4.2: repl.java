//Write a method named repl that accepts a String and a number of repetitions as parameters and returns the String concatenated that many times.
//For example, the call repl("hello", 3) returns "hellohellohello". If the number of repetitions is 0 or less, an empty string is returned. 

public static String repl (String str, int rep) {
   String sendBack ="";
    for (int i =1; i<=rep; i++){
     sendBack += str;
    }
return sendBack;
}
