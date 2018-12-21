package com.example.maulana.kridaapp.modelLogin;

import com.google.gson.annotations.SerializedName;

public class ResponseLogin{

	@SerializedName("UserAccount")
	private UserAccount userAccount;

	public void setUserAccount(UserAccount userAccount){
		this.userAccount = userAccount;
	}

	public UserAccount getUserAccount(){
		return userAccount;
	}

	@Override
 	public String toString(){
		return 
			"ResponseLogin{" + 
			"userAccount = '" + userAccount + '\'' + 
			"}";
		}
}