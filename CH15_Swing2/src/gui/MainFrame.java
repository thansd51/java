package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);
		
		MainPanel mainPanel = new MainPanel();
		mainPanel.setBackground(Color.darkGray);
		
		//레이아웃 설정
		setLayout(new BorderLayout());
		//패널 생성하여 창의 가운데 붙이기
		
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		
		
		setSize(600, 400); // 창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫을시 프로그램 종료	
		setVisible(true);
	}

}
