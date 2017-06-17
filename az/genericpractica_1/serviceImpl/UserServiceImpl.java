package az.genericpractica_1.serviceImpl;

import az.genericpractica_1.dao.UserDao;
import az.genericpractica_1.domain.User;
import az.genericpractica_1.service.UserService;

/**
 * Created by Agile-PC on 6/17/2017.
 */
public class UserServiceImpl extends GenericServiceImpl<User, String> implements UserService {

    private UserDao userDao;

    //@Autowired
    public UserServiceImpl(UserDao userDao) {
        super(userDao);
        this.userDao = userDao;
    }

    public User getByUsername(String username) {
        return null;
    }
}
