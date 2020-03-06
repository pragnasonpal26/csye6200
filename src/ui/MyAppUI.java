package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.java.dev.designgridlayout.DesignGridLayout;

public class MyAppUI implements ActionListener {

	private Logger log=Logger.getLogger(MyAppUI.class.getName());
	private JFrame frame=null;
	
	public JPanel mainPanel=null;
	private JPanel drawPanel=null;
	private JButton startBtn=null;
	private JButton stopBtn=null;
	
	private JTextField nameTF=new JTextField();  //A name input field
	private JTextField idTF=new JTextField();  //A id input field
	
	//Constructor
	public MyAppUI() {
		log.info("App Started");
		initGUI();
	}
	//Initialize the GUI
	private void initGUI()
	{
		frame=new JFrame();
		frame.setTitle("MyAPPUI");
		frame.setSize(400,300);  //Set the size to something reasonable
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //If we press the close button,exit
		
		frame.setLayout(new BorderLayout());
		frame.add(getMainPanel(),BorderLayout.NORTH);   //Buttons on top
		frame.add(getDrawPanel(), BorderLayout.CENTER);  //Drawing in the center
		frame.setVisible(true);
	}
	//Create a panel used for drawing
	private JPanel getDrawPanel()
	{
		drawPanel=new MyPanel();
		return drawPanel;
	}
	//Create a panel that contains control buttons
	private JPanel getMainPanel()
	{
	mainPanel= new JPanel();
	DesignGridLayout playout=new DesignGridLayout(mainPanel);
	//mainPanel.setLayout(new FlowLayout());   //Flow from left to right
	startBtn=new JButton("start");
	stopBtn=new JButton("stop");
	//startBtn.addActionListener(this);
	
	startBtn.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			System.out.println("Do start operation-Anonymous");
			drawPanel.repaint();  //Ask for a panel redraw -let the UI thread do it!
		}
	});
	
	stopBtn.addActionListener(this);
	
	//mainPanel.add(startBtn);
	//mainPanel.add(stopBtn);
	
	nameTF.setText("Pragna");
	
	playout.row().grid(new JLabel ("Name")).add(nameTF);
	playout.row().grid(new JLabel ("ID")).add(idTF);
	playout.emptyRow();
	playout.row().center().add(startBtn,stopBtn);
	
	mainPanel.setBackground(Color.GRAY);
	return mainPanel;
	}
	public static void main(String[] args)
	{
		
		MyAppUI myApp =new MyAppUI();
		System.out.println("MyAppUI is exiting");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		log.info("We receive an ActionEvent" + arg0);
		if(arg0.getSource()== startBtn)
			System.out.println("DO start operation");
		if(arg0.getSource()==stopBtn)
			System.out.println("DO stop operation");
	}
}
