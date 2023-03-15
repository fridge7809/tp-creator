class App {
    public static void main(String[] args) {
		//Time timeModule = new Time();
		User newUser = new User(300, 0, 0);
		Run newSesh = new Session(34, "bige");
		newUser.executeWorkout(newSesh);
		System.out.println(newUser.atl);
		System.out.println("hello world");
    }
}