import java.util.Scanner;
class BMI
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kg");
        double w=sc.nextDouble();
        System.out.println("Enter height in cm");
        double h=sc.nextDouble();
        h= h/100;
        double bmi = w/(h*h);
        System.out.println("BMI= " + bmi);
        if (bmi<=18.4) 
		{
            System.out.println("Underweight");
        } 
		else if(bmi>=18.5&&bmi<=24.9)
		{
            System.out.println("Normal");
        }
		else if (bmi>=25.0&&bmi<=39.9) 
		{
            System.out.println("Overweight");
        }
		else if(bmi>=40.0)
		{
            System.out.println("Obese");
        }
    }
}