package tenth.windows.mytransformer01;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

class Dimen {
    int width;
    int height;
}

public class IntroActivity extends AppCompatActivity {

    // base for all project and
    private int LG_G3_DIMENTIONS_WIDTH = 1440;
    private int LG_G3_DIMENTIONS_HEIGHT = 2392;


    private float BACK_IMAGE_TOP_DISTANCE;
    private float BACK_IMAGE_LEFT_DISTANCE;

    private Dimen dimensOfBackGroundImage;
    private ViewPager mViewPager;
    private ImageView iv_skip;
    //    Point myPoint;
    private RelativeLayout rl_bigest;

    private ImageView movingObj1;
    int movingObj1_width;
    int movingObj1_heigh;

    private ImageView movingObj2;
    int movingObj2_width;
    int movingObj2_heigh;

    private ImageView movingObj3;
    int movingObj3_width;
    int movingObj3_heigh;

    private ImageView movingObj4;
    int movingObj4_width;
    int movingObj4_heigh;

    private ImageView movingObj5;
    int movingObj5_width;
    int movingObj5_heigh;

//    ImageView iv_gas;
//    int iv_gas_width;
//    int iv_gas_heigh;


    private ImageView MianImage;

    double x_movingObj1_init_onCenterPic;
    double y_movingObj1_init_onCenterPic;
    double x_movingObj1_post1_onCenterPic;
    double y_movingObj1_post1_onCenterPic;

    double x_movingObj2_init_onCenterPic;
    double y_movingObj2_init_onCenterPic;
    double x_movingObj2_post1_onCenterPic;
    double y_movingObj2_post1_onCenterPic;

    double x_movingObj3_init_onCenterPic;
    double y_movingObj3_init_onCenterPic;
    double x_movingObj3_post1_onCenterPic;
    double y_movingObj3_post1_onCenterPic;

    double x_movingObj4_init_onCenterPic;
    double y_movingObj4_init_onCenterPic;
    double x_movingObj4_post1_onCenterPic;
    double y_movingObj4_post1_onCenterPic;

    double x_movingObj5_init_onCenterPic;
    double y_movingObj5_init_onCenterPic;
    double x_movingObj5_post1_onCenterPic;
    double y_movingObj5_post1_onCenterPic;
    double x_movingObj5_post2_onCenterPic;
    double y_movingObj5_post2_onCenterPic;

    int x_movingObj1_init;
    int y_movingObj1_init;
    int x_movingObj1_post1;
    int y_movingObj1_post1;

    int x_movingObj2_init;
    int y_movingObj2_init;
    int x_movingObj2_post1;
    int y_movingObj2_post1;

    int x_movingObj3_init;
    int y_movingObj3_init;
    int x_movingObj3_post1;
    int y_movingObj3_post1;

    int x_movingObj4_init;
    int y_movingObj4_init;
    int x_movingObj4_post1;
    int y_movingObj4_post1;

    int x_movingObj5_init;
    int y_movingObj5_init;
    int x_movingObj5_post1;
    int y_movingObj5_post1;
    int x_movingObj5_post2;
    int y_movingObj5_post2;


    private Point getDimensionsOfSmartPhoneScreen() {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        return size;
    }

    private Dimen getDimensionsOfMainImage_iv() {
        Dimen d = new Dimen();
        ImageView iv = (ImageView) findViewById(R.id.iv_temp_iv);
        Point size = new Point();
        d.width = iv.getWidth();
        d.height = iv.getHeight();

        return d;
    }

    private int getXBasedOnNewScreen(int oldX) {

        int result = (oldX * getDimensionsOfSmartPhoneScreen().x) / LG_G3_DIMENTIONS_WIDTH;
        return result;
    }

    private int getYBasedOnNewScreen(int oldY) {

        int result = (oldY * getDimensionsOfSmartPhoneScreen().y) / LG_G3_DIMENTIONS_HEIGHT;
        return result;
    }

