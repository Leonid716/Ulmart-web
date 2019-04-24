package ru.itpark.ulmart.domain;

public class IPhone extends SmartPhone /*, Colored - множественное наследование запрещено */ {
  private String model;
  private String color;
  private int memorySize;

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getMemorySize() {
    return memorySize;
  }

  public void setMemorySize(int memorySize) {
    this.memorySize = memorySize;
  }
}
