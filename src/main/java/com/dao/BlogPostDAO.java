package com.dao;

import java.util.List;

import com.model.BlogComment;
import com.model.BlogPost;

public interface BlogPostDAO 
{
void saveBlogPost(BlogPost blogpost);
List<BlogPost> getAllBlogs(int approved);
void updateBlogPost(BlogPost blogPost);
BlogPost getBlogById(int id);
List<BlogComment> getBlogComments(int blogId);
void addBlogComment(BlogComment blogComment);
}