import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level3_1 extends JFrame {
    Level3_1(){
        //타이틀
        super("Level3.1");

        //화면 구성
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        jPanel.setBackground(new Color(0xFAE76C));
        
        JLabel description = new JLabel("");
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setBounds(158, 60, 381, 46);
		jPanel.add(description);
		description.setIcon(new ImageIcon(Start.class.getResource("data/frequency_description.png")));
        
        JButton buttonKorea = new JButton();
        buttonKorea.setBounds(19, 100, 123, 116);
        buttonKorea.setIcon(new ImageIcon(Start.class.getResource("/data/button_korea.png")));
        buttonKorea.setBorderPainted(false);
        buttonKorea.setContentAreaFilled(false);
        buttonKorea.setFocusPainted(false);
        jPanel.add(buttonKorea);

        buttonKorea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.setFrequency(1, 1);
                new Level3_2();
                setVisible(false);
            }
        });

        JButton buttonJapan = new JButton();
        buttonJapan.setBounds(154, 100, 123, 116);
        buttonJapan.setIcon(new ImageIcon(Start.class.getResource("/data/button_japan.png")));
        buttonJapan.setBorderPainted(false);
        buttonJapan.setContentAreaFilled(false);
        buttonJapan.setFocusPainted(false);
        jPanel.add(buttonJapan);

        buttonJapan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.setFrequency(2, 1);
                new Level3_2();
                setVisible(false);
            }
        });

        JButton buttonChina = new JButton();
        buttonChina.setBounds(289, 100, 123, 116);
        buttonChina.setIcon(new ImageIcon(Start.class.getResource("/data/button_china.png")));
        buttonChina.setBorderPainted(false);
        buttonChina.setContentAreaFilled(false);
        buttonChina.setFocusPainted(false);
        jPanel.add(buttonChina);

        buttonChina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.setFrequency(3, 1);
                new Level3_2();
                setVisible(false);
            }
        });

        JButton buttonWestern = new JButton();
        buttonWestern.setBounds(424, 100, 123, 116);
        buttonWestern.setIcon(new ImageIcon(Start.class.getResource("/data/button_western.png")));
        buttonWestern.setBorderPainted(false);
        buttonWestern.setContentAreaFilled(false);
        buttonWestern.setFocusPainted(false);
        jPanel.add(buttonWestern);

        buttonWestern.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.setFrequency(4, 1);
                new Level3_2();
                setVisible(false);
            }
        });

        JButton buttonSnack = new JButton();
        buttonSnack.setBounds(559, 100, 123, 116);
        buttonSnack.setIcon(new ImageIcon(Start.class.getResource("/data/button_snack.png")));
        buttonSnack.setBorderPainted(false);
        buttonSnack.setContentAreaFilled(false);
        buttonSnack.setFocusPainted(false);
        jPanel.add(buttonSnack);

        buttonSnack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.setFrequency(5, 1);
                new Level3_2();
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