package oop.buoi07.testprotected;

public class Person {
    protected String name;
    protected String birthday;

    public Person(String name, String birday) {
        this.name = name;
        this.birthday = birday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person [birthday=" + birthday + ", name=" + name + "]";
    }

}
