import java.util.Scanner;


public class Ex1Week3{
	public static void main(String [] nilaiTerima){

int noInt = 10 , x;

// if (noInt == 10)
// 	System.out.println("sama");
// else
// 	System.out.println("ta sama");

System.out.println(noInt == 10 ? "sama" : "ta sama");

if(noInt == 10)
	x = 3;
else
	x = 16;


// ternary operator
x = noInt == 10 ? 3 : 19;

System.out.println("x is " + x);

// String name;
// int nombor;
// double noDouble;

// Scanner input = new Scanner(System.in);

// System.out.println("Enter a name: ");
// name = input.nextLine();  //or input.nextLine
// System.out.println("Name is  " + name);


// System.out.println("Enter a number: ");
// nombor = input.nextInt();
// System.out.println("Number is " + nombor);

// // input.nextLine();





// System.out.println("Enter a double number: ");
// noDouble = input.nextDouble();
// System.out.println("Number is " + noDouble);




// input.close();






//ordinary for
//	int [] tataInt = {10 , 20, 30 , 40}; //declare

	//	for (int i=0; i<tataInt.length; i++){
	//	System.out.println(tataInt[i]); 
//}

//for-each or advanced for
//for (int t : tataInt){
	//System.out.println("for each: " + t);
//}


	//	int noInt = '10';  //declare and initialize


		//final means constant variable
		//wutt is final static?
		//final static char myChar = 21;  //asci code
	//	System.out.println("Char  " + myChar);

		//char myChar = 56;  //asci code
		//System.out.println("Char  " + myChar);

	//	int [] tataInt = new int[4]; //declare

	//	for (int i=0; i<tataInt.length; i++){
	//		System.out.println(tataInt[i]); 

//}

		// int noInt = 123;
		// int noInt2 = 636;
		// double noDouble = 123.546;


	//	System.out.format("%6d dan %4d" , noInt , noInt2);
	//	System.out.format("%4d"  ,  noInt2);
	//	System.out.format("  RM%7.2f" , noDouble);

	//	System.out.printf(" \nRM%7.2f and %6d" , noDouble , noInt);
		//System.out.println("Nilai 1: " + nilaiTerima[0]);
		//System.out.println("Nilai 1: " + nilaiTerima[1]);
		//System.out.println("Nilai 1: " + nilaiTerima[2]);

		//javac Ex1Week3.java
		//java ExWeek3 farisahhannes
		//int sum = 0;


		//for (int i=0; i<nilaiTerima.length; i++){

		//	System.out.println("Nilai : " + nilaiTerima[i]);
//
		//	sum += Integer.parseInt(nilaiTerima[i]);
		//	System.out.println("Nilai : " + sum);


	//	}

		
			//java ExWeek3 10 20 30 40


	}

}