package com.gtl.neeraj.daggertest.ui.nse;

import java.util.Map;

public interface NseContract {

    public interface MainPresenter {

        void getData();

    }


    public interface MainView {

        void setData(Map<String, String> data);

        void setError(String error);

    }


}
