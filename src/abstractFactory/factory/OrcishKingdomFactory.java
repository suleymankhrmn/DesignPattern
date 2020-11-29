package abstractFactory.factory;

import abstractFactory.base.Army;
import abstractFactory.base.Castle;
import abstractFactory.base.King;
import abstractFactory.orcish.OrcishArmy;
import abstractFactory.orcish.OrcishCastle;
import abstractFactory.orcish.OrcishKing;

public class OrcishKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcishCastle();
    }

    @Override
    public King createKing() {
        return new OrcishKing();
    }

    @Override
    public Army createArmy() {
        return new OrcishArmy();
    }
}
