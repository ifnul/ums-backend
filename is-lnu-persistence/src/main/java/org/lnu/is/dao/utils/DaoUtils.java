package org.lnu.is.dao.utils;

import com.lambdista.util.Try;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;

public class DaoUtils {

    public static String getQuery(String queryName) {
        InputStream res = DaoUtils.class.getResourceAsStream("/queries/" + queryName);
        return Try.apply(() ->
                IOUtils.toString(res, "UTF-8")).get();
    }

}
