package az.genericpractica_1.dao;

import az.genericpractica_1.domain.User;

/**
 * Created by Agile-PC on 6/17/2017.
 */
public interface UserDao extends GenericDao<User,String> {
    public User getByUsername(String username);
}
