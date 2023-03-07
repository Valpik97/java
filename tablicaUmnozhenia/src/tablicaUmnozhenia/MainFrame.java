package tablicaUmnozhenia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
	static int [][] table_int;

	private JPanel contentPane;
	private JLabel outputLabel;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void mathResult() {
		table_int = new int[10][10];
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				table_int[i][j] = i * j;
			}
		}
		
		String Table_text = "<html>";
	    for (int i = 1; i < 10; i++){
	    	for(int j = 1; j < 10; j++) {
	    		String fcolor = "black";
	    		if (i == 1 || j == 1) {
	    			fcolor = "red";
	    		}
	    		else if(table_int[i][j] % 10 == 0) {
	    			fcolor = "blue";
	    		}
	    		if(i * j < 10) {
	    			Table_text += "<span style=\"font-size:20px\"><font color=\""+fcolor+"\"> " + table_int[i][j] +" </font><span>&nbsp&nbsp";
	    		}
	    		else {
	    			Table_text += "<font color=\""+fcolor+"\"> " + table_int[i][j] +"</font>&nbsp";
	    		}
	    	}
	    	Table_text += "<br>";
	    }
	    Table_text += "</html>";
	    outputLabel.setText(Table_text);

	}

	public MainFrame() {
		setResizable(false);
		setAlwaysOnTop(true);
		setTitle("Таблица умножения");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 400, 389, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		outputLabel = new JLabel("");
		outputLabel.setBounds(0, 0, 373, 337);
		contentPane.add(outputLabel);
		mathResult();
	}

}
