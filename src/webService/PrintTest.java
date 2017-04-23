package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/restful")
public class PrintTest {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnPrint()
	{
		return "Hello World!";
	}

}
