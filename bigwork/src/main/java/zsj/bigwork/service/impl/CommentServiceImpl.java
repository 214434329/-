package zsj.bigwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zsj.bigwork.mapper.CommentDao;
import zsj.bigwork.pojo.Comment;
import zsj.bigwork.service.CommentService;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;
    @Override
    public List<Comment> selectCommentAll() {
        return commentDao.selectCommentAll();
    }


    @Override
    public List<Comment> selectCommentById(int id) {
        return commentDao.selectCommentById(id);
    }

    @Override
    public void insertComment(Comment comment) {
        commentDao.insertComment(comment);
    }
}
