import java.util.Scanner;
public class TestStudent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Stoixeia Foititi 1 
        Student student1 = new Student();
        System.out.println("Dose onoma foititi 1:");
        student1.setOnoma(sc.next());
        System.out.println("Dose epitheto foititi 1");
        student1.setEpitheto(sc.next());
        System.out.println("Dose Arithmo Mhtrouu foititi 1");
        student1.setAm(sc.nextInt());
        System.out.println("Dose Arithmo Apousion foititi 1");
        student1.setApousies(sc.nextInt());
        System.out.println("Dose Vathmo Erhastirioy foititi 1");
        student1.setVathmosErg(sc.nextDouble());
        System.out.println("Dose Vathmo Theorias foititi 1");
        student1.setVathmosTh(sc.nextDouble());

        //Telikos vathmos Foititi 1 
        System.out.println("O telikos vathmos toy foititi 1 einai:" +student1.computeFinal(student1.vathmosErg, student1.vathmosTh));
        System.out.println(student1.toString());

        
        //Stoixeia Foititi 2
        Student student2 = new Student();
        System.out.println("Dose onoma foititi 2:");
        student2.setOnoma(sc.next());
        System.out.println("Dose epitheto foititi 2");
        student2.setEpitheto(sc.next());
        System.out.println("Dose Arithmo Mhtrouu foititi 2");
        student2.setAm(sc.nextInt());
        System.out.println("Dose Arithmo Apousion foititi 2");
        student2.setApousies(sc.nextInt());
        System.out.println("Dose Vathmo Erhastirioy foititi 2");
        student2.setVathmosErg(sc.nextDouble());
        System.out.println("Dose Vathmo Theorias foititi 2");
        student2.setVathmosTh(sc.nextDouble());

        //Telikos vathmos Foititi 2 
        System.out.println("O telikos vathmos toy foititi 2 einai:" +student2.computeFinal(student2.vathmosErg, student2.vathmosTh));
        System.out.println(student2.toString());
    }


}
