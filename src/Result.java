import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Component extends JFrame {
	void makeResult(JPanel jpanel, int rank) {
		JPanel panel_1 = new JPanel();
	    jpanel.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("사진");
	    btnNewButton_1.setBounds(0, 6, 75, 60);
	    panel_1.add(btnNewButton_1);
	   
	    String name;
	    String description;
	    String link;
	    //String name = Main.rest[rank].getName();
	   // String description = Main.rest[rank]
	    //String link = Main.rest[rank]
	    
	    JLabel content = new JLabel("\"<html>\" + name + \"<br>@\" + description + \"<br>@\" + link + \"<html>\"");
	    content.setBounds(75, 65, 500, -60);
	    panel_1.add(content);
	}
}

public class Result extends JFrame {
    Result(){
        //타이틀
        super("Result");
	    Component component = new Component();

        //화면 구성
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        
        //처음으로
        JButton toStart = new JButton("처음으로");
        toStart.setBounds(577, 337, 117, 29);
        jPanel.add(toStart);
        
        toStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Start();
                setVisible(false);
            }
        });
        
        JButton quit = new JButton("종료");
        quit.setBounds(577, 307, 117, 29);
        jPanel.add(quit);
        
        JPanel result = new JPanel();
	    result.setBounds(0, 6, 581, 360);
	    jPanel.add(result);
	    result.setLayout(new GridLayout(5, 1));
	    
	   for(int i = 0; i < Main.getOutputNum(); i++)
		   component.makeResult(result, i);
	 
        //화면 중앙에 띄우기
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}