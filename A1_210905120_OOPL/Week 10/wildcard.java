import java.util.*;
class wildcard{
	public static void main(String[] args){
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Double> list2 = Arrays.asList(1.0,2.0,3.0,4.0);
		compares(list1,list2);
	}
	static void compares(List<? extends Number> list1, List<? extends Number> list2)
	{
		int flag=0;
		for(int i=0;i<list1.size();i++)
			if(!(list1.get(i).equals(list2.get(i))))
				flag=1;
			if(flag==0)
				System.out.println("Lists are the same");
			else
				System.out.println("Lists are not the same");
	}
}