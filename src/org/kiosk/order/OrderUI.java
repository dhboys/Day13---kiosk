package org.kiosk.order;

import java.util.ArrayList;

import org.kiosk.menu.Menu;
import org.kiosk.menu.MenuDAO;
import org.kiosk.menu.MenuService;
import org.kiosk.util.BaseUI;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class OrderUI extends BaseUI {

	// MenuService로 부터 Menu받아야한다
	@NonNull
	private MenuService service;
	
	private MenuDAO dao;

	public void makeOrder() {

		// orderItem의 배열을 만들기
		ArrayList<OrderItem> items = new ArrayList<>();
		// 주문을 반복적으로 받을 수 있다
		while (true) {
			// 메뉴번호 입력받기
			int menuNum = inputInt("주문하실 메뉴의 번호를 입력하세요");
			// 입력받은 번호에 맞는 메뉴 가져오기
			Menu menu = service.getMenu(menuNum);
			// 수량 입력받기
			int qty = inputInt("수량을 입력해주세요");
			// OrderItem 객체 만들어서 메뉴와 수량 넣기
			OrderItem orderItem = new OrderItem(menu, qty);
			// items의 그 OrderItem 객체 넣어
			items.add(orderItem);
			// 주문 추가할건지 물어보고 아니면 break;
			print("주문을 계속하시려면 Enter");
			String answer = inputStr("주문을 그만하시려면 n");
			if (answer.equals("n")) {
				break;
			}
		} // end while
			// Order 생성
			// 주문을 계속 추가하면 orderItem이 배열에 하나씩 쌓이고
			// 주문을 그만하면 Order객체가 만들어지고 그 안에 배열이 담긴다.
		Order order = new Order(items);

		// order 출력
		print("OrderNum: " + order.getOrderNum());

		print("-------------------------------");

		for (OrderItem orderItem : items) {
			print(orderItem.getMenu().getName()+": "+orderItem.getQty()+": "+orderItem.getItemPrice());
		}
		print("===============================");
		print("TOTAL: "+order.getTotal());
	}

}
