package io.egen.api.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.egen.api.entity.Rating;

@Repository
public class RatingRepositoryImpl implements RatingRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Rating> findAll(String mId) {
		
		TypedQuery<Rating> query = em.createNamedQuery("Rating.findBymId", Rating.class);
		query.setParameter("pMId", mId);

		List<Rating> ratings = query.getResultList();
		
		return ratings;
	}

	@Override
	public Rating findOne(String id) {

		return em.find(Rating.class, id);
	}

	@Override
	public Rating create(Rating rating) {
		
		em.persist(rating);
		return rating;
	}

	@Override
	public Rating update(Rating rating) {
		
		return em.merge(rating);
	}

	@Override
	public void delete(Rating rating) {
		
		em.remove(rating);
	}
	
	

}