package pk1;
public class Student {
    double gpa_package; // access package 
    private double gpa_private; // edit severity method only 
    public double gpa_public;
    void test_access_package()
    {
        gpa_private = 3.5;
    }

    public void test_access_public(){
    
    }


    public double get_gpa_private(){ //getter
        return gpa_private; //edit variable private
    }
    
    public void set_gpa_private(double new_gpa){ //setter
        if(new_gpa>= 0 || new_gpa<=4)
            gpa_private = new_gpa;
    }

    class InnerStudent{

    }
}


