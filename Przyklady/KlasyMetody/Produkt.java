
class Ksiazki{
	String tytul;
	String autor;
	String wydawnictwo;
	int wydanie;
	int rokWydania;
	double cena;
	
	void wyswietl() {
		System.out.println("Tytu³: "+tytul);
		System.out.println("Autor: "+autor);
		System.out.println("Wydawnictwo: "+wydawnictwo);
		System.out.println("Wydanie: "+ zamienNaRzymskie(wydanie));
		System.out.println("Rok wydania: "+rokWydania);
		System.out.println("Cena: "+cena);
	}
	
	double obliczVat5Procent()
	{
		return ((int)((0.05*cena)*100))/100.0;
	}
	
	String zamienNaRzymskie(int lArabska)
	{
		String lRzymska = "I";
		switch(lArabska)
		{
		case 1:
			lRzymska = "I";
			break;
		case 2:
			lRzymska = "II";
			break;
		case 3:
			lRzymska = "III";
			break;
		case 4:
			lRzymska = "IV";
			break;
		case 5:
			lRzymska = "V";
			break;
		case 6:
			lRzymska = "VI";
			break;
		case 7:
			lRzymska = "VII";
			break;
		case 8:
			lRzymska = "VIII";
			break;
		case 9:
			lRzymska = "IX";
			break;
		case 10:
			lRzymska = "X";
			break;
		}
		return lRzymska;
	}
	//ewentualnie to-do metoda do zamiany cyfr arabskich na rzymskie
}

public class Produkt {
	public static void main(String[] args) {
		Ksiazki lektura7kl = new Ksiazki();
		lektura7kl.autor = "Adam Mickiewicz";
		lektura7kl.tytul = "Pan Tadeusz";
		lektura7kl.wydawnictwo = "Ossolineum";
		lektura7kl.wydanie = 9;
		lektura7kl.rokWydania = 2021;
		lektura7kl.cena = 75.12;
		lektura7kl.wyswietl();
		System.out.println(lektura7kl.obliczVat5Procent());
	}
}
