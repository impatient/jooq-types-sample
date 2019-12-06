/*
 * This file is generated by jOOQ.
 */
package org.jooq.sample.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.sample.Indexes;
import org.jooq.sample.JooqSample;
import org.jooq.sample.Keys;
import org.jooq.sample.tables.records.AddressRecord;


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
public class Address extends TableImpl<AddressRecord> {

    private static final long serialVersionUID = 1949391166;

    /**
     * The reference instance of <code>jooq_sample.address</code>
     */
    public static final Address ADDRESS = new Address();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AddressRecord> getRecordType() {
        return AddressRecord.class;
    }

    /**
     * The column <code>jooq_sample.address.id</code>.
     */
    public final TableField<AddressRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('shared_sequence'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>jooq_sample.address.person_id</code>.
     */
    public final TableField<AddressRecord, Long> PERSON_ID = createField(DSL.name("person_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>jooq_sample.address.address_1</code>.
     */
    public final TableField<AddressRecord, String> ADDRESS_1 = createField(DSL.name("address_1"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jooq_sample.address.city</code>.
     */
    public final TableField<AddressRecord, String> CITY = createField(DSL.name("city"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jooq_sample.address.extraneous</code>.
     */
    public final TableField<AddressRecord, String> EXTRANEOUS = createField(DSL.name("extraneous"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>jooq_sample.address</code> table reference
     */
    public Address() {
        this(DSL.name("address"), null);
    }

    /**
     * Create an aliased <code>jooq_sample.address</code> table reference
     */
    public Address(String alias) {
        this(DSL.name(alias), ADDRESS);
    }

    /**
     * Create an aliased <code>jooq_sample.address</code> table reference
     */
    public Address(Name alias) {
        this(alias, ADDRESS);
    }

    private Address(Name alias, Table<AddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private Address(Name alias, Table<AddressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Address(Table<O> child, ForeignKey<O, AddressRecord> key) {
        super(child, key, ADDRESS);
    }

    @Override
    public Schema getSchema() {
        return JooqSample.JOOQ_SAMPLE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ADDRESS_PKEY);
    }

    @Override
    public Identity<AddressRecord, Long> getIdentity() {
        return Keys.IDENTITY_ADDRESS;
    }

    @Override
    public UniqueKey<AddressRecord> getPrimaryKey() {
        return Keys.ADDRESS_PKEY;
    }

    @Override
    public List<UniqueKey<AddressRecord>> getKeys() {
        return Arrays.<UniqueKey<AddressRecord>>asList(Keys.ADDRESS_PKEY);
    }

    @Override
    public List<ForeignKey<AddressRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AddressRecord, ?>>asList(Keys.ADDRESS__ADDRESS_PERSON_ID_FKEY);
    }

    public Person person() {
        return new Person(this, Keys.ADDRESS__ADDRESS_PERSON_ID_FKEY);
    }

    @Override
    public Address as(String alias) {
        return new Address(DSL.name(alias), this);
    }

    @Override
    public Address as(Name alias) {
        return new Address(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(String name) {
        return new Address(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Name name) {
        return new Address(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
