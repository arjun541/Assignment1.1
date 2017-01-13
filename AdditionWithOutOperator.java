public class AdditionWithOutOperator
{



public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int a=Integer.parseInt(sc.next());
	int b=Integer.parseInt(sc.next());
		while(b!=0)
		{
		  int c=(a&b);
		  a=a^b;
		  b=c<<1;
		}

		System.out.println(a);
	}
  
  }
