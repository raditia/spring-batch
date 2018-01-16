package com.blibli.springbatch.processor;

import com.blibli.springbatch.model.Person;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static  final org.slf4j.Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    public Person process(final Person person) throws Exception {
        Person transformedPerson = new Person();
        transformedPerson.setId(person.getId());
        transformedPerson.setFirstName(person.getFirstName());
        transformedPerson.setLastName(person.getLastName());
        transformedPerson.setEmail(person.getEmail());
        transformedPerson.setGender(person.getGender());
        transformedPerson.setAddress(person.getAddress());

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }
}
