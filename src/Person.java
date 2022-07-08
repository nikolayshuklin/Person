public class Person {
    public String fullName;
    public int age;

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Иван Иванович Иванов", 55);

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }

    public void move (){
        System.out.println(this.fullName + " движется");
    }
    public void talk (){
        System.out.println(this.fullName + " говорит");
    }
    public Person() {
        this.fullName = "Неизвестный";
        this.age = 35;
    }
    public Person (String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

}
