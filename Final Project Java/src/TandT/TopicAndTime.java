package TandT;
import javax.swing.*;
import All.New;
import java.awt.*;
import java.awt.event.*;
public class TopicAndTime  extends JPanel implements ActionListener {
	
	
	JFrame frame = new JFrame("DrawingChallenge");
	JPanel PframeTp = new JPanel();
	JPanel PframeBt = new JPanel();
	JPanel Button = new JPanel();
	private JLabel tp = new JLabel ("Topic : ");
	public JTextField Topictf = new JTextField(30);
	JTextField Time = new JTextField(" Min ",50);
	JButton oneBt = new JButton("1");
	JButton twoBt = new JButton("2");
	JButton threeBt = new JButton("3");
	JButton fourBt = new JButton("4");
	JButton fiveBt = new JButton("5");
	JButton sixBt = new JButton("6");
	JButton sevenBt = new JButton("7");
	JButton eightBt = new JButton("8");
	JButton nineBt = new JButton("9");
	JButton zeroBt = new JButton("0");
	JButton startBt = new JButton("start");
	JButton resetBt = new JButton("reset");
	public static String topic2;
	public static String time_str = "";
	protected String ms = " Minute ";
	
	
	
	public TopicAndTime(){
		
		Button.setLayout(new GridLayout(4,3));
		Button.add(oneBt);
		Button.add(twoBt);
		Button.add(threeBt);
		Button.add(fourBt);
		Button.add(fiveBt);
		Button.add(sixBt);
		Button.add(sevenBt);
		Button.add(eightBt);
		Button.add(nineBt);
		Button.add(startBt);
		Button.add(zeroBt);
		Button.add(resetBt);
		
		
		PframeTp.setLayout(new FlowLayout());
		PframeTp.add(tp);
		PframeTp.add(Topictf);
		
		
		PframeBt.setLayout(new BorderLayout());
		PframeBt.add(Time, BorderLayout.CENTER);
		PframeBt.add(Button, BorderLayout.EAST);
		
		
		frame.setLayout(new GridLayout(3,1));
		frame.add(PframeTp);
		frame.add(new nhom());
		frame.add(PframeBt);
		
		frame.setSize(800,500);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		oneBt.addActionListener(this);
		twoBt.addActionListener(this);
		threeBt.addActionListener(this);
		fourBt.addActionListener(this);
		fiveBt.addActionListener(this);
		sixBt.addActionListener(this);
		sevenBt.addActionListener(this);
		eightBt.addActionListener(this);
		nineBt.addActionListener(this);
		zeroBt.addActionListener(this);
		startBt.addActionListener(this);
		resetBt.addActionListener(this);
		Topictf.addActionListener(this);
		
	
		
	}

	
	class nhom extends JPanel{
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.orange);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.black);
		g.setFont(new Font("Avenir",Font.BOLD,65));
		g.drawString(ms, 50, 100);
		
		
}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//Start code
		if(e.getSource() == startBt) {
			TopicAndTime run = new All.New();
			
			New.tp.setText("Topic: "+Topictf.getText());
			frame.dispose();
		}
		
		
		//Number code
		if(e.getSource() == oneBt) {
			time_str += oneBt.getText();
			Time.setText(time_str);
			
		}
		
		if(e.getSource() == twoBt) {
			time_str += twoBt.getText();
			Time.setText(time_str);
			
		}
		
		if(e.getSource() == threeBt) {
			time_str += threeBt.getText();
			Time.setText(time_str);
		}
		
		if(e.getSource() == fourBt) {
			time_str += fourBt.getText();
			Time.setText(time_str);
		}
		
		if(e.getSource() == fiveBt) {
			time_str += fiveBt.getText();
			Time.setText(time_str);
		}
			
		if(e.getSource() == sixBt) {
			time_str += sixBt.getText();
			Time.setText(time_str);
		}
		
		if(e.getSource() == sevenBt) {
			time_str += sevenBt.getText();
			Time.setText(time_str);
		}
		
		if(e.getSource() == eightBt) {
			time_str += eightBt.getText();
			Time.setText(time_str);
		}
		
		if(e.getSource() == nineBt) {
			time_str += nineBt.getText();
			Time.setText(time_str);
		}
		
		if(e.getSource() == zeroBt) {
			time_str += zeroBt.getText();
			Time.setText(time_str);
		}
		
		if(e.getSource() == resetBt) {
			Time.setText("");
			time_str="";
		}

}
	
	
		
		
	}
	

	

