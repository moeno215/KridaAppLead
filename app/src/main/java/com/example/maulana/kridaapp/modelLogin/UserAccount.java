package com.example.maulana.kridaapp.modelLogin;

import com.google.gson.annotations.SerializedName;

public class UserAccount{

	@SerializedName("kios_id")
	private String kiosId;

	@SerializedName("company_id")
	private String companyId;

	@SerializedName("is_actived")
	private String isActived;

	@SerializedName("last_login")
	private String lastLogin;

	@SerializedName("created")
	private String created;

	@SerializedName("type_akses")
	private String typeAkses;

	@SerializedName("is_salesforce")
	private String isSalesforce;

	@SerializedName("branch_code")
	private String branchCode;

	@SerializedName("kios_kode")
	private Object kiosKode;

	@SerializedName("password")
	private String password;

	@SerializedName("last_activity")
	private String lastActivity;

	@SerializedName("branch_id")
	private String branchId;

	@SerializedName("name")
	private String name;

	@SerializedName("company_code")
	private String companyCode;

	@SerializedName("id")
	private String id;

	@SerializedName("email")
	private String email;

	@SerializedName("is_login")
	private String isLogin;

	@SerializedName("username")
	private String username;

	public void setKiosId(String kiosId){
		this.kiosId = kiosId;
	}

	public String getKiosId(){
		return kiosId;
	}

	public void setCompanyId(String companyId){
		this.companyId = companyId;
	}

	public String getCompanyId(){
		return companyId;
	}

	public void setIsActived(String isActived){
		this.isActived = isActived;
	}

	public String getIsActived(){
		return isActived;
	}

	public void setLastLogin(String lastLogin){
		this.lastLogin = lastLogin;
	}

	public String getLastLogin(){
		return lastLogin;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setTypeAkses(String typeAkses){
		this.typeAkses = typeAkses;
	}

	public String getTypeAkses(){
		return typeAkses;
	}

	public void setIsSalesforce(String isSalesforce){
		this.isSalesforce = isSalesforce;
	}

	public String getIsSalesforce(){
		return isSalesforce;
	}

	public void setBranchCode(String branchCode){
		this.branchCode = branchCode;
	}

	public String getBranchCode(){
		return branchCode;
	}

	public void setKiosKode(Object kiosKode){
		this.kiosKode = kiosKode;
	}

	public Object getKiosKode(){
		return kiosKode;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setLastActivity(String lastActivity){
		this.lastActivity = lastActivity;
	}

	public String getLastActivity(){
		return lastActivity;
	}

	public void setBranchId(String branchId){
		this.branchId = branchId;
	}

	public String getBranchId(){
		return branchId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	public String getCompanyCode(){
		return companyCode;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setIsLogin(String isLogin){
		this.isLogin = isLogin;
	}

	public String getIsLogin(){
		return isLogin;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"UserAccount{" + 
			"kios_id = '" + kiosId + '\'' + 
			",company_id = '" + companyId + '\'' + 
			",is_actived = '" + isActived + '\'' + 
			",last_login = '" + lastLogin + '\'' + 
			",created = '" + created + '\'' + 
			",type_akses = '" + typeAkses + '\'' + 
			",is_salesforce = '" + isSalesforce + '\'' + 
			",branch_code = '" + branchCode + '\'' + 
			",kios_kode = '" + kiosKode + '\'' + 
			",password = '" + password + '\'' + 
			",last_activity = '" + lastActivity + '\'' + 
			",branch_id = '" + branchId + '\'' + 
			",name = '" + name + '\'' + 
			",company_code = '" + companyCode + '\'' + 
			",id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			",is_login = '" + isLogin + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}