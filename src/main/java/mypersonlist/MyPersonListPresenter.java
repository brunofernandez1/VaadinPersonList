package mypersonlist;

/**
 * Created by Bruno on 30.01.2018.
 */
public class MyPersonListPresenter implements MyPersonListView.MyPersonListViewListener {

    MyPersonListView view;
    MyPersonListModel model;

    public MyPersonListPresenter(MyPersonListView view, MyPersonListModel model){
        this.model = model;
        this.view  = view;
        view.addListener(this);
        System.out.println("presenter called");
    }

    @Override
    public void buttonClick() {
        System.out.println("buttonClick on Presenter was called");
        view.updateView();
    }
}
