
public class Specific extends Offer {
	int dis;
	public void set_offer(int o) {
		dis=o;
	}
	
	 public  String offer_name() {
		 return "Specific";
	 }

	@Override
	public int getoffer() {
		return dis;
	}



}