    public static double ConvertRange(
            double originalStart, double originalEnd, // original range
            double newStart, double newEnd, // desired range
            double value) // value to convert
    {
        double scale = (double) (newEnd - newStart) / (originalEnd - originalStart);
        return (double) (newStart + ((value - originalStart) * scale));
    }

    private void positionsClaculationsOfMovingObjects() {

       /* for first viewPager's page, animation Object's Dimens
       (like movingObj1_getWidth()) is 0 so It should be set manually
       like done below.*/

        x_movingObj1_init = (int) (-getXBasedOnNewScreen(movingObj1_width) / 2 + getDimensionsOfSmartPhoneScreen().x * (BACK_IMAGE_LEFT_DISTANCE) + dimensOfBackGroundImage.width * x_movingObj1_init_onCenterPic);
        y_movingObj1_init = (int) (-getYBasedOnNewScreen(movingObj1_heigh) / 2 + getDimensionsOfSmartPhoneScreen().y * (BACK_IMAGE_TOP_DISTANCE) + dimensOfBackGroundImage.height * y_movingObj1_init_onCenterPic);

        x_movingObj1_post1 = (int) (-movingObj1.getWidth() / 2 + getDimensionsOfSmartPhoneScreen().x * (BACK_IMAGE_LEFT_DISTANCE) + dimensOfBackGroundImage.width * x_movingObj1_post1_onCenterPic);
        y_movingObj1_post1 = (int) (-movingObj1.getHeight() / 2 + getDimensionsOfSmartPhoneScreen().y * (BACK_IMAGE_TOP_DISTANCE) + dimensOfBackGroundImage.height * y_movingObj1_post1_onCenterPic);

        x_movingObj2_init = (int) (-getXBasedOnNewScreen(movingObj2_width) / 2 + getDimensionsOfSmartPhoneScreen().x * (BACK_IMAGE_LEFT_DISTANCE) + dimensOfBackGroundImage.width * x_movingObj2_init_onCenterPic);
        y_movingObj2_init = (int) (-getYBasedOnNewScreen(movingObj2_heigh) / 2 + getDimensionsOfSmartPhoneScreen().y * (BACK_IMAGE_TOP_DISTANCE) + dimensOfBackGroundImage.height * y_movingObj2_init_onCenterPic);

        x_movingObj2_post1 = (int) (-movingObj2.getWidth() / 2 + getDimensionsOfSmartPhoneScreen().x * (BACK_IMAGE_LEFT_DISTANCE) + dimensOfBackGroundImage.width * x_movingObj2_post1_onCenterPic);
        y_movingObj2_post1 = (int) (-movingObj2.getHeight() / 2 + getDimensionsOfSmartPhoneScreen().y * (BACK_IMAGE_TOP_DISTANCE) + dimensOfBackGroundImage.height * y_movingObj2_post1_onCenterPic);

        x_movingObj3_init = (int) (-getXBasedOnNewScreen(movingObj3_width) / 2 + getDimensionsOfSmartPhoneScreen().x * (BACK_IMAGE_LEFT_DISTANCE) + dimensOfBackGroundImage.width * x_movingObj3_init_onCenterPic);
        y_movingObj3_init = (int) (-getYBasedOnNewScreen(movingObj3_heigh) / 2 + getDimensionsOfSmartPhoneScreen().y * (BACK_IMAGE_TOP_DISTANCE) + dimensOfBackGroundImage.height * y_movingObj3_init_onCenterPic);

        x_movingObj3_post1 = (int) (-movingObj3.getWidth() / 2 + getDimensionsOfSmartPhoneScreen().x * (BACK_IMAGE_LEFT_DISTANCE) + dimensOfBackGroundImage.width * x_movingObj3_post1_onCenterPic);
        y_movingObj3_post1 = (int) (-movingObj3.getHeight() / 2 + getDimensionsOfSmartPhoneScreen().y * (BACK_IMAGE_TOP_DISTANCE) + dimensOfBackGroundImage.height * y_movingObj3_post1_onCenterPic);


        x_movingObj4_init = (int) (-getXBasedOnNewScreen(movingObj4_width) / 2 + getDimensionsOfSmartPhoneScreen().x * (BACK_IMAGE_LEFT_DISTANCE) + dimensOfBackGroundImage.width * x_movingObj4_init_onCenterPic);
        y_movingObj4_init = (int) (-getYBasedOnNewScreen(movingObj4_heigh) / 2 + getDimensionsOfSmartPhoneScreen().y * (BACK_IMAGE_TOP_DISTANCE) + dimensOfBackGroundImage.height * y_movingObj4_init_onCenterPic);
        x_movingObj4_post1 = (int) (-movingObj4.getWidth() / 2 + getDimensionsOfSmartPhoneScreen().x * (BACK_IMAGE_LEFT_DISTANCE) + dimensOfBackGroundImage.width * x_movingObj4_post1_onCenterPic);
        y_movingObj4_post1 = (int) (-movingObj4.getHeight() / 2 + getDimensionsOfSmartPhoneScreen().y * (BACK_IMAGE_TOP_DISTANCE) + dimensOfBackGroundImage.height * y_movingObj4_post1_onCenterPic);

        x_movingObj5_init = (int) (-getXBasedOnNewScreen(movingObj5_width) / 2 + getDimensionsOfSmartPhoneScreen().x * (BACK_IMAGE_LEFT_DISTANCE) + dimensOfBackGroundImage.width * x_movingObj5_init_onCenterPic);
        y_movingObj5_init = (int) (-getYBasedOnNewScreen(movingObj5_heigh) / 2 + getDimensionsOfSmartPhoneScreen().y * (BACK_IMAGE_TOP_DISTANCE) + dimensOfBackGroundImage.height * y_movingObj5_init_onCenterPic);
        x_movingObj5_post1 = (int) (-movingObj5.getWidth() / 2 + getDimensionsOfSmartPhoneScreen().x * (BACK_IMAGE_LEFT_DISTANCE) + dimensOfBackGroundImage.width * x_movingObj5_post1_onCenterPic);
        y_movingObj5_post1 = (int) (-movingObj5.getHeight() / 2 + getDimensionsOfSmartPhoneScreen().y * (BACK_IMAGE_TOP_DISTANCE) + dimensOfBackGroundImage.height * y_movingObj5_post1_onCenterPic);
        x_movingObj5_post2 = (int) (-movingObj5.getWidth() / 2 + getDimensionsOfSmartPhoneScreen().x * (BACK_IMAGE_LEFT_DISTANCE) + dimensOfBackGroundImage.width * x_movingObj5_post2_onCenterPic);
        y_movingObj5_post2 = (int) (-movingObj5.getHeight() / 2 + getDimensionsOfSmartPhoneScreen().y * (BACK_IMAGE_TOP_DISTANCE) + dimensOfBackGroundImage.height * y_movingObj5_post2_onCenterPic);
    }

