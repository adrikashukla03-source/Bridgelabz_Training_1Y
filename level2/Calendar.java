import java.util.Scanner;
class Calendar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year number");
		int y=sc.nextInt();
		System.out.println("enter month number");
		int m=sc.nextInt();
		System.out.println("enter date number");
		int d=sc.nextInt();
		int y0=y-(14-m)/12;
		int x=y0+(y0/4)-(y0/100)+(y0/400);
		int m0=m+(12*((14-m)/12))-2;
		int d0=(d+x+(31*m0)/12)%7;
		System.out.println("0=sunday,1=monday,2=tuesday,3=wednesday,4=thursday,5=friday,6=saturday");
		System.out.println("day of week="+d0);
	}
}