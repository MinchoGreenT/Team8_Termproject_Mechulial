import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class Component extends JFrame {
	void makeResult(JPanel jpanel, int rank) {
		JPanel panel_1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    
	    JButton btnNewButton_1 = new JButton("사진");
	    panel_1.add(btnNewButton_1);
	    
	    JLabel content = new JLabel("<html>" + Main.rest[rank].getName() + 
	    		"<br>@" + Main.rest[rank].getMain() + 
	    		"<br>@" + Main.rest[rank].getLink() + "<html>");
	    panel_1.add(content);
 
	    jpanel.add(panel_1);
	}
}

public class Result extends JFrame {
	
    Result(){
        //���씠��
        super("Result");
	    Component component = new Component();

	    Main.dijkstra(Main.S);

		try {
			Main.setResult();
		}
		catch(IOException e) {
			System.out.println("Errororroror");
		}
	    
        //�솕硫� 援ъ꽦
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        
        //泥섏쓬�쑝濡�
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
        
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        
        JPanel result = new JPanel();
	    result.setBounds(0, 6, 581, 360);
	    jPanel.add(result);
	    result.setLayout(new GridLayout(5, 1));
	    
	   for(int i = 0; i < Main.getOutputNum(); i++)
		   component.makeResult(result, i);
	 
        //�솕硫� 以묒븰�뿉 �쓣�슦湲�
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}