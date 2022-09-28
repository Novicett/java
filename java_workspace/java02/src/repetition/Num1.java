package repetition;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Num1 {

	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("k-pop 인기 투표");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(108, 10, 244, 72);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.아이유-라일락");
		lblNewLabel_1.setBounds(290, 92, 128, 23);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2.프로미스나인-we go");
		lblNewLabel_1_1.setBounds(290, 212, 128, 23);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("3.스테이지 - ASAP");
		lblNewLabel_1_1_1.setBounds(290, 332, 128, 23);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton b1 = new JButton("New button");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		b1.setBounds(36, 125, 157, 77);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("New button");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b2.setBounds(36, 245, 157, 77);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("New button");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b3.setBounds(36, 365, 157, 77);
		f.getContentPane().add(b3);
		
		JTextArea t1 = new JTextArea();
		t1.setBounds(290, 125, 133, 77);
		f.getContentPane().add(t1);
		
		JTextArea t2 = new JTextArea();
		t2.setBounds(290, 245, 133, 77);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setBounds(290, 365, 133, 77);
		f.getContentPane().add(t3);
		f.setVisible(true);
		
		
	}
}
