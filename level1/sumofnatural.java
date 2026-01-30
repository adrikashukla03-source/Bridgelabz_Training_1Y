import java.util.Scanner;
class SumOfNatuaral{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int num =sc.nextInt();
int sum=0;

if(num>=0){
int i=1;
while(i<=num){
sum+=i;
}
i++;
System.out.println(sum);
System.out.println("no. is natural no");
}
}
}