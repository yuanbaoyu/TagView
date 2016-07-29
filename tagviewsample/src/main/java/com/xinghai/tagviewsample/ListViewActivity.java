package com.xinghai.tagviewsample;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;


import com.xinghai.tagview.LabelImageView;

import java.util.ArrayList;
import java.util.List;


public class ListViewActivity extends ActionBarActivity {

    public class CategoryData {
        public String image;
        public String text;
        public String label;
    }

    public class CategoryAdapter extends SimpleBaseAdapter<CategoryData> {
        public CategoryAdapter(Context context, List<CategoryData> data) {
            super(context, data);
        }

        @Override
        public int getItemResource() {
            return R.layout.list_view_item;
        }

        @Override
        public View getItemView(int position, View convertView, ViewHolder holder) {

            CategoryData item = (CategoryData) _categoryAdapter.getItem(position);
            TextView textView = holder.getView(R.id.text);
            textView.setText(item.text);

            LabelImageView imageView = holder.getView(R.id.image);
            imageView.setImageResource(Integer.parseInt(item.image));
            imageView.setLabelText("LID " + position);

            return convertView;
        }
    }

    private CategoryAdapter _categoryAdapter;
    private ListView _listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        _listView = (ListView) findViewById(R.id.list_view);
        _categoryAdapter = new CategoryAdapter(this, null);
        _listView.setAdapter(_categoryAdapter);

        getCategoryData();
        getCategoryData();
        getCategoryData();

    }

    private void getCategoryData() {

        List<CategoryData> data = new ArrayList<>();

        {
            CategoryData item = new CategoryData();
            item.text = "Following the founding of New China, the policy of cultural reawakening offered Kunqu Opera the chance to emerge from a long period of neglect.";
            item.image = R.mipmap.k1 + "";
            item.label = "MD";
            data.add(item);
        }

        {
            CategoryData item = new CategoryData();
            item.text = "Kunqu Opera can trace its origins back to the Ming Dynasty about six hundred years ago, and a small town south of the Yangtze, called Kunshan.";
            item.image = R.mipmap.k2 + "";
            item.label = "FC";
            data.add(item);
        }

        {
            CategoryData item = new CategoryData();
            item.text = "The popularity of Kunqu Opera historically has a lot to do with the support it received from the imperial court, from the time of Emperor Kangxi, onwards.";
            item.image = R.mipmap.k3 + "";
            item.label = "NFC";
            data.add(item);
        }

        {
            CategoryData item = new CategoryData();
            item.text = "Perhaps the greatest masterpiece of Kunqu Opera is “The Peony Pavilion” written by Tang Xianzu in the early years of the 17th century.";
            item.image = R.mipmap.k4 + "";
            item.label = "GBA";
            data.add(item);
        }

        {
            CategoryData item = new CategoryData();
            item.text = "Kunqu Opera is remarkable, if for nothing else, because of the long time it has been around. It continues to exert a strong appeal today.";
            item.image = R.mipmap.k5 + "";
            item.label = "PS";
            data.add(item);
        }

        {
            CategoryData item = new CategoryData();
            item.text = "In the late Qing Dynasty, after five hundred years of development, Kunqu faced the greatest crisis in its existence.";
            item.image = R.mipmap.k6 + "";
            item.label = "XBOX";
            data.add(item);
        }


        {
            CategoryData item = new CategoryData();
            item.text = "During the Qing Dynasty that followed, it became so popular that it was said to have an influence at every level of society, from the imperial court, down.";
            item.image = R.mipmap.k7 + "";
            item.label = "GB";
            data.add(item);
        }


        {
            CategoryData item = new CategoryData();
            item.text = "The Qing Dynasty’s greatest playwrights, are Hong Sheng and Kong Shangren, who wrote, respectively, “The Palace of Eternal Youth” and “The Peach Blossom Fan”.";
            item.image = R.mipmap.k8 + "";
            item.label = "N64";
            data.add(item);
        }


        {
            CategoryData item = new CategoryData();
            item.text = "Every period of history has its own fashions and tastes in clothing, music, etc. During the Ming Dynasty, it was fashionable among the intelligentsia to enjoy Kunqu Opera.";
            item.image = R.mipmap.k9 + "";
            item.label = "PSP";
            data.add(item);
        }

        {
            CategoryData item = new CategoryData();
            item.text = "Kunqu Opera can trace its origins back to the late Ming Dynasty and a small town south of the Yangtze, called Kunshan.";
            item.image = R.mipmap.k10 + "";
            item.label = "NDS";
            data.add(item);
        }
        _categoryAdapter.addAll(data);
        _categoryAdapter.notifyDataSetChanged();
    }

}
