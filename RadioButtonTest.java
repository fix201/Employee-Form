//Olufisayo Joseph Ayodele

package program4;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class RadioButtonTest extends JFrame
{
	private String[] names = {"Bird","Pig","Cat","Dog","Rabbit"};
	private String[] labels = {"Label 0", "Label 1", "Label 2"};
	private String[] buttons = { "Button 0","Button 1", "Button 2"};	   
	private int[] lengths = {14,14,14};
	  
	private JCheckBox[] checkBox = new JCheckBox[5];
	private JRadioButton[] radioButtons = new JRadioButton[5];
	private JButton[] jButtons = new JButton[3];
	private JLabel[] jLabel = new JLabel[4]; 
	private JTextField[] textFields = new JTextField[3];
	
	public JCheckBox getCheckBoxAt(int index)
	{
		return checkBox[index];
	}
	public JRadioButton getRadioButtonAt(int index)
	{
		return radioButtons[index];
	}
	public JButton getButtonAt(int index)
	{
		return jButtons[index];
	}	
	public JLabel getLabelAt(int index)
	{
		return jLabel[index];
	}
	public JLabel getImage()
	{
		return jLabel[3];
	}
	public JTextField getTextAt(int index)
	{
		return textFields[index];
	}
	
	public RadioButtonTest(String str)
	{
	   //Create a JPanel and add the Image and the Label
	   JPanel images = new JPanel();
	   JLabel picture = new JLabel(new ImageIcon("program4/" + names[0] + ".gif", names[0]));
	   JLabel jlabel = new JLabel(names[0]);
	   jLabel[3] = picture;
	   images.add(picture);
	   images.add(jlabel);
	   
	   //Create GridLayout to hold the Radio Buttons
	   JPanel radioButtonPanel = new JPanel(new GridLayout(5, 1));
		    
	   //Create a JRadioButton for the pictures
	   ButtonGroup bg = new ButtonGroup();
	   
	   for (int i = 0; i < names.length; i++)
	   {
	      //Create JRadioButton
	      JRadioButton jrb = new JRadioButton(names[i]);
	      radioButtons[i] = jrb;
	      radioButtonPanel.add(jrb);
	      bg.add(jrb);
	   }
	   
	   JPanel outer = new JPanel();
	   outer.add(images);
	   outer.add(radioButtonPanel);
	   
	   //Adds JPanel for the CheckBoxes
	   JPanel checkBoxPanel = new JPanel(new GridLayout(5, 1));
	   
	   for (int i = 0; i < names.length; i++)
	   {
	      //Create JCheckBox within current Loop and add to checkBoxPanel
	      JCheckBox jcb = new JCheckBox(names[i]);
	      checkBox[i] = jcb;
	      checkBoxPanel.add(jcb);
	   }
	   
	   //Add these JPanel to outer
	   outer.add(checkBoxPanel);
	   
	   
	   //Add Form to the South
	   JPanel form = new JPanel(new GridLayout(labels.length,3));
	 
	    //Add in Button 0 - 2
	   for (int i = 0; i < labels.length; i++)
	   {
	      JLabel label = new JLabel(labels[i],SwingConstants.RIGHT);
	      jLabel[i] = label;
	      JButton button = new JButton(buttons[i]);
	      jButtons[i] = button;	      
	      button.setPreferredSize(new Dimension (10,4));
	      
	      JTextField jtf = new JTextField(lengths[i]);
	      jtf.setText("TextField");
	      textFields[i] = jtf;
	      JPanel tpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	      	      
	      tpanel.add(jtf);
	      form.add(label);
	      form.add(button);
	      form.add(tpanel);	      
	   }
	   
	    JPanel outer1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	   
	    outer1.add(form);  	    
	    this.setTitle(str);
	  
	    this.add(outer1,BorderLayout.CENTER);
	    this.add(outer,BorderLayout.NORTH);	    
	    
	    //Makes Visible
	    this.setVisible(true);
	    this.pack();
 }
  
	public static void main(String[] args)
	{
		RadioButtonTest radiobuttontest = new RadioButtonTest("Radio Button Test");
	}
}