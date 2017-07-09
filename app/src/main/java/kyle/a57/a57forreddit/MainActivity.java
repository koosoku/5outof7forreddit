package kyle.a57.a57forreddit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import kyle.a57.a57forreddit.datastructures.PostContent;
import kyle.a57.a57forreddit.dummy.DummyContent;


public class MainActivity extends AppCompatActivity implements PostsFragment.OnListFragmentInteractionListener{

    private static final int FRAGMENT_POST_ID = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container, PostsFragment.newInstance(1)).commit();

    }

    @Override
    public void onListFragmentInteraction(PostContent.PostItem item) {

    }
}
