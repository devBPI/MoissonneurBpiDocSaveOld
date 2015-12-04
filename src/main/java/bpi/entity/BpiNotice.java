package bpi.entity;

public class BpiNotice {

    private final BpiNoticeControls noticeControls;
    private final BpiNoticeMetadatas noticeMetadatas;
    private final BpiNoticeSolrs noticeSolrs;

    private Integer id;
    private String title;
    private Integer collectionId;

    public BpiNotice() {
        noticeSolrs = new BpiNoticeSolrs(this);
        noticeMetadatas = new BpiNoticeMetadatas(this);
        noticeControls = new BpiNoticeControls(this);
    }

    public BpiNoticeControls forControls() {
        return noticeControls;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
