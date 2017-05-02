package cenat.curso.listabaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listusers);
        listView.setAdapter(new UserBaseAdapter(this,cargarUsuario()));

    }


    private ArrayList<Users> cargarUsuario()
    { ArrayList<Users> userlist=new ArrayList<>();

        for(int i=0;i<10;i++)
        {
            Users user=new Users();
            user.setId((i+1));
            user.setUser("Usuario "+(i+1));
            userlist.add(user);

        }
        return userlist;

    }
}
