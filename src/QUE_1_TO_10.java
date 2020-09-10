import java.util.Scanner;

public class QUE_1_TO_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("QUE 1============================");
//1.ENTER THE NUMBER ENTERED BY USER 
		
		Scanner sc = new Scanner (System.in);//java.util
		int a;
		System.out.println("enter the no ");
		//a= sc.nextInt();
		//System.out.println(""+a);
		
		//2.add two integer 
		
		System.out.println("QUE 2============================");
		//int b=sc.nextInt();
		//int c =sc.nextInt();
		
		int b1=9;
		int c1=24;
		
		int d=b1+c1;
		System.out.println("sum is "+d);
		
//3.MULTIPLICATION OF FLOATING OPINT NUMBERS 
		System.out.println("QUE 3============================");
		float e=9.8f;
		float f=8.1f;
		System.out.println("multiplication is "+(e*f));
		
		//4. find ascii value of the character 
		System.out.println("QUE 4============================");
		
		char g='g';//a=97
		
		int g1=g;
		System.out.println(""+g1);
		int ascii_of_g1 =(int)g;
		System.out.println(""+ascii_of_g1);
		
		System.out.println("QUE 5============================");

		
		//5. to find quotient and reminder
		
		int rem= 145 % 82;
		int divi=145 / 82;
		
		System.out.println(" quotient and reminder are "+divi+"  "+ rem );
		
		System.out.println("QUE 6============================");
		//6. to find swapping of two numbers 
		int h= 34;
		int j=9;
		System.out.println("before swapping no are h=  :"+h+"  j="+j);
			
		int t;
		t=h;
		h=j;
		j=t;
		System.out.println("swapped no are :h= "+h+" j= "+j);
		
		System.out.println("before swapping without third variable  h= "+h+" j ="+ j);
	h=h+j;
	j=h-j;
	h=h-j;
	
	System.out.println("swapped without third variable  h= "+h+" j ="+ j);
	System.out.println("QUE 7============================");
	//7. number is even or odd 
	
	int k=8;
	if (k%2==0)
		System.out.println(k+ "number is even");
	else
		System.out.println(k+ "number is odd ");
		
	
	System.out.println("QUE 8============================");
	
	//8.given alphabet  is vowel or consonant 
	
	char l='L';
	
	if((l=='a') ||(l=='e') || (l=='i') ||( l=='o') || (l=='u'))
	{
		System.out.println(l +"  character is vowel ");
	}
	else
		System.out.println(l +"  character is  consonant");
	
	
	//by using switch case 
	
	switch(l)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println(l + "character is vowel ");
		break;
		
	default:
		System.out.println(l +"  character is  consonant");
		break;
		
	}
	System.out.println("QUE 9============================");
	//9.largest among 3 numbers 
	
	int m=78;
	int n=84;
	int o=24;
			
	
	if (m>n && m>o)
		System.out.println(m+" is the largest number ");
	else if (n>m && n>o)
		System.out.println(n+" is the largest number ");
	else
		System.out.println(o+" is the largest number ");
	System.out.println("QUE 10============================");
	//QUADRATIC EQUATION :
	
	
	}

}
