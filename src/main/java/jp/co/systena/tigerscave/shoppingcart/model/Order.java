package jp.co.systena.tigerscave.shoppingcart.model;

public class Order{
  //商品ID
  private int itemid;

  //個数
  private int num;

  //ゲッター,セッター
  public int getItemid() {
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