import java.util.Random;

public class MovableMan {

	private double[] position;
	
	//コンストラクター  座標(0,0)で初期化
	public MovableMan(){
		this(new double[2]);
	}
	//コンストラクター  任意の座標で初期化
	public MovableMan(double[] position){
		this.position = position;
	}
	
	//引数の座標と今の座標の距離を返す
	public double dist(double[] p){
		return Math.sqrt((position[0]-p[0])*(position[0]-p[0]) + (position[1]-p[1])*(position[1]-p[1]));
	}
	
	//位置を移動させる
	public void moveEast(double d){
		this.position[0] += d;
	}
	public void moveWest(double d){
		this.position[0] -= d;
	}
	public void moveSouth(double d){
		this.position[1] += d;
	}
	public void moveNorth(double d){
		this.position[1] -= d;
	}
	
	//セッターとゲッター
	public void setPosition(double[] position){
		this.position = position;
	}
	public double[] getPosition(){
		return position;
	}
	
	//出力用にtoStringをOverrideする
	@Override
	public String toString() {
		return "x = "+position[0] + " y = "+position[1];
	}
	
	public static void main(String[] args) {
		//インスタンス生成
		MovableMan man1 = new MovableMan();
		MovableMan man2 = new MovableMan();
		Random rand = new Random();
		
		//ランダムに移動
		for(int i = 0; i < 20; i++){
			man1.moveEast(rand.nextDouble()*10);
			man1.moveWest(rand.nextDouble()*10);
			man1.moveSouth(rand.nextDouble()*10);
			man1.moveNorth(rand.nextDouble()*10);
			man2.moveEast(rand.nextDouble()*10);
			man2.moveWest(rand.nextDouble()*10);
			man2.moveSouth(rand.nextDouble()*10);
			man2.moveNorth(rand.nextDouble()*10);

		}
		
		//距離を求めて出力
		System.out.println("一人目の位置は、"+man1);
		System.out.println("二人目の位置は、"+man2);
		System.out.println("二人の距離は、" + man1.dist(man2.getPosition()));
		
	}

}
