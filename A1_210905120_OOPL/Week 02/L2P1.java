import java.util.Scanner;
class L2P1
{
public static void main(String[] args)
{
try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter length of array : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i = 0 ; i < n ; i++)
	{
	System.out.println("Enter Element at position : "+i);
	arr[i] = sc.nextInt();
	}
	int temp;
	System.out.println("Enter 0 for Ascending Order. Enter 1 for Descending order");
	int choice = sc.nextInt();
	if(choice == 0)
	{
	for(int i = 0 ; i < n-1; i++)
	{
	for(int j = i ; j < n-i-1 ; j++)
	{
	if(arr[j] > arr[j+1])
	{
	temp = arr[j];
	arr[j] = arr[j+1];
	arr[j+1] = temp;
	}
	}
	}
	}
	else if(choice == 1)
	{
	for(int i = 0 ; i < n-1; i++)
	{
	for(int j = i ; j < n-i-1 ; j++)
	{
	if(arr[j] < arr[j+1])
	{
	temp = arr[j];
	arr[j] = arr[j+1];
	arr[j+1] = temp;
	}
	}
	}	
	}
	else
	{
	System.out.println("Wrong Choice Enetered Please Try Again!!");
	System.exit(0);
	}
	System.out.println("The Sorted Array is : ");
	for(int i = 0 ; i < n-1 ; i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println(arr[n-1]);
}
}
}