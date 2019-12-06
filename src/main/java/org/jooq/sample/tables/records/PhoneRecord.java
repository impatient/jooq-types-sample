/*
 * This file is generated by jOOQ.
 */
package org.jooq.sample.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.sample.tables.Phone;


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
public class PhoneRecord extends UpdatableRecordImpl<PhoneRecord> implements Record4<Long, Long, Integer, String> {

    private static final long serialVersionUID = -2044417175;

    /**
     * Setter for <code>jooq_sample.phone.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq_sample.phone.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>jooq_sample.phone.person_id</code>.
     */
    public void setPersonId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq_sample.phone.person_id</code>.
     */
    public Long getPersonId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>jooq_sample.phone.priority</code>.
     */
    public void setPriority(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq_sample.phone.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>jooq_sample.phone.digits</code>.
     */
    public void setDigits(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>jooq_sample.phone.digits</code>.
     */
    public String getDigits() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Phone.PHONE.ID;
    }

    @Override
    public Field<Long> field2() {
        return Phone.PHONE.PERSON_ID;
    }

    @Override
    public Field<Integer> field3() {
        return Phone.PHONE.PRIORITY;
    }

    @Override
    public Field<String> field4() {
        return Phone.PHONE.DIGITS;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getPersonId();
    }

    @Override
    public Integer component3() {
        return getPriority();
    }

    @Override
    public String component4() {
        return getDigits();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getPersonId();
    }

    @Override
    public Integer value3() {
        return getPriority();
    }

    @Override
    public String value4() {
        return getDigits();
    }

    @Override
    public PhoneRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PhoneRecord value2(Long value) {
        setPersonId(value);
        return this;
    }

    @Override
    public PhoneRecord value3(Integer value) {
        setPriority(value);
        return this;
    }

    @Override
    public PhoneRecord value4(String value) {
        setDigits(value);
        return this;
    }

    @Override
    public PhoneRecord values(Long value1, Long value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PhoneRecord
     */
    public PhoneRecord() {
        super(Phone.PHONE);
    }

    /**
     * Create a detached, initialised PhoneRecord
     */
    public PhoneRecord(Long id, Long personId, Integer priority, String digits) {
        super(Phone.PHONE);

        set(0, id);
        set(1, personId);
        set(2, priority);
        set(3, digits);
    }
}