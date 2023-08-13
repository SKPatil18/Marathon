
public class Quadrant {
	public void findQuadrant(int x,int y) {
		if(x==0 && y==0) {
			System.out.println("Point is in the origin");
		}else if(x==0 && (y<0 || y>0)) {
			System.out.println("Point is in the X - axis");
		}else if(y==0 && (x<0 || x>0)) {
			System.out.println("Point is in the Y - axis");
		}else if(x>0 && y>0) {
			System.out.println("Point is in 1st-Quadrant");
		}else if(x<0 && y>0) {
			System.out.println("Point is in 2nd-Quadrant");
		}else if(x<0 && y<0) {
			System.out.println("Point is in 3rd-Quadrant");
		}else {
			System.out.println("Point is in 1st-Quadrant");
		}
	}

}
