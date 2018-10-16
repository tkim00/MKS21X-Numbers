public class RationalNumber extends RealNumber{
	private int y;
	private int z;

	public RationalNumber(value1, value2){
		super(-1);
		y = value1;
		z = value2;
	}

	public int getY(){
		return y;
	}
	public int getZ(){
		return z;
	}
	public String toString(){
		return "" + getY() + "/" + getZ();
	}
	public boolean compareTo(super s){
		return false;
	}
	public boolean compareTo(RationalNumber n){
		return true;
	}
}
