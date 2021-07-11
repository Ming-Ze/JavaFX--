package application;

import java.util.Random;

public class GameSetting extends GameController {
	
	public int[] createThreeNumbers() {
		int count = 0;
		int[] temp = new int[3];
		
		Random random = new Random();
		temp[0] = random.nextInt(10);		
		count++;
		while(count < 3) {
			temp[count] = random.nextInt(10);
			count = count + 1;
			for(int i=0; i<count-1; i++){  //檢查數字是否重複 
				if(temp[count-1] == temp[i]){  //若有重複  
					count = count - 1;  //count減一，重新產生 
					break;
				}
			}
		}
		return temp;
	}
	
	public String judgeThreeNumbers(String str, int[] guess, int[] answer) {
		int a = 0;
		int b = 0;
		
		for(int i=0; i<3; i++) {
			if(answer[i] == guess[i]) {
				a++;
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(answer[i] == guess[j]) {
					b++;
				}
			}
		}
		b = b - a;
		
		if(a == 3) {
			super.timing = false;
			return(str + "      " + a + "A" + b + "B\n" + "        恭喜答對!!!\n");
		}else {
			return(str + "      " + a + "A" + b + "B\n");
		}
	}
	
	public int[] createFourNumbers() {
		int count = 0;
		int[] temp = new int[4];
		
		Random random = new Random();
		temp[0] = random.nextInt(10);		
		count++;
		while(count < 4) {
			temp[count] = random.nextInt(10);
			count = count + 1;
			for(int i=0; i<count-1; i++){  //檢查數字是否重複 
				if(temp[count-1] == temp[i]){  //若有重複  
					count = count - 1;  //count減一，重新產生 
					break;
				}
			}
		}
		return temp;
	}
	
	public String judgeFourNumbers(String str, int[] guess, int[] answer) {
		int a = 0;
		int b = 0;
		
		for(int i=0; i<4; i++) {
			if(answer[i] == guess[i]) {
				a++;
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(answer[i] == guess[j]) {
					b++;
				}
			}
		}
		b = b - a;
		
		if(a == 4) {
			super.timing = false;
			return(str + "      " + a + "A" + b + "B\n" + "        恭喜答對!!!\n");
		}else {
			return(str + "      " + a + "A" + b + "B\n");
		}
	}
	
	public int[] createFiveNumbers() {
		int count = 0;
		int[] temp = new int[5];
		
		Random random = new Random();
		temp[0] = random.nextInt(10);		
		count++;
		while(count < 5) {
			temp[count] = random.nextInt(10);
			count = count + 1;
			for(int i=0; i<count-1; i++){  //檢查數字是否重複 
				if(temp[count-1] == temp[i]){  //若有重複  
					count = count - 1;  //count減一，重新產生 
					break;
				}
			}
		}
		return temp;
	}
	
	public String judgeFiveNumbers(String str, int[] guess, int[] answer) {
		int a = 0;
		int b = 0;
		
		for(int i=0; i<5; i++) {
			if(answer[i] == guess[i]) {
				a++;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(answer[i] == guess[j]) {
					b++;
				}
			}
		}
		b = b - a;
		
		if(a == 5) {
			super.timing = false;
			return(str + "      " + a + "A" + b + "B\n" + "        恭喜答對!!!\n");
		}else {
			return(str + "      " + a + "A" + b + "B\n");
		}
	}
}