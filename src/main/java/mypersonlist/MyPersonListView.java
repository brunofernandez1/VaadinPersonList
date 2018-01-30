package mypersonlist;


import com.vaadin.ui.CustomComponent;

/**
 * Created by Bruno on 30.01.2018.
 */
public interface MyPersonListView {
     public void updateView();

     public interface MyPersonListViewListener{
         void buttonClick();
     }

     public void addListener(MyPersonListViewListener listener);
}
