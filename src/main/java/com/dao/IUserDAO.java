package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.User;

public interface IUserDAO {
	
	List<User> getAllUsers();
	/*
	Article getArticleById(int articleId);

	void addArticle(Article article);

	void updateArticle(Article article);

	void deleteArticle(int articleId);

	boolean articleExists(String title, String category);
	*/
}
