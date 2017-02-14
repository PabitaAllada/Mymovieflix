package io.egen.api.repository;



import io.egen.api.entity.Comment;


public interface CommentRepository {

	
	public Comment findBymId(String id);
	
	public Comment create(Comment emp);

	public Comment update(Comment emp);

	public void delete(Comment emp);
}