    private void allInitialization() {

/* if back IageView width and height are
 chenged in XML , these should be changed*/

        BACK_IMAGE_TOP_DISTANCE = 0.043f;
        BACK_IMAGE_LEFT_DISTANCE = 0.2f;

// movingObject 's Dimens
        movingObj1_width = 248;
        movingObj1_heigh = 50;

        movingObj2_width = 143;
        movingObj2_heigh = 50;

        movingObj3_width = 100;
        movingObj3_heigh = 100;

        movingObj4_width = 100;
        movingObj4_heigh = 100;

        movingObj5_width = 200;
        movingObj5_heigh = 150;

        // movingObj 's  Points Initializations
        x_movingObj1_init_onCenterPic = (float) 136 / 476;
        y_movingObj1_init_onCenterPic = (float) 392 / 565;
        x_movingObj1_post1_onCenterPic = (float) 140 / 474;
        y_movingObj1_post1_onCenterPic = (float) 240 / 562;


        x_movingObj2_init_onCenterPic = (float) 368 / 476;
        y_movingObj2_init_onCenterPic = (float) 462 / 565;
        x_movingObj2_post1_onCenterPic = (float) 118 / 474;
        y_movingObj2_post1_onCenterPic = (float) 405 / 562;


        x_movingObj3_init_onCenterPic = (float) 101 / 474;
        y_movingObj3_init_onCenterPic = (float) 321 / 562;
        x_movingObj3_post1_onCenterPic = (float) 44 / 474;
        y_movingObj3_post1_onCenterPic = (float) 470 / 564;


        x_movingObj4_init_onCenterPic = (float) 102 / 474;
        y_movingObj4_init_onCenterPic = (float) 490 / 562;
        x_movingObj4_post1_onCenterPic = (float) 44 / 474;
        y_movingObj4_post1_onCenterPic = (float) 470 / 564;


        x_movingObj5_init_onCenterPic = (float) 70 / 474;
        y_movingObj5_init_onCenterPic = (float) 470 / 564;
        x_movingObj5_post1_onCenterPic = (float) 450 / 474;
        y_movingObj5_post1_onCenterPic = (float) 470 / 564;
        x_movingObj5_post2_onCenterPic = (float) 340 / 474;
        y_movingObj5_post2_onCenterPic = (float) 306 / 564;
    }


