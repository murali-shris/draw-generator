package com.tournament.draw;

import com.tournament.draw.parser.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.util.List;

public class Main {

    public static void main(String args[]) {
        String filePath = "/home/murali/git/drawgenerator/src/main/resources/players.csv";
        CSVParser parser = new CSVParser();
        List<CSVRecord> csvRecordList = parser.parseFile(filePath,null);
        System.out.println(csvRecordList.size());

    }
}
