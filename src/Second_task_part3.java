public class Second_task_part3 {
    public static void main(String[] args) {
        //Задание 2.3
        System.out.println("Задание 2.3");

        int ageOfChild =3;
        if (ageOfChild <5) {
            System.out.println("Ребенку нельзя кататься на аттракционе");
        } else if(ageOfChild >=5 && ageOfChild <14){
            System.out.println("Ребенок может кататься ТОЛЬКО в сопровождении взрослого");
        } else if (ageOfChild >=14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }
    }
}
