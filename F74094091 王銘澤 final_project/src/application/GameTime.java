package application;

public class GameTime extends GameController {
	
	public String time(int minute, int second) {
		if(second != 0) {
			second = second - 1;
			return(minute + ":" + second);
		}else if(second == 0 && minute != 0) {
			second = 59;
			minute = minute - 1;
			return(minute + ":" + second);
		}else{
			super.timing = false;
			return("0:00");
		}
	}
}