/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.service;

import com.example.newEdunavibackend.data.Blog;
import com.example.newEdunavibackend.data.BlogRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public List<Blog> getAllBlog() {
        List<Blog> blogs = blogRepository.findAll();
        return blogs;
    }

    public Blog getBlogById(int id) {
        Optional<Blog> brd = blogRepository.findById(id);
        return brd.get();
    }

    public Blog createBlog(Blog brd) {
        return blogRepository.save(brd);
    }

    public Blog updateBlog(Blog brd) {
        return blogRepository.save(brd);
    }
    
     public void deleteBlogById (int id){
          blogRepository.deleteById(id);
      } 
}
