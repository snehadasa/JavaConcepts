package learning;

public class AreaOfPoygon {

	public static double polygonArea(int no_of_sides, double side) {	
		return (no_of_sides*(side * side))/(4*Math.tan(Math.PI/no_of_sides));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side = 6;
		int no_of_sides = 7;
		//int area = 0;
		System.out.println(polygonArea(no_of_sides, side));
	}

}
