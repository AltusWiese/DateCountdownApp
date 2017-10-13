package com.example.awiese.datecountdownapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.time.LocalDateTime;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventListFragment extends Fragment {

    private RecyclerView recyclerView;
    private EventAdapter eventAdapter;
    private EventViewHolder eventViewHolder;
    private EventDao eventDao;
    private LocalDateTime localDateTime;



    public EventListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_event_list, container, false);
//        eventDao = EventDatabase.getInstance(getContext()).eventDao();
//        eventDao.getEvents(localDateTime).observe(this, events -> {
//            Log.d(TAG, "Events Changed:" + events);
//            eventAdapter.setItems(events);
//        });
        return rootView;
    }

}
