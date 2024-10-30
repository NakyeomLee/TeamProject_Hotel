package HotelDance;

import java.util.Scanner;

// 객실 정보 조회 UserInformation()

// 객실 현황 조회 StateInOut()

// 예약 현황 조회 StateStatus()

// 청소 직원 청소해야할 방 확인하기 CleanRoom()

// 청소 직원 청소 완료한 방 만들기 CleanRoom2()

////////////////////////////////////////////////////////////////////////////////

public class Room {
	Scanner scanner = new Scanner(System.in);
	Information[][] information;

	public void UserInformation() { // 객실 정보 조회
		boolean go = true;
		while (go) {
			System.out.println("고객 정보 확인입니다.");
			System.out.println("===============================");
			System.out.println("1.예약번호 입력  | 2.고객 정보 입력 | 3.뒤로가기");
			int input = scanner.nextInt();
			if (input == 1) {
				System.out.println("\n예약번호를 입력하세요.");
				
				int inputRn = scanner.nextInt();
				int count = 0;
				for (int i = 0; i < information.length; i++) {
					for (int j = 0; j < information[i].length; j++) {
						if (information[i][j].reservationNumber == inputRn) {
							System.out.println("===============================");
							System.out.println("예약번호 : " + information[i][j].reservationNumber + " 님의 정보는");
							System.out.println("이름 : " + information[i][j].name);
							System.out.println("생년월일 : " + information[i][j].birth);
							System.out.println("전화번호 : " + information[i][j].phoneNumber);
							System.out.println("객실 호수 : " + information[i][j].roomNumber);
							System.out.println("===============================");
							count++;
						} else {

						}
					}
				}
				if (count > 0) {
					
				}else {
					System.out.println("예약번호를 다시 확인해주세요.");
				}
				break;

			} else if (input == 2) {
				System.out.println("\n고객 정보(이름)를 입력하세요");
				String inputName = scanner.next();
				int count = 0;
				for (int i = 0; i < information.length; i++) {
					for (int j = 0; j < information[i].length; j++) {
						if (information[i][j].name.equals(inputName)) {
							System.out.println("===============================");
							System.out.println("이름 : " + information[i][j].name + " 님의 정보는");
							System.out.println("예약번호 : " + information[i][j].reservationNumber);
							System.out.println("생년월일 : " + information[i][j].birth);
							System.out.println("전화번호 : " + information[i][j].phoneNumber);
							System.out.println("방번호 : " + information[i][j].roomNumber);
							System.out.println("===============================");
							count++;
						} else {

						}
					}
				}
				if (count >0) {
					
				}else {
					System.out.println("예약번호를 다시 확인해주세요.");
				}
				break;

			} else if (input == 3) {
				System.out.println("===============================");
				System.out.println("업무 선택으로 돌아갑니다.");
				break;

			} else {
				System.out.println("===============================");
				System.out.println("다시 선택해주세요.\n");
			}
			go = false;
		}
	}
	
////////////////////////////////////////////////////////////////////////////////

	public void StateInOut() { // 객실 현황 조회
		System.out.println("===============================");
		System.out.println("층 별 객실 상태 확인입니다.");
		System.out.println("원하시는 층을 입력해주세요.\n");
		int a = scanner.nextInt();
		if (a >= 2 && a <= 5) {
			System.out.println("===============================");
			System.out.println((a) + "층의 객실 상태");
			System.out.println("○ = 빈 객실  |  ◎ = 예약중 | ● = 투숙중  |  ★ = 없는 객실  | ♠ = 청소중\n");
			for (int j = 0; j < 20; j++) {

				if (information[a - 2][j].roomState == 0) {
					if ((a == 4 && j == 3) || (a == 4 && j == 13)) {
						System.out.print("★ ");
						System.out.print("없는 객실");
					} else {
						System.out.print("○ ");
						System.out.printf(information[a - 2][j].roomNumber + "호  ");
					}
					
				} else if (information[a - 2][j].roomState == 1) {
					if ((a == 4 && j == 3) || (a == 4 && j == 13)) {
						System.out.print(" ★ ");
						System.out.print("없는 객실");
					} else {
						System.out.print("◎ ");
						System.out.printf(information[a - 2][j].roomNumber + "호  ");
					}
					
				} else if (information[a - 2][j].roomState == 2) {
					if ((a == 4 && j == 3) || (a == 4 && j == 13)) {
						System.out.print(" ★ ");
						System.out.print("없는 객실");
					} else {
						System.out.print("● ");
						System.out.printf(information[a - 2][j].roomNumber + "호  ");
					}

				} else if (information[a - 2][j].roomState == 3) {
					if ((a == 4 && j == 3) || (a == 4 && j == 13)) {
						System.out.print(" ★ ");
						System.out.print("없는 객실");
					} else {
						System.out.print("♠ ");
						System.out.printf(information[a - 2][j].roomNumber + "호  ");
					}

				} else {

				}
				if (information[a - 2][j].roomNumber % 2 == 0) {
					System.out.println();
				}
			}
			
		} else if (a == 1) {
			System.out.println("===============================");
			System.out.println("1층은 로비입니다. 다시 확인해주세요.\n");
			
		} else {
			System.out.println("===============================");
			System.out.println("다시 확인해주세요.\n");
		}
	}
////////////////////////////////////////////////////////////////////////////////

