import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;


public class CurrencyConverters extends JFrame implements ActionListener {
	JTextField PKR,USD,GBP; 
	JLabel pkr,usd,gbp;
	JButton btn1,btn2;
	JLabel Pak,US,BritP;

	public CurrencyConverters() {
		setLayout(new GridLayout(4,2,15,15));
		setSize(300,300);
		setTitle("CURRENCY CONVERTER");
		PKR = new JTextField(" ");
		USD = new JTextField(" ");
		GBP = new JTextField(" ");
		
		pkr = new JLabel("Pakistani Rupee");
		add(pkr);
		add (PKR);
		
		usd = new JLabel("US Dollar");
		add(usd);
		add (USD);
		
		gbp = new JLabel("British Pound");
		add(gbp);
		add (GBP);
		
		btn1 = new JButton("Convert");
		add(btn1);
		btn2 = new JButton("Clear");
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new CurrencyConverters();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		 double pkr = Double.parseDouble(PKR.getText());
	double usdValue = pkr / 280;
	double gbpValue = pkr / 350;
		
	USD.setText(String.format("%.2f",usdValue));
	GBP.setText(String.format("%.2f",gbpValue));
	
	if (e.getSource() == btn2 ) {
		PKR.setText(String.valueOf(" "));
		USD.setText(String.valueOf(" "));
		GBP.setText(String.valueOf(" "));
		
	}
	
	
	
	}

}
