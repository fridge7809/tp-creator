class App {
    public static void main(String[] args) {
		//Time timeModule = new Time();
        User chichi = new User(300, 0, 0);
        Run newSesh = new Session(30, "Interval");
        chichi.executeWorkout(newSesh);
    }
}