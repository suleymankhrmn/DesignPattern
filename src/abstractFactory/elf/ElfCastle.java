package abstractFactory.elf;

import abstractFactory.base.Castle;

public class ElfCastle implements Castle {
    static final String DESCRIPTION = "This is Elf Castle";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
