package zsj.bigwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zsj.bigwork.pojo.Comment;
import zsj.bigwork.service.CommentService;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/all")
    public List<Comment> selectCommentAll(){
        return commentService.selectCommentAll();
    }

    @PostMapping("/list")
    public List<Comment> selectCommentById(@RequestBody Comment comment){
        return commentService.selectCommentById(comment.getId());
    }

    @PostMapping("/add")
    public void insertComment(@RequestBody Comment comment){
        System.out.println(comment.getBid());
        System.out.println(comment.getUser());
        System.out.println(comment.getComment());
        commentService.insertComment(comment);
    }


}
