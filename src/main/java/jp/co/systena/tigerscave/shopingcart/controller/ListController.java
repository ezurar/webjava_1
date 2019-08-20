package jp.co.systena.tigerscave.shopingcart.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Viewを返却するアノテーション
@Controller
public class ListController {

  //セッション管理
  @Autowired
  HttpSession session;

  //URLとのマッピング
  @RequestMapping(value = "/list", method =RequestMethod.GET)
  public ModelAndView index（ModelAndView mav) {


    Map<Integer，Item> itemListMap = getItemListMap();
    mav.addObject("itemList" ,itemListMap);

    Cart cart = getCart();
    mav.addObject("orderList", cart.getOrderList());

    // 合計金額計算
    int totalPrice = 0;
    for (Order order : cart.getOrderList()) {
      if (itemListMap.containsKey(order.getItemid())) {
        totalPrice += order.getNum() * itemListMap.get(order.getItemid()).getPrice();
      }
    }


  }

}
