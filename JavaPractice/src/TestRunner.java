



public class TestRunner implements Cloneable {
	
	String name;
	Integer id;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public TestRunner(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------");
		
		TestRunner test1 = new TestRunner("Kotresh",3423);
		
		try{
			TestRunner test2 = (TestRunner)test1.clone();
			System.out.println(test1.name);
			System.out.println(test2.name);
			
			test2.name="Malli";
			System.out.println(test1.name);
			System.out.println(test2.name);
		}catch(CloneNotSupportedException e){
			System.out.println(e);
		}
		
//		Result result = JUnitCore.runClasses(TestJunit.class);
//		
//		System.out.println("Result "+ result.wasSuccessful());

	}

}
