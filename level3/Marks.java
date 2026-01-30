import java.util.Scanner;
class Marks
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks in physics");
		int p=sc.nextInt();
		System.out.println("enter marks in chemistry");
		int c=sc.nextInt();
		System.out.println("enter marks in maths");
		int m=sc.nextInt();
		int t=p+c+m;
		int percentage=t/3;
		System.out.println("percentage="+percentage);
		if(percentage>=80)
		{
			System.out.println("remark-level 4,above agency-normalised standard");
            System.out.println("grade-A");
		}
        else if(percentage>=70 && percentage<=79)
		{
            System.out.println("remark-level 3,at agency-normalised standards");
            System.out.println("grade-B");
		}
        else if(percentage>=60 && percentage<=69)
		{
            System.out.println("remark-level 2,below,but approaching agency-normalised standards");
            System.out.println("grade-C");
		}
        else if(percentage>=50 && percentage<=59)
		{
            System.out.println("remark-level 1,well below agency-normalised standards");
            System.out.println("grade-D");
		}
        else if(percentage>=40 && percentage<=49)
		{
            System.out.println("remark-level 1-,too below agency-normalised standards");
		    System.out.println("grade-E");
		} 			
		else 
		{
			System.out.println("remark-remedial standards");
			System.out.println("grade-R");
		}
	}
}