
public class FunkcjaSignum {
	public static void main(String[] args) {
		/* sgn(x) = { 1 jeœli x>0
		 * 			 0 jeœli x=0
		 * 			-1 jeœli x<0 
		 */
		double x, x1, x2;
		x = 3.14;
		x1 = 0;
		x2= -2.51;
		if(x1==0)
		{
			System.out.println("Sgn("+x1+")=0");
		}else if (x1>0)
		{
			System.out.println("Sgn("+x1+")=1");
		}else
		{
			System.out.println("Sgn("+x1+")=-1");
		}
		if(x==0)
		{
			System.out.println("Sgn("+x+")=0");
		}else if (x>0)
		{
			System.out.println("Sgn("+x+")=1");
		}else
		{
			System.out.println("Sgn("+x+")=-1");
		}
		if(x2==0)
		{
			System.out.println("Sgn("+x2+")=0");
		}else if (x2>0)
		{
			System.out.println("Sgn("+x2+")=1");
		}else
		{
			System.out.println("Sgn("+x2+")=-1");
		}
	}
}