    private void movingObjCreation() {

        movingObj1 = new ImageView(getApplicationContext());
        movingObj1.setImageResource(R.drawable.onboarding_page_1_resource_1);
        movingObj1.setScaleType(ImageView.ScaleType.FIT_XY);

        movingObj2 = new ImageView(getApplicationContext());
        movingObj2.setImageResource(R.drawable.onboarding_page_1_resource_2);
        movingObj2.setScaleType(ImageView.ScaleType.FIT_XY);

        movingObj3 = new ImageView(getApplicationContext());
        movingObj3.setImageResource(R.drawable.onboarding_page_2_resource_1);
        movingObj3.setScaleType(ImageView.ScaleType.FIT_XY);

        movingObj4 = new ImageView(getApplicationContext());
        movingObj4.setImageResource(R.drawable.onboarding_page_2_resource_2);
        movingObj4.setScaleType(ImageView.ScaleType.FIT_XY);

        movingObj5 = new ImageView(getApplicationContext());
        movingObj5.setImageResource(R.drawable.onboarding_page_3_resource_1);
        movingObj5.setScaleType(ImageView.ScaleType.FIT_XY);


        movingObj1.setLayoutParams(new RelativeLayout.LayoutParams(getXBasedOnNewScreen(movingObj1_width), getYBasedOnNewScreen(movingObj1_heigh)));
        movingObj2.setLayoutParams(new RelativeLayout.LayoutParams(getXBasedOnNewScreen(movingObj2_width), getYBasedOnNewScreen(movingObj2_heigh)));
        movingObj3.setLayoutParams(new RelativeLayout.LayoutParams(getXBasedOnNewScreen(movingObj3_width), getYBasedOnNewScreen(movingObj3_heigh)));
        movingObj4.setLayoutParams(new RelativeLayout.LayoutParams(getXBasedOnNewScreen(movingObj4_width), getYBasedOnNewScreen(movingObj4_heigh)));
        movingObj5.setLayoutParams(new RelativeLayout.LayoutParams(getXBasedOnNewScreen(movingObj5_width), getYBasedOnNewScreen(movingObj5_heigh)));

        rl_bigest = (RelativeLayout) findViewById(R.id.rl_bigest);

        rl_bigest.addView(movingObj1);
        rl_bigest.addView(movingObj2);
        rl_bigest.addView(movingObj3);
        rl_bigest.addView(movingObj4);
        rl_bigest.addView(movingObj5);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.intro_layout);
        dimensOfBackGroundImage = new Dimen();

        allInitialization();

        movingObjCreation();


        iv_skip = (ImageView) findViewById(R.id.iv_skip);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        // Set an Adapter on the ViewPager
        mViewPager.setAdapter(new IntroAdapter(getSupportFragmentManager()));

