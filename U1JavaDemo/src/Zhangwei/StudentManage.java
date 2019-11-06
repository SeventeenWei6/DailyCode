package Zhangwei;

public class StudentManage {
    private  String ID;
    private  String Name;
    private  int Age;

    public StudentManage(String ID, String name, int age) {
        this.ID = ID;
        Name = name;
        Age = age;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }
}
