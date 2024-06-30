package zsj.bigwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zsj.bigwork.mapper.BlogDao;
import zsj.bigwork.pojo.Blog;
import zsj.bigwork.service.BlogService;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public List<Blog> selectAllBlog() {
        return blogDao.selectAllBlog();
    }
}
