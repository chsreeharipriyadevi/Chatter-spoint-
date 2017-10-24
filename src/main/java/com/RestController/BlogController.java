package com.RestController;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.BlogDAO;
import com.model.Blog;

@RestController
	public class BlogController {

		@Autowired
		BlogDAO blogDAO;
		
	@GetMapping(value="/test")
	public ResponseEntity<String> testMethod()
	{
		return new ResponseEntity<String>("Test Rest Controller", HttpStatus.OK);
		
	}

	@PostMapping(value="/createBlog")
	public ResponseEntity<String> createBlog(@RequestBody Blog blog)
	{
		blog.setCreateDate(new java.util.Date());
		blog.setStatus("NA");
		blog.setLikes(0);
		if(blogDAO.createBlog(blog))
		{
			return new ResponseEntity<String>("blog created", HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("problem in creating blog", HttpStatus.OK);
		}
		
	}

	@GetMapping(value="/getAllBlogs")
	public ResponseEntity<ArrayList<Blog>> getAllBlog()
	{
		ArrayList<Blog> listBlogs = new ArrayList<Blog>();
		listBlogs=(ArrayList<Blog>)blogDAO.getBlogs();
		return new ResponseEntity<ArrayList<Blog>>(listBlogs, HttpStatus.OK);
		
	}
	}