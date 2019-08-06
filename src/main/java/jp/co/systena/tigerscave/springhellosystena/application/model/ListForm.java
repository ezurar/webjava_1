package com.example.demo;

import java.util.ArrayList;

public class ListForm {
  
  private ArrayList<Item> itemList;
  private int num;
  
  public ArrayList<Item> getItemlist(){
    return itemList;
  }
  
  public void setItemList(ArrayList<Item> itemList) {
    this.itemList = itemList;
  }
  
  public int getNum() {
    return num;
  }
  
  public void setNum(int num) {
    this.num = num;
  }
}
