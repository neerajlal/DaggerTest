package com.gtl.neeraj.daggertest.ui.main;

import java.util.Map;

public interface MainContract {

    public interface MainPresenter {

        void getData();

    }


    public interface MainView {

        void setData(Map<String, String> data);

        void setError(String error);

    }


}
