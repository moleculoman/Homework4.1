public class Third_task {
    public static void main(String[] args) {
        //Задание 3.1 + Задание 3.2
        System.out.println("Задание 1.1 + Задание 1.2");
        int amountOfSeats = 102;
        int amountOfSeatingSeats = 60;
        int personSeat = 103;
        if (personSeat < amountOfSeatingSeats){
            System.out.println("У пассажира сидячее место в вагоне");
            } else if (personSeat > amountOfSeatingSeats && personSeat<amountOfSeats) {
                System.out.println("У пассажира стоячее место в вагоне");
            } else if (personSeat>amountOfSeats) {
                System.out.println("Пассажир не попадет в поезд, т.к. места закончились");
            }
        }
    }
