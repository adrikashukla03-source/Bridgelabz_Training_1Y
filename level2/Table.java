import java.util.Scanner;
class Table{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num =sc.nextInt();
		
		for(int i=5;i<=9;i++){
         System.out.println(num+"*" +i+ "="+(num*i));
		}
	}
}