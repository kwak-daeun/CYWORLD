package book.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import book.service.face.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// 서비스 객체
	@Autowired private BookService bookService;
	
	// 테스트
	@RequestMapping("/book")
	public void main() {
		logger.info("BOOK 확인");
	}	
}