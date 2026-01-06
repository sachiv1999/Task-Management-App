package com.TaskManagement.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="attachment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Attachment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long issueId;
	
	@Column(nullable=false)
	private String fileName;
	
	@Column(nullable=false)
	private String contentType;
	@Column(nullable=false)
	private String fileSize;
	private String storagePath;
	private String uploadedBy;
	public Long getIssueId() {
		return issueId;
	}
	public void setIssueId(Long issueId) {
		this.issueId = issueId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	
	public String getStoragePath() {
		return storagePath;
	}
	public void setStoragePath(String storagePath) {
		this.storagePath = storagePath;
	}
	public String getUploadedBy() {
		return uploadedBy;
	}
	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}
	public Attachment save(Attachment attach) {
		// TODO Auto-generated method stub
		return null;
	}
	public Object findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void setFileName(long size) {
		// TODO Auto-generated method stub
		
	}
	
	
}
