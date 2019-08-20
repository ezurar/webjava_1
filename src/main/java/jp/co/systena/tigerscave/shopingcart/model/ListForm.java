package jp.co.systena.tigerscave.shopingcart.model;

public class ListForm {

  //商品ID
  private int itemid;

  //個数
  private int num;



  //ゲッター,セッター
  public int geyItemid() {
    return itemid;

  }

  public void setItemid(int itemid) {
    this.itemid = itemid;

  }
  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num =num;
  }

}