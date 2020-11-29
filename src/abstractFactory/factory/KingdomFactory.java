package abstractFactory.factory;

import abstractFactory.base.Army;
import abstractFactory.base.Castle;
import abstractFactory.base.King;

public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
