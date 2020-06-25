package learning;

public class AreaOfHexagon {

	public static double hexagonArea(double side) {	
		return (6*(side*side))/(4*Math.tan(Math.PI/6));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side = 6;
		//int area = 0;
		System.out.println(hexagonArea(side));
	}


}
