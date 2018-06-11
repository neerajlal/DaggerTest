package com.gtl.neeraj.daggertest;

import com.gtl.neeraj.daggertest.network.ApiService;
import com.gtl.neeraj.daggertest.ui.main.MainPresenterImpl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

/**
 * Created by 10944 on 11-04-2018.
 */

//@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    private MainPresenterImpl presenter;

    @Mock
    private MainView view;

    @Mock
    private ApiService api;

    /**
     * {@link ArgumentCaptor} is a powerful Mockito API to capture argument values and use them to
     * perform further actions or assertions on them.
     */
    @Captor
    private ArgumentCaptor<Runnable> captor;

    @Before
    public void setUpPresenter() {
        // Mockito has a very convenient way to inject mocks by using the @Mock annotation.
        // To inject the mocks in the test the initMocks method needs to be called.
        MockitoAnnotations.initMocks(this);

        presenter = new MainPresenterImpl(view, api);
    }

    @Test
    public void isDataLoading() {
        presenter.getData();

        verify(view).setData(null);
    }

    @Test
    public void IsLoadButtonWorking() {

    }

}
