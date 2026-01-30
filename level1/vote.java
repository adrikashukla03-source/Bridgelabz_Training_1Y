import java.util.Scanner;

class vote{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a ");
		int a=sc.nextInt();
		if(a>=18)
		System.out.println("Eligible");
		else 
		System.out.println("Not eligible");
	}
}