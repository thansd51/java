package application;

import javax.swing.JFrame;

public class HelloWorld {

	public static void main(String[] args) {
		// JFrame은 윈도우 창
		JFrame mainFrame = new JFrame(); // 새 창 생성

		mainFrame.setSize(600, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true); // 보이게 하기
	}

}
