package proxy2;

public class TargetDataService2 implements DataService {
	public int insertData(String data) {
		System.out.println(data+" 를 mysql db에 저장하였습니다.");
		return 0;
	}

}
