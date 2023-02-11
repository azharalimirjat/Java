import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
//		If a User Want that program should take input from user at run time,
//		We Use Scanner Class(This class is already defined in Java
		
		// First we import this class than we use it by Object of this class
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Input your Sentence : ");
		String sentence = input.nextLine(); // next() is used for String type Input(This Takes Sentence)
		System.out.println("Your Sentence is : "+sentence);
		
		
		System.out.print("Input your Name : ");
		String name = input.next(); // next() is used for String type Input(This Takes only one word)
		System.out.println("Your Name is : "+name);
		
		System.out.print("Input your Age : ");
		int age= input.nextInt(); // nextInt() is used for taking Integer Type Input
		System.out.println("The Age is : "+age);
		
		
	}

}
