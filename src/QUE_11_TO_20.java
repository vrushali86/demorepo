import java.util.Scanner;

public class QUE_11_TO_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//11.TO FIND LEAP YEAR =YEAR DIVISIBLE BY 400 century years and ends with 00 
		
		int year =2012;
		if(year%400==0 &&year%4==0 && year%100==0)
		{
			System.out.println(year+" year is leap year ");
		}
		else if (year%4==0 && year%400==0 || year%100==0 )
		{
			System.out.println(year+" year is leap year ");	 
		}
		
		else
		{
			System.out.println(year+" year is not leap year ");	 
		}
		
		// no of digits in an integers
		
		int n= 16,digit=0 , rem=0 ;
		int newn = 0;
		
		
		while (n!=0)
		{
			
		 rem= n%10;
		 newn = (newn*10) + rem ;
		 n= n/10;
		 digit++;
		}
		
		System.out.println("reversed no = "+newn+ " no of digits = "+digit);
		
		
		
		// power of number 
		
		int n1=8;
		int pow=0;
		long mul=1;
		
		while(pow!=3)
		{
			mul=mul*n1;
			
			pow++;
		}
		System.out.println("power is "+ mul );
		
		
		//palidrome or not 
		
		int n2 =9089;
		int n3=n2;
		int rev=0;
		while(n2!=0)
		{
			
			rem=n2%10;
			rev=rev * 10 +rem; 
			n2=n2/10;
			
		}
		
		if(rev==n3)
		
			System.out.println(n3+" no is palidrome ");
		
		else
			System.out.println(n3+" no is not  palidrome ");
		
		//prime number 
		System.out.println( " prime numbes are  ");
		for(int n4=40;n4<73;n4++) {
			
					
		
		Boolean flag=false;
		for(int i=2;i<n4;i++)
		{
			if(n4%i==0)
			{
				flag=false;
				break;
			}
			flag=true;			
		}
		
		if(flag)
		{
			System.out.println(n4+ " number is prime ");
		}
		
		}
		
		//armstrong number cubes sum is equal to that number only 
		
	
		
       int n5=153;
		int templ=n5;
		int arm = 0;
		while(templ!=0)
		{
			int rem1 =templ%10;
			arm=arm + (rem1*rem1*rem1);
			templ=templ/10;
		}
		if(arm==n5)
		{
			System.out.println(arm +" number is armstrong ");
		}
		else
			
			System.out.println(n5 +" number is not  armstrong ");

		// find the factors   10--1,2,5,10 
		
		int n6=60;
		System.out.println("factords : ");
		
		for(int i=1;i<=n6;i++) {
			if(n6%i==0)
			{
				System.out.print(" "+i );
			}
			
		}
		
		
		//calculator using switch :
		Scanner sc = new Scanner (System.in);
		//enter two numbers 
		
		double first=50 ;
		double second=40 ;
		// enter the operator +-*/
		
		char op= '+';
		double result ;
		switch (op) {
		case '+':
			result=first+second;
			System.out.println("" +result);
			break;

		default:
			result=first-second;
			System.out.println("" +result);
			break;
		}
		
		
		//to check given number is summation of two [prime numbers or not ]
		
		int no1=34;
		System.out.println("summation of two prime numbers for "+no1);
		for(int i=2; i<=no1/2;i++)
		{
		if(isprime(i))
		{
			if(isprime(no1-i))
			{
			System.out.println(i+"+  "+(no1-i)+" =" +no1);	
			}
		}				
			
		}
	// recussion function sum 
		
		System.out.println("ANSWER IS "+sumof(3));
		int F=FACT(7);
		System.out.println("ANSWER of factorial  "+F);
	
		//binary to decimal 
		
		long ab=10101;
		long ab1=convert_B_to_D(ab);
		System.out.println("answer for B to D is "+ab1);
		long ab2=156;
		long ab3=convert_D_to_B(ab2);
		System.out.println("answer for D to B is "+ab3);
		
		long ab4=116;
		long ab5=convert_oct_dec(ab4);
		System.out.println("answer for O to D is "+ab5);
	}

	public static boolean isprime(int i) {
		
		for(int j=2; j<i;j++)
		{
			if(i%j==0)
			{
				return false;
			}
		}
		return true;
		
		
	}
	
	public static int sumof(int i)
	{
	
		if(i!=0)
		
	return i+	sumof(i-1)	;
		
		else
			
		return i;

		
	}
	
	
	public static int FACT(int o)
	{
	int out = 0;
	
	
		if(o>1)
		{
			out= FACT(o-1)*o 	;
		}
		else
			out=1;
		
		return out;

		
	}
	
	public static long convert_B_to_D(long B)
	{
		long dec=0;
		long i = 0;
		while(B!=0)
		{
		long r= (B % 10);
		dec=(long) (r *Math.pow(2, i) +dec);
		B=B/10;
		++i; 
		
		}
		return dec;
	}

	public static long convert_D_to_B(long D)
	{
		long B=0;int i = 0;
	
		while(D!=0)
		{	
		long  r= D%2;
		B=(long) (B+(r*Math.pow(10, i)));
		D=D/2;
		++i;
		}
		return B;
		
			}

     public static long convert_oct_dec(long Oct)
{
	long dec=0; int i=0;

	while(Oct!=0)
	{
		long r=Oct%10;
		dec=(long) (dec+r*(Math.pow(8, i)));
		Oct=Oct/10;
		++i;
	}
	
	return dec;
	
}

}
