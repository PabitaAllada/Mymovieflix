package io.egen.api.service;

import java.util.List;

import io.egen.api.entity.Rating;

public interface RatingService {
	
	public List<Rating> findAll(String mId);

	public Rating findOne(String id);

	public Rating create(Rating rating);

	public Rating update(String id, Rating rating);

	public void delete(String id);


}