package io.egen.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.egen.api.entity.Rating;
import io.egen.api.exception.EntityNotFoundException;
import io.egen.api.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository repository;

	@Override
	@Transactional(readOnly = true)
	public List<Rating> findAll(String mId) {
		return repository.findAll(mId);
	}

	@Override
	@Transactional(readOnly = true)
	public Rating findOne(String id) {
		
		Rating rating = repository.findOne(id);
		if (rating == null) {
			throw new EntityNotFoundException("Rating not found");
		}
		return rating;
	}

	@Override
	@Transactional
	public Rating create(Rating rating) {
		
		return repository.create(rating);
	}

	@Override
	@Transactional
	public Rating update(String id, Rating rating) {
		
		Rating existing = repository.findOne(id);
		if (existing == null) {
			throw new EntityNotFoundException("Rating not found");
		}
		return repository.update(rating);
	}

	@Override
	@Transactional
	public void delete(String id) {
		
		Rating existing = repository.findOne(id);
		if (existing == null) {
			throw new EntityNotFoundException("Rating not found");
		}
		repository.delete(existing);
		
	}

}