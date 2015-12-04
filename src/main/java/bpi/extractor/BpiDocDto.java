package bpi.extractor;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BpiDocDto {

        public Date creationDate;

        public Date publicationDate;

        public String secondaryDescription;

        public String[] keywords1;

        public String[] keywords2;

        @JsonProperty("NUID")
        public Integer id;

        @JsonProperty("DESG")
        public String geographicDescription;

        @JsonProperty("DESP")
        public String mainDescription;

        @JsonProperty("SOUR")
        public String publisher;

        @JsonProperty("TIUN")
        public String title;

        @JsonProperty("AUT")
        public String author;

        @JsonProperty("TERM")
        public String ephemeralTerms = "";

        @JsonProperty("TIDX")
        public String workTitle = "";

        @JsonProperty("CONT")
        public String content = "";


        @JsonProperty("GDES")
        public void setKeywords1(String keywords) {
                keywords1 = splitKeywords(keywords);
        }

        @JsonProperty("GMON")
        public void setKeywords2(String keywords) {
                keywords2 = splitKeywords(keywords);
        }

        @JsonProperty("DESS")
        public void setSecondaryDescription(String description) {
                secondaryDescription = description.replaceAll("[\\\\n^]", "");
        }

        @JsonProperty("DAT1")
        public void setCreationDate(String unparsedDate) throws ParseException {
                creationDate = transformDate(unparsedDate);
        }

        @JsonProperty("DAT2")
        public void setPublicationDate(String unparsedDate) throws ParseException {
                publicationDate = transformDate(unparsedDate);
        }

        private Date transformDate(String unparsedDate) throws ParseException {
                return new SimpleDateFormat("yyyyMMdd").parse(unparsedDate);
        }

        private String[] splitKeywords(String keywords) {
                return keywords.split("\\\\n");
        }
}
