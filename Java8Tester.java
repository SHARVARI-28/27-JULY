/*1)Write a program in Java to demonstrate Java 8 Functional Interface Predicate feature. The class will print all numbers , even numberrs and number greater than 3 of the numbers in the array list
Step1: create Java main class Java8 Tester
Step2: create a method eval which will take 2 parameters (list of numbers from 1 to 9 and predicate condition)
Step3: call the eval method from main method to print all the even numbers by passing appropriate parameters
Step4: call the eval method from main method to print all the numbers greater than 3 by passing appropriate parameters
Sample output
Print all numbers:
1
2
3
4
5
6
7
8
9

Print even numbers:
2
4
6
8

Print numbers greater than 3:
4
5
6
7
8
9*/




interface Predicate{
	void eval(int a, int b);
}
public class Java8Tester implements Predicate {
	
	public void eval(int a, int b)
	{
		if(a==1) {
			for(int i=a;i<=b;i++) {
				System.out.println(i);
			}
		}
		
		//for printing even no
		else if(a==2)
		{
			for(int i=a;i<=b;i++) {
				if(i%2 == 0)
					System.out.println(i);
			}
		}
		
		//for printing no greater than 3
		else {
			for(int i=4;i<=b;i++) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Java8Tester j =new Java8Tester();
		
		System.out.println("Print all numbers:");
		j.eval(1,  9);
		
		System.out.println("\nPrint even numbers:");
		j.eval(2,  9);
		
		System.out.println("\nPrint numbers greater than 3");
		j.eval(3,  9);
	}
}
