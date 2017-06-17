package az.genericpractica_1.service;

import az.genericpractica_1.domain.User;

/**
 * Created by Agile-PC on 6/17/2017.
 */
public interface UserService extends GenericService<User,String>{
    public User getByUsername(String username);
}
