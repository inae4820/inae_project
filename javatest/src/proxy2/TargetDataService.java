package proxy2;

public class TargetDataService implements DataService {
	public int insertData(String data) {
		System.out.println(data+" 를 oracle db에 저장하였습니다.");
		return 1;
	}

}
