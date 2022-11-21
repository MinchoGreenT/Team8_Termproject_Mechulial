import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level3_5 extends JFrame {
    Level3_5(int totalEgg, int favoriteFood, int favoriteType, int ranking[]){
        //Ÿ��Ʋ
        super("Level3.5");

        //ȭ�� ����
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        
        JButton buttonKorea = new JButton("�ѽ�");
        buttonKorea.setBounds(19, 128, 123, 116);
        jPanel.add(buttonKorea);
        if(ranking[0] == 0 || ranking[1] == 0 || ranking [2] == 0 || ranking[3] == 0)
        	buttonKorea.setVisible(false);

        buttonKorea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 ranking[4] = 0;
                 new Result(totalEgg, favoriteFood, favoriteType, ranking);
                 setVisible(false);
            }
        });

        JButton buttonJapan = new JButton("�Ͻ�");
        buttonJapan.setBounds(154, 128, 123, 116);
        jPanel.add(buttonJapan);
        if(ranking[0] == 1 || ranking[1] == 1 || ranking [2] == 1 || ranking[3] == 1)
        	buttonJapan.setVisible(false);

        buttonJapan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ranking[4] = 1;
                new Result(totalEgg, favoriteFood, favoriteType, ranking);
                setVisible(false);
            }
        });

        JButton buttonChina = new JButton("�߽�");
        buttonChina.setBounds(289, 128, 123, 116);
        jPanel.add(buttonChina);
        if(ranking[0] == 2 || ranking[1] == 2 || ranking [2] == 2 || ranking[3] == 2)
        	buttonChina.setVisible(false);

        buttonChina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ranking[4] = 2;
                new Result(totalEgg, favoriteFood, favoriteType, ranking);
                setVisible(false);
            }
        });

        JButton buttonWestern = new JButton("���");
        buttonWestern.setBounds(424, 128, 123, 116);
        jPanel.add(buttonWestern);
        if(ranking[0] == 3 || ranking[1] == 3 || ranking [2] == 3 || ranking[3] == 3)
        	buttonWestern.setVisible(false);

        buttonWestern.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ranking[4] = 3;
                new Result(totalEgg, favoriteFood, favoriteType, ranking);
                setVisible(false);
            }
        });

        JButton buttonSnack = new JButton("�н�");
        buttonSnack.setBounds(559, 128, 123, 116);
        jPanel.add(buttonSnack);
        if(ranking[0] == 4 || ranking[1] == 4 || ranking [2] == 4 || ranking[3] == 4)
        	buttonSnack.setVisible(false);

        buttonSnack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ranking[4] = 4;
                new Result(totalEgg, favoriteFood, favoriteType, ranking);
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