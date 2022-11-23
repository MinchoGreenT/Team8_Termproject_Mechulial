import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level2_1 extends JFrame {
	
	class setVal {
		static void clickButton(JButton button, int total) {
			if(total == 1)
				button.setText("1");
			else if(total == 2)
				button.setText("2");
			else if(total == 3)
				button.setText("3");
			else if(total == 4)
				button.setText("4");
			else
				button.setText("5");
		}
	}
	
    Level2_1(){
        //타이틀
        super("Level2.1");
        JPanel jPanel = new JPanel();

        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        
        JButton buttonKorea = new JButton("한식");
        buttonKorea.setBounds(19, 128, 123, 116);
        jPanel.add(buttonKorea);

        JButton buttonJapan = new JButton("일식");
        buttonJapan.setBounds(154, 128, 123, 116);
        jPanel.add(buttonJapan);

        JButton buttonChina = new JButton("중식");
        buttonChina.setBounds(289, 128, 123, 116);
        jPanel.add(buttonChina);

        JButton buttonWestern = new JButton("양식");
        buttonWestern.setBounds(424, 128, 123, 116);
        jPanel.add(buttonWestern);

        JButton buttonSnack = new JButton("분식");
        buttonSnack.setBounds(559, 128, 123, 116);
        jPanel.add(buttonSnack);
        
        JButton koreaStatus = new JButton("선호도");
        koreaStatus.setBounds(43, 219, 69, 29);
        jPanel.add(koreaStatus);
        
        JButton japanStatus = new JButton("선호도");
        japanStatus.setBounds(179, 219, 69, 29);
        jPanel.add(japanStatus);
        
        JButton chinaStatus = new JButton("선호도");
        chinaStatus.setBounds(314, 219, 69, 29);
        jPanel.add(chinaStatus);
        
        JButton westernStatus = new JButton("선호도");
        westernStatus.setBounds(449, 219, 69, 29);
        jPanel.add(westernStatus);
        
        JButton snackStatus = new JButton("선호도");
        snackStatus.setBounds(584, 219, 69, 29);
        jPanel.add(snackStatus);
        
        JButton minusKorea = new JButton("-");
        minusKorea.setBounds(18, 219, 29, 29);
        jPanel.add(minusKorea);
        
		minusKorea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.preference[1] >= 2)
					Main.preference[1] = Main.preference[1] - 1;
				else if(Main.preference[1] == 1)
					Main.preference[1] = 1;
				
				setVal.clickButton(koreaStatus, Main.preference[1]);
			}
		});
        
        JButton plusKorea = new JButton("+");
        plusKorea.setBounds(112, 219, 29, 29);
        jPanel.add(plusKorea);
        
        plusKorea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.preference[1] <= 4)
					Main.preference[1] = Main.preference[1] + 1;
				else if(Main.preference[1] == 5)
					Main.preference[1] = 5;
				
				setVal.clickButton(koreaStatus, Main.preference[1]);
			}
		});
        
        JButton minusJapan = new JButton("-");
        minusJapan.setBounds(153, 219, 29, 29);
        jPanel.add(minusJapan);
        
        minusJapan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.preference[2] >= 2)
					Main.preference[2] = Main.preference[2] - 1;
				else if(Main.preference[2] == 1)
					Main.preference[2] = 1;
				
				setVal.clickButton(japanStatus, Main.preference[2]);
			}
		});
        
        JButton plusJapan = new JButton("+");
        plusJapan.setBounds(247, 219, 29, 29);
        jPanel.add(plusJapan);
        
        plusJapan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.preference[2] <= 4)
					Main.preference[2] = Main.preference[2] + 1;
				else if(Main.preference[2] == 5)
					Main.preference[2] = 5;
				
				setVal.clickButton(japanStatus, Main.preference[2]);
			}
		});
        
        JButton minusChina = new JButton("-");
        minusChina.setBounds(288, 219, 29, 29);
        jPanel.add(minusChina);
        
        minusChina.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.preference[3] >= 2)
					Main.preference[3] = Main.preference[3] - 1;
				else if(Main.preference[3] == 1)
					Main.preference[3] = 1;
				
				setVal.clickButton(chinaStatus, Main.preference[3]);
			}
		});
        
        JButton plusChina = new JButton("+");
        plusChina.setBounds(382, 219, 29, 29);
        jPanel.add(plusChina);
        
        plusChina.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.preference[3] <= 4)
					Main.preference[3] = Main.preference[3] + 1;
				else if(Main.preference[3] == 5)
					Main.preference[3] = 5;
				
				setVal.clickButton(chinaStatus, Main.preference[3]);
			}
		});
        
        JButton minusWestern = new JButton("-");
        minusWestern.setBounds(423, 219, 29, 29);
        jPanel.add(minusWestern);
        
        minusWestern.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.preference[4] >= 2)
					Main.preference[4] = Main.preference[4] - 1;
				else if(Main.preference[4] == 1)
					Main.preference[4] = 1;
				
				setVal.clickButton(westernStatus, Main.preference[4]);
			}
		});
        
        JButton plusWestern = new JButton("+");
        plusWestern.setBounds(517, 219, 29, 29);
        jPanel.add(plusWestern);
        
        plusWestern.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.preference[4] <= 4)
					Main.preference[4] = Main.preference[4] + 1;
				else if(Main.preference[4] == 5)
					Main.preference[4] = 5;
				
				setVal.clickButton(westernStatus, Main.preference[4]);
			}
		});
        
        JButton minusSnack = new JButton("-");
        minusSnack.setBounds(558, 219, 29, 29);
        jPanel.add(minusSnack);
        
        minusSnack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.preference[5] >= 2)
					Main.preference[5] = Main.preference[5] - 1;
				else if(Main.preference[5] == 1)
					Main.preference[5] = 1;
				
				setVal.clickButton(snackStatus, Main.preference[5]);
			}
		});
        
        JButton plusSnack = new JButton("+");
        plusSnack.setBounds(652, 219, 29, 29);
        jPanel.add(plusSnack);
        
        plusSnack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.preference[5] <= 4)
					Main.preference[5] = Main.preference[5] + 1;
				else if(Main.preference[5] == 5)
					Main.preference[5] = 5;
				
				setVal.clickButton(snackStatus, Main.preference[5]);
			}
		});
        
        JButton buttonToLevel3_1 = new JButton("다음으로");
        buttonToLevel3_1.setBounds(571, 331, 123, 35);
        jPanel.add(buttonToLevel3_1);
        
        buttonToLevel3_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Level3_1();
                setVisible(false);
            }
        });
        
        JButton buttonToLevel1 = new JButton("이전으로");
        buttonToLevel1.setBounds(6, 331, 123, 35);
        jPanel.add(buttonToLevel1);
        
        buttonToLevel1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Level1();
                setVisible(false);
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