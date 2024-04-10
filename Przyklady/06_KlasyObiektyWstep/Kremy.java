/*KremyDoRak
--
firma: String
nazwa: String
terminWaznosci: String
czasUzytkowaniaOd1Otwarcia: int
cena: double
pojemnik: String
pojemnosc: double
cenaZOstatnich30Dni: double
--
wyswietl():void
*/

class KremyDoRak
{
	String firma;
	String nazwa;
	String terminWaznosci;
	int czasUzytkowaniaOd1Otwarcia;
	double cena;
	String pojemnik;
	double pojemnosc;
	double cenaZOstatnich30Dni;
	void wyswietl()
	{
		System.out.println("Firma: "+firma);
		System.out.println("Nazwa: "+nazwa);
		System.out.println("Cena: "+cena+" zl");
		System.out.println("Cena z ostatnich 30 dni: "+cenaZOstatnich30Dni+" zl");
		System.out.println("Pojemnik: "+pojemnik);
		System.out.println("Zawartosc: "+pojemnosc+" ml");
		System.out.println("Zuzyj przed: "+terminWaznosci);
		System.out.println("Od otwarcia zuzyj w przeciagu: "+czasUzytkowaniaOd1Otwarcia+" miesiecy");
	}
}


public class Kremy {
	public static void main(String[] args) {
		KremyDoRak zwykly = new KremyDoRak();
		zwykly.firma = "Sloneczko";
		zwykly.nazwa = "Rumiankowy";
		zwykly.cena = 6.99;
		zwykly.cenaZOstatnich30Dni = 4.99;
		zwykly.terminWaznosci = "12.05.2025";
		zwykly.czasUzytkowaniaOd1Otwarcia = 12;
		zwykly.pojemnik = "tubka";
		zwykly.pojemnosc = 75;
		zwykly.wyswietl();
	}
}
