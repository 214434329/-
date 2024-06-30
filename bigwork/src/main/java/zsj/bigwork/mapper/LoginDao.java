package zsj.bigwork.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import zsj.bigwork.pojo.User;

@Mapper
public interface LoginDao {
    @Select("select * from user where username=#{username}")
    User selectByUsername(String username);

    @Insert("insert into user (username, password)values (#{username}, #{password})")
    void insertUser(User user);
}
