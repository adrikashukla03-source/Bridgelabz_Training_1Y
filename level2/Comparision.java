import java.util.Scanner;
class Comparision{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the age ");
		int ageAmar =sc.nextInt();
		System.out.println("enter the age ");
		int ageAkbar=sc.nextInt();
		System.out.println("enter the age");
		int ageAnthony =sc.nextInt();
		
		System.out.println("enter the height");
		int heightAkbar =sc.nextInt();
		System.out.println("enter the height");
		int heightAmar=sc.nextInt();
		System.out.println("enter the height");
		int heightAnthony =sc.nextInt();
		
		if(ageAmar<ageAkbar && ageAkbar <ageAnthony){
		System.out.println("Amar is youngest");}
			else if(ageAkbar <ageAnthony && ageAnthony<ageAkbar){
			System.out.println("Akbar is youngest");}
				else{
					System.out.println("Anthony is Youngest");
				}
					
		if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest.");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }			
			
		
	}
}