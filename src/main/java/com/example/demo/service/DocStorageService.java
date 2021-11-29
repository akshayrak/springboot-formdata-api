package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Doc;
import com.example.demo.model.Req;
import com.example.demo.repository.DataRepository;
import com.example.demo.repository.DocRepository;

@Service
public class DocStorageService {
	@Autowired
	private DocRepository docRepository;
	
	@Autowired
	private DataRepository dataRepository;
	
	public Doc saveFile(MultipartFile file,Integer requestId) {
		String docname = file.getOriginalFilename();
		try {
			Doc doc = new Doc(requestId,docname,file.getContentType(),file.getBytes());
			return docRepository.save(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public void saveData(Req data) {
		dataRepository.save(data);
	}
}
