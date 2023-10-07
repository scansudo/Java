package Notes;
public class Enums {
	enum Rank{
		SOILDER,
		SERGEANT,
		CAPTAIN,
		COMMANDER,
		PRESIDENT
	}
	public static void main(String[] args) {
		Rank a = Rank.SOILDER;
//		Rank b = Rank.SERGEANT;
//		Rank c = Rank.CAPTAIN;
//		Rank d = Rank.COMMANDER;
//		Rank e = Rank.PRESIDENT;
		switch(a) {
		case SOILDER:
			System.out.println("Soilder Ready!");
			break;
		case SERGEANT:
			System.out.println("Sergeant reporting for duty!");
			break;
		case CAPTAIN:
			System.out.println("Captain Here!");
			break;
		case COMMANDER:
			System.out.println("Commander at your service!");
			break;
		case PRESIDENT:
			System.out.println("President");
			break;
		}
	}
}