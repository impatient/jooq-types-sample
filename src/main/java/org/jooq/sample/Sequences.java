/*
 * This file is generated by jOOQ.
 */
package org.jooq.sample;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in jooq_sample
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>jooq_sample.shared_sequence</code>
     */
    public static final Sequence<Long> SHARED_SEQUENCE = new SequenceImpl<Long>("shared_sequence", JooqSample.JOOQ_SAMPLE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
