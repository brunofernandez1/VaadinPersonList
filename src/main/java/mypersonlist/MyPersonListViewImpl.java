package mypersonlist;
import com.vaadin.ui.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruno on 30.01.2018.
 */
public class MyPersonListViewImpl extends CustomComponent implements MyPersonListView, Button.ClickListener{

    VerticalLayout personLayout = new VerticalLayout();
     GridLayout Persongrid;

    public MyPersonListViewImpl(){
        Panel panel = new Panel("this is the PersonList");
        GridLayout Persongrid = new GridLayout();
        Button click = new Button("Update List", this);
        personLayout.addComponents(panel, Persongrid, click);
        personLayout.setVisible(true);
        personLayout.setSizeFull();
        setSizeFull();
        setVisible(true);
        setCompositionRoot(personLayout);
        System.out.println("viewimplementation called");

    }

    List<MyPersonListViewListener> listeners = new ArrayList<MyPersonListViewListener>();


    @Override
    public void updateView() {
        System.out.println("View was updated");
        this.getLayout().addComponent(new Button("i was added"));

    }

    public VerticalLayout getLayout(){
        return this.personLayout;
    }

    @Override
    public void addListener(MyPersonListViewListener listener) {
        listeners.add(listener);

    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        //this.personLayout.addComponent(new Label("gugs"));
        System.out.println("button click was pressed");
        for (MyPersonListViewListener listener: listeners){
            System.out.println("button click was pressed");
            listener.buttonClick();
        }

    }
}
