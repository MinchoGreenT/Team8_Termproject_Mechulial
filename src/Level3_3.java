import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level3_3 extends JFrame {
    Level3_3(){
        //Ÿ��Ʋ
        super("Level3.3");

        //ȭ�� ����
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        
        JButton buttonKorea = new JButton("�ѽ�");
        buttonKorea.setBounds(19, 128, 123, 116);
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

        JButton buttonJapan = new JButton("�Ͻ�");
        buttonJapan.setBounds(154, 128, 123, 116);
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

        JButton buttonChina = new JButton("�߽�");
        buttonChina.setBounds(289, 128, 123, 116);
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

        JButton buttonWestern = new JButton("���");
        buttonWestern.setBounds(424, 128, 123, 116);
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

        JButton buttonSnack = new JButton("�н�");
        buttonSnack.setBounds(559, 128, 123, 116);
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

        //ȭ�� �߾ӿ� ����
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}