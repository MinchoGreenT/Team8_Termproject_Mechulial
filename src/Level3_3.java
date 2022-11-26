import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level3_3 extends JFrame {
    Level3_3(){
        //타이틀
        super("Level3.3");

        //화면 구성
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        
        JButton buttonKorea = new JButton();
        buttonKorea.setBounds(19, 100, 123, 116);
        buttonKorea.setIcon(new ImageIcon(Start.class.getResource("/data/button_korea.png")));
        buttonKorea.setBorderPainted(false);
        buttonKorea.setContentAreaFilled(false);
        buttonKorea.setFocusPainted(false);
        jPanel.add(buttonKorea);
        if(Main.getFrequency(1) != 0)
        	buttonKorea.setVisible(false);

        buttonKorea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.setFrequency(1, 3);
                 new Level3_4();
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
        if(Main.getFrequency(2) != 0)
        	buttonJapan.setVisible(false);

        buttonJapan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.setFrequency(2, 3);
                new Level3_4();
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
        if(Main.getFrequency(3) != 0)
        	buttonChina.setVisible(false);

        buttonChina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.setFrequency(3, 3);
                new Level3_4();
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
        if(Main.getFrequency(4) != 0)
        	buttonWestern.setVisible(false);

        buttonWestern.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.setFrequency(4, 3);
                new Level3_4();
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
        if(Main.getFrequency(5) != 0)
        	buttonSnack.setVisible(false);

        buttonSnack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.setFrequency(5, 3);
                new Level3_4();
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