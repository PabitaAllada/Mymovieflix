package io.egen.api.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ 
		@NamedQuery(name = "User.findBymId", query = "SELECT c FROM Comment c WHERE c.mId=:pId") 
})

public class Comment {

	@Id
	private String id;
	private String comment;
	private String mId;
	
	public Comment() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comment + ", mId=" + mId + "]";
	}
	
		
}
