package com.lzf.export.util;





import java.util.List;

public interface ExportInterface<T> {
    List<T> queryList(Integer startRow, Integer endRow);
}
