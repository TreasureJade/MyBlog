package com.by.blog.dao;

import com.by.blog.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hobo
 * @description
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CommentMapperTest {

    @Autowired
    private CommentMapper mapper;

    @Autowired
    private CommentService service;

    @Test
    public void selectCommentById() {
        System.out.println(mapper.selectCommentById(1L));
        System.out.println(service.getAllCommentByBlogId(1L));
    }
}