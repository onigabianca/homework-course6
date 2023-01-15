public class Person {
    private String name;
    private int age;
    private boolean married;

    String getPerson() {
        return "Name:" + name + " Age: " + age + " Married status : " + married;
    }

    Person(String givenName, int givenAge, boolean isMarried) {
        name = givenName;
        age = givenAge;
        married = isMarried;
    }

    @Override
    public String toString() {
        return "My person has name %s and age %s and married status is %s.".formatted(this.name, this.age, this.married);
    }
}