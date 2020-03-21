package interfacepolymerphism;

import java.time.LocalDateTime;

public class Clock implements Alarm {
	public void showTime()
	{
		System.out.println("it is"+ LocalDateTime.now());
	}
	
	public void setAlarm()
	{
		System.out.println("seeting an alarm for clock");
	}

}
