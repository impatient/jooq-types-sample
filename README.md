##Sample of Jooq with user defined types

Attended the 2Q PG Conf.  One of the presenters, Hettie Dombrovskaya talked about her solution to O-R
 impedance, which involved a layer inside of Postgres that generated/aggregated/returned custom types.  Presently
  they return the results in JSON and the application server could largely be unaware they are talking to the database.
 
This is an exploration in using UDT's in Jooq to possibly lighten any serialization/deserialization done in PG to
 convert to/from JSON.  

Hettie refers to this as NoRM. https://hdombrovskaya.wordpress.com/2019/10/14/introducing-new-term/

Largely this is another way to encapsulate data that does not include views and doesn't require the often messy
 queries of ORMs.  Since JOOQ is tightly coupled to the database and not strictly an ORM, it seemed compatible to the
  requirements without introducing the JSON overhead.  It also gives type safety, but is not a tolerant reader.
  
This is just a main that pulls some UDTs from a function and presents them. It aggregates a person, their addresses
 and phones into one response.
 
Assuming you have docker-compose and a JDK, to run it:

  `./gradlew migrate && ./gradlew run`

To reset the DB:

  `./gradlew reset`
  

  