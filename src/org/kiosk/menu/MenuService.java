package org.kiosk.menu;

public class MenuService {

	private MenuDAO dao;
	private Menu[] menus;

	public MenuService(MenuDAO dao) {
		super();
		this.dao = dao;
	}

	public Menu[] getAllMenus() {
		return dao.getDataBase();
	}
	
	public Menu getMenu(int indexNum) {
		return dao.getDataBase()[indexNum];
	}
	
}
