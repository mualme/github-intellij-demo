public class Human {
    private String name;
    private int age;
    private boolean isReady;

    public Human(String name, int age, boolean isReady) {
        this.name = name;
        this.age = age;
        this.isReady = isReady;
    }

    public void sayHello() {
        System.out.println("Hello, I am " +name);
    }

    public void celebrateBirthday() {
        this.age++;
        System.out.println("Happy Birthday! I am now " +age);
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public boolean getIsReady() {return isReady;}
    public void setIsReady(boolean isReady) {this.isReady = isReady;}
}
