package day20;

public class ThreadEx01 {

	public static void main(String[] args) {
		/* Thread(쓰레드)
		 * => 실행중인 프로그램이 OS로 부터 메모리를 할당받으면 process 상태가 된다. 
		 * - 하나의 프로세스는 하나이상의 쓰레드를 가지게 되고,
		 * 실제 작업을 수행하는 단위는 thread 단위이다.
		 * - thread 단위는 실제 CPU가 처리하는 단위
		 * - multi-thread는 여러 쓰레드가 동시에 수행되는 프로그래밍 작업이다.(시분할 시스템)
		 * - CPU는 시간을 잘게 쪼개서 thread들을 수행하면 사용자에게는 동시에 처리되는 듯한 효과를 보인다.
		 * - thread는 각각 자신만의 작업 공간을 가진다. (context)
		 * - 각 thread사이에 공유하는 자원이 있을 수 있다. (자바에서는 static instance)
		 * - 여러 thread가 공유하는 자원 중 경쟁이 발생하는 부분을 critical section(임계영역)
		 * - critical section에 대한 동기화(순차적 수행)를 구현하여 오류를 막는다.
		 * 
		 * thread 구현 방식
		 * 1.상속(extends Thread)    2.인터페이스(Runnable) 
		 */
		System.out.println(Thread.currentThread());
		MyThread th = new MyThread();
		th.start();
		
		MyThread th2 = new MyThread();
		th2.start();
		
		
		
	}

}
// thread 클래스로 상속받기
class MyThread extends Thread{
	// thread를 상속받으면 반드시 run() 메서드를 구현해야함.
	public void run() {
		int i;
		for (i=1; i<=200; i++) {
			System.out.printf("%d번째 %s\n",i,getName());
		}
	}
}