#!/usr/bin/env groovy


def call(String name = 'human') {
  echo "Hello, ${name}."
  echo "Hello, test123."
  def get = new URL("https://httpbin.org/get").openConnection();
  def getRC = get.getResponseCode();
  println(getRC);
  if(getRC.equals(200)) {
    println(get.getInputStream().getText());
  }


}