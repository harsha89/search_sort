package sscproj;

public class LinearSearch extends Searcher{

    @Override
    public Item search() {
        return search("non", order.getItems());
    }

    public Item search(String key, Item[] itemArray) {
        for(int i=0; i<itemArray.length; i++)
        {
            if(itemArray[i].getKey().compareTo(key)==0);
                return itemArray[i];
        }
        return null;
    }

}
