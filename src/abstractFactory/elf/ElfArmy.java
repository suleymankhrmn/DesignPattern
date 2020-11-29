package abstractFactory.elf;

import abstractFactory.base.Army;

public class ElfArmy implements Army {
    static final String DESCRIPTION = "This is Elf Army";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
