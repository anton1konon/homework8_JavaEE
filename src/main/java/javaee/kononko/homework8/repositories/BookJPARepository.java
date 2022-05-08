package javaee.kononko.homework8.repositories;


import javaee.kononko.homework8.models.Book;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookJPARepository extends PagingAndSortingRepository<Book, Integer>, JpaSpecificationExecutor<Book> {
}
