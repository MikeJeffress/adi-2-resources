package ly.generalassemb.dynamicfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by michaeljeffress on 7/6/16.
 */
public class DailyFragment extends Fragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setRetainInstance(true);
    }
}
