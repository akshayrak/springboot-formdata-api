package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="requestData")
public class Req {
	@Id
	private Integer requestId;
	
	private String channel;
	private String customer;
	public Req() {}
	public Req(Integer requestId, String channel, String customer) {
		super();
		this.requestId = requestId;
		this.channel = channel;
		this.customer = customer;
	}
	public Integer getRequestId() {
		return requestId;
	}
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
}
