public class person {
    private String name;
    private int age;
    private String city;
    private String gender;

    public void eat(){
        System.out.print(this.name + "is eating");
    }

    public void idade(){
        System.out.print(this.name + "is" + this.age + "old");
    }

    public void play(){
        System.out.print(this.name + "is playing");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main (String args[]){
        person p1 = new person();
        person p2 = new person();

        p1.setName("Jhon");


        p1.getName();
    }
}