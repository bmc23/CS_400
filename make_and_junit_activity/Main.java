public class Main {
    public static void main(String[] args) {
	MyList<String> words = new MyList<String>();
	words.add("Hello ");
	words.add("world ");
	words.add("today ");
	words.add("is ");
	words.add("Friday.");
        for(int i = 0; i < words.size(); i++){
		System.out.print(words.get(i));
	}
    System.out.println();
	}
}
