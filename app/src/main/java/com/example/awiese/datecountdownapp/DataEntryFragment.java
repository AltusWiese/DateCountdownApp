package com.example.awiese.datecountdownapp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataEntryFragment extends Fragment {


    public DataEntryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_data_entry, container, false);
//        Button setDateButton = rootView.findViewById(R.id.selectDate_button);
//        Button saveEventButton = rootView.findViewById(R.id.save_event_button);
        final EditText title = rootView.findViewById(R.id.editText_title);
        final EditText description = rootView.findViewById(R.id.editText_description);
        final DatePicker selectedDate = rootView.findViewById(R.id.datePicker);
//        setDateButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                selectedDate.setVisibility(View.INVISIBLE);
//                int getDay = selectedDate.getDayOfMonth();
//                int getMonth = selectedDate.getMonth();
//                int getYear = selectedDate.getYear();
//
//            }
//        });
//
//        saveEventButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String eventTitle = title.getText().toString();
//                String eventDescription = description.getText().toString();
//                Event event = new Event(0, eventTitle, eventDescription, eventDateTime);
//            }
//        });
        return rootView;
    }

}
