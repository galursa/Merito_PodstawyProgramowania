
public class sredniaOcen {
	public static void main(String[] args) {
		double oceny[] = {3.0, 4.5, 5.0, 3.5, 4.5};
		double srednia=0;
		int dlugosc = oceny.length;
		for(int i=0; i<dlugosc; i++)
		{
			srednia+=oceny[i];
		}
		System.out.print(srednia/dlugosc);
	}
}
