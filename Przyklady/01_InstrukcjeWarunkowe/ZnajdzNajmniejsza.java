
public class ZnajdzNajmniejsza {
	public static void main(String[] args) {
		//mamy trzy liczby i chcemy znalezc najmniejsz¹ liczbe
		int l1 = 12;
		int l2 = 15;
		int l3 = 11;
		int lTemp;
		//l1 < l2 -  z tego uzyskamy liczbê mniejsz¹ z tych dwóch
		// lTemp < l3 - z tego uzyskamy ostatecznie najmniejsz¹ liczbê 
		
		if (l1 < l2)
		{
			lTemp = l1;
		}else {
			lTemp = l2;
		}
		if(lTemp > l3)
		{
			lTemp = l3;
		} 
		System.out.println("Liczba = "+lTemp);
		
	}
}
