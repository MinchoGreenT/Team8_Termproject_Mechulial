import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result extends JFrame {
    Result(){
        //타이틀
        super("Result");
        
        for(int i=1; i<=5; i++)
        {
        	System.out.println(Main.getFrequency(i));
        }

        //화면 구성
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        
        //처음으로
        JButton toStart = new JButton("처음으로");
        toStart.setBounds(577, 337, 117, 29);
        jPanel.add(toStart);
        
        JButton quit = new JButton("종료");
        quit.setBounds(577, 307, 117, 29);
        jPanel.add(quit);
        
       toStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Start();
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