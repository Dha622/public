//p9Frame.java
//David Anderson
//April 8, 2013
//Takes the an order of a drink and as 
//many meals or desserts as you choose. 


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class p9Frame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	JLabel drinkLabel;
	JLabel freeLabel;
	JLabel foodLabel;
	JLabel dessertLabel;
	JLabel paymentLabel;
	
	JTextField totalText;	
	
	JButton totalButton;
	JButton newOrderButton;
	JButton submitButton;
	
	ButtonGroup radioGroup;
	JRadioButton waterRadio;
	JRadioButton cokeRadio;
	JRadioButton dCokeRadio;
	JRadioButton teaRadio;
	JRadioButton noneRadio;
		
	JCheckBox burgerNFriesBox;
	JCheckBox chickenBox;
	JCheckBox pizzaBox;
	JCheckBox spaghettiBox;
	JCheckBox tunaBox;
	JCheckBox grilledCheeseBox;
	JCheckBox pieBox;
	JCheckBox iceCreamBox;

	JComboBox paymentCombo;	
	
	String paymentArray[] = {"cash", "credit", "debit"};
	String status = "Your order: ";
	
	public p9Frame() {
		super();
		
		this.setTitle("David Anderson - Food Order");

		drinkLabel = new JLabel("|  Drinks - $1.25: ");	
		freeLabel = new JLabel("|  No charge: ");
		foodLabel = new JLabel("|  Meals: ");
		dessertLabel = new JLabel("|  Desserts: ");
		paymentLabel = new JLabel("Payment type:");
		
		totalText = new JTextField(5);
		
		totalButton = new JButton("Total");
		newOrderButton = new JButton("New Order");
		submitButton = new JButton("Submit");
					
		waterRadio = new JRadioButton("Water", false);
		cokeRadio = new JRadioButton("Coke", false);
		dCokeRadio = new JRadioButton("Diet Coke", false);	
		teaRadio = new JRadioButton("Iced Tea", false);	
		noneRadio = new JRadioButton("No Drink", true);	
		
		radioGroup = new ButtonGroup();
		radioGroup.add( waterRadio );
		radioGroup.add( cokeRadio );
		radioGroup.add( dCokeRadio );
		radioGroup.add( teaRadio );
		radioGroup.add( noneRadio );
		
		burgerNFriesBox = new JCheckBox("Hamburger w/ fries - $7.00", false);
		chickenBox = new JCheckBox("Fried Chicken - $7.75", false);
		pizzaBox = new JCheckBox("Pizza - $8.75", false);
		spaghettiBox = new JCheckBox("Spaghetti - $8.50", false);
		tunaBox = new JCheckBox("Tuna Sandwich - $4.50", false);
		grilledCheeseBox = new JCheckBox("Grilled Cheese - $5.25", false);
		pieBox = new JCheckBox("Apple Pie - $5.00", false);
		iceCreamBox = new JCheckBox("Ice Cream - $4.50", false);
		
		paymentCombo = new JComboBox( paymentArray );
		
		ButtonHandler bh = new ButtonHandler();
		totalButton.addActionListener(bh);
		newOrderButton.addActionListener(bh);
		submitButton.addActionListener(bh);

		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(drinkLabel);
		this.add(cokeRadio);
		this.add(dCokeRadio);
		this.add(teaRadio);
		this.add(freeLabel);
		this.add(waterRadio);
		this.add(noneRadio);
		this.add(foodLabel);
		this.add(burgerNFriesBox);
		this.add(chickenBox);
		this.add(pizzaBox);
		this.add(spaghettiBox);
		this.add(tunaBox);
		this.add(grilledCheeseBox);
		this.add(dessertLabel);
		this.add(pieBox);
		this.add(iceCreamBox);
		this.add(paymentLabel);
		this.add(paymentCombo);
		this.add(totalText);
		this.add(totalButton);
		this.add(newOrderButton);
		this.add(submitButton);
		resetForm();
	}
	
	private class ButtonHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == totalButton)
			{
				updateTotal();
			}
			else if (e.getSource() == newOrderButton)
			{
				resetForm(); 
			}
			else if (e.getSource() == submitButton)
			{
				displaySelected();
			}

			
		}// actionPerformed

	} // ButtonHandler

	private void displaySelected() {

		if (waterRadio.isSelected())
			status += "Water, ";
		else
			if (cokeRadio.isSelected())
				status += "Coke, ";
			else
				if (dCokeRadio.isSelected())
					status += "Diet Coke, ";
				else
					if (teaRadio.isSelected())
						status += "Iced Tea, ";
					else
						status += "No Drink, ";
		
		if ( burgerNFriesBox.isSelected() )
		{
			status += "Burger w/ Fries, ";
		}
			
		if ( chickenBox.isSelected() )
		{
			status += "Fried Chicken, ";
		}
		
		if ( pizzaBox.isSelected() )
		{
			status += "Pizza, ";
		}
		
		if ( spaghettiBox.isSelected() )
		{
			status += "Spaghetti, ";
		}
		
		if (tunaBox.isSelected() )
		{
			status += "Tuna Sandwich, ";
		}
		
		if ( grilledCheeseBox.isSelected() )
		{
			status += "Grilled Cheese, ";
		}
		
		if ( pieBox.isSelected() )
		{
			status += "Apple Pie, ";
		}
		
		if ( iceCreamBox.isSelected() )
		{
			status += "Ice Cream, ";
		}
		
		status += "paid with " + paymentArray[paymentCombo.getSelectedIndex()] + "\n Total = " + totalText.getText();
		
		JOptionPane.showMessageDialog(null, status, "Your order", JOptionPane.INFORMATION_MESSAGE);
		
		submitButton.setVisible(false);
	}
	
	//calculate and display new total
	private void updateTotal()
	{
		//price is $1.25 unless "none" or water is selected
		double price = 1.25;
		
		if ( noneRadio.isSelected() )
			price = 0;
		
		if ( waterRadio.isSelected() )
			price = 0;
			
		if ( burgerNFriesBox.isSelected() )
		{
			price += 7.00;
		}
			
		if ( chickenBox.isSelected() )
		{
			price += 7.75;
		}
		
		if ( pizzaBox.isSelected() )
		{
			price += 8.75;
		}
		
		if ( spaghettiBox.isSelected() )
		{
			price += 8.50;
		}
		
		if (tunaBox.isSelected() )
		{
			price += 4.50;
		}
		
		if ( grilledCheeseBox.isSelected() )
		{
			price += 5.25;
		}
		
		if ( pieBox.isSelected() )
		{
			price += 5.00;
		}
		
		if ( iceCreamBox.isSelected() )
		{
			price += 4.50;
		}
		
		totalText.setText( String.format("$%.2f", price) );		
		
	}

	
	
	//reset GUI form selections and values
	private void resetForm()
	{
		noneRadio.setSelected(true);
		burgerNFriesBox.setSelected(false);
		chickenBox.setSelected(false);
		pizzaBox.setSelected(false);
		spaghettiBox.setSelected(false);
		tunaBox.setSelected(false);
		grilledCheeseBox.setSelected(false);
		pieBox.setSelected(false);
		iceCreamBox.setSelected(false);
		totalText.setText("$0.00");
		paymentCombo.setSelectedIndex(0);
		status = "Your order: ";
		submitButton.setVisible(true);
	}
	
}//class
