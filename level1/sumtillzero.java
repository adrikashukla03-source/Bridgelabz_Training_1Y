import java.util.Scanner;
class SumtillZero{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		double num=sc.nextDouble();
		int sum=0;
		
		
		while(num!=0){
		sum+=num;
		num =sc.nextDouble();
		}
		
        System.out.println(sum);
	}
}