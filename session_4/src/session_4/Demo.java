package session_4;

public class Demo {
	public enum Seasons{SUMMER,WINTER,AUTUMN};
	public static void main(String[] args) {
		Seasons s= Seasons.SUMMER;
		System.out.println(s);
		Seasons s2= Seasons.WINTER;
		System.out.println(s2);
		Seasons s3= Seasons.AUTUMN;
		System.out.println(s3);
		for(Seasons s1:Seasons.values())
		{
			System.out.println(s1+" "+s1.ordinal());
		}
	}

}
