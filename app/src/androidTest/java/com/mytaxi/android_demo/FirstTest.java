//Login case, the up-to-date credential (username & password) you can find here).
// Search for "sa", select the 2nd result (via the name, not the index) from the list, then click the call button.
// Author Amit Dhar

package com.mytaxi.android_demo;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

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
    public void setUp()  {
        //Before Test case execution
    }

    //Login case, the up-to-date credential (username & password) you can find here).
    // Search for "sa", select the 2nd result (via the name, not the index) from the list, then click the call button.
    //Deploy the tests on CircleCI, and send us the link to the CircleCI builds overview page.

    @Test
    public void testLoginSearch() {

      //  onView(withId(R.id.edt_username)).check(matches(isDisplayed()));
      //  onView(withId(R.id.edt_username)).perform(replaceText(username));
     //   onView(withId(R.id.edt_password)).check(matches(isDisplayed()));
     //   onView(withId(R.id.edt_password)).perform(replaceText(password));
     //   onView(withId(R.id.btn_login)).check(matches(isDisplayed()));
     //   onView(withId(R.id.btn_login)).perform(click());
        waitFor(15);
     //   onView(withId(R.id.textSearch)).check(matches(isDisplayed()));
     //   onView(withId(R.id.textSearch)).perform(typeText(searchKeyword));
        //onView(withText("Sarah Scott")).inRoot(RootMatchers.isPlatformPopup()).perform(click());
       // onView(withId(R.id.fab)).check(matches(isDisplayed()));
       // onView(withId(R.id.fab)).perform(click());
       // waitFor(15);
    }


    @After
    public void tearDown()  {
        //After Test case Execution

    }







}