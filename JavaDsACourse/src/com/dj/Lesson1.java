package com.dj;

public class Lesson1 {

	public static void main(String[] args) {
		// ~
		// int n=2;
		// System.out.println(n);
		// n=~n;
		// System.out.println(n);
		// <<
		// int n=10;
		// System.out.println(n);
		// n=n<<1;
		// System.out.println(n);
		// >>
		// int n=-6;
		// System.out.println(n);
		// n=n>>>1;
		// System.out.println(n);
		// Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
		// if((n&1)==1){
		// System.out.println("ODD");
		// }else{
		// System.out.println("EVEN");
		// }

		//new Lession1().caseChnage('p');
		
		 	//int n=10;
		 	//System.out.println(n);
			//n=n<<1;
			//System.out.println(n);
			
			
			/*
			 * int m=10; System.out.println(m); m=m>>1; System.out.println(m);
			 */

	}

	public void caseChnage(char letter) {
		// 'A' is 65 and 'a' is 97. diff 97-65=32

		if (letter >= 65 && letter < 97) {
			letter = (char) (letter ^ 32);
		} else {
			letter = (char) (letter-32);
		}
		System.out.println(letter);

	}

}

/*
 * Task 6: 1. Take one character input or take single char string input and type
 * cast it to char 2. Change the case of that character (a -> A)/(A -> a) using
 * only bitwise operator. 3. Print out the resulting character.
 * 
 * Solution: -By
 * 
 *  n<<1 === n*2pow(n)
 *  n>>1 === n/2pow(n)
 * 
 * 
 */
