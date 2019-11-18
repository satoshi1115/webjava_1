package jp.co.systena.tigerscave.springtest.application.model;

import javax.validation.constraints.Min;

/*
 * テンプレートファイルのListView.htmlの「th:objext」で処理をする箇所を指定されたため、 以下に記載。
 */
public class ListForm {

  private int itemId;

  // アノテーションで最小の値を定義（入力値から入力チェックをしてくれる）
  @Min(1)
  private int num;

  public int getItemId() {
    return itemId;
  }

  public void setItemId(int itemId) {
    this.itemId = itemId;
  }

  public int getnum() {
    return num;
  }

  public void setnum(int num) {
    this.num = num;
  }



}
