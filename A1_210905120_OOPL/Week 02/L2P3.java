import java.util.Scanner;
class L2P3
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
    System.out.println("Enter the element to be searched : ");
    int ele = sc.nextInt();
    int flag = 0;
    for(int i = 0 ; i < n ; i++)
    {
    if(arr[i] == ele)
    {
    System.out.println("Element '"+ele+"' found at position '"+(i+1)+"'.");
    flag = 1;
    }
    }
    if(flag == 0)
    {
    System.out.println("Element '"+ele+"' Not Found! Please try again!!");
    }
}
}
}