class  Transaction{

public void deposit(){
System.out.println("deposit");
}

public void withdraw(){
System.out.println("withdraw");
}

}

class ApnaBank extends Transaction{

public void makeDD(){
		System.out.println("ApnaBank dd bna rha h");
}

}
class inheritaceDemoOne{

public static void main(String [] arr){
	ApnaBank ab = new ApnaBank();
	ab.makeDD();
	ab.deposit();
	ab.withdraw();
}

}