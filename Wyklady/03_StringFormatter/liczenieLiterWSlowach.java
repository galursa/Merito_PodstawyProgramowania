import java.util.Scanner;

public class liczenieLiterWSlowach {
	public static void main(String[] args) {
		Scanner wejscie = new Scanner(System.in);
		System.out.println("Podaj pierwsze slowo:");
		String slowo1 = wejscie.next();
		System.out.println("Podaj drugie slowo:");
		String slowo2 = wejscie.next();
		//Sprawdzamy czy d³ugoœæ jest taka sama

		if (slowo1.equals(slowo2) )
		{
			// sprawdzamy wyraz znak po znaku
			//w jednej tablicy zapisujemy nowy znak
			//w drugiej ile razy wyst¹pi³
			int iZnaki = 0;
			int dlugosc = slowo1.length();
			char[] znaki = new char[dlugosc];
			int[] iloscZnakow = new int[dlugosc];
			for(int i=0; i<dlugosc; i++)
				iloscZnakow[i] = 0;
			for(int i=0; i<dlugosc; i++)
			{
				int pozycjaZnaku=0;
				char znak = slowo1.charAt(i);
				if (i==0)
				{
					znaki[iZnaki]= znak ;
					iloscZnakow[0]=1;
					iZnaki++;
				}else {
				
					for(int j=i;j>=0; j--)
					{
						if(znak==znaki[j])
						{
							pozycjaZnaku=j;
							break;
						}else {
							pozycjaZnaku = -1;
						}
					}
					if(pozycjaZnaku>=0)
					{
						iloscZnakow[pozycjaZnaku]++;
						//znalezlismy znak
						//zwiekszamy wartosc
					} else
					{
						znaki[iZnaki]=znak;
						iloscZnakow[iZnaki]++;
						iZnaki++;
						//nieznalezlismy znaku - dopisujemy do tablicy
					}
				}
			}
			for(int i=0; i<dlugosc; i++)
			{
				System.out.println("Znak: "+znaki[i]+", Ilosc: "+iloscZnakow[i]);
			}
			

		}else {
			System.out.println("Slowa s¹ ró¿ne nie liczê znaków");
		}
		wejscie.close();
	}
}
