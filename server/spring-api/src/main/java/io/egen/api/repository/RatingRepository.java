package io.egen.api.repository;

import java.util.List;

import io.egen.api.entity.Rating;

public interface RatingRepository {
	
	public List<Rating> findAll(String mId);

	public Rating findOne(String id); 

	public Rating create(Rating rating);

	public Rating update(Rating rating);

	public void delete(Rating rating);



}