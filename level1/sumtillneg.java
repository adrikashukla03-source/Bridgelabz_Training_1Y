import java.util.Scanner;
class SumUntilNeg{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		double num=sc.nextDouble();
		int sum=0;
		
		
		while(true){
	
		num = sc.nextDouble();
		
		if(num<=0){
			
		break;
		}
		sum+=num;
		}
		System.out.println(sum);
	}
}