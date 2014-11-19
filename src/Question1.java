import java.util.List;


public class Question1 {

	
	public static void compute(List<Point> points) {
		int initx = points.get(0).x;
		int inity = points.get(0).y;
		int minX = points.get(0).x;
		int minY = points.get(0).y;

		for (Point point : points) {
			if (initx < point.x) {
				initx = point.x;
			}
			if (inity < point.y) {
				inity = point.y;
			}
			if (minX > point.x) {
				minX = point.x;
			}
			if (inity > point.y) {
				minY = point.y;
			}
		}
		Point uprightPoint = new Point(initx, inity);
		Point botdownPoint = new Point(minX, minY);

		System.out.println("Top-right " + uprightPoint);
		System.out.println("Bottom-left "+botdownPoint);

	}
	
}
