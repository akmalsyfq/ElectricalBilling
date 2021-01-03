package javaapplication20;

import java.util.ArrayList;
import java.io.*;


public class UserDataList {
	
	public void add(UserMethod list) throws IOException{
		File fileName = new File("list.txt");
		FileWriter fw = new FileWriter(fileName , true);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(list.getBilDate());
		pw.println(list.getAccNumber());
		pw.println(list.getTax());
		pw.println(list.getUserName());
		pw.println(list.getUserAddress());
		pw.println(list.getArrears());
		pw.println(list.getNoMeter());
		pw.println(list.getFirstReading());
		pw.println(list.getLastReading());
		pw.println(list.getTotalUsage());
		pw.println(list.getCharge());
		pw.println(list.getTotalBil());
		
		pw.close();
		fw.close();
	}//end add
	
	public ArrayList <UserMethod> display() throws FileNotFoundException , IOException , NumberFormatException{
		
		ArrayList<UserMethod> list = new ArrayList<>();
		UserMethod user1;
		
		File fileName = new File("list.txt");
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line != null) {
			
			int billDate = Integer.parseInt(line);
			int accNumber = Integer.parseInt(br.readLine());
			double tax = Double.parseDouble(br.readLine());
			String userName = br.readLine();
			String userAddress = br.readLine();
			double arrears = Double.parseDouble(br.readLine());
			double noMeter = Double.parseDouble(br.readLine());
			double firstReading = Double.parseDouble(br.readLine());
			double lastReading = Double.parseDouble(br.readLine());
			double totalUnit = Double.parseDouble(br.readLine());
			double charge = Double.parseDouble(br.readLine());
			double totalPayment = Double.parseDouble(br.readLine());
		
			
			user1 = new UserMethod(billDate , accNumber , tax , userName , userAddress , arrears , noMeter , firstReading , lastReading , totalUnit , charge , totalPayment);
			//user2 = new UserMethod(totalUnit , charge , totalPayment);
			
			list.add(user1);
			//line = br.readLine();
			
		}
		br.close();
		fr.close();	
		return list;
	}//end display
	
	public UserMethod search(int num) throws IOException{
		UserMethod user = null;
		ArrayList<UserMethod> userList = readAllRecord();
		
		
		for(int i = 0; i < userList.size(); i++) {
			if(num == userList.get(i).getAccNumber()) {
				user = userList.get(i);
				//System.out.print("Record found");
			}
		}
		
		return user;
	}//end search
	
	public  UserMethod binarySearch(ArrayList<UserMethod> test , int first , int last , int number) throws IOException{
		UserMethod user = null;
		ArrayList<UserMethod> userList = readAllRecord();

		
		if(last >= first) {
			int mid  = (first + last) / 2;
			for(int i = 0; i < userList.size(); i++) {
			if(number == test.get(mid).getAccNumber()) {
				user = userList.get(i);
				return user;
			}	
			else if (number < test.get(mid).getAccNumber())
				binarySearch(test , first , mid - 1 , number);
			
			else
				binarySearch(test , mid + 1 , last - 1 , number);
			}
		}
		return user;
	}//end binary search
	
	public void edit(ArrayList<UserMethod> list) throws IOException{
		File fileName = new File("list.txt");
		FileWriter fw = new FileWriter(fileName);
		PrintWriter pw = new PrintWriter(fw);
		
		for(int i = 0; i < list.size(); i++) {
			pw.println(list.get(i).getBilDate());
			pw.println(list.get(i).getAccNumber());
			pw.println(list.get(i).getTax());
			pw.println(list.get(i).getUserName());
			pw.println(list.get(i).getUserAddress());
			pw.println(list.get(i).getArrears());
			pw.println(list.get(i).getNoMeter());
			pw.println(list.get(i).getFirstReading());
			pw.println(list.get(i).getLastReading());
			pw.println(list.get(i).getTotalUsage());
			pw.println(list.get(i).getCharge());
			pw.println(list.get(i).getTotalBil());
		}
		pw.close();
		fw.close();	
	}//end edit
	
	public ArrayList <UserMethod>  readAllRecord() throws FileNotFoundException, IOException {
        ArrayList <UserMethod> list = new ArrayList<>();
        UserMethod user1;
        
        File fileName = new File("list.txt");
        FileReader fr = new FileReader(fileName);
        BufferedReader br =  new BufferedReader(fr);
        
        String line = br.readLine();
        while (line != null)
        {
        	int billDate = Integer.parseInt(line);
			int accNumber = Integer.parseInt(br.readLine());
			double tax = Double.parseDouble(br.readLine());
			String userName = br.readLine();
			String userAddress = br.readLine();
			double arrears = Double.parseDouble(br.readLine());
			double noMeter = Double.parseDouble(br.readLine());
			double firstReading = Double.parseDouble(br.readLine());
			double lastReading = Double.parseDouble(br.readLine());
			double totalUnit = Double.parseDouble(br.readLine());
			double charge = Double.parseDouble(br.readLine());
			double totalPayment = Double.parseDouble(br.readLine());
            
            user1 = new UserMethod(billDate , accNumber , tax , userName , userAddress , arrears , noMeter , firstReading , lastReading , totalUnit , charge , totalPayment);
            //user2 = new UserMethod(totalUnit , charge , totalPayment);
			
            
            list.add(user1);
            //list.add(user2);
            line = br.readLine();
        } 
        br.close();
        fr.close();
        return list;
    } // readAllRecordFromFile
	
}//end class