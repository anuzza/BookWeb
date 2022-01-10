package com.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Book;

public class BookDaoImpl implements BookDao {

	@Override
	public void addbook(Book b) {
		
		String sql = "insert into book (title, author, price, publication, edition) values ('"+b.getTitle()+"','"+b.getAuthor()+"', '"+b.getPrice()+"', '"+b.getPublication()+"','"+b.getEdition()+"' ) ";
		try {
			Statement stm = DB.getDBCon().createStatement();
			stm.execute(sql);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	public Book getById(int id) {
		
		
		Book b = new Book ();
		
		String sql = "select * from book where id = "+id;
		
		try {
			Statement stm = DB.getDBCon().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if (rs.next()) {
				
				b.setId(rs.getInt("id"));
				b.setTitle(rs.getString("title"));
				b.setAuthor(rs.getString("author"));
				b.setPrice(rs.getInt("price"));
				b.setPublication(rs.getString("publication"));
				b.setEdition(rs.getString("edition"));
				
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return b;
	}
	

	@Override
	public List<Book> SearchBook(Integer data) {
		
		List <Book> blist = new ArrayList<>();
		
		String sql = " select * from book where id = '"+data+"' ";
		
		try {
			Statement stm = DB.getDBCon().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				
				Book b = new Book ();
				
				b.setId(rs.getInt("id"));
				b.setTitle(rs.getString("title"));
				b.setAuthor(rs.getString("author"));
				b.setPrice(rs.getInt("price"));
				b.setPublication(rs.getString("publication"));
				b.setEdition(rs.getString("edition"));
				
				blist.add(b);
				
				
			}
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return blist;
	}

	
	
}
