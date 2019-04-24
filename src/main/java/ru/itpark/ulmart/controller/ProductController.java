package ru.itpark.ulmart.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itpark.ulmart.service.ProductService;

@Controller
@AllArgsConstructor
public class ProductController {
  private ProductService service;


  @GetMapping
  public String frontPage(Model model) {
    model.addAttribute("products", service.getAll());
    return "index";
  }
  @GetMapping(params = "search")
  public String searchByName(@RequestParam String search, Model model) {
    model.addAttribute("products", service.findByName(search));
    model.addAttribute("search", search);
    return "index";
  }

  @GetMapping("/view/{id}")
  public String details(@PathVariable int id, Model model) {
    model.addAttribute("product", service.getById(id));
    return "details";
  }

  @GetMapping("/add")
  public String addPage() {
    return "add";
  }

  @PostMapping("/add")
  public String add(@RequestParam String name, @RequestParam int price) {
      service.add(name, price);
    return "redirect:/";
  }
}

