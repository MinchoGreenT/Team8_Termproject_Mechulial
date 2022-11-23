import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class setEgg {
	void clickButton(JButton button, int totalEgg) {
		if(totalEgg == 1)
			button.setText("1");
		else if(totalEgg == 2)
			button.setText("2");
		else if(totalEgg == 3)
			button.setText("3");
		else if(totalEgg == 4)
			button.setText("4");
		else
			button.setText("5");
	}
}

public class Start extends JFrame {
	int totalEgg = 3;
	setEgg setVal = new setEgg();
	public Start() {

		//타이틀
		super("Start");
		

		//화면 구성
		JPanel mainPanel = new JPanel();
		setSize(700, 400);
		mainPanel.setLayout(null);
		
		//버튼 생성
		JButton buttonToLevel1 = new JButton("3"); 
		buttonToLevel1.setBounds(297, 107, 100, 150);
		
		 //버튼 추가
		mainPanel.add(buttonToLevel1);
		getContentPane().add(mainPanel);
		
		//버튼 클릭 이벤트
		buttonToLevel1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.setOutputNum(totalEgg);
				new Level1();
				setVisible(false);
			}
		});
		
		JButton minusEgg = new JButton("-");
		minusEgg.setBounds(256, 168, 29, 29);
		mainPanel.add(minusEgg);
		
		minusEgg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(totalEgg >= 2)
					totalEgg = totalEgg - 1;
				else if(totalEgg == 1)
					totalEgg = 1;
				
				setVal.clickButton(buttonToLevel1, totalEgg);
			}
		});
		
		JButton plusEgg = new JButton("+");
		plusEgg.setBounds(409, 168, 29, 29);
		mainPanel.add(plusEgg);

		plusEgg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(totalEgg <= 4)
					totalEgg = totalEgg + 1;
				else if(totalEgg == 5)
					totalEgg = 5;
				
				setVal.clickButton(buttonToLevel1, totalEgg);
			}
		});

		//화면 중앙에 띄우기
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
}