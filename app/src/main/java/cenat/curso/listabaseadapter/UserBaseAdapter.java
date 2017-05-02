package cenat.curso.listabaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by A on 04/01/2017.
 */

public class UserBaseAdapter extends BaseAdapter{

    ArrayList<Users> lista=new ArrayList<>();
    LayoutInflater inflater;
    Context context;

    public UserBaseAdapter(Context context,ArrayList<Users>lista)
    {
        this.context=context;
        this.lista=lista;
        inflater=LayoutInflater.from(this.context);
    }
    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        UserViewHolder userviewholder;

        if(convertView==null)
        {

            convertView=inflater.inflate(R.layout.list_item,parent,false);
            userviewholder=new UserViewHolder(convertView);
            convertView.setTag(userviewholder);
        }else
        {
            userviewholder=(UserViewHolder)convertView.getTag();
        }

        Users user= (Users)getItem(position);
        userviewholder.txtid.setText(String.valueOf(user.getId()));
        userviewholder.txtuser.setText(user.getUser());
        return convertView;
    }

    private class UserViewHolder
    {
        TextView txtid;
        TextView txtuser;

        public UserViewHolder(View item)
        {
            txtid=(TextView)item.findViewById(R.id.txtid);
            txtuser=(TextView)item.findViewById(R.id.txtusuario);
        }
    }
}
