public class Second_task {
    public static void main(String[] args) {
        //Задание 2.1 + Задание 2.2
        System.out.println("Задание 2.1 + Задание 2.2");

        int age =19;
        if (age >=7 && age <18) {
            System.out.println("Ты ходишь в школу");
        } else if(age >=18 && age <24){
            System.out.println("Поздравляю с окончанием школы!Ты можешь пойти в институт.");
        } else if (age >=24) {
            System.out.println("Поздравляю с окончанием университета, пора искать первую работу!");
        }

    }
}
    /* ребенок ходит в школу, если его возраст равен или больше 7 годам
        человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
        человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет. */