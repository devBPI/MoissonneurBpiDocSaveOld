package mock;

import bpi.entity.BpiNotice;

public class MockNoticeFactory {

    public static BpiNotice getInstance() {
        BpiNotice notice = new BpiNotice();
        notice.setTitle("Un titre");
        notice.setCollectionId(6);

        return notice;
    }

}
