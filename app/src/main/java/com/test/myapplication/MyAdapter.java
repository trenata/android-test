package com.test.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CityViewHolder> {

    private Context mContext;
    private int[] mCityList;
    private String[] mCityNameList;

    public class CityViewHolder extends RecyclerView.ViewHolder {

        private ImageView mCity;
        private TextView mCityName;

        private CityViewHolder(View itemView) {
            super(itemView);

            mCity = itemView.findViewById(R.id.ivCity);
            mCityName = itemView.findViewById(R.id.tvCity);
        }

        private void bind(int cityImage, String cityName) {
            mCity.setImageResource(cityImage);
            mCityName.setText(cityName);
        }
    }

    public MyAdapter(Context mContext, int[] mCityList, String[] mCityNameList) {
        this.mContext = mContext;
        this.mCityList = mCityList;
        this.mCityNameList = mCityNameList;
    }

    @Override
    public MyAdapter.CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,
                parent, false);
        return new CityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CityViewHolder holder, int position) {
        holder.bind(mCityList[position], mCityNameList[position]);

        holder.mCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, DetailActivity.class);
                mIntent.putExtra("Image", mCityList[holder.getAdapterPosition()]);
                mContext.startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mCityList.length;
    }
}

