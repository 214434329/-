package zsj.bigwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zsj.bigwork.mapper.LoginDao;
import zsj.bigwork.pojo.User;
import zsj.bigwork.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private  LoginDao loginDao;
    @Override
    public User selectByUserName(String username) {
        return loginDao.selectByUsername(username);
    }

    @Override
    public void insertUser(User user) {
        loginDao.insertUser(user);
    }
}
