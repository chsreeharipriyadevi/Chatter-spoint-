package com.Backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.dao.ForumDAO;
import com.model.Forum;

@ComponentScan("com.*")

public class ForumDAOTestcase {
@Autowired	
static ForumDAO forumDAO;
@Autowired	
static Forum forum;

@SuppressWarnings("resource")
@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.*");
		annotationConfigAppContext.refresh();
	    forumDAO=(ForumDAO)annotationConfigAppContext.getBean("forumDAO");
	    forum=(Forum)annotationConfigAppContext.getBean("forum");
	
	}
	
	@Test
	public void createForumtest()
	{
		forum.setForumId(112);
		forum.setForumName("Akhila");
		forum.setForumContent("I like singing");
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("NA");
		forum.setLikes(0);
		assertTrue("Problem in Forum Creation",forumDAO.createForum(forum));
	
	}
	
	@Ignore
	@Test
	public void approveForumTest()
	{
		forum.setForumName("Akhila");
		forum.setForumContent("I like dancing");
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("NA");
		forum.setLikes(0);
		assertTrue("Problem in approving Forum",forumDAO.approveForum(forum));	
	}
	@Test
	public void editForumTest()
	{
    forum.setForumId(1002);
    forum.setForumName("NagaAkhila");
    forum.setForumContent("NagaAkhila likes cooking ");
    forum.setCreateDate(new java.util.Date());
    forum.setStatus("NA");
    forum.setLikes(0);
	assertTrue("Problem in approving Forum",forumDAO.editForum(forum.getForumId()));	
	}
	
	@Test
	public void deleteForumTest()
	{
		forum.setForumId(1001);
	assertTrue("Problem in approving Forum",forumDAO.deleteForum(forum.getForumId()));	
	}
	
	@Test
	public void getForumTest()
	{
		forum.setForumId(1001);
		 /* assertTrue("Problem in getting forum",forumDAO.getforumdetails(forum.getforumId())>0);*/

	}
	
	
}