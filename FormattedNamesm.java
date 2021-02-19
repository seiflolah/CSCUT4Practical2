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
public class FormattedNamesm {

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
		        	System.out.println("results in the input file: "+ result);
		        	//write line in output
		        	print.write(result);
		        	System.out.println("results in the output file: " + result);
		        	}
			  scan.close();
			  print.close();
			  } catch (FileNotFoundException e) {
			    System.out.println("Error has occured");
			e.printStackTrace();
		}
		
		//try and catch 
		try {
			//making files
	        File input = new File ("inputm.txt");
	        File output = new File ("outputm.txt");
	        //making scanner
			Scanner scan = new Scanner(input);
			//printer for output file
			PrintWriter print = new PrintWriter(output);
			System.out.println(args[0]);
			//while loop so it can read file
			 while(scan.hasNextLine()) {
		        	String result = scan.nextLine();
		        	// capital by split
		        	String[] line = result.split(" +");
		        	String capital = line[1];
		        	capital = capital.toUpperCase() + ".";
		        	line[1] = capital;
		        	result = String.join(" ", line);
		        	System.out.println("results in the inputm file: "+ result);
		        	//write line in output
		        	print.write(result);
		        	System.out.println("results in the outputm file: " + result);
		        	}
			  scan.close();
			  print.close();
			  } catch (FileNotFoundException e) {
			    System.out.println("File (inputm.txt) was not found");
			e.printStackTrace();
		}
    }
} 