package activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.cloudconcept.BaseActivity;

import fragment.SamplesFragment;
import utilities.ExceptionHandler;
import utilities.TitleConstants;

/**
 * Created by Abanoub Wagdy on 12/15/2015.
 */
public class SamplesActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));
    }

    @Override
    public Fragment GetFragment() {
        Fragment fragment = SamplesFragment.newInstance();
        return fragment;
    }

    @Override
    public String GetHeaderTitle() {
        return TitleConstants.SAMPLES_TITLE;
    }

    @Override
    public int GetCalendarVisibillity() {
        return View.GONE;
    }

    @Override
    public int GetAddVisibillity() {
        if (getIntent().getIntExtra("addfunction", -1) == 1) {
            return View.VISIBLE;
        } else {
            return View.GONE;
        }
    }

    @Override
    public int GetBackVisibillity() {
        if (getIntent().getIntExtra("showmenu", -1) == 2) {
            return View.VISIBLE;
        } else {
            return View.GONE;
        }

    }

    @Override
    public int GetMenuVisibillity() {

        if (getIntent().getIntExtra("showmenu", -1) == 1) {
            return View.VISIBLE;
        } else {
            return View.GONE;
        }
    }

    public View GetAddControl() {
        return imageAdd;
    }
}
