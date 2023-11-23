/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.newEdunavibackend.controller;

import com.example.newEdunavibackend.data.Blog;
import com.example.newEdunavibackend.service.BlogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    //get all values from blog table-----------------------------------------
    @GetMapping(path = "/blogs")
    public List<Blog> getAllBlogs() {

        return blogService.getAllBlog();
    }

    //get value using blog id----------------------------------------------
    @GetMapping(path = "/blogs/{id}")
    public Blog getBlogById(@PathVariable int id) {

        return blogService.getBlogById(id);
    }

    //create blog part-----------------------------------------------------
    @PostMapping(path = "/blogs")
    public Blog createBlog(@RequestBody Blog brd) {

        return blogService.createBlog(brd);
    }

    //update blog part----------------------------------------------------
    @PutMapping(path = "/blogs")
    public Blog updateBlog(@RequestBody Blog brd) {

        return blogService.updateBlog(brd);
    }

    //delete using blog id------------------------------------------------
    @DeleteMapping(path = "/blogs/{id}")
    public void deleteBlogById(@PathVariable int id) {

        blogService.deleteBlogById(id);
    }
}
