package scjp;

public class OverridingTEst {
protected int blipvert(int x){
	return 0;
}
}
class Test11{
	public int blipvert(int x){
		return 0;
	}
	/*private int blipvert(long x){
		return 0;
	}
	protected int blipvert(long x){
		return 0;
	}
	protected long blipvert(long x){
		return 0;}*/
	
	protected int blipvert(int x,long y){
		return 0;
	}
}