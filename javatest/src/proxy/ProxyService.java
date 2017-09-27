package proxy;

public class ProxyService implements Service {
	Service s;
	public String runSomething() {
		//비서=proxy
		System.out.println("프록시가 호출을 대신합니당.");
		s = new RealService(); //수행결과를 바꿀수 없음.(수정, 삭제 등 x)
		String result = s.runSomething();
		System.out.println("프록시가 호출을 종료합니당.");
		return result;
	}

}
