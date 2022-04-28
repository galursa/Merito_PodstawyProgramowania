import java.util.Scanner;

/*
 * Potrawy
--
String nazwa
int kalorieNaPorcje
int ilePorcji
float sredniKosztPorcji
float wagaPorcji
string[10] skladniki
float[10] wagaSkladnikow 
--
void wyswietlInformacje()
 */
class Potrawy{
	String nazwa;
	int kalorieNaPorcje;
	int ilePorcji;
	float sredniKosztPorcji;
	float wagaPorcji;
	String[] skladniki = new String[10];
	float[] wagaLubIloscSkladnikow = new float[10];
	
	void wyswietlInformacje() {
		System.out.println("Nazwa: "+nazwa);
		System.out.println("Liczba porcji: "+ilePorcji);
		System.out.println("Kalorie w jednej porcji: "+kalorieNaPorcje);
		System.out.println("Waga porcji: "+wagaPorcji);
		System.out.println("Œredni koszt porcji: "+sredniKosztPorcji + " zl.");
		System.out.println("Sk³adniki");
		for(int i=0; i<10;i++)
		{
			if(wagaLubIloscSkladnikow[i]==0)
			{
				break;
			}else
			{
				System.out.print(skladniki[i]+" : "+wagaLubIloscSkladnikow[i]+" g. /szt.");
				System.out.println();
			}
		}
		
	}
}

public class Gotowanie {
	public static void main(String[] args) {
		Potrawy jajecznica = new Potrawy();
		jajecznica.nazwa = "Jajecznica z 8 jaj";
		jajecznica.kalorieNaPorcje = 100;
		jajecznica.ilePorcji = 4;
		jajecznica.sredniKosztPorcji = 10.7f;
		jajecznica.wagaPorcji = 400;
		jajecznica.skladniki[0] = "jajka";
		jajecznica.wagaLubIloscSkladnikow[0]=8;
		jajecznica.skladniki[1] = "maslo";
		jajecznica.wagaLubIloscSkladnikow[1]=50;
		jajecznica.wyswietlInformacje();
		
		Potrawy ciasto = new Potrawy();
		ciasto.nazwa = "Jablecznik";
		ciasto.kalorieNaPorcje = 600;
		ciasto.ilePorcji = 10;
		ciasto.sredniKosztPorcji = 20;
		ciasto.wagaPorcji = 100;
		
		Scanner data = new Scanner(System.in);
		System.out.println("Podaj sk³adniki do jablecznika;");
		int i=0;
		while ((i<10))
		{
			System.out.print(i+1);
			System.out.print("Podaj nazwe");
			ciasto.skladniki[i] = data.next();
			System.out.print("Podaj wage");
			ciasto.wagaLubIloscSkladnikow[i] = data.nextFloat();
			i++;
		}
		ciasto.wyswietlInformacje();
		data.close();
		
		
	}
}
