public class Third_task_part3 {
    public static void main(String[] args) {
        int one = 95;
        int two = 7;
        int three =95;
        if (one >three && one> two) {
            System.out.println("Число " + one + " бОльшее из всех");
        } else if (two >three && two > one){
            System.out.println("Число " + two + " бОльшее из всех");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " бОльшее из всех");
        } else if (one == two || two== three || one==three) {
            System.out.println("Невозможно определить наибольшее из чисел");
        }
    }
}
