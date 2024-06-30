package zsj.bigwork.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import zsj.bigwork.pojo.Blog;

import java.util.List;

@Mapper
public interface BlogDao {
    @Select("select * from blog")
    List<Blog> selectAllBlog();
}
