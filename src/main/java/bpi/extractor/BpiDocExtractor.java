package bpi.extractor;


import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.*;

public class BpiDocExtractor {

    private final MappingIterator<BpiDocDto> bpiDocIterator;

    public BpiDocExtractor(String file) throws IOException {
        CsvSchema csvSchema = CsvSchema.emptySchema().withHeader().withColumnSeparator('\t');
        CsvMapper mapper = new CsvMapper();
        InputStreamReader csvFile = new InputStreamReader(new FileInputStream(file), "latin1");
        this.bpiDocIterator = mapper.reader(BpiDocDto.class).with(csvSchema).readValues(csvFile);
    }

    public MappingIterator<BpiDocDto> getIterator() {
        return this.bpiDocIterator;
    }
}
