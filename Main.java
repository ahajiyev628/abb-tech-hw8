import java.util.*;

public class Main {

    public static void main(String[] args) {
        Human mother = new Human();
        Human father = new Human();
        Human child = new Human();

        Set<Pet> p = new Set<Pet>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Pet> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Pet pet) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Pet> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        Family family = new Family();
        //ArrayList<Human> family = new ArrayList<>();

        mother.setName("Tito");
        mother.setSurname("Karleone");
        /*mother.setYear(1960);
        mother.setIq(60);
        mother.setFather(new Human("Allahverdi", "Hajiyev"));
        mother.setMother(new Human("Allahverdi", "Hajiyev"));
        mother.setSchedule(new String[]{String.valueOf(DayOfWeek.Sunday), Human.tasks[0]});*/


        father.setName("Vito");
        father.setSurname("Karleone");
        /*father.setYear(1970);
        father.setIq(70);
        father.setFather(new Human("Allahverdi", "Hajiyev"));
        father.setMother(new Human("Allahverdi", "Hajiyev"));
        father.setSchedule(new String[]{String.valueOf(DayOfWeek.Thursday), Human.tasks[4]});*/

        child.setName("Michael");
        child.setSurname("Karleone");
        child.setYear(1990);
        child.setIq(50);
        child.setFather(new Human(father.getName(), father.getSurname()));
        child.setMother(new Human(mother.getName(), mother.getSurname()));
        child.setSchedule(Map.of(DayOfWeek.Saturday, Human.tasks[6]));

        ArrayList<Human> childs = family.addChild(child);
        for(Human ch : childs) System.out.println(ch.toString());

        // family.deleteChild(0);


        Dog dg = new Dog(AnimalSpecies.DOG, "wimel", 10, 51, new Set<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        });
        System.out.println(dg.describePet());

        System.out.print("Count of members in the family: " + family.countFamily());

    }
}