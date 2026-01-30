import java.util.Scanner;

class divisible{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a ");
		int a=sc.nextInt();
		if(a%5==0)
		System.out.println("Divisible");
		else 
		System.out.println("Not Divisible");
	}
}