import java.util.Random;

/*
 * Generujemy losowo elementy tablicy jednowymiarowej
 * nastêpnie wyswietlamy cala tablice
 * a potem wyswietlamy co piaty element
 */
public class TabJedenWymiarWyswietlCoKtorys {
	public static void main(String[] args) {
		int arraySize = 50;
		int intArray[] = new int[arraySize];
		Random rnd = new Random();
		for(int i=0; i<arraySize; i++)
		{
			intArray[i]= rnd.nextInt(10);
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arraySize; i+=5)
		{
			if(i==0)
			{
				System.out.print(intArray[i]);
			} else {
				System.out.format("%10d", intArray[i] );
			}
		}
	}
}
