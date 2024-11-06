public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1:");
        String firstName = "Ivanov", middleName = "Ivan", lastName = "Ivanovich",
                fullName = "Ivanov Ivan Ivanovich";

        //Задача 2
        System.out.println("Задача 2:");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения" +
                " отчета - " + fullName.toUpperCase());

        //Задача 3
        System.out.println("Задача 3:");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName.replace("ё", "е"));
    }
}
