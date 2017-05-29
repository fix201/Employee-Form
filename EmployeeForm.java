package program4;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class EmployeeForm extends JFrame
{
	public EmployeeForm(String title, String[] labels, int[] no_of_columns)
	{
		//Title of the file
		super(title);
		
		//Create the menu bar and components
		JMenuBar jmb = new JMenuBar();		
		//Add Top Level  menus
	    JMenu jmFile = new JMenu("File");	    
	    //Add sub levels to File
	    jmFile.add(new JMenuItem("New"));
	    jmFile.add(new JMenuItem("Save"));
	    jmFile.add(new JMenuItem("Exit"));
	    //Add submenus to JMenuBar
	    jmb.add(jmFile);
	    jmb.add(new JMenu("Edit"));
	    jmb.add(new JMenu("Search"));
	    //Set the Menu Bar
	    this.setJMenuBar(jmb);
	    
	    //Sets a layout for the labels
	    JPanel layout = new JPanel(new GridLayout(labels.length,2));
	    
	    for(int i = 0; i < labels.length; i++)
	    {
	    	//Creates panels for the text field and labels
	    	JPanel jlPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	    	JPanel jtfPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		    		 
	    	//Creates new Label and textfields
		    jlPanel.add(new JLabel(labels[i]));
		    jtfPanel.add(new JTextField(no_of_columns[i]));	    	
		    
		    //Adds the panels to the layout
	    	layout.add(jlPanel);
	    	layout.add(jtfPanel);
	    }
	    
	    JPanel another = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    	   
	    //Create JButton - Submit
	    another.add(new JButton("Submit"));
	    //Create JButton - Get
	    another.add(new JButton("Get"));
	    
	    JPanel last = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    last.add(layout);
	    last.add(another);
	    this.add(last);
	    	    
	    //Set a default close action
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	       
	    //Makes visible
	    this.setSize(500, 300);
	    setVisible(true);
	}
	
	public static void main(String[] args)
	{
		int[] no_of_columns = new int[]{7,20,20,10,20,20};
		String[] labels = {"ID","Last Name","First Name","Phone", "Department Name", "Job Title"};

		EmployeeForm employeeform = new EmployeeForm("Employee Form", labels, no_of_columns);
	}

}
