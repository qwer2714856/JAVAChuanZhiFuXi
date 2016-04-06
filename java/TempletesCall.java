package Templetes;
class TempletesCall extends TempletesBcall{
	
	public static void main(String[] args){
		System.out.println("--");
		TempletesCall a = new TempletesCall();
		a.getRuntime();
	}
	public void code(){
		for(int i = 0; i < 1000; i++){
			System.out.println(i);
		}
	}
}