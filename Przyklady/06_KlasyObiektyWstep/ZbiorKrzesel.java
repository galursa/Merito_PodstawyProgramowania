/*
 * Krzes³a
--
cena: float
obrotowe: boolean
naKolkach: boolean
materialy: string
ileNog: int
--
info():void
 */

class Krzeslo 
{
	float cena;
	boolean obrotowe;
	boolean naKolkach;
	String materialy;
	int ileNog;
	void info()
	{
		System.out.println("Parametry wybranego krzes³a: ");
		System.out.println("Materialy: "+materialy);
		System.out.println("Cena: "+cena+" zl.");
		System.out.println("Liczba nog: "+ileNog);
		System.out.print("Czy na kolkach? ");
		if(naKolkach)
			System.out.print("tak");
		else
			System.out.print("nie");
		System.out.println();
		System.out.print("Czy jest obrotowe? ");
		if(obrotowe)
			System.out.print("tak");
		else
			System.out.print("nie");	
		System.out.println();
	}
}




public class ZbiorKrzesel {
	public static void main(String[] args) {
		Krzeslo biurowe;
		biurowe = new Krzeslo();
		Krzeslo stolowe = new Krzeslo(); 
		biurowe.cena = 599.99f;
		biurowe.ileNog = 5;
		biurowe.materialy = "metalowa rama, material sztuczny, gabka, guma";
		biurowe.naKolkach = true;
		biurowe.obrotowe = true;
		biurowe.info();
		stolowe.cena = 499.99f;
		stolowe.ileNog = 4;
		stolowe.materialy ="drewniana rama, materia³, plastik";
		stolowe.naKolkach = false;
		stolowe.obrotowe = false;
		stolowe.info();
	}
}
