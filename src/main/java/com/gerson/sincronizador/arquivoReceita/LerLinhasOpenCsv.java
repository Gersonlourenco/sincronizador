package com.gerson.sincronizador.arquivoReceita;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LerLinhasOpenCsv {
	private static final String CSV_FILE = "C:\\opt\\documentos\\testeIBM\\Backend\\teste.csv";//"/tmp/users.csv";
	 
    public static void main(String[] args) throws IOException {
    	
    	//File raiz = new File(CSV_PATH);
    	
    	CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
    	//for (File f : raiz.listFiles()) {
          //  if (f.isFile() && f.getName().endsWith("csv")) {
               // System.out.println(f.getName());
	            Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE));
	            
	            
	            CSVReader csvReader = new CSVReaderBuilder(reader).withCSVParser(parser).withSkipLines(1).build();
	
	            List<String[]> colunas = csvReader.readAll();
	            for (String[] coluna : colunas) {
	                System.out.println("agencia : " + coluna[0] +
	                                " - conta : " + coluna[1] +
	                                " - saldo : " + coluna[2] +
	                                " - status : " + coluna[2]);
	            }
	    	//}
        //}
        
    }

}
