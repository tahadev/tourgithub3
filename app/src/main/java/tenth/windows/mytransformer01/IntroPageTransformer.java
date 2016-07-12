package tenth.windows.mytransformer01;

import android.graphics.Color;
import android.graphics.pdf.PdfDocument;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import static android.support.v4.view.ViewPager.*;

public class IntroPageTransformer implements PageTransformer {

    @Override
    public void transformPage(View page, float position) {

        // Get the page index from the tag. This makes
        // it possible to know which page index you're
        // currently transforming - and that can be used
        // to make some important performance improvements.
        int pagePosition = (int) page.getTag();

        // Here you can do all kinds of stuff, like get the
        // width of the page and perform calculations based
        // on how far the user has swiped the page.
        int pageWidth = page.getWidth();
        float pageWidthTimesPosition = pageWidth * position;
        float absPosition = Math.abs(position);
//        if (0 <= position && position < 1) {
//            page.setTranslationX(pageWidth * -position);
//        }
//        if (-1 < position && position < 0) {
//            page.setTranslationX(pageWidth * position);
//        }
        if (position <= -1.0f || position >= 1.0f) {
        } else if (position == 0.0f) {
        }
        // Now it's time for the effects
        if (position <= -1.0f || position >= 1.0f) {


            // The page is not visible. This is a good place to stop
            // any potential work / animations you may have running.

        } else {
            if (position == 0.0f) {

                // The page is selected. This is a good time to reset Views
                // after animations as you can't always count on the PageTransformer
                // callbacks to match up perfectly.

            } else {
                // page.setAlpha(1.0f - Math.abs(position/8));
                // The page is currently being scrolled / swiped. This is
                // a good place to show animations that react to the user's
                // swiping as it provides a good user experience.
//                View iv_cycle_6 = page.findViewById(R.id.iv_cycle_6);
//                View lv6 = page.findViewById(R.id.listview6);
//                View iv_earth = page.findViewById(R.id.iv_earth);
                // Let's start by animating the title.
                // We want it to fade as it scrolls out

               // View computer1 = page.findViewById(R.id.computer1);
//                View title1 = page.findViewById(R.id.title1);
//                View description1 = page.findViewById(R.id.description1);

//                if (pagePosition == 4) {
//                    View iv_scooter_dest_layout_5 = page.findViewById(R.id.iv_scooter_dest_layout_5);
//                    if (iv_scooter_dest_layout_5 != null) {
//                        Log.d("TAG_IV_DIMEN", "----------------------------");
//                        Log.d("TAG_IV_DIMEN", "width" + String.valueOf(iv_scooter_dest_layout_5.getWidth()));
//                        Log.d("TAG_IV_DIMEN", "height" + String.valueOf(iv_scooter_dest_layout_5.getHeight()));
//                        Log.d("TAG_IV_DIMEN", "height" + iv_scooter_dest_layout_5.getHeight() / iv_scooter_dest_layout_5.getWidth());
//                        iv_scooter_dest_layout_5.setLayoutParams(new LinearLayout.LayoutParams((int) (iv_scooter_dest_layout_5.getWidth() * 0.843f), iv_scooter_dest_layout_5.getHeight()));
//                        Log.d("TAG_IV_DIMEN", "width" + String.valueOf(iv_scooter_dest_layout_5.getWidth()));
//                        Log.d("TAG_IV_DIMEN", "height" + String.valueOf(iv_scooter_dest_layout_5.getHeight()));
//                        Log.d("TAG_IV_DIMEN", "height" + iv_scooter_dest_layout_5.getHeight() / iv_scooter_dest_layout_5.getWidth());
//                    }
//                }
                // Now, we want the image to move to the right,
                // i.e. in the opposite direction of the rest of the
                // content while fading out

//                View cload01 = page.findViewById(R.id.cload01);
//                View cload02 = page.findViewById(R.id.cload02);
//                View cload03 = page.findViewById(R.id.cload03);
//
//                View cycle_05 = page.findViewById(R.id.cycle_05);
//
//
////            View round00 = page.findViewById(R.id.round00);
//                View round01 = page.findViewById(R.id.round01);
//            View round1mid2 = page.findViewById(R.id.round1mid2);
//            View round02 = page.findViewById(R.id.round02);
//            View round03 = page.findViewById(R.id.round03);
//            View round04 = page.findViewById(R.id.round04);
//                View round05 = page.findViewById(R.id.round05);
//
//
//                View bag00 = page.findViewById(R.id.bag00);
//                View bag01 = page.findViewById(R.id.bag01);
                // View bag03 = page.findViewById(R.id.bag03);

                // We're attempting to create an effect for a View
                // specific to one of the pages in our ViewPager.
                // In other words, we need to check that we're on
                // the correct page and that the View in question
                // isn't null.


                // We're attempting to create an effect for a View
                // specific to one of the pages in our ViewPager.
                // In other words, we need to check that we're on
                // the correct page and that the View in question
                // isn't null.
//                int colorF = 0;
//                if (pagePosition == 0)
//                    colorF = R.color.colorFragment1;
//                if (pagePosition == 1)
//                    colorF = R.color.colorFragment2;
//                if (pagePosition == 2)
//                    colorF = R.color.colorFragment3;
//                if (pagePosition == 3)
//                    colorF = R.color.colorFragment4;
//                if (pagePosition == 4)
//                    colorF = R.color.colorFragment5;
//                if (pagePosition == 5)
//                    colorF = R.color.colorFragment6;
//
//
//                View background = page.findViewById(R.id.background);
//                if (0 < position && position < 1) {
//                    //  background.setTranslationX(pageWidth * -position);
//                    background.setBackgroundColor((int) (colorF - Math.abs(position*10)));
////                    ViewHelper.setTranslationX(page, pageWidth * -position);
//
//
//                }
//                if (-1 < position && position < 0) {
//                    //  background.setAlpha(1.0f - 4f*Math.abs(position));
////                    background.setTranslationX(pageWidth * position);
//                    background.setBackgroundColor((int) (colorF - Math.abs(position*10)));
//
//
//                }

                if (pagePosition == 0 ) {


                    //  title1.setAlpha(1.0f - absPosition);

                    // Now the description. We also want this one to
                    // fade, but the animation should also slowly move
                    // down and out of the screen
                    // description.setTranslationY(-pageWidthTimesPosition / 2f);
                    //  description1.setAlpha(1.0f - absPosition);
//
//                    computer1.setAlpha(1.0f - absPosition);
//                    computer1.setTranslationX(pageWidthTimesPosition * 1.5f);
                }
                if (pagePosition == 1) {
                    // cload01.setAlpha(1.0f - absPosition);
//                    cload01.setTranslationX(pageWidthTimesPosition * 0.5f);
//
//                    //  cload02.setAlpha(1.0f - absPosition);
//                    cload02.setTranslationX(pageWidthTimesPosition * 0.3f);
//
//                    // cload03.setAlpha(1.0f - absPosition);
//                    cload03.setTranslationX(pageWidthTimesPosition * 0.9f);

                }
                if (pagePosition == 2) {
//                round00.setAlpha(1.0f - absPosition);
//                round00.setTranslationX(pageWidthTimesPosition * 0.5f);
/// bbbbbbbbbbbbbbbbbbb
//
//                    //round01.setAlpha(1.0f - absPosition);
//
//                    round01.setTranslationX(-pageWidthTimesPosition * 1.0f);
//                    round01.setTranslationY(-pageWidthTimesPosition * 0.02f);
//                    round01.setAlpha(1.0f - 2f * absPosition);
//
//                    // round05.setTranslationX(-pageWidthTimesPosition * 1.0f);
//                    //round01.setTranslationY(-pageWidthTimesPosition * 0.02f);
//                    round05.setAlpha(1.0f - 2f * absPosition);
//                    //cload01.setTranslationY(-pageWidthTimesPosition * 0.2f);
//
////                round1mid2.setAlpha(1.0f - absPosition);
////                round1mid2.setTranslationX(pageWidthTimesPosition * 0.3f);
////                // cload01.setTranslationY(-pageWidthTimesPosition * 0.2f);
////                round02.setAlpha(1.0f - absPosition);
////                round02.setTranslationX(pageWidthTimesPosition * 0.5f);
////                //cload02.setTranslationY(pageWidthTimesPosition * 2f);
////
////                round03.setAlpha(1.0f - absPosition);
////                round03.setTranslationX(pageWidthTimesPosition * 0.4f);
////
////                round04.setAlpha(1.0f - absPosition);
////                round04.setTranslationX(pageWidthTimesPosition * 0.3f);
////                //cload03.setTranslationY(-pageWidthTimesPosition * 0.2f);
////
////                round05.setAlpha(1.0f - absPosition);
////                round05.setTranslationX(pageWidthTimesPosition * 0.1f);
////                //cload03.setTranslationY(-pageWidthTimesPosition * 0.2f);
                }
                if (pagePosition == 3) {
//                    bag00.setAlpha(1.0f - 5f * absPosition);
//                    // bag00.setTranslationX(pageWidthTimesPosition * 1.5f);
//                    //  bag00.setTranslationY(pageWidthTimesPosition * 1.5f);
//                    // bag01.setAlpha(1.0f + absPosition);
//                    if (position >= 0.0f) {
//                        bag01.setTranslationX(-pageWidthTimesPosition * 1.0f);
//                        bag01.setTranslationY(-pageWidthTimesPosition * 0.5f);
//                        bag01.setAlpha(1.0f - 2.5f * absPosition);
//                    } else {
//                        bag01.setTranslationX(-pageWidthTimesPosition * 1.0f);
//                        bag01.setTranslationY(pageWidthTimesPosition * 0.5f);
//                        bag01.setAlpha(1.0f - 2f * absPosition);
//                    }
//
//                    //bag01.setAlpha(1.0f - absPosition);
////                bag01.setScaleX(0.8f);
////                bag01.setScaleY(0.8f);
//
//
////                float MIN_SCALE = 5.0f;
////                float scaleFactor = MIN_SCALE
////                        + (1 - MIN_SCALE) * (1 - Math.abs(position));
////                bag00.setScaleX(scaleFactor);
////                bag00.setScaleY(scaleFactor);
                }
                if (pagePosition == 4) {

//                    if (position >= 0.0f) {
//                        // iv_earth.setTranslationX(-pageWidthTimesPosition * 1.5f);
//                        iv_earth.setAlpha(1.0f - 5.0f * absPosition);
//                        cycle_05.setTranslationX(-pageWidthTimesPosition * 1.0f);
//                        cycle_05.setTranslationY(pageWidthTimesPosition * 0.5f);
//                        cycle_05.setAlpha(1.0f - 2.3f * absPosition);
//                    } else {
//                        // iv_earth.setTranslationX(-pageWidthTimesPosition * 1.5f);
//                        iv_earth.setAlpha(1.0f - 5.0f * absPosition);
//                        cycle_05.setTranslationX(-pageWidthTimesPosition * 1.0f);
////                        cycle_05.setTranslationY(pageWidthTimesPosition * 0.5f);
//                        cycle_05.setAlpha(1.0f - 2.3f * absPosition);
////                    cycle_05.setTranslationX(-pageWidthTimesPosition * 1.0f);
////                    cycle_05.setTranslationY(-pageWidthTimesPosition * 0.5f);
////                        cycle_05.setAlpha(1.0f - 5.0f * absPosition);
//                    }
//

                    // sc_images.setAlpha(1.0f - absPosition);


//                float MIN_SCALE = 5.0f;
//                float scaleFactor = MIN_SCALE
//                        + (1 - MIN_SCALE) * (1 - Math.abs(position));
//                sc_images.setScaleX(scaleFactor);
//                sc_images.setScaleY(scaleFactor);
                }
                if (pagePosition == 5) {
                    // lv6.setAlpha(1.0f - absPosition);
//                    iv_cycle_6.setTranslationX(-pageWidthTimesPosition * 1.5f);
//                    iv_cycle_6.setAlpha(1.0f - 5.0f * absPosition);
//
//                    lv6.setTranslationX(pageWidthTimesPosition * 1.5f);
//
////                    float MIN_SCALE = 5.0f;
////                    float scaleFactor = MIN_SCALE
////                            + (1 - MIN_SCALE) * (1 - Math.abs(position));
////                    lv6.setScaleX(scaleFactor);
////                    lv6.setScaleY(scaleFactor);

                }
//            if (pagePosition == 0 && computer != null) {
//                computer.setAlpha(1.0f - absPosition);
//                computer.setTranslationX(-pageWidthTimesPosition * 1.5f);
//            }
//            if (pagePosition == 1 && computer != null) {
//                cload01.setAlpha(1.0f - absPosition);
//                cload01.setTranslationX(-pageWidthTimesPosition * 1.5f);
//            }
//            if (pagePosition == 2 && computer != null) {
//                cload01.setAlpha(1.0f - absPosition);
//                cload01.setTranslationX(-pageWidthTimesPosition * 1.5f);
//                computer.setAlpha(1.0f - absPosition);
//                computer.setTranslationX(-pageWidthTimesPosition * 1.5f);
//            }
//            if (pagePosition == 3 && computer != null) {
//                computer.setAlpha(1.0f - absPosition);
//                computer.setTranslationX(-pageWidthTimesPosition * 1.5f);
//            }
                // Finally, it can be useful to know the direction
                // of the user's swipe - if we're entering or exiting.
                // This is quite simple:
                if (position < 0) {

                    // Create your out animation here
                } else {

                    // Create your in animation here
                }
            }
        }
    }


}