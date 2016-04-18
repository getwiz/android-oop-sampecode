package com.semangat.werbserver_php_mysql;

/**
 * Created by HP-G4 on 4/18/2016.
 */
public abstract class City {
    abstract Building getBuilding(String buildings);
    abstract Size getSize(String sizes);
}
