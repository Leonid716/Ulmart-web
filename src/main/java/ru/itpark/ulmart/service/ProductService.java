package ru.itpark.ulmart.service;

import org.springframework.stereotype.Service;
import ru.itpark.ulmart.domain.Product;
import ru.itpark.ulmart.repository.ProductRepository;

@Service
public class ProductService {
  private ProductRepository repository;
  private int nextId = 1;

  public ProductService(ProductRepository repository) {
    this.repository = repository;
  }

  public Product[] getAll() {
    return repository.getAll();
  }

//  public Product getById(int id) {
//    for (Product product : repository.getAll()) {
//      if (product==null){
//        continue;
//      }
//      if (product.getId()==id){
//        return product;
//      }
//    }
//    return null;
//  }

  public Product getById(int id) {
    return repository.getById(id);
  }

  public Product[] findByName(String search) {
    int maxResults = 10;
    Product[] result = new Product[maxResults];
    int nextIndex = 0;

    for (Product product : repository.getAll()) {
      if (product == null) {
        continue;
      }

      if (product.getName().toLowerCase().contains(search.toLowerCase())) {
        result[nextIndex] = product;
        nextIndex++;
      }

      if (nextIndex == maxResults) {
        break;
      }
    }

    return result;
  }

  public void add(String name, int price) {
    Product product = new Product(nextId,name,price);
    repository.add(product);
    nextId++;
  }
}


//  public Product[] searchByName(String search) {
//    Product[] result = new Product[10];
//    int nextIndex = 0;
//    for (Product product : repository.getAll()) {
//      if (product==null){
//        continue;
//      }
//      if (product.getName().toLowerCase().contains(search.toLowerCase())){
//        result[nextIndex]=product;
//        nextIndex++;
//
//      }
//    }
//    return result;
//  }
//}
