
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=10;i++)
{
	for(int j=1;j<=10;j++)
	{
		if((i==4&&j!=4&&j!=10)|(j==4&&i!=4&&i!=10))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
			}
	System.out.println();
		}
	}
}