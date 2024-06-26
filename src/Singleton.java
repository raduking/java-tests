public class Singleton {

	private Singleton() {
		// this line will only execute when calling getInstance()
		// and will not execute when calling getAuthor() or main()
		System.out.println("Singleton instantiated!");
	}

	public static String getAuthor() {
		return "John Doe";
	}

	public static Singleton getInstance() {
		return LazyHolder.INSTANCE;
	}

	private static class LazyHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static void main(final String[] args) {
		System.out.println(getAuthor());
	}

}
