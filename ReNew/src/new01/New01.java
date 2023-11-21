package new01;

import java.time.LocalDateTime;
import java.util.Date;

public class New01 {

	public static void main(String[] args) {
		/* 홍길동 주민등록번호는 881122-1234567이다
		 * 출력형태 => 생년월일 : 881122, 성별 : 남(1,3) 여(2,4)
		 * */
		String pin = "881122-1234567";
		
		String arr [] = pin.split("-");
		String arr2 [] = arr[1].split("");
		String gender = "";
		
		if(arr2[0].equals("2") || arr2[0].equals("4")) {
			gender = "여";
		}else {
			gender = "남";
		}
		
		System.out.println("생년월일 : "+arr[0]+", 성별 : "+gender);
		
		//선생님 풀이
		String pin1 = "881122-1234567";
		String birth = pin.substring(0, pin.indexOf("-"));
		System.out.println("생년월일 : "+birth);
		String ch = pin.substring(pin.indexOf("-")+1,8);
		//System.out.println(ch);
		//char '' == / String "" equals()
		
		if(ch.equals("1") || ch.equals("3")) {
			System.out.println("성별 : 남");
		}else {
			System.out.println("성별 : 여");
		}

	}

}
