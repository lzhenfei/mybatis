package com.lzf.export.util;

import org.apache.poi.ss.formula.functions.T;

public class ExportTask {

    private int totalCount;
    private ExportInterface exportInterface;
    private Class<?> clazz;

    public ExportTask(int count, ExportInterface exportInterface, Class<?> clazz) {
        this.totalCount = count;
        this.exportInterface = exportInterface;
        this.clazz = clazz;
    }

    public void execute() throws IllegalAccessException {
        ExcelUtil.writerToExcel(totalCount, exportInterface, clazz);
    }
}
