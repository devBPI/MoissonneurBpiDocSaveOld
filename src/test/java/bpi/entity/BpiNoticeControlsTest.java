package bpi.entity;

import mock.MockNoticeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BpiNoticeControlsTest {

    private BpiNotice notice;

    @Before
    public void setUp() throws Exception {
        notice = MockNoticeFactory.getInstance();
    }

    @Test
    public void testHasTitle() throws Exception {
        assertThat(notice.forControls().getTitle()).isEqualTo("Un titre");
    }

    @Test
    public void testHasCollectionId() throws Exception {
        assertThat(notice.forControls().getCollectionId()).isEqualTo(6);
    }

    @Test
    public void testHasOaiIdentifier() throws Exception {
        assertThat(notice.forControls().getOaiIdentifier()).isEqualTo(555);
    }
}