package najwiekszaLosowa;

import java.util.Random;

public class najwiekszaLosowa {
	public static void main(String[] args) {
		// losujemy liczby i szukamy najwiêkszej wœród nich
		Random los = new Random();
		int losLiczba = los.nextInt(99);
		int maks=losLiczba;
		for(int i=1;i<20;i++)
		{
			losLiczba=los.nextInt(99);
			System.out.print(losLiczba+" ");
			if(losLiczba>maks)
				maks=losLiczba;
		}
		System.out.println();
		System.out.println("Wartoœæ maksymalna: "+maks);
		
	}
}
