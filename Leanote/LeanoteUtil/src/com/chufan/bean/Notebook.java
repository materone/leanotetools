package com.chufan.bean;
/**
 * **
 * @author Tony
 *
 *{"NotebookId":"5a04ff7c9d3e620387000005","UserId":"5e63c307b9c7e4504d000004","ParentNotebookId":"59c4bf919d3e627ab20000f5","Seq":-1,"Title":"Tomcat","UrlTitle":"Tomcat",
 *"IsBlog":false,"CreatedTime":{"$$date":1510276989000},"UpdatedTime":{"$$date":1510276989000},"Usn":470,"IsDeleted":false,"ServerNotebookId":"5a04ff7c9d3e620387000005",
 *"IsDirty":false,"LocalIsNew":false,"LocalIsDelete":false,"_id":"XGwbsmqcuVFeFYeJ","NumberNotes":1}
 *
 *{"Title":"CoreOS","Seq":-1,"UserId":"5e7372f4b9c7e4504d0000c5","ParentNotebookId":"5e76146acbf86a5185000000","LocalIsNew":true,"IsDirty":true,
 *"NotebookId":"5e761481cbf86a5185000002","_id":"GlGwhttJ1qTgyoCi","NumberNotes":1}
 */

import com.alibaba.fastjson.annotation.JSONField;

public class Notebook {
	@JSONField(name="NotebookId")
	String NotebookId="";
	@JSONField(name="UserId")
	String UserId="";
	@JSONField(name="ParentNotebookId")
	String ParentNotebookId="";
	@JSONField(name="Seq")
	Integer Seq;
	@JSONField(name="Title")
	String Title="";
	@JSONField(name="UrlTitle")
	String UrlTitle="";
	@JSONField(name="IsBlog")
	Boolean IsBlog;
	@JSONField(name="CreatedTime")
	String CreatedTime="";
	@JSONField(name="UpdatedTime")
	String UpdatedTime="";
	@JSONField(name="Usn")
	Integer Usn;
	/**
	 * @return the notebookId
	 */
	public String getNotebookId() {
		return NotebookId;
	}
	/**
	 * @param notebookId
	 * @param userId
	 * @param parentNotebookId
	 * @param seq
	 * @param title
	 * @param urlTitle
	 * @param isBlog
	 * @param createdTime
	 * @param updatedTime
	 * @param usn
	 * @param isDeleted
	 * @param serverNotebookId
	 * @param isDirty
	 * @param localIsNew
	 * @param _id
	 * @param numberNotes
	 * @param localIsDelete
	 */
	public Notebook(String notebookId, String userId, String parentNotebookId, Integer seq, String title,
			String urlTitle, Boolean isBlog, String createdTime, String updatedTime, Integer usn, Boolean isDeleted,
			String serverNotebookId, Boolean isDirty, Boolean localIsNew, String _id, String numberNotes,
			Boolean localIsDelete) {
		super();
		NotebookId = notebookId;
		UserId = userId;
		ParentNotebookId = parentNotebookId;
		Seq = seq;
		Title = title;
		UrlTitle = urlTitle;
		IsBlog = isBlog;
		CreatedTime = createdTime;
		UpdatedTime = updatedTime;
		Usn = usn;
		IsDeleted = isDeleted;
		ServerNotebookId = serverNotebookId;
		IsDirty = isDirty;
		LocalIsNew = localIsNew;
		this._id = _id;
		NumberNotes = numberNotes;
		LocalIsDelete = localIsDelete;
	}
	
