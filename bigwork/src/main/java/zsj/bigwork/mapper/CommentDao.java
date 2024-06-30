package zsj.bigwork.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import zsj.bigwork.pojo.Comment;

import java.util.List;

@Mapper
public interface CommentDao {
    @Select("select * from comment")
    List<Comment> selectCommentAll();
    @Select("select * from comment where bid = #{id}")
    List<Comment> selectCommentById(int id);
    @Insert("insert into comment (bid, user, comment)values (#{bid}, #{user}, #{comment})")
    void insertComment(Comment comment);
}
