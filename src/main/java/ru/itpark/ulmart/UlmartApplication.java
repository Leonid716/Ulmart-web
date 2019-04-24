package ru.itpark.ulmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UlmartApplication {

  public static void main(String[] args) {
    SpringApplication.run(UlmartApplication.class, args);

//    BookRepository repository = new BookRepository();
//    BookService service = new BookService(repository);
//    BookController controller = new BookController(service);
  }

}
