import java.util.Scanner;
class L1P1
{
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 3 numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int largest = largest(a,b,c);

			System.out.println("The largest amongst the three numbers is "+largest);
		}

	}

		static int largest(int a,int b,int c)
		{
			if(a>b && a>c)
				return a;
			else if (b>c && b>a)
				return b;
			else 
				return c;
		}


}