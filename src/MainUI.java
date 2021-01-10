import org.kiosk.menu.MenuUI;
import org.kiosk.order.OrderUI;
import org.kiosk.util.BaseUI;

public class MainUI extends BaseUI{

	private MenuUI menuUI;
	private OrderUI orderUI;
	
	public MainUI(MenuUI menuUI, OrderUI orderUI) {
		super();
		this.menuUI = menuUI;
		this.orderUI = orderUI;
	}

	
	public void welcome() {
			
		inputStr("주문하시려면 Enter를 입력해주세요");
		print("메뉴를 보여드리겠습니다");
		
		menuUI.showAllMenus();
		orderUI.makeOrder();
		
		print("주문이 완료되었습니다");
		// 재귀
		welcome();
		
	}
	
}
