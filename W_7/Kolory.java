import java.util.ArrayList;
import java.util.List;

public class Kolory {
	public static void main(String[] args) {
		//Tworzymy list�
		List <String> naszeKolory = new ArrayList<String>();
		//Wyswietlamy elemnety
		naszeKolory.add("Bia�y");
		naszeKolory.add("Czerwony");
		naszeKolory.add("��ty");
		System.out.println("Wpisana lista");
		System.out.println(naszeKolory);
		//Pobieramy wybrany element
		System.out.println("Drugi element na li�cie: ");
		System.out.println(naszeKolory.get(1));
	}
}
