/*
 * This file is generated by jOOQ.
 */
package org.jooq.sample;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Result;
import org.jooq.sample.tables.Address;
import org.jooq.sample.tables.AllPersons;
import org.jooq.sample.tables.FlywaySchemaHistory;
import org.jooq.sample.tables.Person;
import org.jooq.sample.tables.Phone;
import org.jooq.sample.tables.records.AllPersonsRecord;


/**
 * Convenience access to all tables in jooq_sample
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>jooq_sample.address</code>.
     */
    public static final Address ADDRESS = Address.ADDRESS;

    /**
     * The table <code>jooq_sample.all_persons</code>.
     */
    public static final AllPersons ALL_PERSONS = AllPersons.ALL_PERSONS;

    /**
     * Call <code>jooq_sample.all_persons</code>.
     */
    public static Result<AllPersonsRecord> ALL_PERSONS(Configuration configuration) {
        return configuration.dsl().selectFrom(org.jooq.sample.tables.AllPersons.ALL_PERSONS.call()).fetch();
    }

    /**
     * Get <code>jooq_sample.all_persons</code> as a table.
     */
    public static AllPersons ALL_PERSONS() {
        return org.jooq.sample.tables.AllPersons.ALL_PERSONS.call();
    }

    /**
     * The table <code>jooq_sample.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>jooq_sample.person</code>.
     */
    public static final Person PERSON = Person.PERSON;

    /**
     * The table <code>jooq_sample.phone</code>.
     */
    public static final Phone PHONE = Phone.PHONE;
}
