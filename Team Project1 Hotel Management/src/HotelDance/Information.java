package HotelDance;

// 객실 최초 예약시 필요한 정보 클래스
public class Information {
	int roomNumber; // 객실 번호
	int roomState; // 객실 상태 (0 : 빈 방, 1 : 예약중, 2 : 투숙중, 3 : 청소중)
	String name; // 고객 이름
	String phoneNumber; // 고객 전화번호
	String birth; // 고객 생년월일
	int reservationNumber; // 예약 번호

	// 생성자
	public Information(int roomNumber, int roomState, String name, String phoneNumber, String birth,
			int reservationNumber) {
		super();
		this.roomNumber = roomNumber;
		this.roomState = roomState;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
		this.reservationNumber = reservationNumber;
	}

	// 빈 생성자
	public Information() {

	}

	// getter setter
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getRoomState() {
		return roomState;
	}

	public void setRoomState(int roomState) {
		this.roomState = roomState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(int reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
}