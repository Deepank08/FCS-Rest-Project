package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.dto.RCNMaster;
import com.google.gson.Gson;
 
import model.AccessManager;;
 
@Path("/courseService")
public class CourseService
{
@GET
@Path("/courses")
@Produces("application/json")
public String courses()
{
String courses = null;
ArrayList<RCNMaster> rcnList = new ArrayList<RCNMaster>();
try
{
rcnList = new AccessManager().getRCNMaster();
Gson gson = new Gson();
courses = gson.toJson(rcnList);
} catch (Exception e)
{
e.printStackTrace();
}
return courses;
}
}
