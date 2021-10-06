package lss;

public class FinalKiss {
    private String name;
    private int age;

    public FinalKiss() {
    }

    public FinalKiss(String name, int age) {
        this.name = name;
        this.age = age;
    }


}

class LastFinalKiss extends FinalKiss {
    private String gender;

    public LastFinalKiss(String gender) {
        this.gender = gender;
    }

    public LastFinalKiss(String name, int age, String gender) {

        this.gender = gender;
    }
}