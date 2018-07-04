package org.opentutorials.javatutorials.array;

public class GetDemo {
    public static void main(String[] args) {
        //String[] classgroup = { "최진혁", "최유빈", "한이란", "이고잉"};
        String[] classGroup = new String[4];
        classGroup[0] = "최진혁";
        System.out.println(classGroup.length);
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);
        classGroup[2] = "한아람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";
        System.out.println(classGroup.length);
    }
}
