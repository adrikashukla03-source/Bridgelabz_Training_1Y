class assignmentoperator
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	a+=5;
	System.out.println(a);
	a-=5;
	System.out.println(a);
}
}