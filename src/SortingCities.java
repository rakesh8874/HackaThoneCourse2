import java.util.Arrays;

public class SortingCities {
    public String[] citiesWithDistance(String[]cities, int[] distance) {
        int len= distance.length;
        int temp;
        String str;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(distance[j]>distance[j+1]){
                    //Swap Distance
                    temp=distance[j];
                    distance[j]=distance[j+1];
                    distance[j+1]=temp;
                   //swap cities
                    str=cities[j];
                    cities[j]=cities[j+1];
                    cities[j+1]=str;
                }
            }
        }
        String []upperCaseCity = new String[cities.length];
        for(int i = 0; i<cities.length;i++){
        upperCaseCity[i] = cities[i].toUpperCase();
        }
        return upperCaseCity;
    }
    public String findCity(String[]cities, int []distance){
           int index = 0;
            int d = 52;
            for(int i = 0; i<distance.length; i++){
                if(distance[i]==d){
                    d = distance[i];
                    index = i;
                }
            }
            return cities[index];
    }
    public String findHighestCity(String []cities, int []distance){
        int index=0;
        int d = 270;
        for(int i = 0; i<distance.length;i++){
            if(distance[i]>d){
                d=distance[i];
                index = i;
            }
        }
        return cities[index];
    }

    public static void main (String[]args){
            String[] cities = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
            int[] distance = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
            SortingCities sortCity = new SortingCities();
               String[]sortedCities = sortCity.citiesWithDistance(cities,distance);
               System.out.println(Arrays.toString(sortedCities));
               String cityName = sortCity.findCity(sortedCities,distance);
               System.out.println("City Which Is Having 52KM distance : "+cityName);
               String cityName1 = sortCity.findHighestCity(sortedCities,distance);
               System.out.println("City Which Has Distance More Than 270KM : "+cityName1);
    }
    }

