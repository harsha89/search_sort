package sscproj;


public abstract class Searcher {
    final String name;
    final int ServiceID;
    protected Order order = new Order();

    public Searcher() {
        name = "sorter1";
        ServiceID = 12345;
    }


    public abstract Item search();

    public void setOrder(Order order) {
        this.order = order;
    }
}
