package com.tournament.draw.parser;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {

    public List<CSVRecord> parseFile(final String filePath, final String format) {
        CSVFormat csvFormat = null;
        List<CSVRecord> csvRecords = new ArrayList<>();
        if (format == null || format == "") {
            csvFormat = CSVFormat.DEFAULT;
        } else {
            csvFormat = CSVFormat.valueOf(format);
        }
        try {
            Reader in = new FileReader(filePath);
            Iterable<CSVRecord> records = csvFormat.withFirstRecordAsHeader().parse(in);
            for(CSVRecord record : records) {
                csvRecords.add(record);
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return csvRecords;

    }
}
