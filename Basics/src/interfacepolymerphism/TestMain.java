package interfacepolymerphism;

public class TestMain {

	public static void main(String[] args) {
		GoogleMini g=new GoogleMini();
		Iphone i = new Iphone();
		Clock c= new Clock();
		alarmTest(i);
		alarmTest(g);
	}
	
	private static void alarmTest(Alarm i)
	{
		i.setAlarm();
	}

}
