
public class Quarter extends Service_provider{


	String phone;
	public void setp(String p) {
		phone =p;
	
	}
	Quarter(){
	System.out.print("You are now on the system Quarter ");
	}
	public String get_name() {
		return "Quarter";
	}
	@Override
	public int receipt(Service s) {
		// TODO Auto-generated method stub
		
		return  250;
	
	}
	public float offer_percent(){
		Offer obj=new Specific();
		((Specific)obj).set_offer(25);
		return obj.getoffer();
	}

	

}
