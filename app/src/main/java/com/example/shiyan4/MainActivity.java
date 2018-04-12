package com.example.shiyan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //private String[]data={"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private List<Animal> animalList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAnimals();
        AnimalAdapter adapter=new AnimalAdapter(MainActivity.this,
                R.layout.animal_item,animalList);

        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(
        // MainActivity.this,android.R.layout.simple_list_item_1,data
        //);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener
                (new AdapterView.OnItemClickListener()
        {
            @Override
                    public  void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Animal animal=animalList.get(position);
                Toast.makeText(MainActivity.this,animal.getName(),Toast.LENGTH_SHORT).show();


            }

        }
        );
    }
    private void initAnimals()
    {

            Animal lion=new Animal("lion",R.drawable.lion);
            animalList.add(lion);
            Animal tiger=new Animal("tiger",R.drawable.tiger);
            animalList.add(tiger);
            Animal monkey=new Animal("monkey",R.drawable.monkey);
            animalList.add(monkey);
            Animal dog=new Animal("dog",R.drawable.dog);
            animalList.add(dog);
            Animal cat=new Animal("cat",R.drawable.cat);
            animalList.add(cat);
            Animal elephant=new Animal("elephant",R.drawable.elephant);
            animalList.add(elephant);


    }
}
