/**
 * Created by Amit Dhar on 8/7/2018.
 */

package com.mytaxi.android_demo;

import static android.support.test.espresso.Espresso.onView;
import android.support.test.espresso.matcher.RootMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import com.mytaxi.android_demo.activities.MainActivity;
import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import java.io.IOException;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.mytaxi.android_demo.utility.waitFor;


@RunWith(AndroidJUnit4.class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FirstTest {

    public static String username = "crazydog335";
    public static String password = "venture";
    public static String searchKeyword = "sa";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);


    @Before
    public void setUp() throws Exception {
        //Before Test case execution
    }

    // Login case, the up-to-date credential (username & password)
    @Test
    public void testLogin() {

       onView(withId(R.id.edt_username)).check(matches(isDisplayed()));
       onView(withId(R.id.edt_username)).perform(replaceText(username));
       onView(withId(R.id.edt_password)).check(matches(isDisplayed()));
       onView(withId(R.id.edt_password)).perform(replaceText(password));
       onView(withId(R.id.btn_login)).check(matches(isDisplayed()));
       onView(withId(R.id.btn_login)).perform(click());

    }


    // Search for "sa", select the 2nd result (via the name, not the index)
    @Test
    public void testSearchViaName() {

        onView(withId(R.id.edt_username)).check(matches(isDisplayed()));
        onView(withId(R.id.edt_username)).perform(replaceText(username));
        onView(withId(R.id.edt_password)).check(matches(isDisplayed()));
        onView(withId(R.id.edt_password)).perform(replaceText(password));
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_login)).perform(click());
        waitFor(15);
        onView(withId(R.id.textSearch)).check(matches(isDisplayed()));
        onView(withId(R.id.textSearch)).perform(typeText(searchKeyword));
        onView(withText("Sarah Scott")).inRoot(RootMatchers.isPlatformPopup()).perform(click());
    }

    // from the list, then click the call button
    @Test
    public void testListClick() {

        onView(withId(R.id.edt_username)).check(matches(isDisplayed()));
        onView(withId(R.id.edt_username)).perform(replaceText(username));
        onView(withId(R.id.edt_password)).check(matches(isDisplayed()));
        onView(withId(R.id.edt_password)).perform(replaceText(password));
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_login)).perform(click());
        waitFor(15);
        onView(withId(R.id.textSearch)).check(matches(isDisplayed()));
        onView(withId(R.id.textSearch)).perform(typeText(searchKeyword));
        onView(withText("Sarah Scott")).inRoot(RootMatchers.isPlatformPopup()).perform(click());
        onView(withId(R.id.fab)).check(matches(isDisplayed()));
        onView(withId(R.id.fab)).perform(click());
    }


      @After
    public void tearDown() throws Exception {
        //After Test case Execution
    }




}