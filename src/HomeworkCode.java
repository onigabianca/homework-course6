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

        Product myProduct = new Product("Cuie", 80, 2456, "Elemente de ansamblare");
        System.out.println(myProduct);

        myProduct.hasStock();
        System.out.print("Quantity:");
        System.out.println((myProduct.hasStock()));

        System.out.print("Category:");
        myProduct.isCategory("Alala");
        System.out.println(myProduct.isCategory("Alala"));

        System.out.println("Exercitiul4:");
        System.out.println("Product1:");
        Product myProduct1 = new Product("Portocale", 11, 30000, "Fructe");
        System.out.println(myProduct1);

        myProduct1.hasStock();
        System.out.print("Quantity:");
        System.out.println((myProduct1.hasStock()));

        System.out.print("Category:");
        myProduct1.isCategory("Fructe");
        System.out.println(myProduct1.isCategory("Fructe"));

        System.out.println("Product2:");
        Product myProduct2 = new Product("Paine", 6, 120, "Panificatie");
        System.out.println(myProduct2);

        myProduct2.hasStock();
        System.out.print("Quantity:");
        System.out.println((myProduct2.hasStock()));

        System.out.print("Category:");
        myProduct2.isCategory("Legume");
        System.out.println(myProduct2.isCategory("Legume"));


        System.out.println("Exercitiul5:");
        Bottle myBottle = new Bottle(5 , 3,false);
        System.out.println(myBottle);

        System.out.println("More liquid then available liquid?");
        System.out.println(myBottle.moreLiquid(4));

        System.out.print("Available liquid:");
        System.out.println(myBottle.getAvailableLiquid());

        System.out.print("Empty capacity:");
        System.out.println(myBottle.emptyCapacity());
    }

}



