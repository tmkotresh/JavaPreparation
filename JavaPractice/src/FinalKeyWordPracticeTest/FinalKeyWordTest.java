package FinalKeyWordPracticeTest;

public class FinalKeyWordTest {
	
	private  static final int val=5;
	
	private String name;
	private int age;
	
	
	public FinalKeyWordTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private final static FinalKeyWordTest finalKeyObj = new FinalKeyWordTest("Kotresh",2);
	
	
	
	
   
	
	
	
	
	

	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public static int getVal() {
		return val;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object[] s = new Integer[3];
		
		//s[0]=4.4;
		
		finalKeyObj.setAge(12);
		
		System.out.println("Age "+ finalKeyObj.getAge());
		
		
		

	}

}
