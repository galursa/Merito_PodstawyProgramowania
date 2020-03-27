
public class DeklaracjaTablicy {
	public static void main(String[] args) {
		//Deklaracja tablicy z wartoœciami i wyœwietlamy tablicê
		double stale[] = {3.14, 2.71, 5.12, 1.2};
		int dlugosc = stale.length;
		for(int i=0; i<dlugosc; i++)
		{
			System.out.print(stale[i]+" ");
		}
		System.out.println();
		for(double element: stale )
		{
			element=element*2;
			System.out.print(element+" ");
		}
	}
}