	public void StateStatus() { // 예약 현황 조회
		System.out.println("===============================");
		System.out.println("예약 현황입니다.");
		System.out.println("층 별 '예약중' 또는 '투숙중'인 객실을 보여줍니다.");
		System.out.println("확인할 층을 입력하세요.\n");

		int a = scanner.nextInt();
		if (a >= 2 && a <= 5) {
			System.out.println("===============================");
			System.out.println((a) + "층에 '예약중' 또는 '투숙중'인 객실은");
			for (int j = 0; j < 20; j++) {
				if (information[a - 2][j].roomState == 0) {
					// 예약번호랑 고객정보 이름 생년월일 전화번호 방번호 방의 상태
				} else if (information[a - 2][j].roomState == 1) {
					if (a != 4) {
						System.out.println("===============================");
						System.out.println(information[a - 2][j].roomNumber + " 호는 '예약중'입니다.");
						System.out.println("이름 : " + information[a - 2][j].name);
						System.out.println("생년월일 : " + information[a - 2][j].birth);
						System.out.println("전화번호 : " + information[a - 2][j].phoneNumber);
						System.out.println("예약번호 : " + information[a - 2][j].reservationNumber);
					} else if (a == 4) {
						if (j != 3 && j != 13) {
							System.out.println("===============================");
							System.out.println(information[a - 2][j].roomNumber + " 호는 '예약중'입니다.");
							System.out.println("이름 : " + information[a - 2][j].name);
							System.out.println("생년월일 : " + information[a - 2][j].birth);
							System.out.println("전화번호 : " + information[a - 2][j].phoneNumber);
							System.out.println("예약번호 : " + information[a - 2][j].reservationNumber);
						}
					}

				} else if (information[a - 2][j].roomState == 2) {
					System.out.println("===============================");
					System.out.println(information[a - 2][j].roomNumber + " 호는 '투숙중'입니다.");
					System.out.println("이름 : " + information[a - 2][j].name);
					System.out.println("생년월일 : " + information[a - 2][j].birth);
					System.out.println("전화번호 : " + information[a - 2][j].phoneNumber);
					System.out.println("예약번호 : " + information[a - 2][j].reservationNumber);

				} else {

				}
			}

		} else {
			System.out.println("존재하지 않는 층입니다.");
		}
	}
////////////////////////////////////////////////////////////////////////////////

	public void CleanRoom() { // 청소 직원 청소해야할 방 확인하기
		int count = 0;
		boolean go = true;
		while (go) {
			System.out.println("\n청소할 객실을 조회합니다.");
			System.out.println("1. 체크아웃된 객실  | 2. 뒤로가기");
			int user = scanner.nextInt();
			if (user == 1) {
				System.out.println("조회할 층을 입력하세요.");
				int num = scanner.nextInt();
				if (num > 1 && num < 6) {
					int num2 = num - 2;
					for (int i = 0; i < information[num2].length; i++) {
						if (information[num2][i].roomState == 3) {
							System.out.println(information[num2][i].roomNumber + " 호 청소해야합니다.\n");
							count++;
							break;

						} else {

						}
					}
					if (count == 0) {
						System.out.println(num + " 층에 청소할 객실이 없습니다.");
					}
				} else {
					System.out.println("다시 확인해주세요.");
					break;
				}
			} else if (user == 2) {
				System.out.println("업무 선택으로 돌아갑니다.");
				break;

			} else {
				System.out.println("다시 확인해주세요.");
			}
		}
	}

	public void CleanRoom2() { // 청소 직원 청소 완료한 방 만들기
		boolean go = true;
		while (go) {

			System.out.println("청소를 완료하신 객실을 입력해주세요.");
			int user = scanner.nextInt();
			int z = (user / 100) - 2;
			int y = (user % 100) - 1;

			if (user > 200 && user < 221) {
				CleanRoom3(z, y);
				go = false;
			} else if (user > 300 && user < 321) {
				CleanRoom3(z, y);
				go = false;
			} else if (user > 400 && user < 421) {
				CleanRoom3(z, y);
				go = false;
			} else if (user > 500 && user < 521) {
				CleanRoom3(z, y);
				go = false;
			} else {
				System.out.println("존재하지 않는 객실입니다.\n");
				go = false;
			}
		}
	}

	public void CleanRoom3(int z, int y) {
		boolean go = true;
		while (go) {
			if (information[z][y].roomState == 3) {
				System.out.println(information[z][y].roomNumber + "호 청소 완료로 상태 변경하시겠습니까?");
				System.out.println("1. 완료  | 2. 취소");
				int user = scanner.nextInt();
				if (user == 1) {
					information[z][y].roomState = 0;
					System.out.println(information[z][y].roomNumber + "호 청소를 완료 하였습니다.\n");
					go = false;
					
				} else if (user == 2) {
					System.out.println("취소하였습니다.\n");
					go = false;
					
				} else {
					System.out.println("다시 확인해주세요.");
				}
				
			} else {
				System.out.println("다시 확인해주세요.");
				go = false;
			}
		}
	}
}