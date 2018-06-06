package com.gtl.neeraj.daggertest.network.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class IndicesResponseVO{

	@SerializedName("code")
	private int code;

	@SerializedName("preClose")
	private int preClose;

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("mktOpen")
	private int mktOpen;

	@SerializedName("corrClose")
	private int corrClose;

	@SerializedName("preOpen")
	private int preOpen;

	@SerializedName("corrOpen")
	private int corrOpen;

	@SerializedName("time")
	private String time;

	@SerializedName("haltedStatus")
	private String haltedStatus;

	@SerializedName("mktClose")
	private int mktClose;

	@SerializedName("status")
	private String status;

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setPreClose(int preClose){
		this.preClose = preClose;
	}

	public int getPreClose(){
		return preClose;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setMktOpen(int mktOpen){
		this.mktOpen = mktOpen;
	}

	public int getMktOpen(){
		return mktOpen;
	}

	public void setCorrClose(int corrClose){
		this.corrClose = corrClose;
	}

	public int getCorrClose(){
		return corrClose;
	}

	public void setPreOpen(int preOpen){
		this.preOpen = preOpen;
	}

	public int getPreOpen(){
		return preOpen;
	}

	public void setCorrOpen(int corrOpen){
		this.corrOpen = corrOpen;
	}

	public int getCorrOpen(){
		return corrOpen;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setHaltedStatus(String haltedStatus){
		this.haltedStatus = haltedStatus;
	}

	public String getHaltedStatus(){
		return haltedStatus;
	}

	public void setMktClose(int mktClose){
		this.mktClose = mktClose;
	}

	public int getMktClose(){
		return mktClose;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"IndicesResponseVO{" + 
			"code = '" + code + '\'' + 
			",preClose = '" + preClose + '\'' + 
			",data = '" + data + '\'' + 
			",mktOpen = '" + mktOpen + '\'' + 
			",corrClose = '" + corrClose + '\'' + 
			",preOpen = '" + preOpen + '\'' + 
			",corrOpen = '" + corrOpen + '\'' + 
			",time = '" + time + '\'' + 
			",haltedStatus = '" + haltedStatus + '\'' + 
			",mktClose = '" + mktClose + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}