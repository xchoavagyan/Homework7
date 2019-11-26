package Git;

public class Person {
    // region Properties

    private int age;

    //endregion

    // region Methods
    public void greet(){
        System.out.println("Hello");
    }
    //endregion

    // region Getters and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion
}
