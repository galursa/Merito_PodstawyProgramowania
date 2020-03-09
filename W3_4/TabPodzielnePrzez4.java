
public class TabPodzielnePrzez4 {
	public static void main(String[] args) {
		int tablica[];
		tablica = new int[20];
		for(int i=4, j=0; i<20*4; i+=4, j++)
		{
			tablica[j]=i;
			System.out.print(tablica[j]+" ");
		}
	}
}
