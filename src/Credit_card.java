import java.util.Map;

public class Credit_card extends Payment_behaviour{
Long ID;
Long credit_num;
Credit_card(Long num,Long id){
	credit_num=num;
	ID=id;
}
public String get_name() {
	  return "Credit_card";
}
Long get_id() {
	return ID;
}
Long getcredit_num() {
	return credit_num;
}
public boolean valid_credit_card(Map<Long,Integer>user_card,int price) {
	Long rkm=getcredit_num();
	if(user_card.get(ID)==null) {
		System.out.print("Invalid user ");
		return false;	

	}
else {
if(rkm <=100000000 &&price<=user_card.get(ID)) {
	
	return true;
	
}
return false;	
}
}
public void pay(Map<Long,Integer>user_card,int price) {
	if(valid_credit_card(user_card,price)) {

		user_card.put(ID,user_card.get(ID)-price);
		System.out.println("your money is : ");

		System.out.println (user_card.get(ID));
		


	

	}
	else {
		System.out.println("Invalid transection your money is : "+user_card.get(ID));

	}

}

}