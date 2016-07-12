package tenth.windows.mytransformer01;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

public class IntroAdapter extends FragmentPagerAdapter {

    public IntroAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return IntroFragment.newInstance(Color.parseColor("#003F51B5"), position); // blue
            case 1:
                return IntroFragment.newInstance(Color.parseColor("#003F51B5"), position); // blue
            case 2:
                return IntroFragment.newInstance(Color.parseColor("#003F51B5"), position); // blue
            case 3:
                return IntroFragment.newInstance(Color.parseColor("#003F51B5"), position); // blue
            case 4:
                return IntroFragment.newInstance(Color.parseColor("#003F51B5"), position); // blue
//            case 5:
//                return IntroFragment.newInstance(Color.parseColor("#003F51B5"), position); // blue
            default:
                return IntroFragment.newInstance(Color.parseColor("#003F51B5"), position); // green
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

}