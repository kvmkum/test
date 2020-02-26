import java.util.Scanner;
class Pattern
{
	int n,c;
	Scanner sc =new Scanner(System.in);
	void print()
	{
		System.out.print("Enter the no of lines : ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int mid=n/2+1;
			if(i<=mid)
			{
				for(int j=1;j<=i;j++)
				{				
						c=j*i;
						System.out.print(c+" ");	
				}
				System.out.println();
			}
			else
			{
				for(int j=mid-1;j>0;j--)
				{
					for(int k=1;k<=j;k++)
					{				
					
						c=k*i;
						System.out.print(c+" ");	
						if(k==j)
							i++;
					}
					System.out.println();
				}
				
			}
			
		}
	}
}
class PatternPrinting
{								
	public static void main(String args[])
	{
		Pattern p=new Pattern();
		p.print();
	}
}
