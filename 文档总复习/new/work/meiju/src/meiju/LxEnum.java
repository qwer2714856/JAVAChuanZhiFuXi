package meiju;

public class LxEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LxP p = new LxP(MeiJu.man);
	
	}

}

class LxP{
	MeiJu xb = null;

	public LxP(MeiJu xb) {
		this.xb = xb;
	}
	
}

class LxMQ{
	
	public static final LxMQ man = new LxMQ("��");
	public static final LxMQ girl = new LxMQ("Ů");
	
	String val;
	private LxMQ(String val){
		this.val = val;
	}
}



enum MeiJu{
	man("��"),wman("Ů");
	String val = "";
	private MeiJu(String val){
		this.val = val;
	}
}