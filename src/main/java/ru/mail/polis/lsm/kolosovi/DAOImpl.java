package ru.mail.polis.lsm.kolosovi;

import ru.mail.polis.lsm.DAO;
import ru.mail.polis.lsm.Record;

import javax.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListMap;

public class DAOImpl implements DAO {
    private ConcurrentSkipListMap<ByteBuffer, ByteBuffer> map;

    public DAOImpl() {
        this.map = new ConcurrentSkipListMap<>();
    }

    @Override
    public Iterator<Record> range(@Nullable ByteBuffer fromKey, @Nullable ByteBuffer toKey) {
        return null;
    }

    @Override
    public void upsert(Record record) {
        this.map.put(record.getKey(), record.getValue());
    }

    @Override
    public void compact() {

    }

    @Override
    public void close() throws IOException {

    }
}
