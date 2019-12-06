package types.sample

import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.jooq.sample.Routines
import org.postgresql.ds.PGSimpleDataSource

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {

    val datasource = PGSimpleDataSource().apply {
        serverName = "localhost"
        portNumber = 5432
        "jooq_sample".let {
            databaseName = it
            user = it
            password = it
        }
    }
    println("Data source $datasource")

    val connection = datasource.connection

    val context = DSL.using(connection, SQLDialect.POSTGRES)

    println("Context $context")

    val results = context.run {
        Routines.allPersons(this.configuration())
    }

    println(results)


    results.forEach {
        val person =  it.person
        val addresses = it.addresses
        val phones = it.phones

        println(
            """
                Found person $person:
                with addresses in city ${addresses.map{ it.city } }
                and phone is ${phones.map { it.digits }  }
            """.trimIndent()
        )
    }




    println(App().greeting)
}
