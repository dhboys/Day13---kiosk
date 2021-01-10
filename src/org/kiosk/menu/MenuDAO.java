package org.kiosk.menu;

import java.io.File;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class MenuDAO {

	private Menu[] menus = new Menu[5];

	public MenuDAO() {
		try {
			// 파일과 연결된 Scanner를 생성
			File file = new File("C:\\zzz\\kiosk.txt");
			Scanner scanner = new Scanner(file, "UTF-8");

			// 5번 라인을 읽는다.
			for (int i = 0; i < 5; i++) {
//				 한 라인을 :로 분리해서 문자열의 배열로 만들어
				String line = scanner.nextLine();
				String[] arr = line.split(":");
//				 배열을 이용해서 menu객체를 생성
//				 생성한 menu객체를 배열에 보관
				menus[i] = new Menu(arr[0], arr[1]);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Menu[] getDataBase() {
		return menus;
	}
}


