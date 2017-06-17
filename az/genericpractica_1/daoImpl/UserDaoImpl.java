package az.genericpractica_1.daoImpl;

import az.genericpractica_1.dao.UserDao;
import az.genericpractica_1.domain.User;

/**
 * Created by Agile-PC on 6/17/2017.
 */
public class UserDaoImpl extends GenericDaoImpl<User,String> implements UserDao{

    public User getByUsername(String username) {
        StringBuilder sql = new StringBuilder()
                .append("select u.* ")
                .append("from user u ")
                .append("where u.username = ? ");
        return null;
    }
}
