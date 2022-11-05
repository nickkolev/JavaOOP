package L04InterfacesAndAbstraction.exercise.P07CollectionHierarchy;

import L04InterfacesAndAbstraction.exercise.P07CollectionHierarchy.Interfaces.Addable;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String element) {
        items.add(element);
        return items.indexOf(element);
    }
}