	public Notebook() {
		
	}
	/**
	 * @param notebookId the notebookId to set
	 */
	public void setNotebookId(String notebookId) {
		NotebookId = notebookId;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return UserId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		UserId = userId;
	}
	/**
	 * @return the parentNotebookId
	 */
	public String getParentNotebookId() {
		return ParentNotebookId;
	}
	/**
	 * @param parentNotebookId the parentNotebookId to set
	 */
	public void setParentNotebookId(String parentNotebookId) {
		ParentNotebookId = parentNotebookId;
	}
	/**
	 * @return the seq
	 */
	public Integer getSeq() {
		return Seq;
	}
	/**
	 * @param seq the seq to set
	 */
	public void setSeq(Integer seq) {
		Seq = seq;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		Title = title;
	}
	/**
	 * @return the urlTitle
	 */
	public String getUrlTitle() {
		return UrlTitle;
	}
	/**
	 * @param urlTitle the urlTitle to set
	 */
	public void setUrlTitle(String urlTitle) {
		UrlTitle = urlTitle;
	}
	/**
	 * @return the isBlog
	 */
	public Boolean getIsBlog() {
		return IsBlog;
	}
	/**
	 * @param isBlog the isBlog to set
	 */
	public void setIsBlog(Boolean isBlog) {
		IsBlog = isBlog;
	}
	/**
	 * @return the createdTime
	 */
	public String getCreatedTime() {
		return CreatedTime;
	}
	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(String createdTime) {
		CreatedTime = createdTime;
	}
	/**
	 * @return the updatedTime
	 */
	public String getUpdatedTime() {
		return UpdatedTime;
	}
	/**
	 * @param updatedTime the updatedTime to set
	 */
	public void setUpdatedTime(String updatedTime) {
		UpdatedTime = updatedTime;
	}
	/**
	 * @return the usn
	 */
	public Integer getUsn() {
		return Usn;
	}
	/**
	 * @param usn the usn to set
	 */
	public void setUsn(Integer usn) {
		Usn = usn;
	}
	/**
	 * @return the isDeleted
	 */
	public Boolean getIsDeleted() {
		return IsDeleted;
	}
	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIsDeleted(Boolean isDeleted) {
		IsDeleted = isDeleted;
	}
	/**
	 * @return the serverNotebookId
	 */
	public String getServerNotebookId() {
		return ServerNotebookId;
	}
	/**
	 * @param serverNotebookId the serverNotebookId to set
	 */
	public void setServerNotebookId(String serverNotebookId) {
		ServerNotebookId = serverNotebookId;
	}
	/**
	 * @return the isDirty
	 */
	public Boolean getIsDirty() {
		return IsDirty;
	}
	/**
	 * @param isDirty the isDirty to set
	 */
	public void setIsDirty(Boolean isDirty) {
		IsDirty = isDirty;
	}
	/**
	 * @return the localIsNew
	 */
	public Boolean getLocalIsNew() {
		return LocalIsNew;
	}
	/**
	 * @param localIsNew the localIsNew to set
	 */
	public void setLocalIsNew(Boolean localIsNew) {
		LocalIsNew = localIsNew;
	}
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @return the numberNotes
	 */
	public String getNumberNotes() {
		return NumberNotes;
	}
	/**
	 * @param numberNotes the numberNotes to set
	 */
	public void setNumberNotes(String numberNotes) {
		NumberNotes = numberNotes;
	}
	/**
	 * @return the localIsDelete
	 */
	public Boolean getLocalIsDelete() {
		return LocalIsDelete;
	}
	/**
	 * @param localIsDelete the localIsDelete to set
	 */
	public void setLocalIsDelete(Boolean localIsDelete) {
		LocalIsDelete = localIsDelete;
	}
	@JSONField(name="IsDeleted")
	Boolean IsDeleted;
	@JSONField(name="ServerNotebookId")
	String ServerNotebookId="";
	@JSONField(name="IsDirty")
	Boolean IsDirty;
	@JSONField(name="LocalIsNew")
	Boolean LocalIsNew;
	@JSONField(name="_id")
	String _id="";
	@JSONField(name="NumberNotes")
	String NumberNotes="";
	@JSONField(name="LocalIsDelete")
	Boolean LocalIsDelete;
}
