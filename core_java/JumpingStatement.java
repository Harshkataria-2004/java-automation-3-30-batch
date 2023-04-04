package core_java;

public class JumpingStatement {
	public static void main(String[] args) {
	int i;
	System.out.println("Break :");
	for(i=0;i<10;i++)
	{
		if(i==5)
		{
			break;
		}
		else
		{
			System.out.println("I : "+i);
		}
	}
	System.out.println("Continue :");
	for(i=0;i<10;i++)
	{
		if(i==5)
		{
			continue;
		}
		else
		{
			System.out.println("I : "+i);
		}
	}
	}
}
