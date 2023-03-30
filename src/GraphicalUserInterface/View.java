package GraphicalUserInterface;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class View extends JFrame{
	
	private JTextField resultField = new JTextField();
	private JTextField secondPolynom = new JTextField();
	private JTextField firstPolynom = new JTextField();
	private JButton addButton = new JButton();
	private JButton minusButton = new JButton();
	private JButton multiplicationButton = new JButton();
	private JButton divisionButton = new JButton();
	private JButton derivateButton = new JButton();
	private JButton integrationButton = new JButton();
	
	
	public View() {
		
	ImageIcon division = new ImageIcon("division.png");
	ImageIcon integrationImage = new ImageIcon("integration.png");
	ImageIcon additionImage = new ImageIcon("addition.png");
	ImageIcon substractionImage = new ImageIcon("substraction.png");
	ImageIcon multiplicationImage = new ImageIcon("mult.png");
	ImageIcon derivationImage = new ImageIcon("derivation.png");
	
	Border border = BorderFactory.createLineBorder(Color.black,5);
	
	JPanel upPanel = new JPanel();
	upPanel.setBackground(Color.WHITE);
	upPanel.setBounds(0, 0, 350, 130);
	((FlowLayout)upPanel.getLayout()).setHgap(10);
	upPanel.setBorder(border);
	
	//resultField
	JLabel resultLabel = new JLabel("  result       ");
	resultField.setPreferredSize(new Dimension(200, 30));
	
	//secondPolynom
	JLabel secondPolLabel = new JLabel("Polynom 2:");
	secondPolynom.setPreferredSize(new Dimension(200, 30));
	
	//firstPolynom
	JLabel firstPolLabel = new JLabel("Polynom 1:");
	firstPolynom.setPreferredSize(new Dimension(200, 30));
	
	upPanel.add(resultLabel);
	upPanel.add(resultField);
	upPanel.add(firstPolLabel);
	upPanel.add(firstPolynom);
	upPanel.add(secondPolLabel);
	upPanel.add(secondPolynom);
	
	JPanel downPanel = new JPanel();
	//addButton
	addButton.setPreferredSize(new Dimension(50, 50));
	addButton.setIcon(additionImage);
	
	//minusButton
	minusButton.setPreferredSize(new Dimension(50, 50));
	minusButton.setIcon(substractionImage);
	
	//multiplicationButton
	multiplicationButton.setPreferredSize(new Dimension(50, 50));
	multiplicationButton.setIcon(multiplicationImage);
	
	//divisionButton
	divisionButton.setPreferredSize(new Dimension(50, 50));
	divisionButton.setIcon(division);
	
	//derivateButton
	derivateButton.setPreferredSize(new Dimension(50, 50));
	derivateButton.setIcon(derivationImage);
	
	//integrationButton
	integrationButton.setPreferredSize(new Dimension(50, 50));
	integrationButton.setIcon(integrationImage);
	
	downPanel.setBounds(80, 130, 200, 200);
	
	downPanel.add(addButton);
	((FlowLayout)downPanel.getLayout()).setHgap(30);
	((FlowLayout)downPanel.getLayout()).setVgap(10);
	downPanel.add(minusButton);
	downPanel.add(multiplicationButton);
	downPanel.add(divisionButton);
	downPanel.add(derivateButton);
	downPanel.add(integrationButton);
	
	JPanel design = new JPanel();
	design.setBounds(0, 0, 350, 400);
	design.setBackground(Color.DARK_GRAY);
	design.setBorder(border);
	
	this.add(upPanel);
	this.add(downPanel);
	this.add(design);
	this.setTitle("Calculator");
	this.setLayout(null);
	this.setSize(364, 400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setVisible(true);
	
	ImageIcon image = new ImageIcon("logo.jpg");
	this.setIconImage(image.getImage());
	}
	
	public String getFirstPol() {
		return firstPolynom.getText();
	}
	
	public String getSecondPol() {
		return secondPolynom.getText();
	}
	
	public void addListener(ActionListener add) {
		addButton.addActionListener(add);
	}
	
	public void subListener(ActionListener sub) {
		minusButton.addActionListener(sub);
	}
	
	public void setResult(String result) {
		resultField.setText(result);
	}
	
}

