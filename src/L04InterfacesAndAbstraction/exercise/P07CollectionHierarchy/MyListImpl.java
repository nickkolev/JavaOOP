package L04InterfacesAndAbstraction.exercise.P07CollectionHierarchy;

import L04InterfacesAndAbstraction.exercise.P07CollectionHierarchy.Interfaces.MyList;

public class MyListImpl extends Collection implements MyList {

    @Override
    public String remove() {
        return items.remove(0);
    }

    @Override
    public int add(String element) {
        items.add(0, element);
        return 0;
    }

    @Override
    public int getUsed() {
        return items.size();
    }
}
