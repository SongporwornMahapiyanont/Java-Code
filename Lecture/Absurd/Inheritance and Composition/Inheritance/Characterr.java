package Inheritance;

public class Characterr{
    String name;
    double HP,MP,Def;
    double str,dex,spd,horny;
    // Characterr(String name , double HP , double MP , double Def , double str, double dex , double spd){
    //     this.name = name;
    //     this.HP = HP;
    //     this.MP = MP;
    //     this.Def = Def;
    //     this.str = str;
    //     this.dex = dex;
    //     this.spd = spd;
    // } should not have Constructor in Super-Class.
    double critical(){
        double atk = str*2;
        System.out.println("Critical atk = " + atk);
        return atk;
    }
    double DeserveDamage(){
        double damage = (Def/100)*str;
        System.out.println("Deserve damage = " + damage);
        return damage;
    }
    double HORNY()
    {
        return horny*0;
    }
}

