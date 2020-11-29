package abstractFactory.factory;

import abstractFactory.base.Army;
import abstractFactory.base.Castle;
import abstractFactory.base.King;
import abstractFactory.elf.ElfArmy;
import abstractFactory.elf.ElfCastle;
import abstractFactory.elf.ElfKing;

public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
