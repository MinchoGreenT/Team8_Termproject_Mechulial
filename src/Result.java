import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class Component extends JFrame {
	
	void makeResult(JPanel jpanel, int rank) {
		JPanel panel_1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel_1.setBackground(new Color(0xFAE76C));
	    
	    JButton btnNewButton_1 = new JButton();
	    
	    Image egg = new ImageIcon(Start.class.getResource("/data/result_egg.png")).getImage();
	    Image newEgg = egg.getScaledInstance(50,50,Image.SCALE_SMOOTH);
	    
	    btnNewButton_1.setIcon(new ImageIcon(newEgg));
	    btnNewButton_1.setBorderPainted(false);
	    btnNewButton_1.setContentAreaFilled(false);
	    btnNewButton_1.setFocusPainted(false);
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
		    	try {
	                URI uri = new URI(Main.rest[rank].getLink());
	                Desktop.getDesktop().browse(uri);
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            } catch (URISyntaxException ex) {
	                ex.printStackTrace();
	            }
		    }
    	});
	    panel_1.add(btnNewButton_1);
	    
	    JLabel content = new JLabel("<html>이름 : " + Main.rest[rank].getName() + 
	    		"<br>메인 : " + Main.rest[rank].getMain() + 
	    		"<br>거리 : " + Main.dist[Main.rest[rank].getId()] + "m<html>");
	    content.setFont(new Font("맑은 고딕", Font.BOLD, 12));
	    panel_1.add(content);
 
	    jpanel.add(panel_1);
	}
}

public class Result extends JFrame {
	
    Result(){
        super("Result");
        Component component = new Component();

	    Main.dijkstra(Main.S);

		try {
			Main.setResult();
		}
		catch(IOException e) {
			System.out.println("Errororroror");
		}
	    
        JPanel jPanel = new JPanel();
        setSize(700, 400);
        getContentPane().add(jPanel);
        jPanel.setLayout(null);
        jPanel.setBackground(new Color(0xFAE76C));
        
        JButton toStart = new JButton("처음으로");
        toStart.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        toStart.setBorderPainted(false);
        toStart.setContentAreaFilled(false);
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
        quit.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        quit.setBorderPainted(false);
        quit.setContentAreaFilled(false);
        quit.setBounds(577, 307, 117, 29);
        jPanel.add(quit);
        
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        
        JPanel result = new JPanel();
        result.setBorder(BorderFactory.createEmptyBorder(10,10,40,10));
	    result.setBounds(0, 6, 581, 360);
	    jPanel.add(result);
	    result.setLayout(new GridLayout(5, 1));
	    result.setBackground(new Color(0xFAE76C));
	    
	   for(int i = 0; i < Main.getOutputNum(); i++)
		   component.makeResult(result, i);
	 
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}