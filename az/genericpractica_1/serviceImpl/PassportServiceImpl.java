package az.genericpractica_1.serviceImpl;

import az.genericpractica_1.dao.PassportDao;
import az.genericpractica_1.domain.Passport;
import az.genericpractica_1.service.PassportService;

/**
 * Created by Agile-PC on 6/17/2017.
 */
public class PassportServiceImpl extends GenericServiceImpl<Passport,Long> implements PassportService {
    private PassportDao passportDao;

    public PassportServiceImpl(PassportDao passportDao){
        super(passportDao);
        this.passportDao=passportDao;
    }
}
