package com.synergy.bazaar.dao.base;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

/**
 * @author vce
 * @param <E>
 * @param <I>
 */
public abstract interface CommonIDao<E, I extends Serializable> {

	public E findById(I id);
    public String saveOrUpdate(E e);
    public List<E> findByCriteria(Criterion criterion);
    public List<E> findAll();
    public String delete(E e);
    public List<E> findByAttributeAndValue(I attribute,I value);
    public int getCount();
}
