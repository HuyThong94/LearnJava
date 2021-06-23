package buoi8.baitap;

public class Square implements IContent, IShape{
	private int canhX;
	
	
	
	public Square() {
		super();
		
	}
	

	public Square(int canhX) {
		super();
		this.canhX = canhX;
	}
	


	public int getCanhX() {
		return canhX;
	}


	public void setCanhX(int canhX) {
		this.canhX = canhX;
	}


	@Override
	public String area() {
		int s = this.canhX*this.canhX;
		return "dien tich: " + s;
	}

	@Override
	public String perimeter() {
		int p = 4*this.canhX;
		return "chu vi: " + p;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "day la hinh vuong";
	}

}
