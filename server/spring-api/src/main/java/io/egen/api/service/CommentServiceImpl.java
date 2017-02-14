package io.egen.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.egen.api.entity.Comment;

import io.egen.api.exception.EntityNotFoundException;
import io.egen.api.repository.CommentRepository;


@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentRepository repository;

	@Override
	@Transactional(readOnly = true)
	public Comment findbymId(String id) {
		Comment emp = repository.findBymId(id);
		if (emp == null) {
			throw new EntityNotFoundException("Comment not found");
		}
		return emp;
	}
	

	@Override
	public Comment create(Comment emp) {
		return repository.create(emp);
	}

	@Override
	public Comment update(String id, Comment emp) {
		Comment existing = repository.findBymId(id);
		if (existing == null) {
			throw new EntityNotFoundException("Comment not found");
		}
		return repository.update(emp);
	}

	@Override
	public void delete(String id) {
		Comment existing = repository.findBymId(id);
		if (existing == null) {
			throw new EntityNotFoundException("Comment not found");
		}
		repository.delete(existing);
	}
	}


