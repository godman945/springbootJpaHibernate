package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository
public class UserDAO implements IUserDAO{
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public List<User> getAllUsers(){
		 String hql = "FROM User";//FROM Article as atcl ORDER BY atcl.articleId
		 return (List<User>) entityManager.createQuery(hql).getResultList();
	}
}
