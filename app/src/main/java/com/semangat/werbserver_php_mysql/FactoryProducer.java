package com.semangat.werbserver_php_mysql;

/**
 * Created by HP-G4 on 4/18/2016.
 */
public class FactoryProducer {
    public static City getFactory(String choice){
        if (choice.equalsIgnoreCase("building")){
            return new BuildingFactory();
        } else {
            return new SizeFactory();
        }
    }
}
