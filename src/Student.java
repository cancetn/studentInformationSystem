public class Student {
    String name;
    int classes;
    String studentNo;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean gectiMi;

    Student(String name,int classes, String studentNo, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        ortalamaHesaplama();
        this.gectiMi = false;

    }

    public void sınavNotuBul(int mat, int fizik, int kimya){
        if(mat>=0 && mat <= 100){
            this.mat.note = mat;
        }
        if(fizik>=0 && fizik <= 100){
            this.fizik.note = fizik;
        }
        if(kimya>=0 && kimya <= 100){
            this.kimya.note = kimya;
        }
    }
    public void sozluNotuBul(int mat, int fizik, int kimya){
        if(mat>=0 && mat <= 100){
            this.mat.verbal = mat;
        }
        if(fizik>=0 && fizik <= 100){
            this.fizik.verbal = fizik;
        }
        if(kimya>=0 && kimya <= 100){
            this.kimya.verbal = kimya;
        }

    }
    public void gectiMi(){
        if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0){
            System.out.println("Notlar girilmemis");
        }else {
            this.gectiMi = gecisKontrolu();
            printNote();
            System.out.println("Ortalama : "+this.avarage);
            if(this.gectiMi){
                System.out.println("Sinifi gecit");

            }else{
                System.out.println("Sinifta kaldi");
            }

        }
    }

    public void ortalamaHesaplama(){

        this.avarage = (((this.mat.note *80)+(this.mat.verbal*20)) + ((this.fizik.note *80)+(this.fizik.verbal*20)) + ((this.kimya.note *80)+(this.kimya.verbal*20)))/3;

    }

    public boolean gecisKontrolu(){

        ortalamaHesaplama();

        return this.avarage>55;

    }

    public void printNote(){
        System.out.println("==============================");
        System.out.println("Ogrenci : "+this.name);
        System.out.println("Matematik notu : "+this.mat.note);
        System.out.println("Matematik sozlu notu : "+this.mat.verbal);
        System.out.println("Fizik notu : "+this.fizik.note);
        System.out.println("Fizik sozlu notu : "+this.fizik.verbal);
        System.out.println("Kimya notu : "+this.kimya.note);
        System.out.println("Kimya sozlu notu : "+this.kimya.verbal);
    }

}
