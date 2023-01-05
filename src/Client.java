import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class Client extends User{


	static int ID=0;
	
	 Client() {
		ID++;
	}
	 int get_id() {
		 return ID;
	 }
	 
	@Override
	public boolean login(String email, String password, Map<String, String> mp) {
		// TODO Auto-generated method stub
		boolean b=false;
		 for (Entry<String, String> entry : mp.entrySet()) {
			
			 if(entry.getKey().equals(email)&&entry.getValue().equals(password)) {
				 


				 b=true;
				 break;
			 }
		 }
		 
		 if(b==true) {
			 System.out.println("Welcome");

			 return true;

		  }
		 else {
			 System.out.println("Not exist");
			 return false;

		 }
		
		
	}
	public void sign_up(String email, String password, Map<String, String> mp) {
		mp.put(email,password);
		
	}
	public boolean search_service(ArrayList<Service>ss,String s)
	{	
		for(int i=0;i<ss.size();i++) {
			if(ss.get(i).name==s) {
				return true;
			}
			
		}
		return false;
		

	
}
public void request_refund (Map<Integer,Integer>mp,int refund_val) {
		
		int p=mp.get(ID);
		mp.put(ID,p+refund_val);
	}


}