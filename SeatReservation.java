public class SeatReservation {
    private String name;
    private int age;
    private boolean pregnant;

    public SeatReservation(String name, int age, boolean pregnant) {
        this.name = name;
        this.age = age;
        this.pregnant = pregnant;
    }

    public boolean reserveSeat() {
        // This method is responsible for checking if the seat can be reserved
        // In a real-world scenario, it would connect to a database or another system
        // to verify the availability of the seat

        if (age >= 18 && !pregnant) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "SeatReservation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pregnant=" + pregnant +
                '}';
    }
}