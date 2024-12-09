public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House();
        House otherHouse = new House(9,15,"white");
        House defaultHouse = new House();

        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("red");

        yourHouse.setNumStories(3);
        yourHouse.setNumWindows(10);
        yourHouse.setColor("blue");

        printHouseData(myHouse);
        printHouseData(yourHouse);
        printHouseData(otherHouse);
        printHouseData(defaultHouse);


//        System.out.printf("Your house is %s and has %d stories and %d windows. %n", myHouse.getColor(), myHouse.getNumStories(), myHouse.getNumWindows() );
//        System.out.printf("Your house is %s and has %d stories and %d windows.%n", yourHouse.getColor(), yourHouse.getNumStories(), yourHouse.getNumWindows() );
//        System.out.printf("Other house is %s and has %d stories and %d windows.%n", otherHouse.getColor(), otherHouse.getNumStories(), otherHouse.getNumWindows() );
//        System.out.printf("DefaultHouse house is %s and has %d stories and %d windows.", defaultHouse.getColor(), defaultHouse.getNumStories(), defaultHouse.getNumWindows() );



    }

    public static void printHouseData(House house){
        System.out.printf("The house is %s and has %d stories and %d windows.%n", house.getColor(), house.getNumStories(), house.getNumWindows());
    }
}
