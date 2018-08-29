import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFileFromServer {
	private static InputStream input = null;
	private static Properties prop = new Properties();
	
	
	public static void main(String[] args){
		
		try {
			input = new FileInputStream("D:\\Work\\SRF\\SRFConfig.properties");
			prop.load(input);
			
			System.out.println("URL "+ prop.getProperty("CAPEX_APPROVAL_DEV_URL"));
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
