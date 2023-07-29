package com.templateMethod.domain;

public class MineralResource implements BuildStructure {

    private static final int PER_RESOURCE = 7;
    private int resource;

    public MineralResource(int resource) {
        this.resource = resource;
    }

    @Override
    public void collect() {
        if(this.resource == 0) {
            System.out.println("자원이 고가되었습니다.");
            return;
        }
        this.resource -= PER_RESOURCE;

        if(this.resource <= 0) {
            this.resource = 0;
        }
    }
}
