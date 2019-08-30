package com.sda.calculator;

import java.util.Comparator;

public class EntityComparator implements Comparator<Entity> {
    //metoda comparator returneaza un int care poate avea valorile:
    //1 - daca salariul (entity1 e > decat entity2)
    //0 - daca sunt egale
    //-1: - daca entity1 < entity2

    @Override
    public int compare(Entity entity1, Entity entity2) {
        if (entity1.amountReceived() == entity2.amountReceived()) {
            return 0;
        } else if (entity1.amountReceived() > entity2.amountReceived()) {
            return 1;
        } else {
            return -1;
        }

        //varianta de compare de mai sus scrisa mai simplu

      // return Double.compare(entity1.amountReceived(), entity2.amountReceived());
    }
}
