package com.example.jerrydengu.eazyeats;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jerry Dengu on 24/01/2017.
 */

public class Tab2Outlets extends Fragment {
    private static final String TITLE = "title";

    String mTitle;

    public static Tab2Outlets newInstance(String title) {
        Tab2Outlets fragment = new Tab2Outlets();
        Bundle args = new Bundle();
        args.putString(TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    public Tab2Outlets() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mTitle = getArguments().getString(TITLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.outlets, container, false);

        RecyclerView rv = (RecyclerView) root.findViewById(R.id.outlets_list);
        setupRecyclerView(rv);

        return root;
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(getActivity().getResources().getInteger(R.integer.list_columns), StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new RecyclerViewAdapter(getActivity(), Outlets.getOutlets(10)));
    }

    public static class RecyclerViewAdapter
            extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

        private ArrayList<Outlet> mValues;
        private Context mContext;

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

        public Outlet getValueAt(int position) {
            return mValues.get(position);
        }

        public RecyclerViewAdapter(Context context, ArrayList<Outlet> items) {
            mValues = items;
            mContext = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_card, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {

            holder.mOutletTitle.setText(getValueAt(position).getOutletTitle());
            holder.mOutletDescription.setText(getValueAt(position).getOutletDescription());

            /*Glide.with(mContext)
                        .load(getValueAt(position).getReviewerAvatar())
                        .fitCenter()
                        .into(holder.mReviewerAvatar);*/
            holder.mReviewerAvatar.setImageResource(Outlets.getRandomAvatar());
            holder.mReviewerUsername.setText(getValueAt(position).getReviewerUsername());
            holder.mReview.setText(String.valueOf(getValueAt(position).getOutletReview()));

            if (getValueAt(position).getOutletImages().length() <= 0) {
                holder.mOutletImagesContainer.setVisibility(View.GONE);
            } else {
                holder.mOutletImagesContainer.setVisibility(View.VISIBLE);
                holder.mOutletImages.removeAllViews();
                LayoutInflater inflater = LayoutInflater.from(mContext);
                String[] outletImages = getValueAt(position).getOutletImages().split(",");

                if (outletImages.length == 0) {
                    holder.mOutletImagesContainer.setVisibility(View.GONE);
                    return;
                }

                for (final String outletImage : outletImages) {
                    ImageView outletImageView = (ImageView) inflater.inflate(
                            R.layout.include_image_chip, holder.mOutletImages, false);

                    /*Glide.with(mContext)
                        .load(outletImage)
                        .fitCenter()
                        .into(outletImageView);*/

                    outletImageView.setImageResource(Outlets.getRandomImage());

                    outletImageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });

                    holder.mOutletImages.addView(outletImageView);
                }
            }

            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });


        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }
    }


}

