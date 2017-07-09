package kyle.a57.a57forreddit.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Kyle on 7/9/2017.
 */

public class CommentContent {
    /**
     * An array of sample (dummy) items.
     */
    public static final List<CommentItem> ITEMS = new ArrayList<CommentItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, CommentItem> ITEM_MAP = new HashMap<String, CommentItem>();

    static int COUNT = 5;

    private static void addItem(CommentItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static CommentItem createCommentItem(String id, String comment, List<CommentItem> children) {
        return new CommentItem(id, comment, children);
    }

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            LinkedList<CommentItem> baseLayer = new LinkedList<CommentItem>();
            baseLayer.add(createCommentItem("childcommentlikewhat", "That was amazing. I don't know what he expected, those things are usually around 6' tall and probably half a ton, if not more.", null));
            baseLayer.add(createCommentItem("childCommentTwoSayWhat", "that boy ain't right", null));


            LinkedList<CommentItem> secondLayer = new LinkedList<CommentItem>();
            secondLayer.add(createCommentItem("secondLayerFirst", "I said it in my mind while scrunching my face and sharply moving my head in a backwards motion.", baseLayer));
            secondLayer.add(createCommentItem("secondLayerSecond", "I'm just trying to figure out what the fuck they thought was going to happen there.", baseLayer));
            secondLayer.add(createCommentItem("secondLayerThird", "One of the scariest things to me about this world is that practically anyone above a certain age can get a license to drive a 2 ton hunk of steel freely at high speeds.", baseLayer));

            addItem(createCommentItem("rootItem", "That's great because you don't disturb sleeping goldens unless you're a monster. You have chosen wisely.", secondLayer));
        }
    }

    public static class CommentItem {
        public final String id;
        public final String comment;
        public List<CommentItem> children;

        public CommentItem(String id, String comment, List<CommentItem> children) {
            this.id = id;
            this.comment = comment;
            this.children = children;
        }

        @Override
        public String toString() {
            return comment;
        }
    }
}
