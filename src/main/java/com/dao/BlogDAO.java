package com.dao;

import java.util.List;

import com.model.Blog;

public interface BlogDAO {

	public boolean createBlog(Blog blog);
	public Blog getBlogdetails(int blogId);
	public List<Blog> getBlog();
	public boolean approveBlog(Blog blog);
	public boolean editBlog(int blogId);
	public boolean deleteBlog(int blogId);
}
