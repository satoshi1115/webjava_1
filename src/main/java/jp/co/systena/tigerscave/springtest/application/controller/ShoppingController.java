package jp.co.systena.tigerscave.springtest.application.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.springtest.application.model.Item;
import jp.co.systena.tigerscave.springtest.application.service.ListService;

@Controller
public class ShoppingController {

  @Autowired
  ListService listService;

  @RequestMapping(value="list",method=RequestMethod.GET)
  public ModelAndView list(ModelAndView mav) {

    //商品一覧をlistservice クラスより取得しクラス内のメソッドを使用
    Map<Integer, Item> itemList = listService.getItemList();

    //テンプレートに値を渡す内容を設定
    //第一引数は「変数」、第二引数は実際に渡す「オブジェクト」
   mav.addObject("itemList",itemList);

   //テンプレートファイル名を入力
   mav.setViewName("Listview");

return mav;

  }
@RequestMapping(value = "/cart", method = RequestMethod.GET)
  public ModelAndView cart(ModelAndView mav) {







}

}
