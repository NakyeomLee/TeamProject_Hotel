package HotelDance;

import java.util.Scanner;

public class HotelMain{
	Scanner scanner = new Scanner(System.in);
	Check check = new Check();
	Reservation reservation = new Reservation();
	Room room = new Room();
	Information[][] information = reservation.information;

	int master = 111; // 지배인 코드
	int desk = 222; // 데스크 직원 코드
	int cleaning = 333; // 청소 직원 코드

	public void login() {
		room.information = reservation.information;
		check.information = reservation.information;

		boolean go = true;
		while (go) {
			System.out.println("직원 코드를 입력해주세요.");
			int user = scanner.nextInt();
			// 직원 3명 각자의 코드번호를 입력

			if (user == master) { // 지배인 로그인
				boolean go2 = true;
				System.out.println("\n지배인으로 로그인 하였습니다.");
				
				while (go2) {
					System.out.println("\n업무를 선택해주세요.");
					System.out.println("1. 워크인");
					System.out.println("2. 입퇴실 관리");
					System.out.println("3. 예약 관리");
					System.out.println("4. 고객 정보 조회");
					System.out.println("5. 객실 현황");
					System.out.println("6. 각층 예약 및 투숙 현황");
					System.out.println("7. 체크아웃 객실 확인");
					System.out.println("8. 로그아웃");

					int choose = scanner.nextInt();
					if (choose == 1) { // 워크인
						// 워크인 메소드 호출
						reservation.walkIn();
						
					} else if (choose == 2) { // 입퇴실 관리
						// 체크인, 체크아웃 메소드 호출
						check.check();
						
					} else if (choose == 3) { // 예약 관리
						boolean reservationGo = true;
						while (reservationGo) {
							System.out.println("\n업무를 선택해주세요.");
							System.out.println("1. 예약하기");
							System.out.println("2. 예약변경");
							System.out.println("3. 예약취소");
							System.out.println("4. 뒤로가기");
							
							int user1 = scanner.nextInt();
							if (user1 == 1) {
								// 예약하기 메소드 호출
								reservation.Res();
								
							} else if (user1 == 2) {
								// 예약 변경 메소드 호출
								reservation.Change();
								
							} else if (user1 == 3) {
								// 예약 취소 메소드 호출
								reservation.Cancel();
								
							} else if (user1 == 4) {
								// 뒤로가기
								reservationGo = false;
								break;
								
							} else {
								System.out.println("잘못 선택하셨습니다.");
							}
						}

					} else if (choose == 4) { // 고객 정보 조회
						// 고객 정보 조회 메소드 호출
						room.UserInformation();
						
					} else if (choose == 5) { // 객실 현황
						// 객실 상태 메소드 호출
						room.StateInOut();
						
					} else if (choose == 6) { // 예약 현황
						// 예약 현황 메소드 호출
						room.StateStatus();
						
					} else if (choose == 7) {
						room.CleanRoom();
						
					} else if (choose == 8) {
						System.out.println("지배인이 로그아웃 되었습니다.\n"); // 로그아웃
						break;
						
					} else {
						System.out.println("다시 선택해주세요.");
					}
				}

			} else if (user == desk) { // 데스크 직원 로그인
				boolean go2 = true;
				System.out.println("\n데스크 직원으로 로그인 하였습니다.");
				
				while (go2) {
					System.out.println("\n업무를 선택해주세요.");
					System.out.println("1. 워크인");
					System.out.println("2. 입퇴실 관리");
					System.out.println("3. 예약 관리");
					System.out.println("4. 고객 정보 조회");
					System.out.println("5. 객실 현황");
					System.out.println("6. 각층 예약 및 투숙 현황");
					System.out.println("7. 로그아웃");

					int choose = scanner.nextInt();
					if (choose == 1) { // 워크인
						// 워크인 메소드 호출
						reservation.walkIn();
						
					} else if (choose == 2) { // 입퇴실 관리
						// 체크인, 체크아웃 메소드 호출
						check.check();
						
					} else if (choose == 3) { // 예약 관리
						boolean reservationGo = true;
						while (reservationGo) {
							System.out.println("\n업무를 선택해주세요.");
							System.out.println("1. 예약하기");
							System.out.println("2. 예약변경");
							System.out.println("3. 예약취소");
							System.out.println("4. 뒤로가기");
							
							int user1 = scanner.nextInt();
							if (user1 == 1) {
								// 예약하기 메소드 호출
								reservation.Res();
								
							} else if (user1 == 2) {
								// 예약 변경 메소드 호출
								reservation.Change();
								
							} else if (user1 == 3) {
								// 예약 취소 메소드 호출
								reservation.Cancel();
								
							} else if (user1 == 4) {
								// 뒤로가기
								reservationGo = false;
								break;
								
							} else {
								System.out.println("잘못 선택하셨습니다.");
							}
						}
					} else if (choose == 4) { // 고객 정보 조회
						// 고객 정보 조회 메소드 호출
						room.UserInformation();
						
					} else if (choose == 5) { // 객실 현황
						// 객실 상태 메소드 호출
						room.StateInOut();
						
					} else if (choose == 6) { // 예약 현황
						// 예약 현황 메소드 호출
						room.StateStatus();
						
					} else if (choose == 7) { // 로그아웃
						System.out.println("데스크 직원이 로그아웃 되었습니다.\n");
						break;
						
					} else {
						System.out.println("다시 선택해주세요.");
					}
				}

			} else if (user == cleaning) { // 청소 직원 로그인
				boolean go2 = true;
				System.out.println("\n청소 직원으로 로그인 하였습니다.");
				
				while (go2) {
					System.out.println("\n업무를 선택해주세요.");
					System.out.println("1. 객실 현황");
					System.out.println("2. 체크아웃 객실 확인");
					System.out.println("3. 객실 청소 완료");
					System.out.println("4. 로그아웃");

					int choose = scanner.nextInt();
					if (choose == 1) { // 객실 현황
						// 객실 상태 메소드 호출
						room.StateInOut();
						
					} else if (choose == 2) { // 로그아웃
						room.CleanRoom();
						
					} else if (choose == 3) {
						room.CleanRoom2();
						
					} else if (choose == 4) {
						System.out.println("청소 직원이 로그아웃 되었습니다.\n");
						break;
					} else {
						System.out.println("다시 선택해주세요.");
					}
				}
			} else {
				System.out.println("직원 코드를 다시 확인해주세요.\n");
			}
		}
	}
}