class MethodChaining{
	
	
	public MethodChaining m1(){
		System.out.println("m1 method");
		return this;
		
	}
		public MethodChaining m2(){
		System.out.println("m2 method");
		return this;
		
	}
		public MethodChaining m3(){
		System.out.println("m3 method");
		return this;
		
	}
		public MethodChaining m4(){
		System.out.println("m4 method");
		return this;
		
	}

}

class ThisKeywordDemoThree{
	public static void main(String []arr){
			new MethodChaining().m1().m2().m3().m4();
			
	}
}