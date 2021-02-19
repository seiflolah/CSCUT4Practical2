import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) {
    	//try and catch for full name file
		try {
			//making files
	        File input = new File ("input.txt");
	        File output = new File ("output.txt");
	        //making scanner
			Scanner scan = new Scanner(input);
			//making printer
			PrintWriter print = new PrintWriter(output);
			System.out.println(args[0]);
			//while loop so it can read file
			 while(scan.hasNextLine()) {
		        	String result = scan.nextLine();
		        	//capital the line by split
		        	String[] line = result.split(" +");
		        	String capital = line[1];
		        	capital = capital.toUpperCase() + ".";
		        	line[1] = capital;
		        	result = String.join(" ", line);
		        	System.out.println("this is the input file: "+ result);
		        	//write line in output
		        	print.write(result);
		        	System.out.println("this is the output file: " + result);
		        	}
			  //closing scanner and printer
			  scan.close();
			  print.close();
			  } catch (FileNotFoundException e) {
			    System.out.println("Error has occured");
			e.printStackTrace();
		}
    }
    // main
} // FilesInOut
