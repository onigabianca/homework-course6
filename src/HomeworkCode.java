public class HomeworkCode {
    public static void main(String[] args) {
        System.out.println("Exercitiul1:");
        Person myPerson = new Person("Bianca", 24, false);
        System.out.println(myPerson.getPerson());
        System.out.println(myPerson);

        System.out.println("Exercitiul2:");
        System.out.println("Person 1:");
        Person person1 = new Person("Maria", 30, true);
        System.out.println(person1);

        System.out.println("Person 2:");
        Person person2 = new Person("Laura", 16, false);
        System.out.println(person2);

        System.out.println("Person 3:");
        Person person3 = new Person("Corina", 24, false);
        System.out.println(person3);

        System.out.println("Exercitiul3:");
        Product myProduct = new Product("Cuie", 80, 1457, "Elemente de ansamblare");
        System.out.println(myProduct);

    }
}


