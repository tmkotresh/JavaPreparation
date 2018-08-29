package IncrementDecrement;

public class TestIncrement {
	static int YCord = 700;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Communication Mode for Quality Impact to Customer";
		System.out.println(text.length());
				
		
		new TestIncrement().decrement();

	}
	
	public  void decrement(){
		 
		while(YCord>600){
			YCord = YCord-15;
			System.out.println( YCord);
		}
		
	}

}
