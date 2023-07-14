package com.templateMethod.domain;

public class GasResource implements BuildStructure {

    private static final int PER_RESOURCE = 5;
    private int resource;

    public GasResource(int resource) {
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
