package com.dto;

public class RCNMaster {
	private String rcn;
	private String holdername;
	private String race;
	private String districtName;
	private String fathername;
	private String mothername;
	private String address;
	private String income;
	private String familymembers;
	private String townName;
	private String shopName;
	private String cardtype;
	 
	public RCNMaster()
	{
	 
	}
	 
	public RCNMaster(String rcn, String holdername, String race, String districtName,String fathername,
			String mothername,String address,String income,String familymembers,String townName,String shopName,String cardtype)
	{
	super();
	this.rcn = rcn;
	this.fathername = fathername;
	this.race = race;
	this.districtName = districtName;
	this.holdername = holdername;
	this.mothername = mothername;
	this.address = address;
	this.income = income;
	this.familymembers = familymembers;
	this.townName = townName;
	this.shopName = shopName;
	this.cardtype = cardtype;
	}
	
	
	public String getRcn()
	{
	return rcn;
	}
	
	public void setRcn(String rcn)
	{
	this.rcn = rcn;
	}
	 
	
	 
	public String getHolderName()
	{
	return holdername;
	}
	
	public void setHolderName(String holdername)
	{
	this.holdername = holdername;
	}
	
	public String getFatherName()
	{
	return fathername;
	}
	
	public void setFatherName(String fathername)
	{
	this.fathername = fathername;
	}
	
	public String getmotherName()
	{
	return mothername;
	}
	
	public void setmotherName(String mothername)
	{
	this.mothername = mothername;
	}
	
	public String getAddress()
	{
	return address;
	}
	
	public void setAddress(String address)
	{
	this.address = address;
	}
	
	public String getIncome()
	{
	return income;
	}
	
	public void setIncome(String income)
	{
	this.income = income;
	}
	
	public String getFamilyMembers()
	{
	return familymembers;
	}
	
	public void setFamilyMembers(String familymembers)
	{
	this.familymembers = familymembers;
	}
	 
	 
	public String getRace()
	{
	return race;
	}
	
	public void setRace(String race)
	{
	this.race = race;
	}
	 
	
	 
	public String getDistrictName()
	{
	return districtName;
	}
	
	public void setDistrictName(String districtName)
	{
	this.districtName = districtName;
	}
	
	public String getTownName()
	{
	return townName;
	}
	
	public void setTownName(String townName)
	{
	this.townName = townName;
	}
	
	public String getShopName()
	{
	return shopName;
	}
	
	public void setShopName(String shopName)
	{
	this.shopName = shopName;
	}
	
	public String getCardType()
	{
	return cardtype;
	}
	
	public void setCardType(String cardtype)
	{
	this.cardtype = cardtype;
	}
	
	 
	@Override
	public String toString()
	{
	return "RCNMaster [rcn=" + rcn + ", holdername=" + holdername + ", fathername=" + fathername + ", mothername=" + mothername + ", address=" + address + ", income=" + income + ", familymembers=" + familymembers + ", race=" + race
	+ ", districtName=" + districtName + ", townName=" + townName + ", shopName=" + shopName + ", cardtype=" + cardtype + "]";
	}
}
