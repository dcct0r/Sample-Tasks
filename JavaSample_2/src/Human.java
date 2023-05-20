public class Human {
    private String firstName, lastName;
    private int age, birthDate, weight;

    Human(String firstName, String lastName, int age, int birthDate, int weight){
        this.age = age;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLastLetter() {
        return firstName.substring(this.firstName.length() - 1);
    }

    @Override
    public String toString() {
        return "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                ", birthDate = " + birthDate +
                ", weight = " + weight;
    }
}

