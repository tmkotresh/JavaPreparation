
public class Swap2NumbersWithVoid {
	
	private static int x;
	private static int y;
	

	
	
	


	public static int getX() {
		return x;
	}







	public static void setX(int x) {
		Swap2NumbersWithVoid.x = x;
	}







	public static int getY() {
		return y;
	}







	public static void setY(int y) {
		Swap2NumbersWithVoid.y = y;
	}


    
	static void swap(int x, int y) {
		Swap2NumbersWithVoid.setX(x=x+y);
		Swap2NumbersWithVoid.setY(y=x-y);
		Swap2NumbersWithVoid.setX(x=x-y);
		
		
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new Swap2NumbersWithVoid(3,5);
		
		Swap2NumbersWithVoid.setX(3);
		Swap2NumbersWithVoid.setY(5);
		
		System.out.println("X: "+Swap2NumbersWithVoid.getX()+" "+"Y: "+Swap2NumbersWithVoid.getY());
		
		swap(3,5);
		
		
		System.out.println("X: "+Swap2NumbersWithVoid.getX()+" "+"Y: "+Swap2NumbersWithVoid.getY());
		
		

	}

}
