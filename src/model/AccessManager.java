package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.RCNMaster;

import dao.Access;
import dao.Database;

public class AccessManager
{
public ArrayList<RCNMaster> getRCNMaster() throws Exception
{
ArrayList<RCNMaster> rcnList = new ArrayList<RCNMaster>();
Database db = new Database();
Connection con = db.getConnection();
Access access = new Access();
rcnList = access.getRCNMaster(con);
return rcnList;
}
}
