import java.util.Map;

public class Wallet extends Payment_behaviour{
	Long ID;
	
	  public String get_name() {
		  return "Wallet";
	  }

	
	Long get_id() {
		return ID;
	}
	
	Wallet(Long id){
		ID= id;
	}
	
	public void pay(Map<Long,Integer>mp,int price) {
		
		if(mp.get(ID)!=null) {
		int p=mp.get(ID);
		if(price<=p) {
			//System.out.print("y"+p);
			mp.put((long) ID,p-price);
			System.out.print("your money is : ");
			System.out.println (mp.get(ID));


		}
		else {
			System.out.print("Not enough money in your wallet");
		}
	}


	
}
}
	
		
		
	
	

