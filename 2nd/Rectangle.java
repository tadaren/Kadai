
public class Rectangle {
	private double x;	//x座標
	private double y;	//y座標
	private double w;	//幅
	private double h;	//高さ
	
	//コンストラクター
	public Rectangle(double x, double y, double w, double h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	//引数の座標の地点が矩形の中にあれば true そうでなければ false
	public boolean point(double p, double q){
		 return p >= x && q >= y && p <= x+w && q <= y+h;
	}
	
	//ゲッター
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	
	//セッター
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setW(double w) {
		this.w = w;
	}
	public void setH(double h) {
		this.h = h;
	}
	
}
