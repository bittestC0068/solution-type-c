package problem02;

public class MyService extends BaseService {

	public String afternoon() {
		return "오후";
	}

	@Override
	public String day() {
		return super.day() + "서비스시작";
	}

	@Override
	public String night() {
		return super.night() + "서비스시작";
	}

	@Override
	public void service(String state) {
		if(state.equals("오후")) {
			System.out.println(afternoon() + "서비스시작");
		} else {
			super.service(state);
		}
	}
}
