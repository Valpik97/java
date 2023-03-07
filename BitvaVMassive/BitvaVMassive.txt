import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import java.awt.Color;


public class MainFrame extends JFrame {

	private JPanel contentPane;
	
	static double [] array;
	private JTextField Winners;
	private JTextField Massiv;
	
	static double InputNumber(String caption) {
		boolean isError;
		double number = 0;
		String captionOriginal = caption;
		
		do {
			String stringNumber = JOptionPane.showInputDialog(null, 
					caption, "Ввод данных", 
					JOptionPane.INFORMATION_MESSAGE);
			
			isError = false;
			try {
				number = Double.valueOf(stringNumber);
			} catch (NumberFormatException e) {
				caption = captionOriginal + "\nНеверный ввод. Введи еще раз.";
				isError = true;
			} catch (NullPointerException e){
				caption = captionOriginal + "\nТы ничего не ввел";
				isError = true;
			}
			
		} while(isError);
		
		return number;
	}
	
	public void mathStat() {
		int odds = 0;
		int evens = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				evens++;
			}
			else {
				odds++;
			}
		}
		
		String ArrayText = "";
		for(int i = 0; i < array.length; i++) {
			if(i != array.length - 1) {
				ArrayText += i + ", ";
			}
			else {
				ArrayText += i;
			}
		}
		Massiv.setText(ArrayText);
			
		
		String resultText = "Чётные победили!";
		Color color = Color.green;
		if (odds > evens) {
		    resultText = "Нечётные победили!";
		    color = Color.green;
		}
		else if(odds == evens) {
			resultText = "Ничья!";
		    color = Color.blue;
		}
		Winners.setText(resultText);
		Winners.setForeground(color);
	}

	
	public static void main(String[] args) {
		setDefaultFont(new Font("Tahoma", Font.PLAIN, 11));
		
		int count = (int)InputNumber("Введите кол-во чисел: ");
		array = new double[count];
		for (int i = 1; i <= count; i++) {
			array[i-1] = InputNumber("Введите " + i + " число: ");
		}
		
		
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
	
	public static void setDefaultFont (Font font) {
		FontUIResource f = new FontUIResource(font.getFontName(),
		                                      font.getStyle(),
		                                      font.getSize());
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
		        Object key = keys.nextElement();
		        Object value = UIManager.get (key);
		        if (value != null && value instanceof FontUIResource)
		            UIManager.put (key, f);
		}
	}

	
	public MainFrame() {
		setResizable(false);
		setAlwaysOnTop(true);
		setTitle("Массив");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 400, 538, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html><span style=\"font-size:18px\">Массив:</span><html>");
		lblNewLabel.setBounds(32, 33, 93, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html><p><span style=\"font-size:18px\">Победители:</span></p><html>");
		lblNewLabel_1.setBounds(32, 95, 141, 37);
		contentPane.add(lblNewLabel_1);
		
		Winners = new JTextField();
		Winners.setEditable(false);
		Winners.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Winners.setBounds(182, 95, 235, 37);
		contentPane.add(Winners);
		Winners.setColumns(10);
		
		Massiv = new JTextField();
		Massiv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Massiv.setEditable(false);
		Massiv.setBounds(135, 27, 341, 37);
		contentPane.add(Massiv);
		Massiv.setColumns(10);
		
		mathStat();
		
	}
}













