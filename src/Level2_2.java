import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level2_2 extends JFrame {
    Level2_2(int totalEgg, int favoriteFood){
        //title
        super("Level2.2");

        //ȭ�� ����
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        
        //��
        JButton buttonRice = new JButton("��");
        buttonRice.setBounds(162, 126, 117, 108);
        jPanel.add(buttonRice);
        
        buttonRice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int favoriteType = 0;
                new Level3_1(totalEgg, favoriteFood, favoriteType);
                setVisible(false);
            }
        });
        
        //��
        JButton buttonBread = new JButton("��");
        buttonBread.setBounds(291, 126, 117, 108);
        jPanel.add(buttonBread);
        
        buttonBread.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int favoriteType = 1;
                new Level3_1(totalEgg, favoriteFood, favoriteType);
                setVisible(false);
            }
        });
        
        //��
        JButton buttonNoodle = new JButton("��");
        buttonNoodle.setBounds(420, 126, 117, 108);
        jPanel.add(buttonNoodle);
        
        buttonNoodle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int favoriteType = 2;
                new Level3_1(totalEgg, favoriteFood, favoriteType);
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