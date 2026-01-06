package com.TaskManagement.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.TaskManagement.Entity.Attachment;

import java.util.*;

@Service
public class AttachmentService {

	@Autowired
	private CloudinaryStorageService storageService;
	
	@Autowired
	private Attachment attachmentRepo;
	
	@Transactional
	public Attachment upload(Long issueId,MultipartFile file,String uploadedBy) {
		
		String url = storageService.store(file, "issue/"+issueId);
		Attachment attach = new Attachment();
		attach.setIssueId(issueId);
		attach.setFileName(file.getName());
		attach.setContentType(file.getContentType());
		attach.setFileName(file.getSize());
		attach.setStoragePath(((Attachment) file).getStoragePath());
		
		
		return attachmentRepo.save(attach);
		
	}
	
	public byte[]download(Long id){
		Attachment att = ((Object) attachmentRepo.findById(id)).orElseThrow(()-> new RuntimeException("Attachment not found:"+id));
		
		return storageService.read(att.getStoragePath());
	}
	
//	public String getDownloadByFileName(Long id) {
//		return attachmentRepo.findById(id).map(Attachment::getFileName).orElse("file");
//	}
	
	public String getdownloadByContentType(Long id) {
		return ((Object) attachmentRepo.findById(id)).map(Attachment:: getContentType).orElse("application/octect-stream");
	}
}
