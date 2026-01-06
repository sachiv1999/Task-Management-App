package com.TaskManagement.DTO;

import java.time.LocalDateTime;
import java.util.Set;

import com.TaskManagement.Enum.IssuePriority;
import com.TaskManagement.Enum.IssueStatus;
import com.TaskManagement.Enum.IssueType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IssueDTO {
private String issueKey;
	


	private String issueTitle;
	private String issueDescription;
	private IssueType issueType;
	private IssuePriority issuePriority;
	private IssueStatus issueStatus;
	
	private String assignedEmail;
	private String ReporterEmail;
	
	private long epicId;
	private long spinId;
	
	@Builder.Default
	private LocalDateTime createAt= LocalDateTime.now();
	@Builder.Default
	private LocalDateTime updateAt = LocalDateTime.now();
	private LocalDateTime dueDate;
	private Set<String> lables;
	
	public String getIssueKey() {
		return issueKey;
	}
	public void setIssueKey(String issueKey) {
		this.issueKey = issueKey;
	}
	public String getIssueTitle() {
		return issueTitle;
	}
	public void setIssueTitle(String issueTitle) {
		this.issueTitle = issueTitle;
	}
	public String getIssueDescription() {
		return issueDescription;
	}
	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}
	public IssueType getIssueType() {
		return issueType;
	}
	public void setIssueType(IssueType issueType) {
		this.issueType = issueType;
	}
	public IssuePriority getIssuePriority() {
		return issuePriority;
	}
	public void setIssuePriority(IssuePriority issuePriority) {
		this.issuePriority = issuePriority;
	}
	public IssueStatus getIssueStatus() {
		return issueStatus;
	}
	public void setIssueStatus(IssueStatus issueStatus) {
		this.issueStatus = issueStatus;
	}
	public String getAssignedEmail() {
		return assignedEmail;
	}
	public void setAssignedEmail(String assignedEmail) {
		this.assignedEmail = assignedEmail;
	}
	public String getReporterEmail() {
		return ReporterEmail;
	}
	public void setReporterEmail(String reporterEmail) {
		ReporterEmail = reporterEmail;
	}
	public long getEpicId() {
		return epicId;
	}
	public void setEpicId(long epicId) {
		this.epicId = epicId;
	}
	public long getSpinId() {
		return spinId;
	}
	public void setSpinId(long spinId) {
		this.spinId = spinId;
	}
	public LocalDateTime getCreateAt() {
		return createAt;
	}
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}
	public LocalDateTime getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}
	public LocalDateTime getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	public Set<String> getLables() {
		return lables;
	}
	public void setLables(Set<String> lables) {
		this.lables = lables;
	} 
	
	
	
}
