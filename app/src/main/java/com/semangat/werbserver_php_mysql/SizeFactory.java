package com.semangat.werbserver_php_mysql;

/**
 * Created by HP-G4 on 4/18/2016.
 */
public class SizeFactory extends City {
    @Override
    Building getBuilding(String buildings) {
        return null;
    }

    @Override
    Size getSize(String sizes) {
        if(sizes==null){
            return null;
        }
        if(sizes.equalsIgnoreCase("big")){
            return new Big();
        } else if (sizes.equalsIgnoreCase("small")){
            return new Small();
        } return null;
    }
}
