import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField Array;
	private JTextField Sum;
	private JTextField Avg;
	private JTextField Max;
	private JTextField Min;
	
	static double [] arr;
	
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
		double sum = 0;
		String arrS = "";
		double min = arr[0];
		double max = arr[0];
		for (double a : arr) {
		    arrS += a + " ";
		    sum += a;
		    if (a < min) min = a;
		    if (a > max) max = a;
		 
		}
		Array.setText(arrS);
		Sum.setText(String.valueOf(sum));
		Max.setText(String.valueOf(max));
		Min.setText(String.valueOf(min));
		Avg.setText(String.valueOf(sum/arr.length));
		
		Array.setCaretPosition(0);
		Sum.setCaretPosition(0);
		Max.setCaretPosition(0);
		Min.setCaretPosition(0);
		Avg.setCaretPosition(0);
	}

	
	public static void main(String[] args) {
		setDefaultFont(new Font("Tahoma", Font.PLAIN, 11));
		
		int count = (int)InputNumber("Введите кол-во чисел: ");
		arr = new double[count];
		for (int i = 1; i <= count; i++) {
			arr[i-1] = InputNumber("Введите " + i + " число: ");
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
		setBounds(100, 100, 450, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Массив:");
		lblNewLabel.setBounds(30, 28, 46, 14);
		contentPane.add(lblNewLabel);
		
		Array = new JTextField();
		Array.setBounds(109, 25, 285, 20);
		contentPane.add(Array);
		Array.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(30, 53, 364, 143);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Сумма");
		lblNewLabel_1.setBounds(24, 27, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ср. ар.");
		lblNewLabel_2.setBounds(34, 87, 36, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Max");
		lblNewLabel_3.setBounds(211, 27, 27, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Min");
		lblNewLabel_4.setBounds(211, 87, 27, 14);
		panel.add(lblNewLabel_4);
		
		Sum = new JTextField();
		Sum.setBounds(80, 24, 86, 20);
		panel.add(Sum);
		Sum.setColumns(10);
		
		Avg = new JTextField();
		Avg.setBounds(80, 84, 86, 20);
		panel.add(Avg);
		Avg.setColumns(10);
		
		Max = new JTextField();
		Max.setBounds(248, 24, 86, 20);
		panel.add(Max);
		Max.setColumns(10);
		
		Min = new JTextField();
		Min.setBounds(248, 84, 86, 20);
		panel.add(Min);
		Min.setColumns(10);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{Array, Max, Sum, Avg, Min, contentPane, 
				lblNewLabel, panel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4}));
		
		mathStat();
		
	}
}
