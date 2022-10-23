package Advance.Lesson.hunams;

public class Main {
    public static void main(String[] args) {

        Person john = new Person("John", 'M', 30);
        Person jane = new Person("Jane", 'W', 52);
        john.setMother(jane);
        john.setFather("ganna", 'f', 30);
        //        john.name = "Jhon";
//        john.sex = 'M';
//        john.age = 30;
//        john.father = new Person("Jake", 'M', 26);
//        jane.name = "Jane";
//        john.mother.setMother("anna", 'f', 30);




        john.printName();
        jane.printName();

        System.out.println(String.format("name: %s, sex: %s, age %d", john.getName(), john.getSex(), john.getAge()));
        System.out.println(String.format("name: %s, sex: %s, age %d, mother: %s", john.getName(), john.getSex(), john.getAge(), john.getFather().getName()));
    }


}
