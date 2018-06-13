package com.gtl.neeraj.daggertest.ui.bse;

public interface BseContract {

    public interface Presenter {
        void getData();
    }

    public interface View {
        void setData(String dataIn);

        void setError(String dataIn);
    }

}
