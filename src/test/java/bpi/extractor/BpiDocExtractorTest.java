package bpi.extractor;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.assertj.core.api.Assertions.*;


public class BpiDocExtractorTest {

    private BpiDocDto firstLine;
    private BpiDocDto secondLine;
    private BpiDocDto thirdLine;


    @Before
    public void setUp() throws Exception {
        Iterator<BpiDocDto> iterator= new BpiDocExtractor("src/test/fixtures/lean_export.txt").getIterator();
        firstLine = iterator.next();
        secondLine = iterator.next();
        thirdLine = iterator.next();
    }

    @Test
    public void testItExtractTheTitle() {
        assertThat(firstLine.title).isEqualTo("Après-guerre incertain dans les Balkans");
    }

    @Test
    public void testItExtractTheId() {
        assertThat(firstLine.id).isEqualTo(1067);
    }

    @Test
    public void testItExtractTheCreationDate() {
        assertThat(firstLine.creationDate).isEqualTo("1996-01-05T00:00:00.000");
    }

    @Test
    public void testItExtractThePublicationDate() {
        assertThat(firstLine.publicationDate).isEqualTo("1996-01-04T00:00:00.000");
    }

    @Test
    public void testItExtractTheGeographicDescription() {
        //first line does't have geographicalDescription
        assertThat(secondLine.geographicDescription).isEqualTo("FRANCE");
    }

    @Test
    public void testItExtractTheSecondaryDescription() {
        assertThat(firstLine.secondaryDescription).isEqualTo("PAIX");
    }

    @Test
    public void testItExtractTheMainDescription() {
        assertThat(firstLine.mainDescription).isEqualTo("YOUGOSLAVIE");
    }

    @Test
    public void testItExtractThePublisher() {
        assertThat(firstLine.publisher).isEqualTo("MONDE (LE)");
    }

    @Test
    public void testItExtractTheAuthor() {
        assertThat(firstLine.author).isEqualTo("");
    }

    @Test
    public void testItExtractTheKeyword1() {
        assertThat(firstLine.keywords1).contains("YOUGOSLAVIE", "PAIX");
    }

    @Test
    public void testItExtractTheKeyword2() {
        assertThat(secondLine.keywords2).contains("PRISONNIER DE GUERRE", "BOSNIE HERZEGOVINE", "MINISTRE", "PILOTE");
    }

    @Test
    public void testItExtractNotNullEphemeralTerm() {
        assertThat(firstLine.ephemeralTerms).isEqualTo("");
    }

    @Test
    public void testItExtractTheEphemeralTerm() {
        assertThat(secondLine.ephemeralTerms).isEqualTo("PILOTE");
    }

    @Test
    public void testItExtractNotNullWorkTitle() {
        assertThat(firstLine.workTitle).isEqualTo("");
    }

    @Test
    public void testItExtractTheWorkTitle() {
        assertThat(thirdLine.workTitle).isEqualTo("");
    }

    @Test
    public void testItExtractNotNullContent() {
        assertThat(firstLine.content).isEqualTo("");
    }

    @Test
    public void testItExtractTheContent() {
        assertThat(thirdLine.content).isEqualTo("");
    }
}