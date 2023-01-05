import java.util.Scanner;

public class Landline extends Service{
	
	Long id;
	public  void setid(Long id) {
		this.id=id;
	};


	public Long getid() {
		return id;
	}
	
	Landline(){
		name="Landline";
	}
	public String get_name() {
		return "Landline";
	}
	
	public Payment_behaviour rechageProccess(Service_provider p) {
		Service s =new Mobile_recharge();
		 Scanner I20 = new Scanner(System.in);
		 System.out.println("Enter your Phone Number ");
		 String phone =I20.nextLine();	
	
		 
		 int r = p.receipt(s);
		 System.out.println("Your Bill is "+r);
		 
		System.out.println("Enter 1 for Wallet");
		System.out.println("Enter 2 for CreditCard");
		Scanner I21 = new Scanner(System.in);
		int n=I21.nextInt();	
		if(n==1) {
			 pay_behave = new Wallet(id);
				pay_behave.set_r(r);

			 
		}else if(n==2) {
			System.out.println("Enter Your CreditCard Number");
			Scanner I22 = new Scanner(System.in);
			Long card_num=I22.nextLong();
			pay_behave = new Credit_card(card_num,card_num);
			pay_behave.set_r(r);

		
		}
		return pay_behave;
		
	}
	
	public void show_options()
	{
		System.out.println("Enter 1 for Quarter");
		System.out.println("Enter 2 for Monthly");
		
	}
	Payment_behaviour create(int type) {
		 Service_provider p=null;
		 Payment_behaviour pp=null;
		 if(type==1) {
			 p=new Quarter();
			pp= rechageProccess(p);
		 }
		 else if(type==2) {
			 p=new Monthly();
			pp= rechageProccess(p);

		 }
		 pp.set_provider(p);

		return pp;
	 }


	
}
