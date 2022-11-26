import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class Level1 extends JFrame {
    public Level1() {
        //title
        super("Level1");
        setSize(700, 400);
        
        JPanel panel = new JPanel(new GridLayout(4, 6, 5, 5));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        
        String[] startName = new String[24];
        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
    				new File("C:/Users/dldms/eclipse-workspace/Cloud/src/textdata/start_list.txt")), "UTF-8"));
            
            // 식당 정보 입력
            for(int i=0; i<24; i++)
            {
            	startName[i] = br.readLine();
            	
            	final int num = i;
            	ChoiceButton choice = new ChoiceButton(startName[i]);
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
        }
        catch (IOException e) {}
        add(panel);

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
    		setBackground(Color.WHITE);
            setFont(new Font("맑은 고딕", Font.BOLD, 20));
            setBorder(new LineBorder(Color.BLACK, 3));
    	}
    }
}