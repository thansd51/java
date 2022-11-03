package gui;



import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.Color;

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {
		JButton redButton = new JButton("Red");
		JButton blueButton = new JButton("Blue");

		redButton.addActionListener(e -> mainPanel.setBackground(Color.RED));
		
		blueButton.addActionListener(e -> mainPanel.setBackground(Color.BLUE));

		add(redButton);
		add(blueButton);
	}

}
