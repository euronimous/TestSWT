import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Point> points = new ArrayList<Point>();

		Point point1 = new Point(-1, 0);
		Point point2 = new Point(2, 2);
		Point point3 = new Point(1, 3);
		
		points.add(point1);
		points.add(point2);
		points.add(point3);
		Question1.compute(points);
		
		System.out.println("#"+Question2.convert(68)+Question2.convert(58)+Question2.convert(197));
		
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(8);
		listInt.add(6);
		listInt.add(6);
		listInt.add(20);
		listInt.add(9);
		listInt.add(1);
		listInt.add(12);
		listInt.add(16);
		listInt.add(3);
		listInt.add(16);
		listInt.add(22);
		listInt.add(2);
		
		Question3.computePercent(listInt);
		
	}

	

}
