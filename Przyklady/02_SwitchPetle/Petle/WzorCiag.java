
public class WzorCiag {
	public static void main(String[] args) {
		//generujemy wzór
		//2 4 6 8
		//4 6 8
		//6 8
		//8
		
		for(int i=2;i<=8;i+=2)
		{
			for(int j=i; j<=8; j+=2)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
