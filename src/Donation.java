import java.util.Scanner;

public class Donation extends Service {
	private String name;
	
	Long id;
	public  void setid(Long id) {
		this.id=id;
	}

	public Long getid() {
		return id;
	}
	public String get_name() {
		return "Donation";
	}
	Donation(){
		name="Donation";
	}
	public void show_options()
	{
		System.out.println("Enter 1 for NGOs");
		System.out.println("Enter 2 for Schools");
		System.out.println("Enter 3 for Cancer_Hospital");
		
	}
	
	public Payment_behaviour rechageProccess(Service_provider p) {
		Service s =new Donation();
		 Scanner I5 = new Scanner(System.in);
		 
		 System.out.println("Enter Value to donate");
		 int value=I5.nextInt();
		 p.setv(value);		 
		 int r = p.receipt(s);
		 System.out.println("Your Bill is "+r);
		 
		System.out.println("Enter 1 for Wallet");
		System.out.println("Enter 2 for CreditCard");
		Scanner I6 = new Scanner(System.in);
		int n=I6.nextInt();	
		if(n==1) {
			 pay_behave = new Wallet(id);
				pay_behave.set_r(r);

			 
		}else if(n==2) {
			System.out.println("Enter Your CreditCard Number[ Enter 1]");
			Scanner I7 = new Scanner(System.in);
			Long card_num=I7.nextLong();
			pay_behave = new Credit_card(card_num,card_num);
			pay_behave.set_r(r);

		}
		return pay_behave;
		
	}
	Payment_behaviour create(int type)
	 {
		 Service_provider p=null;
		 Payment_behaviour pp=null;
		 if(type==1) {
			 p=new NGOs();
			 rechageProccess(p);
		 }
		 else if(type==2) {
			 p=new Schools();
			 pp=rechageProccess(p);
		 }
		 else if (type==3) {
			 p=new Cancer_Hospital();
			 pp=rechageProccess(p);
		 }
		 pp.set_provider(p);

		return pp;
	 }
}
