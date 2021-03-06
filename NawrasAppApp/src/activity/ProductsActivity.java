package activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;

import com.cloudconcept.BaseActivity;

import fragment.HomeFragment;
import fragment.ProductsFragment;
import utilities.ExceptionHandler;
import utilities.TitleConstants;

/**
 * Created by Abanoub Wagdy on 12/15/2015.
 */
public class ProductsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));
    }

    @Override
    public Fragment GetFragment() {
        Fragment fragment = ProductsFragment.newInstance();
        return fragment;
    }

    @Override
    public String GetHeaderTitle() {
        return TitleConstants.PRODUCTS_TITLE;
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

    public ImageView GetAddControl() {
        return imageAdd;
    }
}
