package book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import book.dto.Book;
import book.service.face.BookService;

@Controller
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
	

	@RequestMapping(value="/bookList")
	public ModelAndView bookList(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("book/book");
		List<Book> list = bookService.bookList();
		
		mv.addObject("Blist",list);
		
		return mv;
		
	}
	
	@RequestMapping(value="/bookInsert")
	public ModelAndView bookInsert(HttpServletRequest request, Book dto) {

		ModelAndView mv = new ModelAndView("redirect:/bookList");
		bookService.bookInsert(dto); 
		return mv; 
	}
	

	@RequestMapping(value="/bookModify")
	public ModelAndView bookModify(HttpServletRequest request, Book dto) {
		
		
		ModelAndView mv = new ModelAndView("book/book");
		bookService.bookModify(dto);
		mv.addObject("list",dto);
		return mv;
	}
	
	@RequestMapping(value="/bookDelete")
	public void bookDelete(int bookNo) {
		bookService.bookDelete(bookNo);
		
		
	}
}