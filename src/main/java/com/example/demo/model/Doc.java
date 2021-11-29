package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="docs")
public class Doc {
	@Id
	private Integer requestId;
	
	private String docName;
	private String docType;
	
	@Lob
	private byte[] data;
	
	public Doc() {}

	public Doc(Integer requestId, String docName, String docType, byte[] data) {
		super();
		this.requestId=requestId;
		this.docName = docName;
		this.docType = docType;
		this.data = data;
	}

	public Integer getRequestId() {
		return requestId;
	}

	public void setRequestId(Integer id) {
		this.requestId = id;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
	

}
