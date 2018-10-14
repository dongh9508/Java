package Java_extend;

class Age {
    int age;
    public Age(int age) {
        this.age = age;
    }

    public void agegroup() {}

}

class Person extends Age {

    public Person(int age) {
        super(age);
    }

    @Override
    public void agegroup() {
        if(age >= 10 && age <= 19)
            System.out.println("저는 10대입니다.");
        else if(age >= 20 && age <= 29)
            System.out.println("저는 20대입니다.");
        else if(age >= 30 && age <= 39)
            System.out.println("저는 30대입니다.");
        else
            System.out.println("저는 40대입니다.");
    }
}


public class default_pattern {
    public static void main(String[] args) {
        Person person1 = new Person(12);
        person1.agegroup();

        Person person2 = new Person(23);
        person2.agegroup();

        Person person3 = new Person(33);
        person3.agegroup();

        //10 years later
        person1 = new Person(22);
        person1.agegroup();

        person2 = new Person(33);
        person2.agegroup();

        person3 = new Person(43);
        person3.agegroup();

    }
}

