package com.example.cesutudy.validation;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.Configurable;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Properties;
import java.util.function.Function;
import java.util.stream.Stream;

public class MyGenerator implements IdentifierGenerator, Configurable {
    private String prefix;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
        String query = String.format("select %s from %s",
                session.getEntityPersister(obj.getClass().getName(), obj)
                        .getIdentifierPropertyName(),
                obj.getClass().getSimpleName());
        Stream ids = session.createQuery(query).stream();
        Long max = ids.map((Function<String, String>) o -> o.replace(prefix + "-", ""))
                .map(Object::toString)
                .mapToLong(num -> Long.parseLong((String) num)).max().orElse(0L);
        return prefix + "-" + (max + 1);
    }

    @Override
    public void configure(Type type, Properties properties,
                          ServiceRegistry serviceRegistry) throws MappingException {
        prefix = properties.getProperty("prefix");
    }
}
