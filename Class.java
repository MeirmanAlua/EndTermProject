package kz.aitu.oop.assignment;

public class Class {
    <?xml version = "1.0" encoding = "utf-8" ?>
<persistence xmlns = "http://java.sun.com/xml/ns/persistence"
        xmlns:
        xsi = "http://www.w3.org/2001/XMLSchema-instance"
        xsi:
        schemaLocation = "http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
        version = "2.0" >
<persistence - unit name = "atm" transaction - type = "RESOURCE_LOCAL" >
<provider > org.hibernate.ogm.jpa.HibernateOgmPersistence </provider >
<class>entity.Account</class>
<properties >
<property name = "hibernate.ogm.datastore.provider" value = "mongodb" / >
<property name = "hibernate.ogm.datastore.database" value = "ATM" / >
<property name = "hibernate.ogm.datastore.host" value = "localhost" / >
<property name = "hibernate.ogm.datastore.create_database" value = "true" / >
</properties >
</persistence - unit >
</persistence >
        }
        }