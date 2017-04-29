package com.example.newbiechen.ireader.model.gen;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.newbiechen.ireader.model.bean.AuthorBean;

import com.example.newbiechen.ireader.model.bean.BookHelpsBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_HELPS_BEAN".
*/
public class BookHelpsBeanDao extends AbstractDao<BookHelpsBean, String> {

    public static final String TABLENAME = "BOOK_HELPS_BEAN";

    /**
     * Properties of entity BookHelpsBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, String.class, "_id", true, "_ID");
        public final static Property AuthorId = new Property(1, String.class, "authorId", false, "AUTHOR_ID");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property LikeCount = new Property(3, int.class, "likeCount", false, "LIKE_COUNT");
        public final static Property HaveImage = new Property(4, boolean.class, "haveImage", false, "HAVE_IMAGE");
        public final static Property State = new Property(5, String.class, "state", false, "STATE");
        public final static Property Updated = new Property(6, String.class, "updated", false, "UPDATED");
        public final static Property Created = new Property(7, String.class, "created", false, "CREATED");
        public final static Property CommentCount = new Property(8, int.class, "commentCount", false, "COMMENT_COUNT");
    }

    private DaoSession daoSession;


    public BookHelpsBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookHelpsBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_HELPS_BEAN\" (" + //
                "\"_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: _id
                "\"AUTHOR_ID\" TEXT," + // 1: authorId
                "\"TITLE\" TEXT," + // 2: title
                "\"LIKE_COUNT\" INTEGER NOT NULL ," + // 3: likeCount
                "\"HAVE_IMAGE\" INTEGER NOT NULL ," + // 4: haveImage
                "\"STATE\" TEXT," + // 5: state
                "\"UPDATED\" TEXT," + // 6: updated
                "\"CREATED\" TEXT," + // 7: created
                "\"COMMENT_COUNT\" INTEGER NOT NULL );"); // 8: commentCount
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_BOOK_HELPS_BEAN_STATE ON BOOK_HELPS_BEAN" +
                " (\"STATE\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_HELPS_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookHelpsBean entity) {
        stmt.clearBindings();
 
        String _id = entity.get_id();
        if (_id != null) {
            stmt.bindString(1, _id);
        }
 
        String authorId = entity.getAuthorId();
        if (authorId != null) {
            stmt.bindString(2, authorId);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
        stmt.bindLong(4, entity.getLikeCount());
        stmt.bindLong(5, entity.getHaveImage() ? 1L: 0L);
 
        String state = entity.getState();
        if (state != null) {
            stmt.bindString(6, state);
        }
 
        String updated = entity.getUpdated();
        if (updated != null) {
            stmt.bindString(7, updated);
        }
 
        String created = entity.getCreated();
        if (created != null) {
            stmt.bindString(8, created);
        }
        stmt.bindLong(9, entity.getCommentCount());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookHelpsBean entity) {
        stmt.clearBindings();
 
        String _id = entity.get_id();
        if (_id != null) {
            stmt.bindString(1, _id);
        }
 
        String authorId = entity.getAuthorId();
        if (authorId != null) {
            stmt.bindString(2, authorId);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
        stmt.bindLong(4, entity.getLikeCount());
        stmt.bindLong(5, entity.getHaveImage() ? 1L: 0L);
 
        String state = entity.getState();
        if (state != null) {
            stmt.bindString(6, state);
        }
 
        String updated = entity.getUpdated();
        if (updated != null) {
            stmt.bindString(7, updated);
        }
 
        String created = entity.getCreated();
        if (created != null) {
            stmt.bindString(8, created);
        }
        stmt.bindLong(9, entity.getCommentCount());
    }

    @Override
    protected final void attachEntity(BookHelpsBean entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public BookHelpsBean readEntity(Cursor cursor, int offset) {
        BookHelpsBean entity = new BookHelpsBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // authorId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.getInt(offset + 3), // likeCount
            cursor.getShort(offset + 4) != 0, // haveImage
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // state
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // updated
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // created
            cursor.getInt(offset + 8) // commentCount
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookHelpsBean entity, int offset) {
        entity.set_id(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setAuthorId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLikeCount(cursor.getInt(offset + 3));
        entity.setHaveImage(cursor.getShort(offset + 4) != 0);
        entity.setState(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUpdated(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCreated(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCommentCount(cursor.getInt(offset + 8));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BookHelpsBean entity, long rowId) {
        return entity.get_id();
    }
    
    @Override
    public String getKey(BookHelpsBean entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookHelpsBean entity) {
        return entity.get_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getAuthorBeanDao().getAllColumns());
            builder.append(" FROM BOOK_HELPS_BEAN T");
            builder.append(" LEFT JOIN AUTHOR_BEAN T0 ON T.\"AUTHOR_ID\"=T0.\"_ID\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected BookHelpsBean loadCurrentDeep(Cursor cursor, boolean lock) {
        BookHelpsBean entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        AuthorBean author = loadCurrentOther(daoSession.getAuthorBeanDao(), cursor, offset);
        entity.setAuthor(author);

        return entity;    
    }

    public BookHelpsBean loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<BookHelpsBean> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<BookHelpsBean> list = new ArrayList<BookHelpsBean>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<BookHelpsBean> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<BookHelpsBean> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
