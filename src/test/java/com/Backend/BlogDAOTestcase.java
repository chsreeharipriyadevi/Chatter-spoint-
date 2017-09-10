package com.Backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.BlogDAO;
import com.model.Blog;

public class BlogDAOTestcase {
	
static BlogDAO blogDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		blogDAO=(BlogDAO)annotationConfigAppContext.getBean("blogDAO");
	
	}
	
	@Test
	public void createBlogtest()
	{
		Blog blog=new Blog();
		blog.setBlogId(111);
		blog.setBlogName("hari");
		blog.setBlogContent("Iam a good girl");
		blog.setCreateDate(new java.util.Date());
		blog.setStatus("NA");
		blog.setLikes(0);
		assertTrue("Problem in Blog Creation",blogDAO.createBlog(blog));
	
	}
	
	@Ignore
	@Test
	public void approveBlogTest()
	{
		Blog blog=new Blog();
		blog.setBlogName("hari");
		blog.setBlogContent("Iam very good girl");
		blog.setCreateDate(new java.util.Date());
		blog.setStatus("NA");
		blog.setLikes(0);
		assertTrue("Problem in approving Blog",blogDAO.approveBlog(blog));	
	}
	@Test
	public void editBlogTest()
	{
	Blog blog = new Blog();
	blog.setBlogId(1001);
	blog.setBlogName("hari");
	blog.setBlogContent("I love to dance");
	blog.setCreateDate(new java.util.Date());
	blog.setStatus("NA");
	blog.setLikes(0);
	assertTrue("Problem in approving Blog",blogDAO.editBlog(blog.getBlogId()));	
	}
	
	@Test
	public void deleteBlogTest()
	{
	Blog blog = new Blog();
	blog.setBlogId(1001);
	assertTrue("Problem in approving Blog",blogDAO.deleteBlog(blog.getBlogId()));	
	}
	
	@Test
	public void getBlogTest()
	{
	Blog blog = new Blog();
	blog.setBlogId(1001);
   /* assertTrue("Problem in getting blog",blogDAO.getBlogdetails(blog.getBlogId())>0);*/
	}
	
	
}

