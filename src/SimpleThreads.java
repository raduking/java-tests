import java.util.concurrent.TimeUnit;

public class SimpleThreads {

	public static void main(final String[] args) throws Exception {
		String d = "";
		new Thread(() -> boring("boring!", d, 1)).start();
		new Thread(() -> boring("boring!", d, 2)).start();
		new Thread(() -> boring("boring!", d, 3)).start();
		new Thread(() -> boring("boring!", d, 4)).start();

		TimeUnit.SECONDS.sleep(10);

		System.out.println("You're boring; I'm leaving.");
	}

	private static void boring(final String msg, final String c, final int id) {
		for (int i = 0;; ++i) {

		}
	}
}
