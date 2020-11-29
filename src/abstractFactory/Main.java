package abstractFactory;

import abstractFactory.base.Castle;
import abstractFactory.factory.ElfKingdomFactory;
import abstractFactory.factory.KingdomFactory;

public class Main {
    public static void main(String[] args){
        KingdomFactory factory = new ElfKingdomFactory();
        Castle castle = factory.createCastle();
        System.out.println(castle.getDescription());
    }
}
