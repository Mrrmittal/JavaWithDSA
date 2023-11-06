package javacollection;
import java.util.*;

public class SortCountry {
    public static void main(String[] args) {
        Country country1 = new Country("India" , "Delhi" , 142);
        Country country2 = new Country("Pakistan","Islamabad",30);
        Country country3 = new Country("USA","Washington",60);
        Country country4 = new Country("China","Beijing",150);

        List<Country> countryList = new ArrayList<Country>();
        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);
        countryList.add(country4);

        Collections.sort(countryList, new PopulationSort());

        SortCountry obj = new SortCountry();
        obj.printSortingCountries(countryList);

        System.out.println();

        Collections.sort(countryList, new CapitalSort());

        SortCountry obj2 = new SortCountry();
        obj.printSortingCountries(countryList);
    }
    public void printSortingCountries(List<Country> countries){
        for (Country country : countries) {
            System.out.println(country);

        }

    }
}
    class CapitalSort implements Comparator<Country>{

        @Override
        public int compare(Country o1, Country o2) {
            return o1.getCapital().compareTo(o2.getCapital());
        }
    }

    class PopulationSort implements Comparator<Country>{

    @Override
    public int compare(Country o1, Country o2) {
        return o1.getPopulation().compareTo(o2.getPopulation());
    }
}
