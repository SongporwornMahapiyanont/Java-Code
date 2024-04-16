package Composition;

import java.util.Scanner;

public class PrintInfo {
    Characterr c;
    String name;
    double HP,MP,Def;
    double str,dex,spd;
    PrintInfo(String name ,double HP, double MP ,double Def , double str ,double dex , double spd){
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.Def = Def;
        this.str = str;
        this.dex = dex;
        this.spd = spd;
    }
    public void printlnfo(){
        c = new Characterr(name, HP, MP, Def, str, dex, spd);
        c.critical();
        c.DeserveDamage();
    }
}

