import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Question3 {

	
	public static void computePercent(List<Integer> listInt){
		
		Collections.sort(listInt);
		
		System.out.println(listInt);
		
		System.out.println("25% of the numbers are less than or equal to " +listInt.get((int) (.25*listInt.size()) - 1));
		System.out.println("50% of the numbers are less than or equal to " +listInt.get((int) (.5*listInt.size()) - 1));
		System.out.println("75% of the numbers are less than or equal to " +listInt.get((int) (.75*listInt.size()) - 1));
		System.out.println("90% of the numbers are less than or equal to " +listInt.get((int) (.9*listInt.size()) - 1));
		System.out.println("95% of the numbers are less than or equal to " +listInt.get((int) (.95*listInt.size()) - 1));
		System.out.println("99% of the numbers are less than or equal to " +listInt.get((int) (.99*listInt.size()) - 1));
		System.out.println("100% of the numbers are less than or equal to " +listInt.get((int) (1*listInt.size()) - 1));

		
	}
}
