import java.util.ArrayList;

class Continent{
    private String contName;
    private double size;
    private ArrayList<Country> list_of_countries = new ArrayList<Country>();

    public Continent(String contName, double size , ArrayList<Country> list_of_countries){
        this.contName = contName;
        this.size = size;
        this.list_of_countries = list_of_countries;
    }

    public String getContName() {
        return contName;
    }

    public void display(){
        for(int i = 0 ; i < list_of_countries.size(); i++){
            System.out.println("Country no = " + (i + 1));
            list_of_countries.get(i).display();
       
        }
    }
}

class Country{
    private String countryName;
    private double area;
    private City capital;
    private ArrayList<City> list_of_cities = new ArrayList<City>();

    Country(String countryName, double area, String[] cities , double[] populations){
        this.countryName = countryName;
        this.area = area;
        this.capital = new City(cities[0], populations[0]); 
        
            for(int i = 0; i < cities.length; i++){
                City city = new City(cities[i], populations[i]);
           
                list_of_cities.add(city);
            
            }
        }
    
        public void display(){
            System.out.println("Country Name: " + countryName);
            System.out.println("Area: " + area);
            System.out.println("Capital: " + capital.getCityName());
           
    }
    
    class City{
        private String cityName;
        private double population;
        City(String cityName, double population){
            this.cityName = cityName;
            this.population = population;
        }
        public String getCityName(){
            return cityName;
        }
        public double getPopulation(){
            return population;
        }
    }
}

class Demo{
    public static void main(String[] args) {
         String[] pakistan_cities = {"Islamabad","Karachi", "Lahore",  "Peshawar"};
         double[] pakistan_populations = { 3121230,1122, 123, 4000120};
        
         String[] india_cities = {"Delhi", "Mumbai", "Bangalore",  "Chennai"};
         double[] india_populations = { 3121230,112212, 123, 4000120};
        
         Country India = new Country("India", 320000, india_cities, india_populations);
         Country Pakistan = new Country("Pakistan", 3122330, pakistan_cities, pakistan_populations);
        
         ArrayList<Country> list_of_countries = new ArrayList<Country>();
         list_of_countries.add(India);
         list_of_countries.add(Pakistan);
         Continent Asia = new Continent("Asia", 320000, list_of_countries );
         Asia.display();
    }
}
