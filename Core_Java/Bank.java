 abstract class Account{

	private String name;
	private String accountNum;
	private int balance;
	
	public Account(String name ,String accountNum ,int balance){
		this.name =name;
		this.accountNum =accountNum;
		this.balance =balance;
	}

	public void deposit(int b){
		System.out.println(this.balance+b);
	}
	
	public void withdrawal(int b){
			System.out.println(this.balance-b);
	}
	
	public int getBalance(){
		return balance;
	}

	public void accountInfo(){
			System.out.println("Account Type            :"+this.getClass().getName());
			System.out.println("Name                    :"+this.name);
			System.out.println("Account Number          :"+this.accountNum);
			System.out.println("Balance                 :"+this.balance);
			System.out.println("IntrestRate             :"+this.getIntrestRate());
		}
	
	public abstract double getIntrestRate();
	
}

class Saving extends Account{

	public Saving( String name ,String accountNum ,int balance){
		super(name,accountNum,balance);
	}
	
	public double getIntrestRate(){
		return 8.0;
	}

}
class FD extends Account{

	public FD( String name ,String accountNum ,int balance){
		super(name,accountNum,balance);
	}
	
	public double getIntrestRate(){
		return 9.0;
	}

}

class Bank{
	
	public static void main(String ...aaa){
	
	Account krishnaSaving = new Saving("Krishna","372000010145580",25000);
	krishnaSaving.accountInfo();
	Account krishnaFD = new FD("Krishna","372000010145580",250);
	krishnaFD.accountInfo();
		
	}

}
