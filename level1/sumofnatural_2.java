import java.util.Scanner;
class SumOfNatural_2{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the num");
int num =sc.nextInt();
int sum=0;
if(num>0){
	
return;
}
for(int i=1;i<=num;i++){
	 sum=sum+i;
}
System.out.println(sum);
	
}

}