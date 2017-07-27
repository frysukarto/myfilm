package com.example.ferry.filmku.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ferry.filmku.AppConstant;
import com.example.ferry.filmku.DetailActivity;
import com.example.ferry.filmku.R;
import com.example.ferry.filmku.model.MovieData;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterMovies extends RecyclerView.Adapter<AdapterMovies.HolderMovies> {

    private Context mContext;
    private List<MovieData.Result> mListMovie;

    public AdapterMovies(Context mContext, List<MovieData.Result> listMovie) {
        this.mContext = mContext;
        this.mListMovie = listMovie;
    }
    public class HolderMovies extends RecyclerView.ViewHolder{

        ImageView img;


        public HolderMovies(View itemView)
        {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.imagesId);
        }

    }



    public class HolderMovies extends RecyclerView.ViewHolder{

        TextView mTextMovieTitle;

        public HolderMovies(View itemView) {
            super(itemView);
            mTextMovieTitle = (TextView) itemView.findViewById(R.id.textMovieTitle);
        }
    }

    public HolderMovies onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowView = LayoutInflater.from(mContext).inflate(R.layout.list_item_movies, parent, false);
        HolderMovies holderMovies = new HolderMovies(rowView);
        return holderMovies;
    }

    @Override
    public void onBindViewHolder(HolderMovies holder, int position) {
//        MovieData.Result movieData = mListMovie.get(position);
//
//        holder.mTextMovieTitle.setText(movieData.original_title);
//
//        final String dataJsonMovie = new Gson().toJson(movieData, MovieData.Result.class);
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(), DetailActivity.class);
//                intent.putExtra("json", dataJsonMovie);
//                v.getContext().startActivity(intent);
//            }
//        });
        Picasso.with(mContext).load(AppConstant.MOVIE_POSTER_URL + mListMovie.get(position).poster_path)
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.img);
    }


    @Override
    public int getItemCount() {
        return mListMovie.size();
    }
}
