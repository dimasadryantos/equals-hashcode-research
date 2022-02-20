package main;

public class Employee {

    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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

    /**
     * If two object are the same equals method will be use and the content should be check
     * if both the same equals & hashcode the content should be rejected (to make hash data structure like hashmap,set works efficient)
     * what if we don't use equals  ?
     * when the object considered the same it will replace the other one as it's against HashMap rules
     * and if we get the value it won't find the right one(as above being replaced)
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee employee = (Employee) obj;
        return employee.getAge() == this.getAge()
                && employee.getName() == this.getName();
    }

    /**
     * why should we use hash code ?
     * Note = if two objects are considered equal ,their hashcode must also be equal
     * what happened if we not using hashcode ?
     * - Two  equals instances have unequals hashcode (Violate hashcode contract mentioned in java doc)
     *
     * @return
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


}