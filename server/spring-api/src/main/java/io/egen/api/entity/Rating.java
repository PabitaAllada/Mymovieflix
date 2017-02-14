package io.egen.api.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ 
	@NamedQuery(name = "Rating.findBymId", query = "SELECT r FROM Rating r WHERE r.mId=:pMId ORDER BY r.ratingValue")
})
public class Rating {

	@Id
	private String id;
	
	private String uId;
	private String mId;

	private String ratingValue;
	
	public Rating() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Rating [id=" + id + ", uId=" + uId + ", mId=" + mId + ", ratingValue=" + ratingValue + "]";
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getUId() {
		return uId;
	}

	public void setUId(String uId) {
		this.uId = uId;
	}

	public String getMId() {
		return mId;
	}

	public void setMId(String mId) {
		this.mId = mId;
	}

	public String getRatingValue() {
		return ratingValue;
	}

	public void setRatingValue(String ratingValue) {
		this.ratingValue = ratingValue;
	}
	
	
}