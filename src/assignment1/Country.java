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
public class Country {

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }
    private String CountryCode ;
    private String CountryName ;
    public Country (String countryCode ,String countryName){
    
     CountryCode =countryCode;
     CountryName = countryName ;
    } 
}
