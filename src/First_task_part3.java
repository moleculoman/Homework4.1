public class First_task_part3 {
    public static void main(String[] args) {
        //Задание 1.3
        System.out.println("Задание 1.3");

        int ageOfPerson =19;
        if (ageOfPerson >=2 && ageOfPerson <6) {
            System.out.println("Если возраст человека равен "+ ageOfPerson + " , то ему нужно ходить в школу");
        } else if(ageOfPerson >=18 && ageOfPerson <24){
            System.out.println("Если возраст человека равен "+ ageOfPerson + " , то ему нужно ходить в университет");
        } else if (ageOfPerson >=24) {
            System.out.println("Если возраст человека равен "+ ageOfPerson + " , то ему пора ходить на работу");
        }
    }
}
