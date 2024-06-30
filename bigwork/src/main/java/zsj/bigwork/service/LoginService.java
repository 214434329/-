package zsj.bigwork.service;

import zsj.bigwork.pojo.User;

public interface LoginService {
    User selectByUserName(String username);

    void insertUser(User user);
}
