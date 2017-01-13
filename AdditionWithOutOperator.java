public class AdditionWithOutOperator
{



public static void main(String args[])
	{
		int a=4,b=3;
		while(b!=0)
		{
		  int c=(a&b);
		  a=a^b;
		  b=c<<1;
		}

		System.out.println(a);
	}
  
  }
