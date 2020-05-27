#!/usr/bin/env groovy


def call(String name = 'human', String TFC_TOKEN) {
  echo "Hello, ${name}."
  echo "Hello, test123."
  echo "TFC_TOKEN, ${TFC_TOKEN}"

  def get = new URL("https://app.terraform.io/api/v2/organizations/fanniemae_pov/workspaces/workspace-1").openConnection();
  get.setRequestProperty("Content-Type", "application/vnd.api+json")
  get.setRequestProperty("Authorization", "Bearer ${TFC_TOKEN}")

  def getRC = get.getResponseCode();
  println(getRC);
  if(getRC.equals(200)) {
    println(get.getInputStream().getText());
  }


}