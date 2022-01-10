package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BookDao;
import com.dao.BookDaoImpl;
import com.model.Book;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("bookdetails.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		Integer price = (Integer.valueOf(request.getParameter("price")));
		String publication = request.getParameter("publication");
		String edition = request.getParameter("edition");
		
		Book b = new Book();
		b.setTitle(title);
		b.setAuthor(author);
		b.setPrice(price);
		b.setPublication(publication);
		b.setEdition(edition);
		
		BookDao bdao = new BookDaoImpl();
		bdao.addbook(b);
		
		request.getRequestDispatcher("searchbook.jsp").forward(request, response);


		
		
		
	}

}
