package Test_Classes;


import org.testng.annotations.Test;

import Common_API_Method.Get_API_Method;
import Repository.Get_Repository;

public class Get_TC 
{
 @Test	
	
	public static void extractor ()
	{
		
		int statusCode = Get_API_Method.ResponseStatusCode(Get_Repository.BaseURI(),
				Get_Repository.Get_Resource());
		System.out.println(statusCode);
		
		String ResponseBody = Get_API_Method.ResponseBody(Get_Repository.BaseURI(),
				Get_Repository.Get_Resource() ) ;
		System.out.println(ResponseBody);		
	}
}
