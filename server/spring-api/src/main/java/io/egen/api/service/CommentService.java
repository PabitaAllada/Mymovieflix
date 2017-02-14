package io.egen.api.service;



import io.egen.api.entity.Comment;

public interface CommentService {

	

	public Comment findbymId(String id);

	public Comment create(Comment emp);

	public Comment update(String id, Comment emp);

	public void delete(String id);
}
