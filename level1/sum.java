import java.util.Scanner;

class vote{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a ");
		int n=sc.nextInt();
		int sum=0;
		if(n>0){
		sum=n*(n+1)/2;
		System.out.println("The Sum of "+n+" natural number is "+sum);}
		
		else
		System.out.println("The Number "+n+" is not natural number");
	}
}