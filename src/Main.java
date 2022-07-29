public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KMY101","KMY");

        Teacher t1 = new Teacher("Ali","1888888","MAT");
        Teacher t2 = new Teacher("Ayse","1888889","FZK");
        Teacher t3 = new Teacher("Fatma","1888890","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Can",3,"2003013081",mat,fizik,kimya);
        s1.sınavNotuBul(50,20,40);
        s1.sozluNotuBul(70,20,30);
        s1.gectiMi();

        Student s2 = new Student("Beyza",3,"2003013082",mat,fizik,kimya);

        s2.sınavNotuBul(100,50,40);
        s2.sozluNotuBul(50,20,40);
        s2.gectiMi();

        Student s3 = new Student("Irem",1,"2003013083",mat,fizik,kimya);
        s3.sınavNotuBul(50,20,40);
        s2.sozluNotuBul(40,60,80);
        s3.gectiMi();




    }
}
