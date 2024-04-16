package Inheritance;

public class Earth extends Characterr{
    Earth(String name , double HP , double MP , double Def , double str, double dex , double spd,double horny) {
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.Def = Def;
        this.str = str;
        this.dex = dex;
        this.spd = spd;
        this.horny = horny;
    }
    void printlnfo(){
        critical();
        DeserveDamage();
        System.out.println("HORNY sub = " + HORNY());
    }
    double HORNY(){
        
        System.out.println("Horny super = " + super.HORNY());
        return horny*99999999;
    }
}
