public class Student {
    //instance
    private String id;
    private String name;
    private String dateofBirth;
    private String classList;

    //constructor
    public Student(String id, String name, String dateofBirth, String classList){
        this.id = id;
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.classList = classList;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateofBirth='" + dateofBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateofBirth(){
        return dateofBirth;
    }

    public String getClassList(){
        return classList;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setClassList(String classList){
        this.classList = classList;
    }

    public void setDateofBirth(String dateofBirth){
        this.dateofBirth = dateofBirth;
    }
}


