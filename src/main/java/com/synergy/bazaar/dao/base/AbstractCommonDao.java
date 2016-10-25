package com.synergy.bazaar.dao.base;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author usc
 * @param <E>
 * @param <I>
 */
public abstract class AbstractCommonDao<E, I extends Serializable> implements CommonIDao<E, I> {

	private Class<E> entityClass;

	protected AbstractCommonDao(Class<E> entityClass) {
		this.entityClass = entityClass;
	}

	@Autowired
	@Qualifier("bazaarSessionFactory")
	private SessionFactory psessionFactory;

	public Session getCurrentSession() {
		return psessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public E findById(I id) {
		return (E) getCurrentSession().get(entityClass, id);
	}

	@Override
	public String saveOrUpdate(E e) {
		getCurrentSession().saveOrUpdate(e);
		return "success";
	}

	@Override
	public String delete(E e) {
		getCurrentSession().delete(e);
		return "success";
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> findByCriteria(Criterion criterion) {
		Criteria criteria = getCurrentSession().createCriteria(entityClass);
		criteria.add(criterion);
		return criteria.list();
	}

	public Criteria findByCriteria() {
		Criteria criteria = getCurrentSession().createCriteria(entityClass);
		return criteria;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> findAll() {
		return getCurrentSession().createQuery("from " + entityClass.getName()).list();
	}

	@Override
	public int getCount() {
		Number rowCount = (Number) getCurrentSession().createCriteria(entityClass.getName())
				.setProjection(Projections.rowCount()).uniqueResult();
		return rowCount.intValue();
	}

	@Override
	public List<E> findByAttributeAndValue(I attribute, I value) {
		@SuppressWarnings("unchecked")
		List<E> list = getCurrentSession()
				.createQuery("from " + entityClass.getName() + " e where e." + attribute + " like '" + value + "'")
				.list();
		return list;
	}

}
