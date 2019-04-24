package ru.itpark.ulmart.repository;

import org.springframework.stereotype.Repository;
import ru.itpark.ulmart.domain.*;

@Repository
public class ProductRepository {
  private Product[] items = new Product[10];
  private int nextIndex = 0;

  public ProductRepository() {

    IPhone iPhone = new IPhone();
    iPhone.setId(1);
    iPhone.setName("iPhone XR");
    iPhone.setPrice(64_000);
    iPhone.setModel("XR");
    iPhone.setOs("iOS");
    iPhone.setMemorySize(64);
    iPhone.setColor("Pink Gold");

    TShirt shirt = new TShirt();
    shirt.setId(2);
    shirt.setName("Nike");
    shirt.setPrice(1_000);
    shirt.setSize(52);
    shirt.setColor("Black");

    FitnessTracker tracker = new FitnessTracker();
    tracker.setId(3);
    tracker.setName("Xiaomi");
    tracker.setModel("Mi Band 3");
    tracker.setPrice(3_000);
    tracker.setColor("Black");

    HardDrive drive = new HardDrive();
    drive.setId(4);
    drive.setName("TOSHIBA");
    drive.setModel("HDTP220EK3CA");
    drive.setVolume(2_000);
    drive.setAssignment("External");
    drive.setPrice(5_000);


    add(iPhone);
    add(shirt);
    add(tracker);
    add(drive);

  }

  public Product[] getAll() {
    return items;
  }

  public void add(Product product) {
    items[nextIndex] = product;
    nextIndex++;
  }

  public Product getById(int id) {
    for (Product item : items) {
      if (item != null && item.getId() == id) {
        return item;
      }
    }
    return null;
  }


}
