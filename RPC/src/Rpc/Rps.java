package Rpc;

import java.util.Scanner;

public class Rps {
	void run() 	{
		Scanner sc = new Scanner(System.in);
		int r = 0;
		String cmd = "";
		String result = "";
		String comRpc = "";
		
		xx:
			while (true) {
				System.out.println("가위 바위 보를 시작합니다.");
				cmd = sc.next();
				r = (int)(Math.random() * 3 + 1);
				
				switch (cmd) {
				case "가위":
					switch (r) {
					case 1:
						comRpc = "가위";
						result = "비김";
						System.out.println("컴퓨터: " + comRpc);
						System.out.println("결과: " + result);
						break;

					case 2:
						comRpc = "바위";
						result = "짐";
						System.out.println("컴퓨터: " + comRpc);
						System.out.println("결과: " + result);
						break; 
						
					case 3:
						comRpc = "보";
						result = "이김";
						System.out.println("컴퓨터: " + comRpc);
						System.out.println("결과: " + result);
						break;
					}
					break;
					
				case "바위":
					switch (r) {
					case 1:
						comRpc = "가위";
						result = "이김";
						System.out.println("컴퓨터: " + comRpc);
						System.out.println("결과: " + result);
						break;

					case 2:
						comRpc = "바위";
						result = "비김";
						System.out.println("컴퓨터: " + comRpc);
						System.out.println("결과: " + result);
						break; 
						
					case 3:
						comRpc = "보";
						result = "짐";
						System.out.println("컴퓨터: " + comRpc);
						System.out.println("결과: " + result);
						break;
					}
					break;
					
				case "보":
					switch (r) {
					case 1:
						comRpc = "가위";
						result = "짐";
						System.out.println("컴퓨터: " + comRpc);
						System.out.println("결과: " + result);
						break;

					case 2:
						comRpc = "바위";
						result = "이김";
						System.out.println("컴퓨터: " + comRpc);
						System.out.println("결과: " + result);
						break; 
						
					case 3:
						comRpc = "보";
						result = "비김";
						System.out.println("컴퓨터: " + comRpc);
						System.out.println("결과: " + result);
						break;
					}
					break;
					
				case "x":
					System.out.println("가위 바위 보를 종료합니다.");		
					break xx;
					
				default:
					comRpc = "error";
					result = "error";
					System.out.println("컴퓨터: " + comRpc);
					System.out.println("결과: " + result);
					break;
				}
			}
	}
}