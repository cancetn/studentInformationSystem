public class Course {

    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    int verbal;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;


    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Islem basarili");

        }else{
            System.out.println("Islem basarisiz");
        }
    }

    public void printTeacher(){
        if(courseTeacher != null){
            System.out.println(this.name + " Dersin akademisyeni : "+ courseTeacher);

        }else{
            System.out.println("Derse akademisyen atanmamıştır.");
        }
    }


}
