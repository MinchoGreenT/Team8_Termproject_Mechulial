import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level2_1 extends JFrame {
    Level2_1(int totalEgg){
        //Ÿ��Ʋ
        super("Level2.1");
        JPanel jPanel = new JPanel();

        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);

        JButton buttonKorea = new JButton("�ѽ�");
        buttonKorea.setBounds(19, 128, 123, 116);
        jPanel.add(buttonKorea);

        buttonKorea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int favoriteFood = 0;
                new Level2_2(totalEgg, favoriteFood);
                setVisible(false);
            }
        });

        JButton buttonJapan = new JButton("�Ͻ�");
        buttonJapan.setBounds(154, 128, 123, 116);
        jPanel.add(buttonJapan);

        buttonJapan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int favoriteFood = 1;
                new Level2_2(totalEgg, favoriteFood);
                setVisible(false);
            }
        });

        JButton buttonChina = new JButton("�߽�");
        buttonChina.setBounds(289, 128, 123, 116);
        jPanel.add(buttonChina);

        buttonChina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int favoriteFood = 2;
                new Level2_2(totalEgg, favoriteFood);
                setVisible(false);
            }
        });

        JButton buttonWestern = new JButton("���");
        buttonWestern.setBounds(424, 128, 123, 116);
        jPanel.add(buttonWestern);

        buttonWestern.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int favoriteFood = 3;
                new Level2_2(totalEgg, favoriteFood);
                setVisible(false);
            }
        });

        JButton buttonSnack = new JButton("�н�");
        buttonSnack.setBounds(559, 128, 123, 116);
        jPanel.add(buttonSnack);

        buttonSnack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int favoriteFood = 4;
                new Level2_2(totalEgg, favoriteFood);
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