public class EnumTutorial {

    public static void main(String[] args) {

        DaysOfTheWeek day = DaysOfTheWeek.MONDAY;

        if (day == DaysOfTheWeek.FRIDAY) {
            System.out.println("Yay, it's almost weekend");
        }

        for (DaysOfTheWeek days : DaysOfTheWeek.values()) {
            System.out.println(days);
        }

        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness);

    }
}
