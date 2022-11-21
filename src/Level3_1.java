import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level3_1 extends JFrame {
    Level3_1(int totalEgg, int favoriteFood, int favoriteType){
        //타이틀
        super("Level3.1");

        //화면 구성
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
                int[] ranking = new int[5];
                ranking[0] = 0;
                new Level3_2(totalEgg, favoriteFood, favoriteType, ranking);
                setVisible(false);
            }
        });

        JButton buttonJapan = new JButton("일식");
        buttonJapan.setBounds(154, 128, 123, 116);
        jPanel.add(buttonJapan);

        buttonJapan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int[] ranking = new int[5];
                ranking[0] = 1;
                new Level3_2(totalEgg, favoriteFood, favoriteType, ranking);
                setVisible(false);
            }
        });

        JButton buttonChina = new JButton("중식");
        buttonChina.setBounds(289, 128, 123, 116);
        jPanel.add(buttonChina);

        buttonChina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int[] ranking = new int[5];
                ranking[0] = 2;
                new Level3_2(totalEgg, favoriteFood, favoriteType, ranking);
                setVisible(false);
            }
        });

        JButton buttonWestern = new JButton("양식");
        buttonWestern.setBounds(424, 128, 123, 116);
        jPanel.add(buttonWestern);

        buttonWestern.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int[] ranking = new int[5];
                ranking[0] = 3;
                new Level3_2(totalEgg, favoriteFood, favoriteType, ranking);
                setVisible(false);
            }
        });

        JButton buttonSnack = new JButton("분식");
        buttonSnack.setBounds(559, 128, 123, 116);
        jPanel.add(buttonSnack);

        buttonSnack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int[] ranking = new int[5];
                ranking[0] = 4;
                new Level3_2(totalEgg, favoriteFood, favoriteType, ranking);
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