package com.gtl.neeraj.daggertest.ui.bse;

public interface BseContract {

    interface Presenter {
        void getData();
    }

    interface View {
        void setData(String dataIn);

        void setError(String dataIn);
    }

}
