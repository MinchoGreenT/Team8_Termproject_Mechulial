import javax.swing.*;

import com.sun.tools.javac.Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ImagePanel extends JPanel{
	private Image img;

	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

public class Level1 extends JFrame {
	
    Level1(int totalEgg){
        //title
        super("Level1");
        
        //화면 구성
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);

        //level2로 가는 버튼 추가
        JButton buttonToLevel2 = new JButton("Level2");
        buttonToLevel2.setBounds(533, 326, 161, 40);
        jPanel.add(buttonToLevel2);
        
        //JFrame backMap = new JFrame();
        //backMap.setBounds(6, 0, 526, 366);
        //backMap.setLocationRelativeTo(null);
        //backMap.setVisible(true);
        //Panel.add(backMap);
        
        
        //ImagePanel panel = new ImagePanel (new ImageIcon("/image/level1_map.jpg").getImage());
        //backMap.add(panel);
        //backMap.pack();
        
        //JPanel backList = new JPanel();
        //backList.setBounds(531, 0, 169, 328);
        //jPanel.add(backList);
                //backList.setLayout(null);
        
                //List 추가
                JList list = new JList();
                list.setBounds(6, 327, 157, -322);
                //backList.add(list);

        buttonToLevel2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Level2_1(totalEgg);
                setVisible(false);
            }
        });

        //화면 중앙에 띄우기
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);

        //JFrame이 정상적으로 종료되게 하는 코드
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        setVisible(true);
    }
}