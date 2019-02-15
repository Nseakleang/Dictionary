package com.seakleang.dictionary.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.seakleang.dictionary.entity.History;

import java.util.List;

@Dao
public interface HistoryDao {

    @Insert
    void add(History history);

    @Update
    void update(History history);

    @Delete
    void delete(History history);

    @Query("select word_id from history where id = :id")
    int getWordIdById(int id);

    @Query("select date from history where id = :id")
    String getDateById(int id);

    @Query("select time from history where id = :id")
    String getTimeById(int id);

    @Query("select word from dictionary inner join history on dictionary.id = history.word_id order by history.id desc")
    List<String> getWord();

    @Query("delete from history")
    void deleteAll();
}
