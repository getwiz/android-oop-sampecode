package com.semangat.werbserver_php_mysql;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        City buildingFactory=FactoryProducer.getFactory("building");
        Building building1= buildingFactory.getBuilding("monas");
        building1.building();

        Building building2=buildingFactory.getBuilding("tower");
        building2.building();

        City sizeFactory=FactoryProducer.getFactory("size");
        Size size1=sizeFactory.getSize("small");
        size1.size();

        Size size2=sizeFactory.getSize("big");
        size2.size();
    }
}
