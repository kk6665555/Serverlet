package tw.mike.j2ee;

public class J2EE20 {
	private int x , y ;
	
	
	public J2EE20(String x,String  y){
		this.x=Integer.parseInt(x);
		this.y=Integer.parseInt(y);
	}
	public int  add() {
		return x + y ;
	}
	
	
}
