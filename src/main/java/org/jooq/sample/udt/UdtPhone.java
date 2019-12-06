/*
 * This file is generated by jOOQ.
 */
package org.jooq.sample.udt;


import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.DSL;
import org.jooq.impl.SchemaImpl;
import org.jooq.impl.UDTImpl;
import org.jooq.sample.JooqSample;
import org.jooq.sample.udt.records.UdtPhoneRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UdtPhone extends UDTImpl<UdtPhoneRecord> {

    private static final long serialVersionUID = -735191144;

    /**
     * The reference instance of <code>jooq_sample.udt_phone</code>
     */
    public static final UdtPhone UDT_PHONE = new UdtPhone();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UdtPhoneRecord> getRecordType() {
        return UdtPhoneRecord.class;
    }

    /**
     * The attribute <code>jooq_sample.udt_phone.id</code>.
     */
    public static final UDTField<UdtPhoneRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT, UDT_PHONE, "");

    /**
     * The attribute <code>jooq_sample.udt_phone.digits</code>.
     */
    public static final UDTField<UdtPhoneRecord, String> DIGITS = createField(DSL.name("digits"), org.jooq.impl.SQLDataType.VARCHAR(15), UDT_PHONE, "");

    /**
     * No further instances allowed
     */
    private UdtPhone() {
        super("udt_phone", null, null, false);
    }

    @Override
    public Schema getSchema() {
        return JooqSample.JOOQ_SAMPLE != null ? JooqSample.JOOQ_SAMPLE : new SchemaImpl(DSL.name("jooq_sample"));
    }
}
