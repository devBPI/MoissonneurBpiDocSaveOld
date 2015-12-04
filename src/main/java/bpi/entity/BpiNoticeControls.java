package bpi.entity;

/**
 * Created by alemaire on 03/12/2015.
 */
public class BpiNoticeControls {

    private final BpiNotice bpiNotice;

    public BpiNoticeControls(BpiNotice notice) {
        bpiNotice = notice;
    }

    public String getTitle() {
        return bpiNotice.getTitle();
    }

    public Integer getCollectionId() {
        return bpiNotice.getCollectionId();
    }

    public Integer getOaiIdentifier() {
        return bpiNotice.getId();
    }
}
