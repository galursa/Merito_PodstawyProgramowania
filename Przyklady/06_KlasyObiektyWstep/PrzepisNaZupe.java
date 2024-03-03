/*
 * Zupa
--
String nazwa
String przepis
String sk³adniki
int iloscPorcji
int kalorycznosc
String alergeny
boolean czyWeganska;
--
void wyswietl()

 */
class Zupa{
	String nazwa;
	String przepis;
	String skladniki;
	int iloscPorcji;
	int kalorycznosc;
	String alergeny;
	boolean czyWeganska;
	void wyswietl()
	{
		System.out.println("Nazwa: "+nazwa);
		System.out.println("Skladniki: ");
		System.out.println(skladniki);
		System.out.println("Przepis:");
		System.out.println(przepis);
		System.out.println("Przepis na "+iloscPorcji+" porcj/ê/e/i ");
		System.out.println("Zawiera: "+kalorycznosc+" kcal");
		System.out.println("Zawiera alergeny: "+alergeny+".");
		System.out.print("Czy weganska: ");
		if(czyWeganska)
			System.out.print("tak");
		else
			System.out.print("nie");
		System.out.println();
	}
}


public class PrzepisNaZupe {
	public static void main(String[] args) {
		Zupa pomidorowa = new Zupa();
		pomidorowa.nazwa="Pomidorowa z ryzem";
		pomidorowa.skladniki = "Koncentrat pomidorowy, ryz, warzywa";
		pomidorowa.przepis= "Wrzuc skladniki do garnka. Zalej woda. Gotuj 1h";
		pomidorowa.kalorycznosc = 499;
		pomidorowa.iloscPorcji = 20;
		pomidorowa.alergeny = "Seler, moze zawierac gluten";
		pomidorowa.czyWeganska = true;
		pomidorowa.wyswietl();
		Zupa kwasnica = new Zupa();
		kwasnica.nazwa = "Kwasnica";
		kwasnica.skladniki = "Kapusta kiszona, zeberka, ziemniaki, kwas z kapusty kiszonej";
		kwasnica.przepis = "Wrzuc skladniki do garnka. Zalej woda. Gotuj 3,5h";
		kwasnica.alergeny = "Moze zawierac gluten";
		kwasnica.kalorycznosc = 600;
		kwasnica.iloscPorcji = 25;
		kwasnica.czyWeganska = false;
		kwasnica.wyswietl();
		
		
	}
}
