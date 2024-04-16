package GetterandSetter;

class Id {
    private String id = "33018013831798";
    Id(){

    }
    String Getter(){ // print value
        return id;
    }
    void Setter(){ // edit value and etc. but it is not print
        int start=0,stop=0;
        char target = '1';
        for(;;)
        {
            stop = id.indexOf(target,start);
            if(stop!=-1)
            {
                System.out.print(id.substring(start, stop) + " ");
            }
            else 
            {
                System.out.println(id.substring(start, id.length()));
                break;
            }
            start = stop+1;
        }
    }   
}
