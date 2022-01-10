package com.dao;

import java.util.List;

import com.model.Book;

public interface BookDao {
	
	void addbook (Book b);
	
	public Book getById (int id);
	
	List <Book> SearchBook (Integer data);
	
	
	

}
