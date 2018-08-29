package RESTPractice;

import java.net.*;
import java.util.Scanner;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class JavaRESTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			URL url = new URL("http://maps.googleapis.com/maps/api/geocode/json?address=583137&sensor=false");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			String inline = "";
			JSONObject jobj = new JSONObject();
			JSONParser parse = new JSONParser();

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			} else {
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					inline += sc.nextLine();
					
				}
				System.out.println("JSON data in string format");
				System.out.println(inline);
				sc.close();
			}
			
			jobj = (JSONObject) parse.parse(inline);

			JSONArray jsonarr_1 = (JSONArray) jobj.get("results");

			for (int i = 0; i < jsonarr_1.size(); i++) {
				
				//Store the JSON objects in an array
				//Get the index of the JSON object and print the values as per the index
				JSONObject jsonobj_1 = (JSONObject)jsonarr_1.get(i);
				//Store the JSON object in JSON array as objects (For level 2 array element i.e Address Components)
				JSONArray jsonarr_2 = (JSONArray) jsonobj_1.get("address_components");
				System.out.println("Elements under results array");
				System.out.println("\nPlace id: " +jsonobj_1.get("place_id"));
				System.out.println("Types: " +jsonobj_1.get("types"));
				//Get data for the Address Components array
				System.out.println("Elements under address_components array");
				System.out.println("The long names, short names and types are:");
				for(int j=0;j<jsonarr_2.size();j++)
				{
					//Same just store the JSON objects in an array
					//Get the index of the JSON objects and print the values as per the index
					JSONObject jsonobj_2 = (JSONObject) jsonarr_2.get(j);
					//Store the data as String objects
					String str_data1 = (String) jsonobj_2.get("long_name");
					System.out.println(str_data1);
					String str_data2 = (String) jsonobj_2.get("short_name");
					System.out.println(str_data2);
					System.out.println(jsonobj_2.get("types"));
					System.out.println("\n");
				}

			
			
				

			

			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {

			e.printStackTrace();

		}

	}

}
