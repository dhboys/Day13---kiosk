package org.kiosk.menu;

import org.kiosk.util.BaseUI;

public class MenuUI extends BaseUI {

	private MenuService service;

	public MenuUI(MenuService service) {
		super();
		this.service = service;
	}
	
	public void showAllMenus() {

		System.out.println("---------------------");
		System.out.println("---------MENU--------");
		System.out.println("---------------------");

		Menu[] menus = service.getAllMenus();

		for (int i = 0; i < menus.length; i++) {
			Menu menu = menus[i];
			print(i+": "+menu.getName()+": "+menu.getPrice());
		}
		print("---------------------------");
	}
}
