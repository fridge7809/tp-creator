class App {
    public static void main(String[] args) {
		Time timeModule = new Time();
		Run newRun = new Run(30, 0.8, 30, timeModule.getCurrentDate(), false);
		User newUser = new User(300, 0, 0);
		newUser.executeWorkout(newRun);
		System.out.println(newUser.atl);
    }
}