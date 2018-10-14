package Java_extend.Strategy_P;

interface AgeGroup {
    void agegroup();
}

class Teenager implements AgeGroup {

    @Override
    public void agegroup() {
        System.out.println("10대입니다");
    }
}

class Twenties implements AgeGroup {

    @Override
    public void agegroup() {
        System.out.println("20대입니다");
    }
}

class Thirties implements AgeGroup {

    @Override
    public void agegroup() {
        System.out.println("30대입니다");
    }
}

class Forties implements AgeGroup {

    @Override
    public void agegroup() {
        System.out.println("40대입니다");
    }
}

class Age {
    private AgeGroup ageGroup;
    public Age(int age) {
        if(age >= 10 && age <= 19)
            this.ageGroup = new Teenager();
        else if(age >= 20 && age <= 29)
            this.ageGroup = new Twenties();
        else if(age >= 30 && age <= 39)
            this.ageGroup = new Thirties();
        else
            this.ageGroup = new Thirties();
    }

    public void ageGroup() {
        ageGroup.agegroup();
    }

    // Set Agegroup
    public void setStrategy(final AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }
}

class Person extends Age {
    public Person(int age) {
        super(age);
    }
}

public class Strategy_Pattern {
    public static void main(String[] args) {
        AgeGroup tennager = new Teenager();
        AgeGroup twenties = new Twenties();
        AgeGroup thirties = new Thirties();
        AgeGroup forties = new Forties();

        Person person1 = new Person(12);
        person1.ageGroup();

        Person person2 = new Person(22);
        person2.ageGroup();

        Person person3 = new Person(32);
        person3.ageGroup();

        // 10 years later
        person1.setStrategy(twenties);
        person2.setStrategy(thirties);
        person3.setStrategy(forties);

        person1.ageGroup();;
        person2.ageGroup();
        person3.ageGroup();
    }
}
