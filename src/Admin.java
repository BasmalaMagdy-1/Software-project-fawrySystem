import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Admin extends User{


	@Override
	public boolean login(String email, String password, Map<String, String> mp) {
		// TODO Auto-generated method stub
		if(mp.get(email)!=null&&mp.get(email).equals(password)) {
			System.out.println("Welcome Admin");
			return true;
		}
		System.out.println("Access Denied");
			return false;
		
	}
	 Scanner INPUT = new Scanner(System.in);
	void AC_REJ(Map<Long,Integer>wallet,int value,Long id) {
		
   		System.out.println("User with id "+id +" want to refund : "+value);

	       		System.out.println("Enter 1 to accept");
	       		System.out.println("Enter 2 to reject");
	       		
	       		int decide=INPUT.nextInt();
	       		if(decide==1) {
	       			System.out.print("Done");
	       			int pp=wallet.get(id);
	       			wallet.put(id, pp+value);
	       			
	       		}
	       		else {
	       			System.out.print("Rejected");
	       		}
	       		
	     			
	}
	
}

