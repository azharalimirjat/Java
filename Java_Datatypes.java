import java.util.Arrays;

public class Java_Datatypes {

	public static void main(String[] args) {
		
//		DATA TYPES (Primitive And Non-Primitive )
		
//		PRIMITIVE DATA TYPES:
		
//		DataType		   bytes
		
//		byte			   1 [Used to store values from -128 to  127]
//		short		       2 [Used to store values from -32,768 to 32,767] 
//		int		           4 [Used to store integer Values as: {1,2,3,...} ]
//		long		       8 [Used to store Numeric Values but has wide range than Integer
//		float			   4 [Used to Store decimal values as: {1.12, 2.3232, 3.14,...} ]
//		double			   8 [Used to store all type of Numeric values] 
//		char(character)	   2 [Used to store alphabets as: (a,b,c,...) ]
//		boolean			   1 [used to store true/false {1/0} ]
		
		byte age= 20;
		
		int number= 1234567890;  //It is Maximum Range Of Int
		
		long number2 = 12345678900L; // L is used to show that this is Long type number
		
		float pi= 3.14F; // F is used to show that this is float type number 
		
		char character = '@';  //We write character value between => ''

		boolean isEmpty = true;
		
		
//		NON-PRIMITIVE DATA TYPE
//		
//		STRING => Combination of characters 
		
		String name= "Azhar Ali";
		
//		We can also daclare as:
		String friend = new String("Sameer");
		
//		Operations On Strings 
		
//		Concatinate => means combining two Strings
		String firstName = "Azhar Ali";
		String lastName  = " Mirjat";
		
		String combineName= firstName+" And "+lastName;
		
		System.out.println("Concatinated Name is : "+combineName);
		
//		Function CharAt => Shows Character at the index which we pass(position starts from 0)
		System.out.println("Character is : "+firstName.charAt(2));
		
//		Length() Funtion => Shows total length of String Here
		System.out.println("Total Length of firstName is : "+firstName.length());
		
//		Replace(value1, value2) => it will replace value1 with value2
/*		Here Original String remains Same ALlways,
		We Declare new String and give name after replacement */
		
		String replaced = firstName.replace('h', 'r');
		System.out.println("Name After Replaced is : "+replaced);
		
//		SubString()   => Give sub part of Existing String
		String name1 = "Shahid Ali";
		System.out.println("Sub Part of: "+name1+" is : "+name1.substring(0, 6));
		
		
//		ARRAYS => A non-primitive datatype which stores multiple values of same datatype
//		If we hava to store  marks of a student we can store as ;
//		1D Array
		int physics= 89;
		int chemistry = 88;
		int maths = 98;
		
//		It takes time to write and much storage/space so write as;
		int[] marks= new int[3];
		marks[0]=89;
		marks[1]=88;
		marks[2]=98;
		
//		We can also initialize Array as 
		int[] mark= {89,88,98};
		
//		To see Output we write as:
		System.out.println("Physics Marks: "+marks[0]);
		System.out.println("Chemistry Marks: "+marks[1]);
		System.out.println("Maths Marks: "+marks[2]);

//		length property => To find total length of an Array while declaring;
		System.out.println("Length of Marks Array is : "+marks.length);
		
//		To Sort array in Accending/Deccending Order We Use Arrays class and Sort mathod;
		System.out.println("Before Sorting first element is : "+marks[0]);
		Arrays.sort(marks);
		System.out.println("After  Sorting first element is : "+marks[0]);
		
//		2D Arrys
		int[][] finalMarks = {{88,98,77,87},{95,92,90,78}};
		System.out.println(finalMarks[0][0]);
		System.out.println(finalMarks[0][1]);
		System.out.println(finalMarks[0][2]);
		System.out.println(finalMarks[0][3]);
		System.out.println(finalMarks[1][0]);
		System.out.println(finalMarks[1][1]);
		System.out.println(finalMarks[1][2]);
		System.out.println(finalMarks[1][3]);
		
		
		System.out.println("*******************************************");
		
//		CASTING => Changing One Data type to another
//		Implicit Casting: Changing small sized data Type to bigger one;
		
		int price=12;
		double finalprice=price+2323;
		System.out.println(finalprice);
		
		
//		Explicit Casting: Changing bigger sized data Type to smaller one;
//		In Explicit Casting some data can be lost:
		int price1=100;
		int price2= price1+(int)18.12;//(.12) wil be lost because int does not hold decimal type pf numbers
		System.out.println(price2);

		
//		CONSTANTS : The Values That Must not be changed once initialized.
//		We Use (final) keyword to make the value constant
		
		final float PI=3.14F; // final shows the value given here is final
//		Pi=4.132323F; // It will give an error
		
	}

}
