/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author koko
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File Country = new File ( "F:\\AI ITI\\java UML\\labs\\assignment1\\src\\assignment1\\country.csv");
        File City = new File ( "F:\\AI ITI\\java UML\\labs\\assignment1\\src\\assignment1\\city.csv");
        List<String> CountryLines = new ArrayList<>();
        List<String> CityLines = new ArrayList<>();
        List <Country> listCountry = new ArrayList<>();
        List <City> listCity = new ArrayList<>();
        try 
        {
            CountryLines = Files.readAllLines(Country.toPath());
            CityLines = Files.readAllLines(City.toPath());
        }
        catch( IOException E )
        { 
        E.printStackTrace();
        }
        Map<String,List<City>> Directory = new HashMap<>();
        for (int i=0;i<CountryLines.size();i++)
        {
            String line = CountryLines.get(i);
            String [] outWords = line.split(",");
            listCountry.add(new Country(outWords[0],outWords[1]));
            Directory.put(listCountry.get(i).getCountryCode(),new ArrayList<>());
           
        }
        //System.out.println(Directory);
        for (int i=0;i<CityLines.size();i++)
        {
           String line = CityLines.get(i);
           String [] outWords = line.split(",");
           listCity.add(new City(outWords[0],outWords[1],outWords[2],Integer.parseInt(outWords[3]),Integer.parseInt(outWords[4]))); 
        }
        //System.out.println(listCity.get(0));
         for (int i=0;i<listCity.size();i++){
             List <City> final_list = Directory.get(listCity.get(i).getCityCode());
             //System.out.println(final_list);
             final_list.add(listCity.get(i));
             Directory.put(listCity.get(i).getCityCode(), final_list);
            
         }
          //Comparison bvc = new Comparison();
          //TreeMap<String, Double> sorted_map = new TreeMap<String, Double>(bvc);
         //for (String i : Directory.keySet()) {
        // List <City> x = Directory.get(i);
             //System.out.println(x.get(0).getCityPopulation());
             
             
        // System.out.println(x.get(0).getCityPopulation());
         //System.out.println(Directory);
         for (String i : Directory.keySet()) {
            System.out.println("key: " + i + " value: " + Directory.get(i));
         }
        
    }
    
}
