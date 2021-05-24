/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author koko
 */


public class City {
    
    public String toString() { 
        
    return "CityCode: "
            + this.CityCode + 
            ", CityName: " +
            this.CityName + 
            ", CityContinent: " + 
            this.CityContinent + 
            " CitySurfaceArea: " +
            this.CitySurfaceArea +
    "CityPopulation: " + 
    this.CityPopulation;
} 

    public String getCityCode() {
        return CityCode;
    }

    public void setCityCode(String CityCode) {
        this.CityCode = CityCode;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public String getCityContinent() {
        return CityContinent;
    }

    public void setCityContinent(String CityContinent) {
        this.CityContinent = CityContinent;
    }

    public int getCitySurfaceArea() {
        return CitySurfaceArea;
    }

    public void setCitySurfaceArea(int CitySurfaceArea) {
        this.CitySurfaceArea = CitySurfaceArea;
    }

    public int getCityPopulation() {
        return CityPopulation;
    }

    public void setCityPopulation(int CityPopulation) {
        this.CityPopulation = CityPopulation;
    }
    private String CityCode;
    private String CityName;
    private String CityContinent;
    private int CitySurfaceArea;
    private int CityPopulation;
    public City(String cityCode,String cityName,String cityContinent,int citySurfaceArea,int cityPopulation){
       
       CityCode = cityCode;
       CityName = cityName;
       CityContinent = cityContinent;
       CitySurfaceArea = citySurfaceArea;
       CityPopulation = cityPopulation;
    }
}
