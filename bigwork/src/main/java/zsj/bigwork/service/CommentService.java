package zsj.bigwork.service;

import zsj.bigwork.pojo.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> selectCommentAll();

    List<Comment> selectCommentById(int id);

    void insertComment(Comment comment);
}
