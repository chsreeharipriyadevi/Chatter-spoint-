package com.dao;

import java.util.List;

import com.model.Blog;

public interface BlogDAO {

	public boolean createBlog(Blog blog);
	  public Blog getBlog(int blogId);
	  public List<Blog> getBlogs();
	  public boolean approveBlog(Blog blog);
	  public boolean editBlog(int blogId);
	  public boolean deleteBlog(int blogId);
	  
}