        // Set a PageTransformer
        mViewPager.setPageTransformer(false, new IntroPageTransformer());

        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                                               @Override
                                               public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                                                   int pagePosition = position;
                                                   Log.d("Tag_position", String.valueOf(position));
                                                   Log.d("Tag_Positionoffset", String.valueOf(positionOffset));
                                                   Log.d("Tag_offsetPixels", String.valueOf(positionOffsetPixels));
                                                   Log.d("Tag_scooter width", String.valueOf(movingObj1.getWidth()));
                                                   Log.d("Tag_scooter heigh", String.valueOf(movingObj1.getHeight()));

                                                   if (pagePosition == 0) {

                                                       movingObj3.setVisibility(View.INVISIBLE);
                                                       movingObj4.setVisibility(View.INVISIBLE);
                                                       movingObj5.setVisibility(View.INVISIBLE);

                                                       dimensOfBackGroundImage = getDimensionsOfMainImage_iv();
                                                       MianImage = (ImageView) findViewById(R.id.iv_mian_image);

                                                       positionsClaculationsOfMovingObjects();

                                                       if (positionOffset == 0) {
                                                           movingObj1.setVisibility(View.VISIBLE);
                                                           movingObj2.setVisibility(View.VISIBLE);

                                                           movingObj1.setTranslationX(x_movingObj1_init);
                                                           movingObj1.setTranslationY(y_movingObj1_init);

                                                           movingObj2.setTranslationX(x_movingObj2_init);
                                                           movingObj2.setTranslationY(y_movingObj2_init);
                                                       }
                                                       if (positionOffset > 0) {

                                                           movingObj3.setVisibility(View.INVISIBLE);
                                                           movingObj4.setVisibility(View.INVISIBLE);

                                                           movingObj1.setTranslationX((float) (x_movingObj1_init + positionOffset * (x_movingObj1_post1 - x_movingObj1_init)));
                                                           movingObj1.setTranslationY((float) (y_movingObj1_init + positionOffset * (y_movingObj1_post1 - y_movingObj1_init)));

                                                           movingObj2.setTranslationX((float) (x_movingObj2_init + positionOffset * (x_movingObj2_post1 - x_movingObj2_init)));
                                                           movingObj2.setTranslationY((float) (y_movingObj2_init + positionOffset * (y_movingObj2_post1 - y_movingObj2_init)));

                                                       }
                                                   } else if (pagePosition == 1) {
                                                       if (positionOffset > 0 && positionOffset <= 1.0) {

                                                           movingObj3.setAlpha((float) (1.0 - positionOffset / 1.5));
                                                           movingObj4.setAlpha((float) (1.0 - positionOffset / 1.5));

                                                           movingObj1.setTranslationX((float) (x_movingObj1_post1 - positionOffset * (3.4 * x_movingObj1_post1)));
                                                           movingObj2.setTranslationX((float) (x_movingObj2_post1 - positionOffset * (3.4 * x_movingObj2_post1)));

                                                       }
                                                       if (positionOffset > 0.0 && positionOffset <= 1.0) {
                                                           movingObj5.setVisibility(View.VISIBLE);
                                                           double newPosOfsset = ConvertRange(0.0, 1.0, 0.0, 1.0, (double) positionOffset);
                                                           movingObj5.setTranslationX(2 * x_movingObj5_post1 - positionOffset * (2 * x_movingObj5_post1 - x_movingObj5_init));
                                                           movingObj5.setTranslationY(y_movingObj5_post1);
                                                       }

                                                       if (positionOffset == 0) {
                                                           movingObj3.setVisibility(View.VISIBLE);
                                                           movingObj4.setVisibility(View.VISIBLE);

                                                           movingObj3.setTranslationX(x_movingObj3_init);
                                                           movingObj3.setTranslationY(y_movingObj3_init);

                                                           movingObj4.setTranslationX(x_movingObj4_init);
                                                           movingObj4.setTranslationY(y_movingObj4_init);
                                                       }
                                                       if (positionOffset > 0) {

                                                           movingObj3.setTranslationX((float) (x_movingObj3_init + positionOffset * (x_movingObj3_post1 - x_movingObj3_init)));
                                                           movingObj3.setTranslationY((float) (y_movingObj3_init + positionOffset * (y_movingObj3_post1 - y_movingObj3_init)));

                                                           movingObj4.setTranslationX((float) (x_movingObj4_init + positionOffset * (x_movingObj4_post1 - x_movingObj4_init)));
                                                           movingObj4.setTranslationY((float) (y_movingObj4_init + positionOffset * (y_movingObj4_post1 - y_movingObj4_init)));

                                                       }
                                                   } else if (pagePosition == 2) {
                                                       if (positionOffset >= 0.0) {
                                                           movingObj3.setAlpha((float) (0));
                                                           movingObj4.setAlpha((float) (0));
                                                       }

                                                       if (positionOffset > 0) {
                                                       }

                                                       if (positionOffset == 0) {

                                                           movingObj5.setTranslationX(x_movingObj5_init);
                                                           movingObj5.setTranslationY(y_movingObj5_init);
                                                       }

                                                       if (0.0f < positionOffset && positionOffset < 0.5f) {
                                                           double newPosOfsset = ConvertRange(0.0, 0.5, 0.0, 1.0, (double) positionOffset);
                                                           movingObj5.setVisibility(View.VISIBLE);

                                                           movingObj5.setTranslationX((float) (x_movingObj5_init));
                                                           movingObj5.setTranslationY((float) (y_movingObj5_init));
                                                       }
                                                       if (0.5f <= positionOffset && positionOffset <= 1.0f) {
                                                           double newPosOfsset = ConvertRange(0.5, 1.0, 0.0, 1.0, (double) positionOffset);
                                                           movingObj5.setScaleX((float) (1.0f - newPosOfsset / 2));
                                                           movingObj5.setScaleY((float) (1.0f - newPosOfsset / 2));
                                                           movingObj5.setTranslationX((float) (x_movingObj5_init + newPosOfsset * (x_movingObj5_post2 - x_movingObj5_init)));
                                                           movingObj5.setTranslationY((float) (y_movingObj5_init + newPosOfsset * (y_movingObj5_post2 - y_movingObj5_init)));
                                                           movingObj5.setVisibility(View.VISIBLE);

                                                       }
//
                                                   }
//                                                   else if (pagePosition == 3) {
//
//                                                   }
                                                   else if (pagePosition == 3) {
                                                       if (positionOffset > 0)
                                                           movingObj5.setVisibility(View.INVISIBLE);
                                                       else if (positionOffset == 0) {
                                                           movingObj5.setVisibility(View.VISIBLE);
                                                       }
                                                   }
                                                   //else if (pagePosition == 5) {
//
//                                                   }
                                               }

                                               @Override
                                               public void onPageSelected(int position) {
                                                   iv_skip.setVisibility(View.INVISIBLE);
//
                                                   switch (position) {
                                                       case 0:
                                                           radioGroup.check(R.id.radioButton1);
                                                           break;
                                                       case 1:
                                                           radioGroup.check(R.id.radioButton2);
                                                           break;
                                                       case 2:
                                                           radioGroup.check(R.id.radioButton3);
                                                           break;
                                                       case 3:
//                                                           iv_skip.setVisibility(View.VISIBLE);
//                                                           iv_skip.setOnClickListener(new View.OnClickListener() {
//                                                               @Override
//                                                               public void onClick(View v) {
//                                                                   Toast.makeText(IntroActivity.this, "Hey, Skip  Clicked!", Toast.LENGTH_SHORT).show();
//                                                               }
//                                                           });
                                                           radioGroup.check(R.id.radioButton4);
                                                           break;

                                                   }
                                               }

                                               @Override
                                               public void onPageScrollStateChanged(int state) {

                                               }

                                           }

        );


    }

}