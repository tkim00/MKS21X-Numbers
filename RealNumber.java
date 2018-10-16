public class RealNumber{
	private double x;

	public RealNumber(double value){
		x = value;
	}

	public double getX(){
		return x;
	}
	public String toString(){
		return "" + getX();
	}
}
