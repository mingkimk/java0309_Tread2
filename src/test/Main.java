package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a aa = new a();
		 aa.setName("1st a");
		aa.start();

		a a1 = new a();
		// aa.gogo();
		a1.start();

		a a2 = new a();
		// aa.gogo();
		a2.start();
		
		
		try {
			aa.join();  // 기다려라  , join 을 쓰면 "main 종료"  가 항상 맨 마지막에  출력 됨
			a1.join();
			a2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("main 종료");

	}

}
