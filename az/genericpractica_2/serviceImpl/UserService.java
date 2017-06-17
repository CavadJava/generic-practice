package az.genericpractica_2.serviceImpl;

import az.genericpractica_2.dao.IUserRepository;
import az.genericpractica_2.service.IUserService;
import az.genericpractica_2.domain.User;

/**
 * Created by Agile-PC on 6/17/2017.
 */
public class UserService extends ServiceBase<User, String> implements IUserService {

    private IUserRepository iUserRepository;

    //@Autowired
    public UserService(IUserRepository iUserRepository) {
        super(iUserRepository);
        this.iUserRepository = iUserRepository;
    }
}
