//Write a method named doubleSpace that accepts a Scanner for an input file and a PrintStream for an output file as its parameters, 
//writing into the output file a double-spaced version of the text in the input file. 
//You can achieve this task by inserting a blank line between each line of output. 

public void doubleSpace (Scanner scan, PrintStream print) {
while(scan.hasNextLine()){
print.println(scan.nextLine());
print.println();
}
}
