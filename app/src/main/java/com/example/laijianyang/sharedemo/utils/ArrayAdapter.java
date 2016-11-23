package com.example.laijianyang.sharedemo.utils;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * recycler view adapter that has an array
 *
 * Created by laijianyang on 2016/11/23.
 */

public abstract class ArrayAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

  public ArrayAdapter() {
    mObjects = new ArrayList<>();
  }

  @Override
  public int getItemCount() {
    return mObjects.size();
  }

  /**
   * Contains the list of objects that represent the data of this ArrayAdapter.
   * The content of this list is referred to as "the array" in the documentation.
   */
  protected List<T> mObjects;

  /**
   * Indicates whether or not {@link #notifyDataSetChanged()} must be called whenever
   * {@link #mObjects} is modified.
   */
  protected boolean mNotifyOnChange = true;

  /**
   * Adds the specified object at the end of the array.
   *
   * @param object The object to add at the end of the array.
   */
  public void add(T object) {
    mObjects.add(object);
    if (mNotifyOnChange) notifyDataSetChanged();
  }

  /**
   * 设置数据集合为指定的数据集
   */
  public void set(Collection<? extends T> collection) {
    mObjects.clear();
    mObjects.addAll(collection);
    if (mNotifyOnChange) notifyDataSetChanged();
  }

  /**
   * 直接绑定给定的数据集
   */
  public void setDirectly(ArrayList<T> collection) {
    mObjects = collection;
    if (mNotifyOnChange) notifyDataSetChanged();
  }

  /**
   * Adds the specified Collection at the end of the array.
   *
   * @param collection The Collection to add at the end of the array.
   */
  public void addAll(Collection<? extends T> collection) {
    mObjects.addAll(collection);
    if (mNotifyOnChange) notifyDataSetChanged();
  }

  public void addAllAfterClear(Collection<? extends T> collection) {

    mObjects.clear();
    mObjects.addAll(collection);

    if (mNotifyOnChange) notifyDataSetChanged();
  }

  /**
   * Adds the specified items at the end of the array.
   *
   * @param items The items to add at the end of the array.
   */
  @SafeVarargs
  public final void addAll(T... items) {

    Collections.addAll(mObjects, items);

    if (mNotifyOnChange) notifyDataSetChanged();
  }

  /**
   * Inserts the specified object at the specified index in the array.
   *
   * @param object The object to insert into the array.
   * @param index The index at which the object must be inserted.
   */
  public void insert(T object, int index) {

    mObjects.add(index, object);

    if (mNotifyOnChange) notifyDataSetChanged();
  }

  /**
   * Removes the specified object from the array.
   *
   * @param object The object to remove.
   */
  public void remove(T object) {

    mObjects.remove(object);
    if (mNotifyOnChange) notifyDataSetChanged();
  }

  /**
   * Remove all elements from the list.
   */
  public void clear() {

    mObjects.clear();
    if (mNotifyOnChange) notifyDataSetChanged();
  }

  /**
   * Sorts the content of this adapter using the specified comparator.
   *
   * @param comparator The comparator used to sort the objects contained
   * in this adapter.
   */
  public void sort(Comparator<? super T> comparator) {
    Collections.sort(mObjects, comparator);
    if (mNotifyOnChange) notifyDataSetChanged();
  }

  /**
   * Control whether methods that change the list ({@link #add},
   * {@link #insert}, {@link #remove}, {@link #clear}) automatically call
   * {@link #notifyDataSetChanged}.  If set to false, caller must
   * manually call notifyDataSetChanged() to have the changes
   * reflected in the attached view.
   * <p/>
   * The default is true, and calling notifyDataSetChanged()
   * resets the flag to true.
   *
   * @param notifyOnChange if true, modifications to the list will
   * automatically call {@link
   * #notifyDataSetChanged}
   */
  public void setNotifyOnChange(boolean notifyOnChange) {
    mNotifyOnChange = notifyOnChange;
  }

  /**
   * {@inheritDoc}
   */
  public T getItem(int position) {
    return mObjects.get(position);
  }
}
