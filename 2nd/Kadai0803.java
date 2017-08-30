import java.util.Random;

public class Kadai0803 {

	public static void main(String[] args) {
		//インスタンス生成
		Rectangle rectangle = new Rectangle(3, 3, 5, 5);
		MovableMan man = new MovableMan(new double[]{rectangle.getX(), rectangle.getY()});
		Random random = new Random();
		
		while(true){
			man.moveEast(random.nextDouble()*0.5);//東に0.0~0.5の距離を移動する
			man.moveSouth(random.nextDouble()*0.5);//南に0.0~0.5の距離を移動する
			System.out.println(man);
			
			//領域内にいるかの判定で領域外ならbreakする
			if(!rectangle.point(man.getPosition()[0], man.getPosition()[1])){
				break;
			}
		}
		System.out.println("領域外に出ました");
	}

}
