package org.kiosk.order;

import java.util.ArrayList;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString
public class Order {

	public static int COUNT;
	
	private int orderNum = 0;
	private ArrayList<OrderItem> items;
	// 오더가 생성될 때마다 orderNum은 1씩 증가해야한다.
	
	public Order(ArrayList<OrderItem> items) {
		this.orderNum = ++COUNT;
		this.items = items;
	}

	// orderitem들의 가격을 합쳐서 UI에게 줘야한다
	public int getTotal() {
		int total = 0;
		
		// getItemPrice의 총합
		for (OrderItem orderItem : items) {
			total = total + orderItem.getItemPrice();
		}
		return total;
	}
	
}
