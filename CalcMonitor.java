import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;

public class CalcMonitor extends JFrame {
	
	private JPanel contentPane;
	JTextField paymentField;
	JComboBox timesBox;
	JButton buttonCalc;
	JLabel outputAllPayment, outputPpm, outputCommission;
	
	/**
	 * Create the frame.
	 */
	public  CalcMonitor() {
		setTitle("分割手数料計算機forVISA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		//購入金額を入力、のテキストフィールド
		JLabel paymentLabel = new JLabel("購入金額を入力");
		paymentLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 17));
		paymentLabel.setBounds(25,10,114,39);
		contentPane.add(paymentLabel);
		
		//購入金額を入力、のテキストフィールド
		JLabel timesLabel = new JLabel("支払い回数を選択");
		timesLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 17));
		timesLabel.setBounds(12,49,127,39);
		contentPane.add(timesLabel);
		
		//購入金額の入力フィールド
		paymentField = new JTextField();
		paymentField.setBounds(151,15,141,27);
		contentPane.add(paymentField);
		
		//支払回数選択ボックス
		String[] times = {"3", "5", "6", "10", "12", "15", "18", "20", "24"};
		timesBox = new JComboBox(times);
		timesBox.setBounds(151, 53, 44, 27);
		contentPane.add(timesBox);
		
		
		//計算ボタン
		buttonCalc = new JButton("\u8A08\u7B97\u3059\u308B");
		buttonCalc.setFont(new Font("MS UI Gothic", Font.PLAIN, 18));
		buttonCalc.setBounds(50, 183, 189, 46);
		buttonCalc.addActionListener(new EventHandler(this));
		contentPane.add(buttonCalc);
		
		JLabel allPaymentLabel = new JLabel("\u7DCF\u652F\u6255\u984D");
		allPaymentLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 17));
		allPaymentLabel.setBounds(71, 95, 68, 24);
		contentPane.add(allPaymentLabel);
		
		JLabel label = new JLabel("\u624B\u6570\u6599");
		label.setFont(new Font("MS UI Gothic", Font.PLAIN, 17));
		label.setBounds(87, 125, 52, 27);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u6708\u3005\u306E\u652F\u6255");
		label_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 17));
		label_1.setBounds(59, 155, 80, 27);
		contentPane.add(label_1);
		
		outputAllPayment = new JLabel("0");
		outputAllPayment.setFont(new Font("MS UI Gothic", Font.PLAIN, 17));
		outputAllPayment.setBounds(145, 95, 80, 27);
		contentPane.add(outputAllPayment);
		
		outputCommission = new JLabel("0");
		outputCommission.setFont(new Font("MS UI Gothic", Font.PLAIN, 17));
		outputCommission.setBounds(145, 125, 80, 27);
		contentPane.add(outputCommission);
		
		outputPpm = new JLabel("0");
		outputPpm.setFont(new Font("MS UI Gothic", Font.PLAIN, 17));
		outputPpm.setBounds(145, 155, 80, 27);
		contentPane.add(outputPpm);
		
		
	}
	
	public int getPay(){
		return Integer.parseInt(paymentField.getText());
	}
	
	public int getTimes(){
		return Integer.parseInt((String)timesBox.getSelectedItem());
	}
	
}
