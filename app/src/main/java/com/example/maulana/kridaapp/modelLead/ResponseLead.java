package com.example.maulana.kridaapp.modelLead;

import com.google.gson.annotations.SerializedName;

public class ResponseLead{

	@SerializedName("Lead")
	private Lead lead;

	public void setLead(Lead lead){
		this.lead = lead;
	}

	public Lead getLead(){
		return lead;
	}

	@Override
 	public String toString(){
		return 
			"ResponseLead{" + 
			"lead = '" + lead + '\'' + 
			"}";
		}
}