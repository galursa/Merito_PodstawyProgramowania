
public class petlaForEach {
	public static void main(String[] args) {
	int tab[] = new int[20];
	for (int i=0; i<20;i++) {
		tab[i]=i*i;
		System.out.print(tab[i]+" ");
	}
	System.out.println();
	for(int element : tab)
	{
		System.out.print(element+" ");
	}
	System.out.println();
	}
}
