
public class ZestawPetli {
	public static void main(String[] args) {
		// Chcemy wyœwietliæ liczby od 10 do 1
		System.out.println("Pêtla wsteczna:");
		for(int i=10; i>=1; i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Tabliczka mno¿enia:");
		// tabliczka mno¿enia
		for(int i=1;i<11;i++)
		{
			for(int j=1;j<11;j++)
			{
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}
