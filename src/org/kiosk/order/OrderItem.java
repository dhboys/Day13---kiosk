package org.kiosk.order;

import org.kiosk.menu.Menu;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class OrderItem {

	private Menu menu;
	private int qty;
	
	public OrderItem(Menu menu, int qty) {
		super();
		this.menu = menu;
		this.qty = qty;
	}
	
	// 메뉴와 수량을 알고 있으니까 가격계산을 잘할수 있는 객체이다.
	public int getItemPrice() {
		int result = (int)Integer.parseInt(menu.getPrice()) * qty;
		return result;
	}
}
