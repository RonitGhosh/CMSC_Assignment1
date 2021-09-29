import java.util.Scanner;
/*

* Class: CMSC203

* Instructor: Professor Eivazi

* Description: Create a wifi diagnosis program using scanner and conditional statements

* Due: 9/28/2021

* Platform/compiler: Java

* I pledge that I have completed the programming assignment independently.

I have not copied the code from a student or any source.

I have not given my code to any student.

Print your Name here: Ronit Ghosh

*/
public class WifiDiag {
	public static void main(String[] args) 
	{
		String input;
		//declare scanner object and string for input
		Scanner userInput = new Scanner(System.in);
		//reboot computer?
		System.out.println("if you have a problem with internet conectivity, this wifi diagnosis might work");
		System.out.println("first step: reeboot your computer");
		System.out.println("are you able to connect to the internet (yes/no)");
		input = userInput.nextLine();
		if (input.equalsIgnoreCase("yes")){
			System.out.println("re-booting your computer seemed to work");
			System.out.println("Programmer=Ronit Ghosh");
			System.exit(0);	}	
		//Reboot router?
		System.out.println("second step: reeboot your router");
		System.out.println("are you able to connect to the internet (yes/no)");
		input = userInput.nextLine();
		if (input.equalsIgnoreCase("yes")){
			System.out.println("re-booting your router seemed to work");
			System.out.println("Programmer=Ronit Ghosh");
			System.exit(0);}
		//router plugged in?
		System.out.println("third step: make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.println("are you able to connect to the internet (yes/no)");
		input = userInput.nextLine();
		if (input.equalsIgnoreCase("yes")){
			System.out.println("re-adjusting your cables seeemed to work ");
			System.out.println("Programmer=Ronit Ghosh");
			System.exit(0);}	
		//Range?
		System.out.println("fourth step: move your computer closer to your router");
		System.out.println("are you able to connect to the internet (yes/no)");
		input = userInput.nextLine();
		if (input.equalsIgnoreCase("yes")){
			System.out.println("moving your computer closer to your router seemed to work");
			System.out.println("Programmer=Ronit Ghosh");
			System.exit(0);}
		//Contact ISP
		System.out.println("fifth step: contact your ISP \nmake sure your ISP is hooked up to your router");
		System.out.println("are you able to connect to the internet (yes/no)");
		input = userInput.nextLine();
		if (input.equalsIgnoreCase("yes")){
			System.out.println("contacting your ISP seemed to work");
			System.out.println("Programmer=Ronit Ghosh");
			System.exit(0);}
		System.exit(0);}}