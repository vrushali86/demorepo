
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*      1  
 1 2  
 1 2 3  
 1 2 3 4  
		 
		 */
		System.out.println(" first program  ");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);//common 
			}
			System.out.println("  ");
		}
		
		System.out.println("second prog   ");
		/*  
		 
		 */
		for(int i=4;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println("  ");
		}
		
		System.out.println("third  prog   ");
		
		for(int i=4;i>0;i--)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" "+j);
			}
			System.out.println("  ");
		}
		
		System.out.println("fourth  prog ");	
		for(int i=4;i>0;i--)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" "+i);
			}
			System.out.println("  ");
		}
		
		System.out.println("fifth  prog ");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" "+j);
			}
			System.out.println("  ");
		}
		
		
		System.out.println(" sixth program  ");
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)
			{
				//common 
				System.out.print("  "+j);
			
			}
			System.out.println(" ");
		}
		
	}

}
