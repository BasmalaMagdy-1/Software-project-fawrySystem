import java.util.Map;
import java.util.Scanner;

public class Mobile_recharge extends Service{
	Long id;
	public  void setid(Long id) {
		this.id=id;
	}

	public Long getid() {
		return id;
	}
	Mobile_recharge(){
		super.name="Mobile_recharge";
	}
	public String  get_name() {
		return "Mobile_recharge";
	}
	public void show_options()
	{
		System.out.println("Enter 1 for WE");
		System.out.println("Enter 2 for Etisalat");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Vodafone");
	}
	
	public Payment_behaviour rechageProccess(Service_provider p) {
		Service s =new Mobile_recharge();
		 Scanner I2 = new Scanner(System.in);
		 System.out.println("Enter your Phone Number ");
		 String phone=I2.nextLine();
		 System.out.println("Enter Value to recharge");
		 int value=I2.nextInt();
		 
		  p.setv(value);
		 
		 int r = p.receipt(s);
		 System.out.println("Your Bill is "+r);
		 
		System.out.println("Enter 1 for Wallet");
		System.out.println("Enter 2 for CreditCard");
		System.out.println("Enter any number for default");

		Scanner I3 = new Scanner(System.in);
		int n=I3.nextInt();	
		if(n==1) {
			 pay_behave = new Wallet(id);
			 
			 
			 pay_behave.set_r(r);
			 
		}else if(n==2) {
			System.out.println("Enter Your CreditCard Number[ Enter 1]");
			Scanner I4 = new Scanner(System.in);
			Long card_num=I4.nextLong();
			pay_behave = new Credit_card(card_num,card_num);
			pay_behave.set_r(r);

		}
		else {
			System.out.println("you havnot select payment way so the default is credit card");

			 pay_behave = new Credit_card(id,id);
			 pay_behave.set_r(r);

		}
		return pay_behave;
		
	}
	
	Payment_behaviour create(int type) {
		 Service_provider p = null;
		 Payment_behaviour pp=null;
		 
		 
		 if(type==1) {
			 p=new We();
			
			pp= rechageProccess( p);
			 
		 }
		 else if(type==2) {
			 p=new Etisalat();
			pp= rechageProccess( p);
			 
		 }
		 else if(type==3) {
			 p=new Orange();
			pp= rechageProccess( p);
		 }
		 else if(type==4) {
			 p=new Vodafone();
			pp= rechageProccess( p);
		 }
		 pp.set_provider(p);

		return pp ;
	 }
	 
	 

	 
	 
	
}
