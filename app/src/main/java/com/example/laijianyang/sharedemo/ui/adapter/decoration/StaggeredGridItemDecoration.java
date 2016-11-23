package com.example.laijianyang.sharedemo.ui.adapter.decoration;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.example.laijianyang.sharedemo.R;

/**
 * Add 1 dp to bottom for each item and 1 dp to first item
 *
 * @author chentian
 */
public class StaggeredGridItemDecoration extends RecyclerView.ItemDecoration {

  private int mSizeGridSpacingPx;

  public StaggeredGridItemDecoration(Context context) {
    mSizeGridSpacingPx = context.getResources().getDimensionPixelOffset(R.dimen.list_item_margin);
  }

  @Override
  public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
    if (!(parent.getLayoutManager() instanceof StaggeredGridLayoutManager)) {
      throw new IllegalStateException("this recycler view is not in a staggered grid");
    }
    StaggeredGridLayoutManager layoutManager = (StaggeredGridLayoutManager) parent.getLayoutManager();
    int spanCount = layoutManager.getSpanCount();
    int itemPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition();
    int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex();
    if (itemPosition < spanCount) {
      outRect.top = 0;
    } else {
      outRect.top = mSizeGridSpacingPx;
    }
    if (spanIndex == 0) {
      outRect.right = mSizeGridSpacingPx / 2;
      outRect.left = mSizeGridSpacingPx;
    } else if (spanIndex == spanCount - 1) {
      outRect.left = mSizeGridSpacingPx / 2;
      outRect.right = mSizeGridSpacingPx;
    } else {
      outRect.left = mSizeGridSpacingPx / 2;
      outRect.right = mSizeGridSpacingPx / 2;
    }
    outRect.bottom = mSizeGridSpacingPx;
  }
}
