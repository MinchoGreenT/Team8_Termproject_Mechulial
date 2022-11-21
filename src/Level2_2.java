import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level2_2 extends JFrame {
    Level2_2(int totalEgg, int favoriteFood){
        //title
        super("Level2.2");

        //È­¸é ±¸¼º
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        
        //¹ä
        JButton buttonRice = new JButton("¹ä");
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
        
        //»§
        JButton buttonBread = new JButton("»§");
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
        
        //¸é
        JButton buttonNoodle = new JButton("¸é");
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

        //È­¸é Áß¾Ó¿¡ ¶ç¿ì±â
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}