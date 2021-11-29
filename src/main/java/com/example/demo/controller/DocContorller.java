package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Req;
import com.example.demo.service.DocStorageService;

@Controller
public class DocContorller {
	@Autowired
	private DocStorageService docStorageService;
	
	@RequestMapping(value="/form",method = RequestMethod.POST,
	        consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String formDataUpload(
			@RequestBody Integer requestId, 
			@RequestBody String channel, 
			@RequestBody String customer,  
			@RequestBody MultipartFile[] files
			)
	{
		Req data = new Req(requestId, channel, customer);
		docStorageService.saveData(data);
		for(MultipartFile file:files) {
			docStorageService.saveFile(file,requestId);
		}
		
		return "Successful";
	}

}
