package tenth.windows.mytransformer01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class IntroFragment extends Fragment {

    private static final String BACKGROUND_COLOR = "backgroundColor";
    private static final String PAGE = "page";

    private int mBackgroundColor, mPage;

    //Defining android ListView
    ListView mListView;
    //Elements that will be displayed in android ListView
    String[] Countries = new String[]{"India", "Australia", "Newzealand",
            "Indonesia", "China", "Russia", "Japan", "South Korea", "Vietnam", "Kongo", "US", "Jibooti"};
    //Ids of flag Images that are placed in res> drawable folder. They return the int value
//    int[] FlagId = new int[]{R.drawable.cload_blue01, R.drawable.cload_green01,
//            R.drawable.cload_blue02, R.drawable.circle_orange,
//            R.drawable.cload_green01, R.drawable.cload_blue01, R.drawable.books_icon,
//            R.drawable.lamp_off};

    public static IntroFragment newInstance(int backgroundColor, int page) {
        IntroFragment frag = new IntroFragment();
        Bundle b = new Bundle();
        b.putInt(BACKGROUND_COLOR, backgroundColor);
        b.putInt(PAGE, page);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        IntroActivity ia = new IntroActivity();
        if (!getArguments().containsKey(BACKGROUND_COLOR))
            throw new RuntimeException("Fragment must contain a \"" + BACKGROUND_COLOR + "\" argument!");
        mBackgroundColor = getArguments().getInt(BACKGROUND_COLOR);

        if (!getArguments().containsKey(PAGE))
            throw new RuntimeException("Fragment must contain a \"" + PAGE + "\" argument!");
        mPage = getArguments().getInt(PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Select a layout based on the current page
        int layoutResId;
        switch (mPage) {
            case 0:
                layoutResId = R.layout.intro_fragment_layout_1;
                break;
            case 1:
                layoutResId = R.layout.intro_fragment_layout_2;
                break;
            case 2:
                layoutResId = R.layout.intro_fragment_layout_3;
                break;
            case 3:
                layoutResId = R.layout.intro_fragment_layout_4;
                break;
            case 4:
                layoutResId = R.layout.intro_fragment_layout_6;
                break;
            default: {
                layoutResId = R.layout.intro_fragment_layout_5;

            }


        }

        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(layoutResId, container, false);

        if (mPage == 4) {

            mListView = (ListView) view.findViewById(R.id.listview6);

            //Declaring Array adapter
            ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, Countries);

            //Setting the android ListView's adapter to the newly created adapter
            mListView.setAdapter(countryAdapter);
            // mListView.setFriction(0.005f);
            mListView.setOnScrollListener(new AbsListView.OnScrollListener() {

                @Override
                public void onScrollStateChanged(AbsListView view, int scrollState) {

                }

                @Override
                public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                    //To change body of implemented methods use File | Settings | File Templates.
                    if (4 == firstVisibleItem) {
                        mListView.smoothScrollToPositionFromTop(3, firstVisibleItem + 4, 3000);
                    }
                }
            });
            mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    //The position where the list item is clicked is obtained from the
                    //the parameter position of the android listview
                    int itemPosition = position;

                    //Get the String value of the item where the user clicked
                    String itemValue = (String) mListView.getItemAtPosition(position);
                    Toast.makeText(getActivity(), itemValue, Toast.LENGTH_SHORT).show();

//
//                    //In order to start displaying new activity we need an intent
//                    Intent intent = new Intent(getApplicationContext(), CountryActivity.class);
//
//                    //Putting the Id of image as an extra in intent
//                    intent.putExtra("flag", FlagId[position]);
//
//                    //Here we will pass the previously created intent as parameter
//                    startActivity(intent);

                }
            });
        }

        // Set the current page index as the View's tag (useful in the PageTransformer)
        view.setTag(mPage);

        return view;
    }

    @Override
    public void setMenuVisibility(final boolean visible) {
        super.setMenuVisibility(visible);
        if (visible && mPage == 4) {
            Log.d("abc", String.valueOf(mListView.getLastVisiblePosition()) + "-  +" + String.valueOf(mListView.getCount()));
            if ((mListView.getCount() - 1) - mListView.getLastVisiblePosition() < 1) {
                mListView.smoothScrollToPositionFromTop(0, mListView.getCount(), 3000);
            } else {
                mListView.smoothScrollToPositionFromTop(0, 0, 5000);
                mListView.smoothScrollToPositionFromTop(mListView.getCount() - 1, 0, 3000);
            }
        }

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Set the background color of the root view to the color specified in newInstance()
        View background = view.findViewById(R.id.intro_background);
        background.setBackgroundColor(mBackgroundColor);

    }

}