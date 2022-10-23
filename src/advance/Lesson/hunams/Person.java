package Advance.Lesson.hunams;

public class Person {
    private String name;
    private char sex;
    private int age;

    private Person mother;
    private Person father;

    Person(String name_, char sex, int age_){ // конструктор класса Person
        name = name_; // присваиваем поле ^^^
        this.sex = sex; // указываем this (обращение к полю данного объекта) чтобы не перепутать с параметром.
        age = age_;
    }

    public String getName() {
//
//        if (this.name == null) {
//            return "";
//        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void printName() {
        System.out.println(name);
    }

//    public void setMother(String name, char sex, int age){
//        this.mother = new Person(name, sex, age);
//    }

    public void setFather(String name, char sex, int age){
        this.father = new Person(name, sex, age);
    }

    public  void setMother(Person mother){
        this.mother = new Person(name, sex, age);
    }

}
