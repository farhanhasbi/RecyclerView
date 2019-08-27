package windows.example.m.recycleviewhewan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rechewan;
    private ArrayList<Animal> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rechewan = findViewById(R.id.ls_hewan);
        rechewan.setHasFixedSize(true);

        list.addAll(AnimalData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rechewan.setLayoutManager(new LinearLayoutManager(this));
        ListAnimalAdapter listHeroAdapter = new ListAnimalAdapter(list);
        rechewan.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode (int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;
        }
    }

    private void showRecyclerGrid(){
        rechewan.setLayoutManager(new GridLayoutManager(this, 2));
        GridAnimalAdapter gridHeroAdapter = new GridAnimalAdapter(list);
        rechewan.setAdapter(gridHeroAdapter);
    }

    private void showRecyclerCardView(){
        rechewan.setLayoutManager(new LinearLayoutManager(this));
        CardViewAnimalAdapter cardViewHeroAdapter = new CardViewAnimalAdapter(list);
        rechewan.setAdapter(cardViewHeroAdapter);
    }
}

