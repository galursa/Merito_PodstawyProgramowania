
public class tablicaZeZmiennaLiczbaElementow {
	public static void main(String[] args) {
		// generujemy tablice 
		//1 1 1 1 1
		//1 1 1 1
		//1 1 1
		//1 1
		//1
		
		int tablicaJedynek[][]=new int[5][];
		int dlugosc = tablicaJedynek.length;
		
		for(int i=0; i<dlugosc; i++)
		{
			tablicaJedynek[i]= new int[dlugosc-i];
			for(int j=0;j<tablicaJedynek[i].length; j++ )
			{
				tablicaJedynek[i][j]=1;
				System.out.print(tablicaJedynek[i][j]+" ");
			}
			System.out.println();
		}
	}
}
