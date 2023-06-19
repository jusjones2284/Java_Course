public class Student {

    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList){
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String name(String name){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDateOfBirth(String dateOfBirth){
        return dateOfBirth;
    }

    public  void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList(String classList){
        return classList;
    }

    public void setClassList(String classList){
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
//The Record Type - the record was introduced in JDK 14, and became
//officially part of Java in JDK 16. its purpose is to replace the boiler
//plate code of the pojo, but to be more restrictive. The record is a special
//class that contains data, that is not meant to be altered.