package com.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Blog;



@Repository("blogDAO")
public class BlogDAOImpl implements BlogDAO {

	@Autowired
	SessionFactory sessionFactory;
	public BlogDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean createBlog(Blog blog) {
		// TODO Auto-generated method stub
		try 
		{
			sessionFactory.getCurrentSession().saveOrUpdate(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Araised" +e);
		
		return false;
		}
		
	}

	@Transactional
	public Blog getBlog(int blogId) {
		try
		{
			
			
			 return  (Blog)sessionFactory.getCurrentSession().createQuery("from Blog where blogId="+blogId);
			
			
		}
		catch(Exception e)
		{
			 System.out.println("Exception Arised"+e);
			 return null;
		}
	}

	@Transactional
	public List<Blog> getBlogs() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Blog where status='A'");
		List<Blog> listBlog=query.list();
		session.close();
		
		return listBlog;
	}

	@Transactional
	public boolean approveBlog(Blog blog) {
		try
		{
			blog.setStatus("A");
			sessionFactory.getCurrentSession().saveOrUpdate(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Araised" +e);
			
		}
		return false;
	}

	@Transactional
	public boolean editBlog(int blogId) {
		try
		{
			Blog blog =new Blog();
			@SuppressWarnings("rawtypes")
			Query query = (Query) sessionFactory.getCurrentSession().createQuery("update Blog set  blogName=?,blogContent=?,status=?,username=?,likes=?,createDate=? where blogId="+blogId);
			  
			  query.setParameter(0,"blog.getBlogName()");
			  query.setParameter(1,"blog.getBlogContent()");
			  query.setParameter(2,"blog.getStatus()");
			  query.setParameter(3,"blog.getUsername()");
			  query.setParameter(4,blog.getLikes());
			  query.setParameter(5,blog.getCreateDate());
			  query.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
				System.out.println("Exception Arised"+e);
			 return false;
		}
	}

	@Transactional
	public boolean deleteBlog(int blogId) {
		try
		{
			
		Query query =	(Query)sessionFactory.getCurrentSession().createQuery("delete Blog where blogId="+blogId);
		query.executeUpdate();	
		return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised"+e);
			return false;
		}
	}

}