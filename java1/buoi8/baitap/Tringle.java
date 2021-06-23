package buoi8.baitap;

public class Tringle implements IShape, IContent{
	private int canhA;
	private int canhB;
	private int canhC;
	
	public Tringle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Tringle(int canhA, int canhB, int canhC) {
		super();
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	

	public int getCanhA() {
		return canhA;
	}


	public void setCanhA(int canhA) {
		this.canhA = canhA;
	}


	public int getCanhB() {
		return canhB;
	}


	public void setCanhB(int canhB) {
		this.canhB = canhB;
	}


	public int getCanhC() {
		return canhC;
	}


	public void setCanhC(int canhC) {
		this.canhC = canhC;
	}


	@Override
	public String description() {
		
		return "day la tam giac";
	}


	@Override
	public String area() {
		float p = (this.canhA + this.canhB + this.canhC) /2;
		double s = Math.sqrt(p*(p- this.canhA)*(p- this.canhB)*(p- this.canhC));
		return "dien tich: " + s;
	}


	@Override
	public String perimeter() {
		// TODO Auto-generated method stub
		return "Chu vi = " + (this.canhA + this.canhB + this.canhC);
	}


	
	
	
}
