package javacollection;

public class Country implements Comparable<Country>{
    private String name;
    private String capital;
    private Integer population;

    public Country(String name, String capital, Integer population) {
        this.name = name;
        this.capital=capital;
        this.population=population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(Country obj){
        return name.compareTo(obj.getName());
    }

}
