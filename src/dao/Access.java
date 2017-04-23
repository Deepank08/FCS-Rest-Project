package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.RCNMaster;

public class Access
{
public ArrayList<RCNMaster> getRCNMaster(Connection con) throws SQLException
{
ArrayList<RCNMaster> rcnList = new ArrayList<RCNMaster>();
PreparedStatement stmt = con.prepareStatement("Select `main`.`rcn`, `main`.`holdername`, `main`.`fathername`, `main`.`mothername`, `main`.`race`,`main`.`address`,`main`.`income`,`main`.`familyMembers`, `D`.`districtName`, `T`.`townName`, `S`.`ShopKey`, `S`.`shopName`, `C`.`cardtype` From `RCNMaster` AS `main` INNER JOIN `District Info` AS `D` ON `main`.`District Info_DistrictKey`=`D`.`DistrictKey` INNER JOIN `Town Info` AS `T` ON `main`.`Town Info_TownKey`=`T`.`TownKey` INNER JOIN `Shop Info` AS `S` ON `main`.`Shop Info_ShopKey`=`S`.`ShopKey` INNER JOIN `Card Info` AS `C` ON `main`.`Card Info_CardTypeKey`=`C`.`CardTypeKey` where `rcn`='1175100468'");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
RCNMaster rcnMasterObj = new RCNMaster();
rcnMasterObj.setRcn(rs.getString("rcn"));    //changing default names 
rcnMasterObj.setHolderName(rs.getString("holdername"));
rcnMasterObj.setFatherName(rs.getString("fathername"));
rcnMasterObj.setmotherName(rs.getString("mothername"));
rcnMasterObj.setAddress(rs.getString("address"));
rcnMasterObj.setIncome(rs.getString("income"));
rcnMasterObj.setFamilyMembers(rs.getString("familymembers"));
rcnMasterObj.setRace(rs.getString("race"));
rcnMasterObj.setDistrictName(rs.getString("districtName"));
rcnMasterObj.setTownName(rs.getString("townName"));
rcnMasterObj.setShopName(rs.getString("shopName"));
rcnMasterObj.setCardType(rs.getString("cardtype"));
rcnList.add(rcnMasterObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return rcnList;

}
}
