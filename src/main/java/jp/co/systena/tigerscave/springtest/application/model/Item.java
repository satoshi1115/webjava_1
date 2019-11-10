package jp.co.systena.tigerscave.springtest.application.model;

public class Item {

  private int ItemID;
  private String name;
  private int price;

  public Item(int itemId,String name,int price) {
    this.ItemID = itemId;
    this.name = name;
    this.price = price;
  }

  public int getItemId() {
    return ItemID;
  }

  public int setItemID(int itemId) {
    return ItemID;
  }

  public String getName() {
    return name;
  }

  public String setName(String name) {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public int setPrice(int price) {
    return price;

  }
}
