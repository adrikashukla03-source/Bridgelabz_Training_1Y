import java.util.Scanner;

class smallest{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b&&a<c)
		System.out.println("a is smallest");
		else 
		System.out.println("a is not smallest");
	}
}