package business.forscherlabs.ganrajastrology;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Gunesh on 9/14/2014.
 */
public class MainFragment extends Fragment {
    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        //lets try if this works as for push
        Button btn_about = (Button) rootView.findViewById(R.id.btn_about);
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abt_intent = new Intent(getActivity(), AboutActivity.class);
                startActivity(abt_intent);
            }
        });

        Button btn_contact = (Button) rootView.findViewById(R.id.btn_Contact);
        btn_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contact_intent = new Intent(getActivity(), ContactActivity.class);
                startActivity(contact_intent);
            }
        });

        return rootView;
    }

}
