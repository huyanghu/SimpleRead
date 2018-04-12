package com.lesincs.simpleread.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.lesincs.simpleread.bean.DBZHNews;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DBZHNEWS".
*/
public class DBZHNewsDao extends AbstractDao<DBZHNews, Long> {

    public static final String TABLENAME = "DBZHNEWS";

    /**
     * Properties of entity DBZHNews.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NewsId = new Property(1, String.class, "newsId", false, "NEWS_ID");
        public final static Property IsCollected = new Property(2, Boolean.class, "isCollected", false, "IS_COLLECTED");
        public final static Property IsRead = new Property(3, Boolean.class, "isRead", false, "IS_READ");
        public final static Property NewsTitle = new Property(4, String.class, "newsTitle", false, "NEWS_TITLE");
        public final static Property ImageUrl = new Property(5, String.class, "imageUrl", false, "IMAGE_URL");
        public final static Property CollectTime = new Property(6, Long.class, "collectTime", false, "COLLECT_TIME");
    }


    public DBZHNewsDao(DaoConfig config) {
        super(config);
    }
    
    public DBZHNewsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DBZHNEWS\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NEWS_ID\" TEXT," + // 1: newsId
                "\"IS_COLLECTED\" INTEGER," + // 2: isCollected
                "\"IS_READ\" INTEGER," + // 3: isRead
                "\"NEWS_TITLE\" TEXT," + // 4: newsTitle
                "\"IMAGE_URL\" TEXT," + // 5: imageUrl
                "\"COLLECT_TIME\" INTEGER);"); // 6: collectTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DBZHNEWS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DBZHNews entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String newsId = entity.getNewsId();
        if (newsId != null) {
            stmt.bindString(2, newsId);
        }
 
        Boolean isCollected = entity.getIsCollected();
        if (isCollected != null) {
            stmt.bindLong(3, isCollected ? 1L: 0L);
        }
 
        Boolean isRead = entity.getIsRead();
        if (isRead != null) {
            stmt.bindLong(4, isRead ? 1L: 0L);
        }
 
        String newsTitle = entity.getNewsTitle();
        if (newsTitle != null) {
            stmt.bindString(5, newsTitle);
        }
 
        String imageUrl = entity.getImageUrl();
        if (imageUrl != null) {
            stmt.bindString(6, imageUrl);
        }
 
        Long collectTime = entity.getCollectTime();
        if (collectTime != null) {
            stmt.bindLong(7, collectTime);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DBZHNews entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String newsId = entity.getNewsId();
        if (newsId != null) {
            stmt.bindString(2, newsId);
        }
 
        Boolean isCollected = entity.getIsCollected();
        if (isCollected != null) {
            stmt.bindLong(3, isCollected ? 1L: 0L);
        }
 
        Boolean isRead = entity.getIsRead();
        if (isRead != null) {
            stmt.bindLong(4, isRead ? 1L: 0L);
        }
 
        String newsTitle = entity.getNewsTitle();
        if (newsTitle != null) {
            stmt.bindString(5, newsTitle);
        }
 
        String imageUrl = entity.getImageUrl();
        if (imageUrl != null) {
            stmt.bindString(6, imageUrl);
        }
 
        Long collectTime = entity.getCollectTime();
        if (collectTime != null) {
            stmt.bindLong(7, collectTime);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public DBZHNews readEntity(Cursor cursor, int offset) {
        DBZHNews entity = new DBZHNews( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // newsId
            cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0, // isCollected
            cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0, // isRead
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // newsTitle
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // imageUrl
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6) // collectTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DBZHNews entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNewsId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIsCollected(cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0);
        entity.setIsRead(cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0);
        entity.setNewsTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setImageUrl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCollectTime(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DBZHNews entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DBZHNews entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DBZHNews entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}