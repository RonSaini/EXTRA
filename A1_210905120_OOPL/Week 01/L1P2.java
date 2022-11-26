import java.util.*;
class L1P2
{
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			double x1,x2,img;
			int choice;

			System.out.println("Enter coeffecient of x^2 : ");
			int a = sc.nextInt();

			System.out.println("Enter coeffecient of x   : ");
			int b = sc.nextInt();

			System.out.println("Enter constant           : ");
			int c = sc.nextInt();

			double disc = (b*b)-(4*a*c);

			if(disc>0)
				choice=1;
			else if (disc == 0)
				choice = 0;
			else 
				choice = -1;

			System.out.println("Roots of "+a+"x^2 + "+b+"x+ "+c+" are ");


			switch(choice)
			{
			case -1:
			x1 = -b/(2*a);
			img = Math.sqrt((-disc)/(2*a));
			System.out.println("Imaginary : "+x1+"+i"+img+"and "+x1+"-i"+img);
			break;


			case 0:
			x1 = -b/(2*a);
			System.out.println("Real and equal roots : "+x1);
			break;

			case 1:
			x1 = (-b + Math.sqrt(disc))/(2*a);
			x2 = (-b - Math.sqrt(disc))/(2*a);

			System.out.println("Real and distinct : "+x1+" and"+x2);
			break;

			}
		}


	}
}