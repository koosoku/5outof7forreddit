package kyle.a57.a57forreddit.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kyle on 6/22/2017.
 */

public class PostContent {


    /**
     * An array of sample (dummy) items.
     */
    public static final List<PostItem> ITEMS = new ArrayList<PostItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, PostItem> ITEM_MAP = new HashMap<String, PostItem>();

    static int COUNT = 10;

    private static void addItem(PostItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static PostItem createPostItem(int position) {
        return new PostItem("6m1s35","Daily Locker Room and Free Talk: Basketball and /r/NBA Discussion (2017.07.08)");
    }

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createPostItem(i));
        }
    }


    public static class PostItem {
        public final String id;
        public final String title;

        public PostItem(String id, String title) {
            this.id = id;
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
