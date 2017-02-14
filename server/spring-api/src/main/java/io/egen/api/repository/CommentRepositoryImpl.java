package io.egen.api.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import io.egen.api.entity.Comment;


@Repository
public class CommentRepositoryImpl implements CommentRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Comment findBymId(String id) {
		return em.find(Comment.class, id);
	}

	@Override
	public Comment create(Comment emp) {
	    em.persist(emp);
		return emp;
	}

	@Override
	public Comment update(Comment emp) {
		return em.merge(emp);
	}

	@Override
	public void delete(Comment emp) {
	         em.remove(emp);
	}

}
