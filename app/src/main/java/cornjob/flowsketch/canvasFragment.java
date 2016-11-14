package cornjob.flowsketch;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class canvasFragment extends Fragment {

    public boolean log_in_status = false; // Boolean whether user is logged in or not
                                          // Options menu changes depending on this variable
                                          // NOTE: Change this variable to 'true' when user
                                          // logs in

    public canvasFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main_logged_out, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {



        int id = item.getItemId();

        /** Go to login activity **/
        if(id == R.id.login_action)
        {
            Intent intent = new Intent(getActivity(), LoginActivity.class);
            startActivity(intent);
        }

        if(id == R.id.square_item){
            Toast.makeText(getActivity(), "Square Clicked", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.cirle_item){
            Toast.makeText(getActivity(), "Circle Clicked", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.triangle_item){
            Toast.makeText(getActivity(), "Triangle Clicked", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.rectangle_item){
            Toast.makeText(getActivity(), "Rectangle Clicked", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.diamond_item){
            Toast.makeText(getActivity(), "Diamond Clicked", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.oval_item){
            Toast.makeText(getActivity(), "Oval Clicked", Toast.LENGTH_SHORT).show();
        }
        //overflow options
        else if(id == R.id.load_canvas_action){
            Intent intent = new Intent(getActivity(), LoadActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
