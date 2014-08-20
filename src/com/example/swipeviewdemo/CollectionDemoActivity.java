package com.example.swipeviewdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;

public class CollectionDemoActivity extends FragmentActivity {
	DemoCollectionPagerAdapter mDemoCollectionPagerAdapter;
	ViewPager mViewPager;
	PagerTabStrip pagerTitleStrip;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);

		// ViewPager和他的adapter使用了support library
		// fragments,所以要用getSupportFragmentManager.
		mDemoCollectionPagerAdapter = new DemoCollectionPagerAdapter(
				getSupportFragmentManager());
		mViewPager = (ViewPager) findViewById(R.id.pager);
		pagerTitleStrip = (PagerTabStrip) findViewById(R.id.pager_title_strip);
//		pagerTitleStrip.setTabIndicatorColor(Color.GREEN);
//		pagerTitleStrip.setBackgroundColor(Color.TRANSPARENT);
		// 分隔线
		pagerTitleStrip.setDrawFullUnderline(false);
		// 标题间间距
		pagerTitleStrip.setTextSpacing(50);
		mViewPager.setAdapter(mDemoCollectionPagerAdapter);

	}
}
