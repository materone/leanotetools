/**
 * 
 */
package com.chufan.bean;

/**
 * @author Tony
 *         {"IsMarkdown":false,"NoteId":"5e7378ce9ffb544c66000000","NotebookId":"5e7372f4b9c7e4504d0000c6","Title":"1","Content":"A
 *         ","Desc":"","ImgSrc":"","Abstract":"","UserId":"5e7372f4b9c7e4504d0000c5","UpdatedTime":{"$$date":1584625875466},"IsDirty":false,
 *         "LocalIsDelete":false,"CreatedTime":{"$$date":1584625875466},"IsTrash":false,"LocalIsNew":false,"_id":"FhlGnFCmCppVl5Q7",
 *         "Tags":[],"IsDeleted":false,"Usn":6,"PublicTime":"0001-01-01T00:00:00Z","ServerNoteId":"5e737932b9c7e4504d0000cd","InitSync":false,"ContentIsDirty":false,"Attachs":[],"Err":""}
 */

public class Note {
	String ImgSrc="";
	String NotebookId="";
	String CreatedTime="";
	String Err="";
	String Desc="";
	Boolean IsMarkdown=Boolean.FALSE;
	String Attachs="";
	Boolean LocalIsNew=Boolean.FALSE;
	Boolean LocalIsDelete=Boolean.FALSE;
	String Tags="";
	Boolean ContentIsDirty;
	String NoteId="";
	Boolean IsDeleted=Boolean.FALSE;
	String PublicTime="";
	String Abstract="";
	String Title="";
	String ServerNoteId="";
	Integer Usn=Integer.valueOf(0);
	Boolean InitSync=Boolean.FALSE;
	String Content="";
	String UserId="";
	Boolean IsTrash=Boolean.FALSE;
	String UpdatedTime="";
	/**
	 * @param imgSrc
	 * @param notebookId
	 * @param createdTime
	 * @param err
	 * @param desc
	 * @param isMarkdown
	 * @param attachs
	 * @param localIsNew
	 * @param localIsDelete
	 * @param tags
	 * @param contentIsDirty
	 * @param noteId
	 * @param isDeleted
	 * @param publicTime
	 * @param abstract1
	 * @param title
	 * @param serverNoteId
	 * @param usn
	 * @param initSync
	 * @param content
	 * @param userId
	 * @param isTrash
	 * @param updatedTime
	 * @param isDirty
	 * @param _id
	 */
	public Note(String imgSrc, String notebookId, String createdTime, String err, String desc, Boolean isMarkdown,
			String attachs, Boolean localIsNew, Boolean localIsDelete, String tags, Boolean contentIsDirty,
			String noteId, Boolean isDeleted, String publicTime, String abstract1, String title, String serverNoteId,
			Integer usn, Boolean initSync, String content, String userId, Boolean isTrash, String updatedTime,
			Boolean isDirty, String _id) {
		super();
		ImgSrc = imgSrc;
		NotebookId = notebookId;
		CreatedTime = createdTime;
		Err = err;
		Desc = desc;
		IsMarkdown = isMarkdown;
		Attachs = attachs;
		LocalIsNew = localIsNew;
		LocalIsDelete = localIsDelete;
		Tags = tags;
		ContentIsDirty = contentIsDirty;
		NoteId = noteId;
		IsDeleted = isDeleted;
		PublicTime = publicTime;
		Abstract = abstract1;
		Title = title;
		ServerNoteId = serverNoteId;
		Usn = usn;
		InitSync = initSync;
		Content = content;
		UserId = userId;
		IsTrash = isTrash;
		UpdatedTime = updatedTime;
		IsDirty = isDirty;
		this._id = _id;
	}
	
