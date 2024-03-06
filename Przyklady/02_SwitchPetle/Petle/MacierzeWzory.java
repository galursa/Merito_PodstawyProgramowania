import java.util.Random;

public class MacierzeWzory {
	public static void main(String[] args) {
		/*
		 *  Generujemy macierz jednostkowa
		 *  rozmiar n = 3
		 *     1 2 3
		 *    ------
		 *  1| 1 0 0   i=1, j=1  
		 *  2| 0 1 0   i=2, j=2
		 *  3| 0 0 1   i=3, j=3
		 */
		System.out.println("Macierz jednostkowa");
		Random rnd = new Random();
		int rozmiar = rnd.nextInt(5)+2;
		
		for(int i = 1; i<=rozmiar; i++)
		{
			for(int j=1; j<=rozmiar; j++)
			{
				if(i==j)
				{
					System.out.print("1 ");
				} else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		/*
		 * Tworzymy docelowo macierz górnotrójkatna
		 * rozmiar = 3
		 *    1 2 3
		 *    ------ 
		 * 1| 8 9 4     i =1, j= 1,2,3   if(j>=i)
		 * 2| 0 3 2     i =2, j=2,3
		 * 3| 0 0 1     i=3,  j=3
		 * przyjmiemy ze wyswietlamy jedynki na poczatku
		 * kiedy i=j to mamy przekatna
		 * chcemy zeby losowane byly liczby od 1 do 9 
		 */
		System.out.println("Macierz gornotrojkatna");
		
		//rozmiar = 3;
		for(int i = 1; i<=rozmiar; i++)
		{
			for(int j=1; j<=rozmiar; j++)
			{
				if(j>=i)
				{
					System.out.print(rnd.nextInt(9)+1+" ");
				}else
				{
					System.out.print("0 ");
				}
				
			}
			System.out.println();
		}
		
	}
}
