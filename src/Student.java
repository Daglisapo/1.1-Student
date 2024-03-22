public class Student {

    //DILOSI METAVLITON
    int am, apousies; 
    double vathmosErg, vathmosTh; 
    String onoma, epitheto ;

    //CONSTRUCTOR
    Student(){
        int am = 2021031; 
        int apousies = 3; 
        double vathmosErg = 8.3; 
        double vathmosTh = 4.5; 
        String onoma = "Apostolos";
        String epitheto = "Dagklis";
    }

    //SETTERS & GETTERS
    public int getAm(){
        return am; 
    }
    public void setAm (int am){
        this.am = am; 
    }  

    public int getApousies(){
        return apousies; 
    }
    public void setApousies (int apousies){
        this.apousies = apousies; 
    } 

    public double getVathmosErg(){
        return vathmosErg; 
    }
    public void setVathmosErg (double vathmosErg){
        this.vathmosErg = vathmosErg; 
    }
    
    public double getVathmosTh(){
        return vathmosTh; 
    }
    public void setVathmosTh (double vathmosTh){
        this.vathmosTh = vathmosTh; 
    }
    
    public String getOnoma(){
        return onoma; 
    }
    public void setOnoma (String onoma){
        this.onoma = onoma; 
    }  

    public String getEpitheto(){
        return epitheto; 
    }
    public void setEpitheto (String epitheto){
        this.epitheto = epitheto; 
    }

    //toString Method
    public String toString(){
        return "Mathitis: " + onoma + epitheto + "\nArithmos Mitroou:" + am + "\nArithmos Apousion:" + apousies; 
    }

    //computeFinal Method 
    public double computeFinal(double vathmosErg, double vathmosTh){
        double vathmos; 
        vathmos = vathmosErg*0.3 + vathmosTh*0.7; 
        return vathmos; 
    }
}
