package com.gerson.sincronizador.arquivoReceita;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class InformacaoContaProcessor implements ItemProcessor<InformacaoConta, InformacaoConta> {

  private static final Logger log = LoggerFactory.getLogger(InformacaoContaProcessor.class);

  @Override
  public InformacaoConta process(final InformacaoConta person) throws Exception {
    /*final String firstName = person.getFirstName().toUpperCase();
    final String lastName = person.getLastName().toUpperCase();

    final Person transformedPerson = new Person(firstName, lastName);

    log.info("Converting (" + person + ") into (" + transformedPerson + ")");

    return transformedPerson;*/
	  return null;
  }

}