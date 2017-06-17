package az.genericpractica_1.serviceImpl;

import az.genericpractica_1.BaseObject;
import az.genericpractica_1.dao.GenericDao;
import az.genericpractica_1.service.GenericService;

/**
 * Created by Agile-PC on 6/17/2017.
 */
public class GenericServiceImpl<T extends BaseObject,PK> implements GenericService<T,PK> {

    protected GenericDao<T, PK> dao;

    public GenericServiceImpl(GenericDao<T, PK> dao) {
        this.dao = dao;
    }
}
