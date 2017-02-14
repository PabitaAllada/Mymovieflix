package io.egen.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.api.entity.Rating;
import io.egen.api.service.RatingService;

@RestController
@RequestMapping(value = "ratings")
public class RatingController {
	
	@Autowired
	private RatingService service;

	@RequestMapping(method = RequestMethod.GET)
	public List<Rating> findAll(String mId) {
		return service.findAll(mId);
	}

	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public Rating findOne(@PathVariable("id") String id) {
		return service.findOne(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Rating create(@RequestBody Rating rating) {
		return service.create(rating);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "{id}")
	public Rating update(@PathVariable("id") String id, @RequestBody Rating rating) {
		return service.update(id, rating);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void delete(@PathVariable("id") String id) {
		service.delete(id);
	}

}