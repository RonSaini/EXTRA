import myPackages.p1.Maximum;

class Q2{
	public static void main(String[] args){
		System.out.println(Maximum.max(2,3,4));
		System.out.println(Maximum.max(2.1F,3.5F,5.3F));
		int[] a = {5,7,816,10};
		System.out.println(Maximum.max(a));
		int[][] b = { { 1, 2 },{ 67, 45 } };
		System.out.println(Maximum.max(b));
	}
}