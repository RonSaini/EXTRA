import java.util.Scanner;
class L1P3
{
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number : ");
			int num = sc.nextInt();

			int facto = fact(num);
			System.out.println("The factorial of the number is "+facto);


			System.out.println("Enter the value of n : ");
			int n = sc.nextInt();
			System.out.println("Enter the value of r : ");
			int r = sc.nextInt();

			int nCr = fact(n)/(fact(r)*fact(n-r));
			System.out.println("The value of nCr is "+nCr);
		}

	}

	static int fact(int num)
	{
		int fact=1,i;
		
		if(num == 0)
		{   
			fact=1;
		}

		for(i=num;i>0;i--)
		{
			fact = fact*i;
		}

		return fact;

	}
}