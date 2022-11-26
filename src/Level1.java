import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Level1 extends JFrame {
    public Level1(){
        //title
        super("Level1");
        setSize(300, 400);
        
        JPanel panel = new JPanel(new GridLayout(0, 3, 5, 5));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        
        
        for(int i=0; i<Main.V; i++)
        {
        	final int num = i;
        	ChoiceButton choice = new ChoiceButton(Main.rest[i].getName());
        	choice.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Main.setStart(num);
					System.out.println(Main.S);
					new Level2_1();
					dispose();
				}
			});
        	panel.add(choice);
        }
        
        JScrollPane choiceScroll = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        choiceScroll.getVerticalScrollBar().setUnitIncrement(20);
        
        add(choiceScroll);

        //화면 중앙에 띄우기
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);

        //JFrame이 정상적으로 종료되게 하는 코드
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        setVisible(true);
    }
    
    static class ChoiceButton extends JButton {
    	ChoiceButton(String text) {
    		super(text);
            setBackground(new Color(29,161,242));
            setFont(new Font("맑은 고딕", Font.BOLD, 12));
            setForeground(Color.WHITE);
            setSize(100, 100);
    	}
    }
}