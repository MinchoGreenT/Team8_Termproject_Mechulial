import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result extends JFrame {
    Result(int totalEgg, int favoriteFood, int favoriteType, int ranking[]){
        //Ÿ��Ʋ
        super("Result");

        //ȭ�� ����
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        
        //ó������
        JButton toStart = new JButton("ó������");
        toStart.setBounds(577, 337, 117, 29);
        jPanel.add(toStart);
        
        JButton quit = new JButton("����");
        quit.setBounds(577, 307, 117, 29);
        jPanel.add(quit);
        
       toStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Start();
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