package dev.lpa;


import java.util.LinkedList;

record Place(String name, int distance){
    //by creating the record we have constructor, accessor methods, and overridden to string


    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class Main {
    public static void main(String[] args) {

        //linkedList is going to contain a list of our Place records
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        Place spain = new Place("Madrid", 1500);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, spain);
        addPlace(placesToVisit, new Place("Adelaide", 1374));
        addPlace(placesToVisit, new Place("New York", 600));
        addPlace(placesToVisit, new Place("Swiss", 900));
        placesToVisit.addFirst(new Place("Sydney", 9));
        placesToVisit.addLast(new Place("Baton rouge", 5));
        System.out.println(placesToVisit);

    }

    private static void addPlace(LinkedList<Place> list, Place place){

        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }
        for (Place p: list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
            int matchedIndex = 0;
            for (var listPlace: list){
                if(place.distance() < listPlace.distance()){
                    list.add(matchedIndex, place);
                    return;
                }
                matchedIndex++;
            }
        }

        list.add(place);
        System.out.println(place);
    }
}