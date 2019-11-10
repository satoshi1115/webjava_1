package jp.co.systena.tigerscave.springtest.application.service;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import jp.co.systena.tigerscave.springtest.application.model.Item;

@Service
public class ListService {


  public Map<Integer,Item> getItemList(){

Item item1 = new Item(1,"TV",1000);
Item item2 = new Item(2,"エアコン",20000);
Item item3 = new Item(3,"車",300000);

    Map<Integer,Item> map = new LinkedHashMap<Integer, Item>();
    map.put(item1.getItemId(), item1);
    map.put(item2.getItemId(), item2);
    map.put(item3.getItemId(), item3);
 return map;

  }
}
