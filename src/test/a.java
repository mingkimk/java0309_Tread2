package test;

public class a extends Thread {
	// extends Thread a��� Ŭ������ ������ �����带 ó���ϰڴ� ��� �ǹ�

	@Override
	public void run() {
		// TODO Auto-generated method stub
	//	super.run();
		// super��� ���� �θ���� �� super �� �θ� ��Ī �ϴ� Ű����,
		gogo();
	}

	a() {
// gogo();		

	}

	public void gogo() {

		String thisName = Thread.currentThread().getName();
		// ���� ����ǰ��ִ� �����带 �����Ͷ� �̱� ������
		for (int i = 0; i < 10; i++) {
			System.out.println(thisName + ":" + i);

		}
	}

}
