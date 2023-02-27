package medium;

public class IntegerToRoman {

	public String intToRoman(int num) {

		String answer = "";
		boolean above = false;
		if(num >= 1000){
			above = true;
			while(above){
				answer = answer+"M";
				num = num - 1000;
				if(num < 1000){
					above = false;
				}
			}
		}
		if(num >= 900){
			answer = answer+"CM";
			num = num - 900;
		}


		if(num >= 500){
			above = true;
			while(above){
				answer = answer+"D";
				num = num - 500;
				if(num < 500){
					above = false;
				}
			}
		}
		if(num >= 400){
			answer = answer+"CD";
			num = num - 400;
		}


		if(num >= 100){
			above = true;
			while(above){
				answer = answer+"C";
				num = num - 100;
				if(num < 100){
					above = false;
				}
			}
		}
		if(num >= 90){
			answer = answer+"XC";
			num = num - 90;
		}


		if(num >= 50){
			above = true;
			while(above){
				answer = answer+"L";
				num = num - 50;
				if(num < 50){
					above = false;
				}
			}
		}
		if(num >= 40){
			answer = answer+"XL";
			num = num - 40;
		}


		if(num >= 10){
			above = true;
			while(above){
				answer = answer+"X";
				num = num - 10;
				if(num < 10){
					above = false;
				}
			}
		}
		if(num >= 9){
			answer = answer+"IX";
			num = num - 9;
		}

		if(num >= 5){
			above = true;
			while(above){
				answer = answer+"V";
				num = num - 5;
				if(num < 5){
					above = false;
				}
			}
		}
		if(num >= 4){
			answer = answer+"IV";
			num = num - 4;
		}


		if(num >= 1){
			above = true;
			while(above){
				answer = answer+"I";
				num = num - 1;
				if(num < 1){
					above = false;
				}
			}
		}

		return answer;
    }

}