package book.service.impl;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book.dao.face.BookDao;
import book.service.face.BookService;

@Service
public class BookServiceImpl implements BookService {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// DAO 객체
	@Autowired private BookDao bookDao;

	// Context 객체
	@Autowired private ServletContext context;
}