package az.genericpractica_2.serviceImpl;

import az.genericpractica_2.BaseObject;
import az.genericpractica_2.dao.IRepositoryBase;
import az.genericpractica_2.service.IServiceBase;

/**
 * Created by Agile-PC on 6/17/2017.
 */
public class ServiceBase<T extends BaseObject,PK> implements IServiceBase<T,PK> {

    protected IRepositoryBase<T, PK> dao;

    public ServiceBase(IRepositoryBase<T, PK> dao) {
        this.dao = dao;
    }
}
