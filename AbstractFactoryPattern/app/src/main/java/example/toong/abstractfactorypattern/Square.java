package example.toong.abstractfactorypattern;

import android.util.Log;
import example.toong.abstractfactorypattern.utils.Constant;

/**
 * Created by phanvanlinh on 28/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class Square implements Shape {
    @Override
    public void draw() {
        Log.i(Constant.TAG, "Inside Square::draw() method.");
    }
}
