package assignments;

public class DataTypes {

	public static void main(String[] args) {
		//Write a Java program to add two strings:
		String a = "Hello";
		String b = "Naveen K";
		System.out.println(a+" "+b);
		
		//Write a Java program to print the sum of two numbers
		int c = 74+36;
		System.out.println("sum of two numbers is "+c);
		
		//Write a Java program to print the division of two numbers.
		int d = 50/3;
		System.out.println("Div of two numbers is "+d);
		
		//Write a Java program to compute the specified expressions and print the output.
		//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
		double f = (25.5* 3.5 - 3.5 * 3.5);
		double f1 = (40.5-4.5); 
		System.out.println(f/f1);
		
		//Try to concat "Hello Selenium" with a character 't'.
		
		String s1= "Hello Selenium";
		String s2= "t";
		System.out.println(s1+s2);
		
		//Create three int variables having values like : 100, 200, 3400. 
		//Add them and concatenate and generate this output String 
		//"Your Total  amount is. 3700".
		
		int g1 = 100;
		int g2 = 200;
		int g3 = 3400;
		System.out.println("Your Total  amount is "+""+(g1+g2+g3));
		
		//Print the ASCII value of the character 'h'.
		
		
		char c1 = 'h';
		System.out.println("value of c"+c1+10055654);
		
		//Write a program to add 3 to the ASCII value of the character 'd' 
		//and print the equivalent character
		
		char c2 = 'd';
		System.out.println(c2+3);
		
		//Write a program to find the square of the number 3.9
		
		float f2 = 3.9f;
		System.out.println("square of the number 3.9 is "+f2*f2);
		
		//output 24
		
        int i = 11;
		
		i = i++ + ++i;
		//  (11 + 13)
		System.out.println(i);
		
        int j=11, k=22, l;
		
		l = j + k + j++ + k++ + ++j + ++k;
		
		System.out.println("a="+j);
		System.out.println("b="+k);
		System.out.println("c="+l);
		
		//i = i++ - --i + ++i - i--;
		//    0   - (-0) + 1 - 1
		
		int i1 = 0;
		int i2 = i++ - --i + ++i - i--;
		System.out.println(i2);
		
		// check below is coorect 
		
		//boolean m = true;
		//m++; ( cannot convert to boolean to int)
		
		int n = 1;
		int o = 2;
		int p = 3;
		int m1 =  n-- - o-- - p--;
		//       1-2-3
		System.out.println("print "+n);
		System.out.println(+o);
		System.out.println(+p);
		System.out.println(+m1);
		
		//program 6 // out put 0
		
		int q1=1,q2=2;
		System.out.println(--q2 - ++q1 + ++q2 - --q1);
		//                (1-2+2-1
		int r1=19,r2=29;
		char u= 'k';
		int r3= r1-- - r2-- - u--;
		//      19-29-107
		System.out.println(+r1);
		System.out.println(+r2);
		System.out.println(+r3);
		System.out.println(+u);
		//What is wrong with the below program? Why it is showing compilation error?
		// int j = --(i++);  invalid argument
		
		int a4=0,a5=0;
		int a3 = --a4 * --a5 * a5-- * a4--;
		//       (-1*(-1)*(-1)*(-1)
		System.out.println(a3);
	
	
		
		

	
	



	}

}
