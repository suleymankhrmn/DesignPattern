package abstractFactory.elf;

import abstractFactory.base.King;

public class ElfKing implements King {
    static final String DESCRIPTION = "This is Elf King";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
