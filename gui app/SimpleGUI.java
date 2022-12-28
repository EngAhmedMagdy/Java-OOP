import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  
public class SimpleGUI {  
JFrame f;  
SimpleGUI(){
f=new JFrame("check if number is even or odd");//creating instance of JFrame        
JLabel prompt = new JLabel("Enter a number");
JTextField input = new JTextField();
JButton checkBtn = new JButton("check");
JTextArea result = new JTextArea("");

Font font = new Font ("Times New Roman", Font.PLAIN, 20);
prompt.setFont(font);
input.setFont(font);
checkBtn.setFont(font);
result.setFont(font);

prompt.setBounds(0,0,150,50);  
input.setBounds(150, 0, 150, 50);
checkBtn.setBounds(0, 100, 150, 50);
result.setBounds(150, 100, 150, 50);

f.add(prompt);
f.add(input);
f.add(checkBtn);
f.add(result);

f.setLayout(null);//using no layout managers
f.setVisible(true);//making the frame visible
f.setBounds(10,10, 500, 250);

checkBtn.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		int num = Integer.parseInt(input.getText());
		if(num%2 == 0) {
			result.setText("Even");
		}
		else {
			result.setText("Odd");
		}
	}});
	
}

public static void main(String[] args) {  
	 new SimpleGUI();  
	}  
}  