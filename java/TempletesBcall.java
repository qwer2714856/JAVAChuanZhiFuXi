package Templetes;
abstract class TempletesBcall{
	public final void getRuntime(){
		long startTime = System.currentTimeMillis();
		
		code();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
	}
	public abstract void code();
}