package sscproj;

public class BinarySearch extends Searcher{

    @Override
    public Item search() {
        return search("non", order.getItems());
    }

    public static Item search(String key, Item[] itemArray) {
        return search(key, itemArray, 0, itemArray.length);
    }
    public static Item search(String key, Item[] itemArray, int lo, int hi) {
        if (hi <= lo) return null;
        int mid = lo + (hi - lo) / 2;
        int cmp = itemArray[mid].getKey().compareTo(key);
        if      (cmp > 0) return search(key, itemArray, lo, mid);
        else if (cmp < 0) return search(key, itemArray, mid+1, hi);
        else              return itemArray[mid];
    }


}
