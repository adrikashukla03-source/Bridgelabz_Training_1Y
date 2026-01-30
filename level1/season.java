import java.util.Scanner;

class season{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter month ");
		int a=sc.nextInt();
		System.out.println("Enter day ");
		int b=sc.nextInt();
		if(a>2&&a<7){
		
			if(a==3&&b<=20){
				System.out.println("Not a Spring Season");}
			else if(a==6&&b>=20){
				System.out.println("Not a Spring Season");}
			else{
				System.out.println("Spring season");}}
		else
			System.out.println("Not a spring season");
		}
	}