	public Note() {
		
	}
	@Override
	public String toString() {
		return "Note [ImgSrc=" + ImgSrc + ", NotebookId=" + NotebookId + ", CreatedTime=" + CreatedTime + ", Err=" + Err
				+ ", Desc=" + Desc + ", IsMarkdown=" + IsMarkdown + ", Attachs=" + Attachs + ", LocalIsNew="
				+ LocalIsNew + ", LocalIsDelete=" + LocalIsDelete + ", Tags=" + Tags + ", ContentIsDirty="
				+ ContentIsDirty + ", NoteId=" + NoteId + ", IsDeleted=" + IsDeleted + ", PublicTime=" + PublicTime
				+ ", Abstract=" + Abstract + ", Title=" + Title + ", ServerNoteId=" + ServerNoteId + ", Usn=" + Usn
				+ ", InitSync=" + InitSync + ", Content=" + Content + ", UserId=" + UserId + ", IsTrash=" + IsTrash
				+ ", UpdatedTime=" + UpdatedTime + ", IsDirty=" + IsDirty + ", _id=" + _id + "]";
	}

	/**
	 * @return the imgSrc
	 */
	public String getImgSrc() {
		return ImgSrc;
	}
	/**
	 * @param imgSrc the imgSrc to set
	 */
	public void setImgSrc(String imgSrc) {
		ImgSrc = imgSrc;
	}
	/**
	 * @return the notebookId
	 */
	public String getNotebookId() {
		return NotebookId;
	}
	/**
	 * @param notebookId the notebookId to set
	 */
	public void setNotebookId(String notebookId) {
		NotebookId = notebookId;
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
	 * @return the err
	 */
	public String getErr() {
		return Err;
	}
	/**
	 * @param err the err to set
	 */
	public void setErr(String err) {
		Err = err;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return Desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		Desc = desc;
	}
	/**
	 * @return the isMarkdown
	 */
	public Boolean getIsMarkdown() {
		return IsMarkdown;
	}
	/**
	 * @param isMarkdown the isMarkdown to set
	 */
	public void setIsMarkdown(Boolean isMarkdown) {
		IsMarkdown = isMarkdown;
	}
	/**
	 * @return the attachs
	 */
	public String getAttachs() {
		return Attachs;
	}
	/**
	 * @param attachs the attachs to set
	 */
	public void setAttachs(String attachs) {
		Attachs = attachs;
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
	/**
	 * @return the tags
	 */
	public String getTags() {
		return Tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(String tags) {
		Tags = tags;
	}
	/**
	 * @return the contentIsDirty
	 */
	public Boolean getContentIsDirty() {
		return ContentIsDirty;
	}
	/**
	 * @param contentIsDirty the contentIsDirty to set
	 */
	public void setContentIsDirty(Boolean contentIsDirty) {
		ContentIsDirty = contentIsDirty;
	}
	/**
	 * @return the noteId
	 */
	public String getNoteId() {
		return NoteId;
	}
	/**
	 * @param noteId the noteId to set
	 */
	public void setNoteId(String noteId) {
		NoteId = noteId;
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
	 * @return the publicTime
	 */
	public String getPublicTime() {
		return PublicTime;
	}
	/**
	 * @param publicTime the publicTime to set
	 */
	public void setPublicTime(String publicTime) {
		PublicTime = publicTime;
	}
	/**
	 * @return the abstract
	 */
	public String getAbstract() {
		return Abstract;
	}
	/**
	 * @param abstract1 the abstract to set
	 */
	public void setAbstract(String abstract1) {
		Abstract = abstract1;
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
	 * @return the serverNoteId
	 */
	public String getServerNoteId() {
		return ServerNoteId;
	}
	/**
	 * @param serverNoteId the serverNoteId to set
	 */
	public void setServerNoteId(String serverNoteId) {
		ServerNoteId = serverNoteId;
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
	 * @return the initSync
	 */
	public Boolean getInitSync() {
		return InitSync;
	}
	/**
	 * @param initSync the initSync to set
	 */
	public void setInitSync(Boolean initSync) {
		InitSync = initSync;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return Content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		Content = content;
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
	 * @return the isTrash
	 */
	public Boolean getIsTrash() {
		return IsTrash;
	}
	/**
	 * @param isTrash the isTrash to set
	 */
	public void setIsTrash(Boolean isTrash) {
		IsTrash = isTrash;
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
	Boolean IsDirty;
	String _id;
}
