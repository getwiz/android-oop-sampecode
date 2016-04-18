package com.semangat.werbserver_php_mysql;

/**
 * Created by HP-G4 on 4/18/2016.
 */
public class BuildingFactory extends City {
    @Override
    Building getBuilding(String buildings) {
        if (buildings==null){
            return null;
        }
        if (buildings.equalsIgnoreCase("Monas")){
            return new Monas();
        } else if (buildings.equalsIgnoreCase("Tower")){
            return new Tower();
        } return null;
    }

    @Override
    Size getSize(String sizes) {
        return null;
    }
}
