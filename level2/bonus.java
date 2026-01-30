import java.util.Scanner;
class Bonus{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the years");
		int y=sc.nextInt();
		
		double b=0.05;
		double Total_bonus=0;
		
		
		if(y>5){
			System.out.println("enter the salary:");
			int sal= sc.nextInt();
			Total_bonus=sal*b;
		System.out.println(Total_bonus);
		}
		else{
			System.out.println("no bonus");
		}
	}
}