import java.util.Random;

public class Oceny {
	public static void main(String[] args) {
		//przyklad switch jako menu
		//1. policzyæ sumê liczb ci¹gu 7,14,21
		//2. wzorek 
		/* 3 2 1   i=1, j=3, 2, 1      3-i+1 = 3 
		 * 2 1     i=2, j=2, 1         3-i+1 = 2
		 * 1       i=3, j=1            3-i+1 = 1
		 */
		//3. losujemy liczbe i sprawdzamy czy jest wiêksza od drugiej wylosowanej za pomoc¹ operatora ?
		Random los = new Random();
		int wybor = los.nextInt(3)+1;
		System.out.println("Program losuje jedno z trzech zadañ i je wykonuje.");
		System.out.println("Mo¿liwe s¹ zadania:");
		System.out.println("1. policzyæ sumê liczb ci¹gu 7,14,21,...");
		System.out.println("2. wzorek ");
		System.out.println("3 2 1");
		System.out.println("2 1");
		System.out.println("1");
		System.out.println("3. losujemy liczbe i sprawdzamy czy jest wiêksza od drugiej wylosowanej za pomoc¹ operatora ?");
		
		switch(wybor) {
		case 1:
			System.out.println("Zadanie 1");
			int suma=0;
			int i=7;
			do {
				suma+=i;
				i+=7; //i=i+7
			}while(i<100);
			System.out.println("Dla ci¹gu 7, 14, 21, ... suma = "+suma);
			break;
		case 2:
			System.out.println("Zadanie 2");
			int ile=5;
			for(int i1=1; i1<=ile; i1++)
			{
				for(int j=ile-i1+1; j>=1; j--)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			break;
		case 3:
			System.out.println("Zadanie 3");
			int liczba1 = los.nextInt(20);
			int liczba2 = los.nextInt(20);
			System.out.println(liczba1> liczba2 ? liczba1+">"+liczba2 : liczba1+"<="+liczba2);
			break;
		default:
			System.out.println("Nierozpoznany wybór");
		}	
	}
}
