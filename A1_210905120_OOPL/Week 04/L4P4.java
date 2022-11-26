import java.util.Scanner;

class Counter
{
    static int count = 0;
    
    Counter()
    {
        count++;
    }
    
    public void showCount()
    {
        System.out.println("Count = "+count);
    }
}

class L4P4
{
    public static void main(String[] args)
    {
    
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number of Objects to be created : ");
            
            int n = sc.nextInt();
            Counter obj[] = new Counter[n];
   
            for(int i = 0 ; i < n ; i++)
            {
                obj[i] = new Counter();
                obj[i].showCount();
            }
        }
    }
}