package com.sda.calculator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Entity> entityList = createEntityList();
        List<Entity> rearrangedEntityList = rearrangeEntities(entityList);
        System.out.println(rearrangedEntityList);

        double salariesFromCluj = computeAmountReceivedPerCity(entityList, "Cluj");
        System.out.println(salariesFromCluj);

    }

    public static List<Entity> createEntityList() {
        List<Entity> entities = new ArrayList<>();

        Professor prof1 = new Professor("Cluj", 4500);
        Professor prof2 = new Professor("Brasov", 3500);
        Student student1 = new Student("Cluj", 1500);
        Student student2 = new Student("Oradea", 1200);


        entities.add(prof1);
        entities.add(prof2);
        entities.add(student1);
        entities.add(student2);

        return entities;

    }

    public static List<Entity> rearrangeEntities(List<Entity> entities) {
        List<Entity> students = new ArrayList<>();
        List<Entity> professors = new ArrayList<>();
        for (Entity e : entities) {
            if (e instanceof Student) {
                students.add(e);
            } else if (e instanceof Professor) {
                professors.add(e);
            }
        }

        Comparator<Entity> myComparator = new EntityComparator();
        //studentii crescator si profi descrescator
        Collections.sort(students, myComparator);
        Collections.sort(professors, myComparator);
        Collections.reverse(professors);

        entities.clear(); // stergem valorile din lista
        entities.addAll(professors);
        entities.addAll(students);

        return entities;
    }

    public static double computeAmountReceivedPerCity(List<Entity> entities, String city) {
        double sum = 0;
        for (Entity e : entities) {
            if (e.getCity().equals(city)) {
                sum = sum + e.amountReceived();
            }
        }
        return sum;
    }
}


