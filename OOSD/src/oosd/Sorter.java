package oosd;


public abstract class Sorter {
    final String name;
    final int ServiceID;
    protected Order order = new Order();


    public Sorter() {
        name = "sorter1";
        ServiceID = 12345;
    }

    public abstract void sort();
   
    public void setOrder(Order order) {
        this.order = order;
    }



}
