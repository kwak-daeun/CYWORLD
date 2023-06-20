package book.service.face;

import java.util.List;

import book.dto.Book;

public interface BookService {

	List<Book> bookList();

	void bookInsert(Book dto);

	void bookModify(Book dto);

	void bookDelete(int bookNo);

}
