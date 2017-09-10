package com.Backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.ForumDAO;
import com.model.Forum;

public class ForumDAOTestcase {
	
static ForumDAO forumDAO;
	
	@BeforeClass
	public static void initialize()
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		forumDAO=(ForumDAO)annotationConfigAppContext.getBean("forumDAO");
	
	}
	
	@Test
	public void createBlogtest()
	{
		Forum forum=new Forum();
		forum.setForumId(111);
		forum.setForumName("hari");
		forum.setForumContent("Iam a good girl");
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("NA");
		forum.setLikes(0);
		assertTrue("Problem in Forum Creation",forumDAO.createForum(forum));
	
	}
	
	@Ignore
	@Test
	public void approveForumTest()
	{
		Forum forum=new Forum();
		forum.setForumName("hari");
		forum.setForumContent("Iam very good girl");
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("NA");
		forum.setLikes(0);
		assertTrue("Problem in approving Forum",forumDAO.approveForum(forum));	
	}
	@Test
	public void editBlogTest()
	{
    Forum forum = new Forum();
    forum.setForumId(1001);
    forum.setForumName("hari");
    forum.setForumContent("I love to dance");
    forum.setCreateDate(new java.util.Date());
    forum.setStatus("NA");
    forum.setLikes(0);
	assertTrue("Problem in approving Forum",forumDAO.editForum(forum.getForumId()));	
	}
	
	@Test
	public void deleteForumTest()
	{
		Forum forum = new Forum();
		forum.setForumId(1001);
	assertTrue("Problem in approving Forum",forumDAO.deleteForum(forum.getForumId()));	
	}
	
	@Test
	public void getForumTest()
	{
	Forum forum = new Forum();
	forum.setForumId(1001);
   /* assertTrue("Problem in getting blog",blogDAO.getBlogdetails(blog.getBlogId())>0);*/
	}
	
	
}

