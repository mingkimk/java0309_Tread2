package test;

public class a extends Thread {
	// extends Thread a라는 클래스를 가지고 쓰레드를 처리하겠다 라는 의미

	@Override
	public void run() {
		// TODO Auto-generated method stub
	//	super.run();
		// super상속 받은 부모님의 것 super 는 부모를 자칭 하는 키워드,
		gogo();
	}

	a() {
// gogo();		

	}

	public void gogo() {

		String thisName = Thread.currentThread().getName();
		// 현재 실행되고있는 쓰레드를 가져와라 싱글 쓰레드
		for (int i = 0; i < 10; i++) {
			System.out.println(thisName + ":" + i);

		}
	}

}
