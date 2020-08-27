package com.esapi;

/**
 * Hello world!
 *
 */

import org.owasp.esapi.ESAPI;
import org.owasp.esapi.Validator;
import org.owasp.esapi.codecs.DB2Codec;


public class App 
{
    public static void main( String[] args )
    {
        Validator instance = ESAPI.validator();

        Boolean flag = instance.isValidInput("test", "eduardo.macarron@mail.com", "Email", 100, false);

        System.out.println(flag);

        String sql = "temp' or '1' = '1";

        String test = "UPDATE TEST_TABLE SET USER = '" + sql + "'";

        String testmod = ESAPI.encoder().encodeForSQL(new DB2Codec(), test);

        System.out.println(testmod);

    }
}
