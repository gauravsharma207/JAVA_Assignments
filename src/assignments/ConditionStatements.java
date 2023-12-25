package assignments;

public class ConditionStatements {

	public static void main(String[] args) 
	{
		int a =25, b =78, c=87, d= 24;
		if(a>b && a>c && a>d )
		{
			System.out.println(" The greatest﻿: "+a);
		}
		else if (b>c&& b>d)
		{
			System.out.println(" The greatest﻿: "+b);
		}
		else if (c>d)
		{
			System.out.println(" The greatest﻿: "+c);
		}
		else System.out.println(" The greatest﻿: "+d);
		
		//Write a Java program to test a number is positive or negative.
		int num1 = 35; // -11
		
		if (num1>0)
		{
			System.out.println("No is Postive");
		}
		else if (num1==0)
			{
			System.out.println("No is 0");
			}
		else System.out.println("no is negtive");
		
		//WAP to run your test cases in a specific environment like: 
		//QA Stage, Dev, UAT, Prod using using Switch - Case
		
		int key = 1;
		String stage1;
		switch (key)
		{
		case 1:
			stage1 ="QA Stage";
			System.out.println("This is in " +stage1);
			break;
		case 2:
			stage1 ="Dev Stage";
			System.out.println("This is in a Dev environment");
			break;
		case 3:
			stage1 ="Uat Stage";
			System.out.println("This is in a UAT environment");
			break;
		case 4:
			stage1 ="Production Stage";
			System.out.println("This is in a Production environment");
			break;

		default:
			System.out.println("This is not a valid environment");
			break;
				
		}
		int salary=3300;
		if (salary>=3500)
		{
			

		int loanKey = 1;
			String loanType;
		switch (loanKey) 
		{
		case 1:
			loanType = "Home Loan";
			System.out.println(loanType);
			break;

		case 2:
			loanType = "Car Loan";
			System.out.println(loanType);
			break;

		case 3:
			loanType = "Edu Loan";
			System.out.println(loanType);
			break;
			
			

		default:
			System.out.println("Invalid Loan");
			break;
		}
		}
		else System.out.println("your salary requirement is not fullfill");
       // Write a program in Java to print "Hello World" ten times using while loop
		String s = "Hello World";
		for (int i=1;i<=10;i++)
		{
			System.out.println(i+ "  "+s);
		}
		
		//WAP to print 10 to 1 using for, while and do-while loop
		int i = 10;
		do 
		{
			System.out.println(i);
			i--;
			
		} 
		while (i>1);
		
		System.out.println(i);
		


		
		
	}
	
	
	



}


