import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level2_1 extends JFrame {
    Level2_1(int totalEgg){
        //타이틀
        super("Level2.1");
        JPanel jPanel = new JPanel();

        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);

        JButton buttonKorea = new JButton("한식");
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

        JButton buttonJapan = new JButton("일식");
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

        JButton buttonChina = new JButton("중식");
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

        JButton buttonWestern = new JButton("양식");
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

        JButton buttonSnack = new JButton("분식");
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

        //화면 중앙에 띄우기
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); 
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}