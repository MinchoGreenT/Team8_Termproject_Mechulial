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
        //Å¸ï¿½ï¿½Æ²
        super("Level2.1");
        JPanel jPanel = new JPanel();
        setBackground(new Color(0xFAE76C));
        setSize(700, 400);
        getContentPane().add(jPanel);
        
        jPanel.setLayout(null);
        jPanel.setBackground(new Color(0xFAE76C));
        
        JLabel description = new JLabel("");
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setBounds(158, 60, 381, 46);
		jPanel.add(description);
		description.setIcon(new ImageIcon(Start.class.getResource("data/preference_description.png")));
        
        JButton buttonKorea = new JButton("");
        buttonKorea.setBounds(19, 100, 123, 116);
        buttonKorea.setIcon(new ImageIcon(Start.class.getResource("/data/button_korea.png")));
        buttonKorea.setBorderPainted(false);
        buttonKorea.setContentAreaFilled(false);
        buttonKorea.setFocusPainted(false);
        jPanel.add(buttonKorea);

        JButton buttonJapan = new JButton("");
        buttonJapan.setBounds(154, 100, 123, 116);
        buttonJapan.setIcon(new ImageIcon(Start.class.getResource("/data/button_japan.png")));
        buttonJapan.setBorderPainted(false);
        buttonJapan.setContentAreaFilled(false);
        buttonJapan.setFocusPainted(false);
        jPanel.add(buttonJapan);

        JButton buttonChina = new JButton("");
        buttonChina.setBounds(289, 100, 123, 116);
        buttonChina.setIcon(new ImageIcon(Start.class.getResource("/data/button_china.png")));
        buttonChina.setBorderPainted(false);
        buttonChina.setContentAreaFilled(false);
        buttonChina.setFocusPainted(false);
        jPanel.add(buttonChina);

        JButton buttonWestern = new JButton("");
        buttonWestern.setBounds(424, 100, 123, 116);
        buttonWestern.setIcon(new ImageIcon(Start.class.getResource("/data/button_western.png")));
        buttonWestern.setBorderPainted(false);
        buttonWestern.setContentAreaFilled(false);
        buttonWestern.setFocusPainted(false);
        jPanel.add(buttonWestern);

        JButton buttonSnack = new JButton("");
        buttonSnack.setBounds(559, 100, 123, 116);
        buttonSnack.setIcon(new ImageIcon(Start.class.getResource("/data/button_snack.png")));
        buttonSnack.setBorderPainted(false);
        buttonSnack.setContentAreaFilled(false);
        buttonSnack.setFocusPainted(false);
        jPanel.add(buttonSnack);
        
        JButton koreaStatus = new JButton("");
        koreaStatus.setBounds(43, 219, 69, 29);
        koreaStatus.setBorderPainted(false);
        koreaStatus.setContentAreaFilled(false);
        koreaStatus.setFocusPainted(false);
        jPanel.add(koreaStatus);
        
        JButton japanStatus = new JButton("");
        japanStatus.setBounds(179, 219, 69, 29);
        japanStatus.setBorderPainted(false);
        japanStatus.setContentAreaFilled(false);
        japanStatus.setFocusPainted(false);
        jPanel.add(japanStatus);
        
        JButton chinaStatus = new JButton("");
        chinaStatus.setBounds(314, 219, 69, 29);
        chinaStatus.setBorderPainted(false);
        chinaStatus.setContentAreaFilled(false);
        chinaStatus.setFocusPainted(false);
        jPanel.add(chinaStatus);
        
        JButton westernStatus = new JButton("");
        westernStatus.setBounds(449, 219, 69, 29);
        westernStatus.setBorderPainted(false);
        westernStatus.setContentAreaFilled(false);
        westernStatus.setFocusPainted(false);
        jPanel.add(westernStatus);
        
        JButton snackStatus = new JButton("");
        snackStatus.setBounds(584, 219, 69, 29);
        snackStatus.setBorderPainted(false);
        snackStatus.setContentAreaFilled(false);
        snackStatus.setFocusPainted(false);
        jPanel.add(snackStatus);
        
        JButton minusKorea = new JButton();
        minusKorea.setIcon(new ImageIcon(Start.class.getResource("/data/minus.png")));
        minusKorea.setBounds(18, 219, 29, 29);
        minusKorea.setBorderPainted(false);
        minusKorea.setContentAreaFilled(false);
        minusKorea.setFocusPainted(false);
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
        
        JButton plusKorea = new JButton();
        plusKorea.setIcon(new ImageIcon(Start.class.getResource("/data/plus.png")));
        plusKorea.setBounds(112, 219, 29, 29);
        plusKorea.setBorderPainted(false);
        plusKorea.setContentAreaFilled(false);
        plusKorea.setFocusPainted(false);
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
        
        JButton minusJapan = new JButton();
        minusJapan.setIcon(new ImageIcon(Start.class.getResource("/data/minus.png")));
        minusJapan.setBounds(153, 219, 29, 29);
        minusJapan.setBorderPainted(false);
        minusJapan.setContentAreaFilled(false);
        minusJapan.setFocusPainted(false);
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
        
        JButton plusJapan = new JButton();
        plusJapan.setIcon(new ImageIcon(Start.class.getResource("/data/plus.png")));
        plusJapan.setBounds(247, 219, 29, 29);
        plusJapan.setBorderPainted(false);
        plusJapan.setContentAreaFilled(false);
        plusJapan.setFocusPainted(false);
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
        
        JButton minusChina = new JButton();
        minusChina.setIcon(new ImageIcon(Start.class.getResource("/data/minus.png")));
        minusChina.setBounds(288, 219, 29, 29);
        minusChina.setBorderPainted(false);
        minusChina.setContentAreaFilled(false);
        minusChina.setFocusPainted(false);
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
        
        JButton plusChina = new JButton();
        plusChina.setIcon(new ImageIcon(Start.class.getResource("/data/plus.png")));
        plusChina.setBounds(382, 219, 29, 29);
        plusChina.setBorderPainted(false);
        plusChina.setContentAreaFilled(false);
        plusChina.setFocusPainted(false);
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
        
        JButton minusWestern = new JButton();
        minusWestern.setIcon(new ImageIcon(Start.class.getResource("/data/minus.png")));
        minusWestern.setBounds(423, 219, 29, 29);
        minusWestern.setBorderPainted(false);
        minusWestern.setContentAreaFilled(false);
        minusWestern.setFocusPainted(false);
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
        
        JButton plusWestern = new JButton();
        plusWestern.setIcon(new ImageIcon(Start.class.getResource("/data/plus.png")));
        plusWestern.setBounds(517, 219, 29, 29);
        plusWestern.setBorderPainted(false);
        plusWestern.setContentAreaFilled(false);
        plusWestern.setFocusPainted(false);
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
        
        JButton minusSnack = new JButton();
        minusSnack.setIcon(new ImageIcon(Start.class.getResource("/data/minus.png")));
        minusSnack.setBounds(558, 219, 29, 29);
        minusSnack.setBorderPainted(false);
        minusSnack.setContentAreaFilled(false);
        minusSnack.setFocusPainted(false);
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
        
        JButton plusSnack = new JButton();
        plusSnack.setIcon(new ImageIcon(Start.class.getResource("/data/plus.png")));
        plusSnack.setBounds(652, 219, 29, 29);
        plusSnack.setBorderPainted(false);
        plusSnack.setContentAreaFilled(false);
        plusSnack.setFocusPainted(false);
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
        
        JButton buttonToLevel3_1 = new JButton("´ÙÀ½");
        buttonToLevel3_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
        buttonToLevel3_1.setBounds(571, 331, 123, 35);
        buttonToLevel3_1.setBorderPainted(false);
        buttonToLevel3_1.setContentAreaFilled(false);
        buttonToLevel3_1.setFocusPainted(false);
        jPanel.add(buttonToLevel3_1);
        
        buttonToLevel3_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Level3_1();
                setVisible(false);
            }
        });
        
        JButton buttonToLevel1 = new JButton("ÀÌÀü");
        buttonToLevel1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
        buttonToLevel1.setBounds(6, 331, 123, 35);
        buttonToLevel1.setBorderPainted(false);
        buttonToLevel1.setContentAreaFilled(false);
        buttonToLevel1.setFocusPainted(false);
        jPanel.add(buttonToLevel1);
        
        buttonToLevel1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Level1();
                setVisible(false);
            }
        });


        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); 
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}