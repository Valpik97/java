package pushka;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	private JPanel contentPane;
	private JLabel labelCoord;
	private JLabel labelCriteria;
	private JLabel labelResult;
	private JLabel labelLength;
	
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
		double[][] coord = {{4.2, 4.6}, {4, 5}, {5.1, 7.4}, {2.1, 4}, {4.7, 4.4},
		        {4.8, 4.8}, {4.3, 5.3}, {5, 5.4}, {6.5, 8}};
		int count = coord.length;
		double sumX = 0;
		double sumY = 0;
		for(int i = 0; i < count; i++) {
			sumY += coord[i][0];
			sumX += coord[i][1];
		}
		double cgX = sumX / count;
		double cgY = sumY / count;
		
		double lengthBad = 2;
		int countBad = 0;
		double length[] = new double [count];
		for (int i = 0; i < count; i++) {
		    length[i] = LengthLine(coord[i][0], coord[i][1], cgX, cgY);
		    if (length[i] > lengthBad) countBad += 1;
		}
		
		double result = ((double) countBad/count) * 100;
		labelCriteria.setText( String.valueOf(result) );
		
		String resultText = "Брак";
		Color color = Color.red;
		if (result <= 50) {
		    resultText = "Принято";
		    color = Color.green;
		}
		labelResult.setText(resultText);
		labelResult.setForeground(color);
		
		String textCoord = "<html>";
	    String textLength = "<html>";
	    for (int i = 0; i < count; i++){
	        String fcolor = "black";
	        if (length[i] > lengthBad) fcolor = "red";
	        textCoord += "<font color=\""+fcolor+"\"> (" + coord[i][0] +", " + coord[i][1] +") </font> <br>";
	        textLength += "<font color=\""+fcolor+"\"> " + length[i] + " </font> <br>";
	    }
	    textCoord += "</html>";
	    textLength += "</html>";
	    labelCoord.setText(textCoord);
	    labelLength.setText(textLength);

	}
	
	public double LengthLine(double x1, double y1, double x2, double y2) {
	    return Math.sqrt( Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2) );
	}


	public MainFrame() {
		setTitle("Оценка погрешности стрельбы");
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 400, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html><p><strong>Координаты<br />\r\nпробоин</strong></p>");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(10, 22, 97, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html><p><strong>Расстояния</strong></p>");
		lblNewLabel_1.setBounds(148, 22, 97, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html><p><strong>Критерии<br />\r\nотбраковки, %</strong></p>");
		lblNewLabel_2.setBounds(312, 22, 88, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<html><p><strong>Результат</strong></p>\r\n");
		lblNewLabel_3.setBounds(312, 110, 88, 22);
		contentPane.add(lblNewLabel_3);
		
		
		labelCoord = new JLabel("New label");
		labelCoord.setBounds(10, 70, 97, 180);
		contentPane.add(labelCoord);
		
		labelLength = new JLabel("New label");
		labelLength.setBounds(148, 70, 154, 180);
		contentPane.add(labelLength);
		
		labelCriteria = new JLabel("New label");
		labelCriteria.setBounds(312, 70, 88, 29);
		contentPane.add(labelCriteria);
		
		labelResult = new JLabel("New label");
		labelResult.setBounds(312, 143, 88, 22);
		contentPane.add(labelResult);
		mathResult();
		
	}
}
