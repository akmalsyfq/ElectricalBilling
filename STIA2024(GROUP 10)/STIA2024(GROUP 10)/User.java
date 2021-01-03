package javaapplication20;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class User extends JFrame implements ActionListener , KeyListener{

	private JFrame frame , frameHelp;
	
	private JTextField bilDateTf;
	private JTextField accNumTf;
	private JTextField taxTf;
	private JTextField userNameTf;
	private JTextField userAddressTf;
	private JTextField arrearsTf;
	private JTextField noMeterTf;
	private JTextField firstReadingTf;
	private JTextField lastReadingTf;
	
	private JTextArea txInfo;
	
	private JTable tblDisplay;
	
	private DefaultTableModel tblModel;
	
	public static void main(String[] args) {
		try {
			User window = new User();
			window.frame.setVisible(true);
		}catch(Exception e1) {
			System.out.print(e1.getMessage());
		}
	}


	public User() {
		initialize();
	}

	private void initialize() {
		UserMethod user;
		//Main frame
		frame = new JFrame();
		frame.setFont(new Font("Calibri", Font.BOLD, 12));
		frame.setTitle("ELECTRICITY BILLING SYSTEM");
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setForeground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(50, 30, 1411, 853);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
			
		
		//Help frame
		frameHelp = new JFrame();
		frameHelp.getContentPane();
		frameHelp.setBounds(0, 100, 1500, 500);
		frameHelp.setVisible(false);
		frameHelp.getContentPane().setLayout(null);
		
		//Label
		JLabel billDateLabel = new JLabel("Bill date");
		billDateLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		billDateLabel.setForeground(Color.BLACK);
		billDateLabel.setBackground(Color.BLACK);
		billDateLabel.setBounds(54, 36, 109, 39);
		frame.getContentPane().add(billDateLabel);

		JLabel accountNumberLabel = new JLabel("Account number");
		accountNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		accountNumberLabel.setForeground(Color.BLACK);
		accountNumberLabel.setBounds(54, 98, 166, 21);
		frame.getContentPane().add(accountNumberLabel);

		JLabel taxLabel = new JLabel("No. Tax Invoice");
		taxLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		taxLabel.setForeground(Color.BLACK);
		taxLabel.setBounds(54, 150, 183, 21);
		frame.getContentPane().add(taxLabel);

		JLabel userNameLabel = new JLabel("User name");
		userNameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		userNameLabel.setForeground(Color.BLACK);
		userNameLabel.setBounds(54, 211, 134, 21);
		frame.getContentPane().add(userNameLabel);

		JLabel addressLabel = new JLabel("User Address");
		addressLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		addressLabel.setForeground(Color.BLACK);
		addressLabel.setBounds(54, 274, 151, 21);
		frame.getContentPane().add(addressLabel);

		JLabel arrearsLabel = new JLabel("Arrears");
		arrearsLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		arrearsLabel.setForeground(Color.BLACK);
		arrearsLabel.setBounds(54, 330, 120, 25);
		frame.getContentPane().add(arrearsLabel);

		JLabel noMeterLabel = new JLabel("No. meter");
		noMeterLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		noMeterLabel.setForeground(Color.BLACK);
		noMeterLabel.setBounds(54, 399, 120, 21);
		frame.getContentPane().add(noMeterLabel);

		JLabel firstReadingLabel = new JLabel("First meter reading");
		firstReadingLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		firstReadingLabel.setForeground(Color.BLACK);
		firstReadingLabel.setBounds(54, 449, 197, 43);
		frame.getContentPane().add(firstReadingLabel);
		
		JLabel lastReadingLabel = new JLabel("Last meter reading");
		lastReadingLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lastReadingLabel.setBounds(54, 521, 197, 39);
		frame.getContentPane().add(lastReadingLabel);
		
		//Text field
		bilDateTf = new JTextField();
		bilDateTf.setBounds(263, 47, 438, 25);;
		bilDateTf.setColumns(10);
		bilDateTf.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(bilDateTf);
		
		accNumTf = new JTextField();
		accNumTf.setColumns(10);
		accNumTf.setBounds(263, 100, 438, 25);
		accNumTf.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(accNumTf);
		
		taxTf = new JTextField();
		taxTf.setColumns(10);
		taxTf.setBounds(263, 152, 438, 25);
		taxTf.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(taxTf);
		
		userNameTf = new JTextField();
		userNameTf.setColumns(10);
		userNameTf.setBounds(263, 213, 438, 25);
		userNameTf.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(userNameTf);
		
		userAddressTf = new JTextField();
		userAddressTf.setColumns(10);
		userAddressTf.setBounds(263, 276, 438, 25);
		userAddressTf.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(userAddressTf);
		
		arrearsTf = new JTextField();
		arrearsTf.setColumns(10);
		arrearsTf.setBounds(261, 334, 438, 25);
		arrearsTf.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(arrearsTf);
		
		noMeterTf = new JTextField();
		noMeterTf.setColumns(10);
		noMeterTf.setBounds(261, 395, 438, 25);
		noMeterTf.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(noMeterTf);
		
		firstReadingTf = new JTextField();
		firstReadingTf.setColumns(10);
		firstReadingTf.setBounds(261, 459, 438, 25);
		firstReadingTf.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(firstReadingTf);
		
		lastReadingTf = new JTextField();
		lastReadingTf.setColumns(10);
		lastReadingTf.setBounds(263, 529, 438, 25);
		lastReadingTf.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lastReadingTf);
		
		
		//button
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMethod user;
				UserDataList userList = new UserDataList();
				
				int bilDate = Integer.parseInt(bilDateTf.getText());
				int accNumber = Integer.parseInt(accNumTf.getText());
				double tax = Double.parseDouble(taxTf.getText());
				String name = userNameTf.getText();
				String address = userAddressTf.getText();
				double arrears = Double.parseDouble(arrearsTf.getText());
				double noMeter = Double.parseDouble(noMeterTf.getText());
				double firstReading = Double.parseDouble(firstReadingTf.getText());
				double lastReading = Double.parseDouble(lastReadingTf.getText());
				double totalUnits = lastReading - firstReading;
				double charge = 0;
				double payment = 0;
				if(totalUnits > 0 && totalUnits < 200){
			         charge = 0.218;
			         charge *= totalUnits;
			         payment = arrears + charge;
			      }
			         else if(totalUnits > 200 && totalUnits < 300){ 
			        	 charge = 0.334;
			        	 charge *= totalUnits;
			        	 payment = arrears + charge;
			         }
			            else if(totalUnits > 300 && totalUnits < 600){
			            	
			            	charge = 0.516;
			            	charge *= totalUnits;
			            	payment = arrears + charge;
			            }
			               else if(totalUnits > 600 && totalUnits < 900){
			            	   
			            	   charge = 0.546;
			            	   charge *= totalUnits;
			            	   payment = arrears + charge;
			               }
			                  else if(totalUnits > 900){    
			                	  charge = 0.571;
			                	  charge *= totalUnits;
			                	  payment = arrears + charge;
			                  }
				
				user = new UserMethod(bilDate , accNumber , tax , name , address , arrears , noMeter , firstReading , lastReading , totalUnits , charge , payment);
				
			    try {
					userList.add(user);
				} catch (IOException e1) {
					System.out.print(e1.getMessage());
				}
				
				JOptionPane.showMessageDialog(null, "Add successfully");
			}
		});
		addButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		addButton.setBounds(849, 611, 107, 39);
		frame.getContentPane().add(addButton);
		
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMethod record = null;
				UserDataList user = new UserDataList();
				ArrayList<UserMethod> list = new ArrayList<UserMethod>();
				
				int accNum = Integer.parseInt(accNumTf.getText());
			
				try {
					record = user.search(accNum);
					
				} catch (IOException e1) {
					System.out.print(e1.getMessage());
				}
				if(record != null) {
					set(record);
				}
				else
					JOptionPane.showMessageDialog(null, "The record of " + accNum + " is not found");
					
			}//end action listener
		});
		searchButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		searchButton.setBounds(991, 611, 107, 39);
		frame.getContentPane().add(searchButton);

		tblDisplay = new JTable();
		tblDisplay.setLocation(0, 0);
		tblDisplay.setFont(new Font("Tahoma", Font.BOLD, 15));
		tblDisplay.setSize(1500, 500);
		tblDisplay.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null},
		
			},
			new String[] {
				"Date", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		
		JButton displayButton = new JButton("Display");
		displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameHelp.setVisible(true);
				frameHelp.setBounds(20, 100, 1500, 500);
				
				
				tblDisplay.setVisible(true);
				frameHelp.getContentPane().add(tblDisplay);

				
				tblModel = (DefaultTableModel) tblDisplay.getModel(); 
		        tblModel.setRowCount(0);
		        
		        String[] data = {
		    			"Date", "Account number", "Tax", "User name", "User address", "Arrears", "No.meter", "First meter reading", "Last meter reading", "Total units use", "Current charge", "Total bill payment"
		    			};
		        tblModel.addRow(data); 
				
				
				ArrayList<UserMethod> user;
				UserDataList userDataList = new UserDataList();
					try {

						user = userDataList.readAllRecord();
						
						for(int i = 0; i < user.size(); i++) {
							String billDate = String.valueOf(user.get(i).getBilDate());
							String accNumber = String.valueOf(user.get(i).getAccNumber());
							String tax = String.valueOf(user.get(i).getTax());
							String userName = user.get(i).getUserName();
							String userAddress = user.get(i).getUserAddress();
							String arrears = String.valueOf(user.get(i).getArrears());
							String noMeter = String.valueOf(user.get(i).getNoMeter());
							String firstReading = String.valueOf(user.get(i).getFirstReading());
							String lastReading = String.valueOf(user.get(i).getLastReading());
							String totalUsage = String.valueOf(user.get(i).getTotalUsage());
							String charge = String.valueOf(user.get(i).getCharge());
							String totalBill = String.valueOf(user.get(i).getTotalBil());
					        String[]date = new String[] {billDate , accNumber , tax , userName , userAddress , arrears , noMeter , firstReading , lastReading , totalUsage , charge , totalBill};
					        
					        tblModel.addRow(date);
							
							
						}
					} catch (NumberFormatException e1) {
						System.out.print(e1.getMessage());
					} catch (FileNotFoundException e1) {
						System.out.print(e1.getMessage());
					} catch (IOException e1) {
						System.out.print(e1.getMessage());					
					}
				
			}
		});
		displayButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		displayButton.setBounds(1129, 611, 107, 39);
		frame.getContentPane().add(displayButton);
		
		JButton editButton = new JButton("Edit");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				UserMethod user;
				UserDataList userList = new UserDataList();
				
				int bilDate = Integer.parseInt(bilDateTf.getText());
				int accNumber = Integer.parseInt(accNumTf.getText());
				double tax = Double.parseDouble(taxTf.getText());
				String name = userNameTf.getText();
				String address = userAddressTf.getText();
				double arrears = Double.parseDouble(arrearsTf.getText());
				double noMeter = Double.parseDouble(noMeterTf.getText());
				double firstReading = Double.parseDouble(firstReadingTf.getText());
				double lastReading = Double.parseDouble(lastReadingTf.getText());
				double totalUnits = lastReading - firstReading;
				double charge = 0;
				if(totalUnits > 0 && totalUnits < 200){
			         charge = 0.218;
			         charge *= totalUnits;
			      }
			         else if(totalUnits > 200 && totalUnits < 300){ 
			        	 charge = 0.334;
			        	 charge *= totalUnits;
			         }
			            else if(totalUnits > 300 && totalUnits < 600){
			            	
			            	charge = 0.516;
			            	charge *= totalUnits;
			            }
			               else if(totalUnits > 600 && totalUnits < 900){
			            	   
			            	   charge = 0.546;
			            	   charge *= totalUnits;
			               }
			                  else if(totalUnits > 900){    
			                	  charge = 0.571;
			                	  charge *= totalUnits;
			                  }
				double payment = arrears + charge;
				
				
				user = new UserMethod(bilDate , accNumber , tax , name , address ,  arrears , noMeter , firstReading , lastReading , totalUnits , charge , payment);
				
				ArrayList<UserMethod> list = new ArrayList<>();
				
				try {
					list = userList.readAllRecord();
				} catch (IOException e1) {
					System.out.print(e1.getMessage());
				}
				for(int i = 0; i < list.size(); i++) {
					if(accNumber == list.get(i).getAccNumber())
						list.set(i, user);
					
				}
				
				try {
					userList.edit(list);
					
				} catch (IOException e1) {
					
					System.out.print(e1.getMessage());
				}
				JOptionPane.showMessageDialog(null, "Edit successfully");
				
			}
		});
		editButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		editButton.setBounds(849, 676, 107, 39);
		frame.getContentPane().add(editButton);

		JButton deleteButton = new JButton("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDataList userList = new UserDataList();
				ArrayList<UserMethod> user = new ArrayList<>();
				UserMethod users = null;
				
				int accNum = Integer.parseInt(accNumTf.getText());
				
				try {
					user = userList.readAllRecord();
					for(int i = 0; i < user.size(); i++) {
						if(accNum == user.get(i).getAccNumber()) {
							users = user.get(i);
							user.remove(i);
							userList.edit(user);
							JOptionPane.showMessageDialog(null, "The record of " + users.getAccNumber() + " has been deleted successfully");
						}
					}
					if(users == null)
						JOptionPane.showMessageDialog(null, "The record of " + accNum + " is not found");
				} catch (IOException e1) {
					
				}
			
				
			}
		});
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		deleteButton.setBounds(1270, 611, 107, 39);
		frame.getContentPane().add(deleteButton);
		
		
		JButton resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilDateTf.setText("");
				accNumTf.setText("");
				taxTf.setText("");
				userNameTf.setText("");
				userAddressTf.setText("");
				arrearsTf.setText("");
				noMeterTf.setText("");
				firstReadingTf.setText("");
				lastReadingTf.setText("");
				txInfo.setText("");
				tblModel.setRowCount(0);
			}
		});
		resetButton.setBounds(991, 676, 107, 39);
		frame.getContentPane().add(resetButton);

		JButton exitButton = new JButton("Exit");
		exitButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		exitButton.setBounds(1129, 676, 107, 39);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(exitButton);

		
		JButton helpBtn = new JButton("Help");
		helpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txInfo.setText("\t\t\t\tUSER GUIDE");
				txInfo.append("\n\nUse of Button\n");
				txInfo.append("\nAdd button       - add the data \n");
				txInfo.append("\nSearch button  - User need to search by the account number\n");
				txInfo.append("\nDisplay button - Display the data that user added \n");
				txInfo.append("\nDelete button  - Before delete , user need to write the account \n\t\t number to delete data\n");
				txInfo.append("\nEdit button      - Before edit , user need to write the account \n\t\t number to search data. After user edit the data , user\n\t\t need to add the data\n");
				txInfo.append("\nReset button   - reset all the \n");
				txInfo.append("\nExit button      - Close and exit the program\n");
				
			}
		});
		helpBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		helpBtn.setBounds(1270, 676, 107, 39);
		frame.getContentPane().add(helpBtn);
		
		
		txInfo = new JTextArea();
		txInfo.setTabSize(4);
		txInfo.setBounds(777, 41, 700, 550);
		txInfo.setFont(new Font("Tahoma", Font.BOLD, 20));
		//txInfo.setLineWrap(true);
		txInfo.setEditable(false);
		frame.getContentPane().add(txInfo);
		
	}// end method
	


	public void set(UserMethod record) {
		int bilDate = record.getBilDate();
		int accNum = record.getAccNumber();
		double tax = record.getTax();
		String userName = record.getUserName();
		String userAddress = record.getUserAddress();
		double arrears = record.getArrears();
		double noMeter = record.getNoMeter();
		double firstReading = record.getFirstReading();
		double lastReading = record.getLastReading();
		double totalUse = record.getTotalUsage();
		double charge = record.getCharge();
		double payment = record.getTotalBil();
		
		bilDateTf.setText(String.valueOf(bilDate));
		accNumTf.setText(String.valueOf(accNum));
		taxTf.setText(String.valueOf(tax));
		userNameTf.setText(userName);
		userAddressTf.setText(userAddress);
		arrearsTf.setText(String.valueOf(arrears));
		noMeterTf.setText(String.valueOf(noMeter));
		firstReadingTf.setText(String.valueOf(firstReading));
		lastReadingTf.setText(String.valueOf(lastReading));
		txInfo.setText("Record is found");
	}//end set
	
	@Override
	public void keyTyped(KeyEvent e) {}


	@Override
	public void keyPressed(KeyEvent e) {}


	@Override
	public void keyReleased(KeyEvent e) {}


	@Override
	public void actionPerformed(ActionEvent e) {}
}// end class
