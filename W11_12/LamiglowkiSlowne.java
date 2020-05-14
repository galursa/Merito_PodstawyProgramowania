import java.util.Scanner;

interface WejscieWyjscieSlowa
{
	public void wyswietl();
	public void pobierzDane();
}

interface Lamiglowki
{
	public void czyPierwszeLiteryTakieSame();
	public void czyDlugoscSlowTakaSama();
}

class SlowoDoSlowa implements  WejscieWyjscieSlowa,Lamiglowki
{
	protected String[] slowa;
	SlowoDoSlowa(int rozmiar)
	{
		slowa = new String[rozmiar];
	}
	public void pobierzDane()
	{
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj s�owa");
		for(int i=0; i<slowa.length; i++)
		{
			System.out.print(i+": ");
			slowa[i] = dane.next();
		}
		dane.close();
	}
	public void wyswietl()
	{
		for(int i=0; i<slowa.length; i++)
		{
			System.out.println(slowa[i]);
		}
		System.out.println();
	}
	public void czyPierwszeLiteryTakieSame()
	{
		Boolean tak=true;
		for(int i=1; i<slowa.length; i++)
		{
			if(slowa[i-1].charAt(0)!=slowa[i].charAt(0))
			{
				tak=false;
				break;
			}
		}
		if(tak)
		{
			System.out.println("Wszystkie s�owa zaczynaj� si� t� sam� liter�");
		} else
		{
			System.out.println("Niekt�re s�owa zaczynaj� si� inn� liter�");
		}
	}
	public void czyDlugoscSlowTakaSama()
	{
		Boolean tak=true;
		for(int i=1; i<slowa.length; i++)
		{
			if(slowa[i-1].length()!=slowa[i].length() )
			{
				tak=false;
				break;
			}
		}
		if(tak)
		{
			System.out.println("Wszystkie s�owa maj� te sam� d�ugo��");
		} else
		{
			System.out.println("S�owa s� r�nej d�ugo�ci");
		}
	}
}

public class LamiglowkiSlowne {
	public static void main(String[] args) {
		SlowoDoSlowa test = new SlowoDoSlowa(4);
		test.pobierzDane();
		test.wyswietl();
		test.czyPierwszeLiteryTakieSame();
		test.czyDlugoscSlowTakaSama();
	}
}
