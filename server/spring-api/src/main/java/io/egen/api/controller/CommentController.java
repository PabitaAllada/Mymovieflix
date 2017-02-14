package io.egen.api.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.api.entity.Comment;
import io.egen.api.service.CommentService;

@RestController
@RequestMapping(value = "comments")
public class CommentController {

	@Autowired
	private CommentService service;

	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public Comment findBymId(@PathVariable("id") String empId) {
		return service.findbymId(empId);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Comment create(@RequestBody Comment emp) {
		return service.create(emp);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "{id}")
	public Comment update(@PathVariable("id") String id, @RequestBody Comment emp) {
		return service.update(id, emp);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void delete(@PathVariable("id") String id) {
		service.delete(id);
	}
}