package com.example.jerrydengu.eazyeats;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jerry Dengu on 24/01/2017.
 */

public class Tab1Cuisines extends Fragment  {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1cuisines, container, false);
     //   RecyclerView vr = (RecyclerView) rootView.findViewById(R.id.cuisinerview);
       // setupRecyclerView(vr);
        return rootView;




    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(getActivity().getResources().getInteger(R.integer.list_columns), StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new RecyclerViewAdapter(getActivity(), Outlets.getOutlets(10)));
    }
    public static class RecyclerViewAdapter
            extends RecyclerView.Adapter<Tab1Cuisines.RecyclerViewAdapter.ViewHolder> {

        private ArrayList<Outlet> mValues;
        private Context mContext;

        public RecyclerViewAdapter(FragmentActivity activity, ArrayList<Outlet> outlets) {
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.cuisine_recycler_cardview, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

        }



        @Override
        public int getItemCount() {
            return 0;
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {

            public final View mView;

            public final TextView mOutletTitle;
            public final TextView mOutletDescription;


            private ViewGroup mOutletImagesContainer;
            private LinearLayout mOutletImages;

            public final ImageView mReviewerAvatar;
            public final TextView mReviewerUsername;
            public final TextView mReview;

            public ViewHolder(View view) {
                super(view);
                mView = view;

                mOutletTitle = (TextView) view.findViewById(R.id.title);
                mOutletDescription = (TextView) view.findViewById(R.id.description);


                mOutletImagesContainer = (ViewGroup) view.findViewById(R.id.outlet_images_container);
                mOutletImages = (LinearLayout) view.findViewById(R.id.outlet_images);

                mReviewerAvatar = (ImageView) view.findViewById(R.id.avatar);
                mReviewerUsername = (TextView) view.findViewById(R.id.username);
                mReview = (TextView) view.findViewById(R.id.review);
            }

        }
}}
