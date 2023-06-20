package book.dao.face;

import java.util.List;

import org.springframework.stereotype.Repository;

import book.dto.Book;

@Repository("bookDao")
public interface BookDao {
	
	
	public List<Book> selectBookList();

	public void bookInsert(Book dto);

	public void bookModify(Book dto);

	public void bookDelete(int bookNo);

}
