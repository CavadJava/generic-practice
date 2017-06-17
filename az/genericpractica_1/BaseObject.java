package az.genericpractica_1;

import java.io.Serializable;

/**
 * Created by Agile-PC on 6/17/2017.
 */
public class BaseObject<T> implements Serializable{

    T id;

    public BaseObject(){}

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
