package crudapplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Customer> c=new ArrayList<Customer>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner (System.in);
        Scanner s2 = new Scanner (System.in);
        Scanner s3 = new Scanner (System.in);
		int ch;
		do { 
			System.out.println("1. CREATE");
			System.out.println("2. READ");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("5. ENTER YOUR CHOICE");
			ch = s.nextInt();  
			
			switch(ch) {
			case 1:
				System.out.print("Enter CustomerID:");
				int customerid = s.nextInt();
				System.out.print("Enter Customername:");
				String customername = s1.nextLine();
				System.out.print("Enter Customeremail:");
				String customeremail = s2.nextLine();
				System.out.print("Enter password:");
				String password = s3.nextLine();
				c.add(new Customer(customerid, customername, customeremail, password));
				break; 
			case 2:
				System.out.println("----------");
				Iterator<Customer> i = c.iterator();
				while (i.hasNext()) {
				Customer e = i.next();
				System.out.println(e);
			}
			System.out.println("----------");
			break;
			
		case 3:
			boolean found = false;
			System.out.print("Enter customerID to search");
			int Customerid = s.nextInt();
			System.out.println("----------");
			 i = c.iterator();
			while (i.hasNext()) { 
			Customer e = i.next();
			if (e.getCustomerID()== customerid)
			System.out.println(e);
			found = true;
		}
			}
		if (!found) {
			System.out.println("Record not found");
		}
		System.out.println("----------"); 
		break;
	    
			
		
 
	}while (ch!=0);
}
	}
