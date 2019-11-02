package jp.co.systena.tigerscave.springtest.application.model;
import java.util.HashMap;
import java.util.Map;
import jp.co.systena.tigerscave.springtest.application.view.Item;

public class ListService {


  public Map<String,Item> getItemList(){

Item item1 = new Item();
item1.setItemID(1);
item1.setName("TV");
item1.setPrice(1000);

Item item2 = new Item();
item2.setItemID(2);
item2.setName("エアコン");
item2.setPrice(20000);

Item item3 = new Item();
item3.setItemID(3);
item3.setName("車");
item3.setPrice(300000);


    Map<String,Item> map = new HashMap<>();
    map.put("1",item1);
    map.put("2",item2);
    map.put("3",item3);
 return map;

  }
}
