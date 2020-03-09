
public class tabDolnotrojkat {
	public static void main(String[] args) {
		int dolnotrojkatna[][] = new int[5][];
		for(int i=0; i<dolnotrojkatna.length;i++)
		{
			dolnotrojkatna[i] = new int[i+1];
			for(int j=0; j<dolnotrojkatna[i].length;j++)
			{
				dolnotrojkatna[i][j]=1;
				System.out.print(dolnotrojkatna[i][j]+" ");
			}
			System.out.println();
		}
	}
}
