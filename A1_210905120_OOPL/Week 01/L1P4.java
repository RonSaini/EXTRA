import java.util.Scanner;
class L1P4
{
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number : ");
			int num = sc.nextInt();

			if(!isPrime(num))
				System.out.println(num+" is a prime number ");
			else
				System.out.println(num+" is not a prime number ");

			System.out.println("Enter the value of N : ");
			int Numm = sc.nextInt();

			System.out.println(" ");

			int i,count=0;

			for(i=2;i>=0;i++)
			{
				if(!isPrime(i))
				{
					System.out.println(i);
					count++;
				}
				else
					continue;

				if(count == Numm)
					break;
			}
		}


	}


	static boolean isPrime(int num)
	{
		boolean flag = false;
		for(int i=2;i<= num/2;++i)
		{
			if (num%i == 0)
			{
				flag = true;
				break;
			}
		}
		return flag;
	}


}
		