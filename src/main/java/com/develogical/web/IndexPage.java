package com.develogical.web;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {

  @Override
  protected void writeContentTo(PrintWriter writer) {
    writer.println(
        "<h1>Welcome to app-training-128!</h1>"
            + "<p>Please enter your term in the box below: "
            + "<form><input type=\"text\" name=\"q\" />"
            + "<input type=\"submit\">"
            + "</form>"
            + "</p>");
  }
}
