
public class Wzory {
	public static void main(String[] args) {
		//wz�r kwadratu
		int rozmiar = 5;
		for(int i=1;i<=rozmiar;i++)
		{
			for(int j=1;j<=rozmiar;j++)
			{
				System.out.print("o");
			}
			System.out.println();
		}
		System.out.println();
		//wz�r tr�jk�ta
		for(int i=1;i<=rozmiar;i++)
		{
			for(int j=1; j<=i ;j++)
			{
				System.out.print("o");
			}
			System.out.println();
		}
	}
}
