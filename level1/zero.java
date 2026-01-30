import java.util.Scanner;

class zero{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a ");
		double sum=0;
		while(double n!=0){
		double n=sc.nextInt();
		for(int i=1;i<=n;i++){
		sum+=i;}
		System.out.println("The Sum of "+n+" natural number is "+sum);}
	}
}