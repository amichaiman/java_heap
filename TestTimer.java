import java.util.Random;

public class TestTimer {
	public static void main(String[] args) {
		int N = 50000;
		HeapData<Student> []array = new HeapData[N];
		Heap <Student>anotherHeap = new Heap<Student>(N);
		Timer timer = new Timer();
		Random r = new Random();
		
		for (int i=0; i<N; i++) {
			array[i] = new HeapData<Student>(new Student("hi",12,12),r.nextDouble());
		}
		
		timer.start();

		anotherHeap.buildHeap(array);
		
		timer.stop();
		System.out.println("it took me " + timer.elapsedTime() + " build heap");
		
	}
}
