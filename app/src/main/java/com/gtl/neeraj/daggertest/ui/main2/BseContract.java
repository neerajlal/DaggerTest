package com.gtl.neeraj.daggertest.ui.main2;

public interface BseContract {

    public interface Presenter {
        void getData();
    }

    public interface View {
        void setData(String dataIn);

        void setError(String dataIn);
    }

}
