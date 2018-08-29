package RESTPractice;


import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class JavaToJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
	    Student st = new Student("Kotresh",29);
	    
	    try {
			mapper.writeValue(new File("C:/Users/kmatada/Downloads/test.json"), st);
			Student st1 = mapper.readValue(new File("C:/Users/kmatada/Downloads/test.json"), Student.class);
			System.out.println("------>"+st1.toString());
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
	    
		
//	    Student st1 = mapper.readValue(new File("C:/Users/kmatada/Downloads/test.json"), Student.class);

	}

}
