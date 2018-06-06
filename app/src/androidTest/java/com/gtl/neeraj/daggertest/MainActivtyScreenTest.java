package com.gtl.neeraj.daggertest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.gtl.neeraj.daggertest.ui.main.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by 10944 on 13-04-2018.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivtyScreenTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void clickLoadMoreButton_moreDataAdded() {
        onView(withId(R.id.loadMore)).perform(click());

        onView(withId(R.id.out)).check(matches(isDisplayed()));
    }

}
