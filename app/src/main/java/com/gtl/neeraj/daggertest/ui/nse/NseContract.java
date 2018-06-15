package com.gtl.neeraj.daggertest.ui.nse;

import java.util.Map;

public interface NseContract {

    interface MainPresenter {

        void getData();

    }


    interface MainView {

        void setData(Map<String, String> data);

        void setError(String error);

    }


}
