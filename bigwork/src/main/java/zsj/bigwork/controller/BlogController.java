package zsj.bigwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zsj.bigwork.pojo.Blog;
import zsj.bigwork.service.BlogService;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;
    @GetMapping("/list")
    public List<Blog> selectAllBlog(){
        return blogService.selectAllBlog();
    }

}
