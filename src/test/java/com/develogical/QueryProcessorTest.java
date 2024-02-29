package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void knowsAboutShakespeare() throws Exception {
    assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
  }

  @Test
  public void knowsName() throws Exception {
    assertThat(queryProcessor.process("What is your name?"), containsString("Sam"));
  }

  @Test
  public void knowsPlus() throws Exception {
    assertThat(queryProcessor.process("What is 86 plus 12?"), containsString("98"));
  }

  @Test
  public void knowsLargest() throws Exception {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 80, 86, 91?"), containsString("91"));
  }

  @Test
  public void knowsMultiply() throws Exception {
    assertThat(queryProcessor.process("What is 11 multiplied by 20?"), containsString("220"));
  }


}
