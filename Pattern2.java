
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(j==1|j==11|i==j&j<=6|i+j==12&j>=6)
				{
					System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println(); 

	}
		System.out.println("============================");
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(j==1|j==11|i==1|i==6)
				{
					System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();

	}
		System.out.println("================================="); 
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(j==1|j==11|i==j)
				{
					System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();

	}
		System.out.println("===========================");
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(i==11|i==1|j==6)
				{
					System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();

	}
		System.out.println("===========================");
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(j==1|i-j==5|i+j==7)
				{
					System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();

	}
	}
}
