package book.service.impl;

import java.util.List;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book.dao.face.BookDao;
import book.dto.Book;
import book.service.face.BookService;

@Service
public class BookServiceImpl implements BookService {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// DAO 객체
	@Autowired private BookDao bookDao;

	// Context 객체
	@Autowired private ServletContext context;
	
	@Override
	public List<Book> bookList(){
		return bookDao.selectBookList();
	}
	
	@Override
	public void bookInsert(Book dto) {
		bookDao.bookInsert(dto);
	}
	

	@Override
	public void bookModify(Book dto) {
		bookDao.bookModify(dto);
	}
	
	@Override
	public void bookDelete(int bookNo) {
		bookDao.bookDelete(bookNo);
	}
}