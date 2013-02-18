package oosd;

public class InsertionSort extends Sorter{
    @Override
    public void sort(){
    int a,b;
	    Item temp;
		int sortTheStrings = order.getItems().length - 1;
		for (a = 0; a < sortTheStrings; ++a)
		for (b = 0; b < sortTheStrings; ++b)
		if(order.getItems()[b].getKey().compareTo(order.getItems()[b + 1].getKey()) >0)
		{
		  temp = order.getItems()[b];
		  order.getItems()[b] = order.getItems()[b + 1];
		  order.getItems()[b + 1] = temp;
	    	}
    }
}
