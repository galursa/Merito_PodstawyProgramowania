import java.util.HashSet;
import java.util.Set;

public class Alfabet {
	public static void main(String[] args) {
		Set<String> litery = new HashSet<String>();
		litery.add("A");
		litery.add("B");
		System.out.println(litery);
		litery.add("A");
		System.out.println(litery);
		for (String znak: litery)
		{
			System.out.print(znak+", ");
		}
		System.out.println();
		System.out.println("Czy zbi�r zawiera A? "+ litery.contains("A"));
		System.out.println("Czy zbi�r zaweira C? "+litery.contains("C"));
		System.out.println("Czy�cimy zbi�r");
		litery.clear();
		System.out.println(litery);
	}
}
