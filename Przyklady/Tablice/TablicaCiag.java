
public class TablicaCiag {
	public static void main(String[] args) {
	//generujemy ci¹g liczb parzystych i zapisujemy go do tablicy
	int rozmiar = 20;
	int ciag[] = new int[rozmiar];
	for(int i=0; i<rozmiar; i++)
	{
		ciag[i]=i*2;
		System.out.print(ciag[i]+" ");
	}
	System.out.println();
	}
}
