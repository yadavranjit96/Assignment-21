// Databricks notebook source
/*
Given a list of strings - List[String] (“alpha”, “gamma”, “omega”, “zeta”, “beta”)
- find count of all strings with length 4
- convert the list of string to a list of integers, where each string is mapped to its corresponding length
- find count of all strings which contain alphabet ‘m’
- find the count of all strings which start with the alphabet ‘a’
*/
// COMMAND ----------
// Create a list
val list = List("alpha", "gamma", "omega", "zeta", "beta")
// COMMAND ----------
// - find count of all strings with length 4
// Method-1
list.count(x => x.length == 4)
// COMMAND ----------
// - find count of all strings with length 4
// Method-2
list.count(_.length == 4)
// COMMAND ----------
// - convert the list of string to a list of integers, where each string is mapped to its corresponding length
list.map(s => (s.length))
// COMMAND ----------
// - convert the list of string to a list of integers, where each string is mapped to its corresponding length
// List is having mapping of each string with the corresponding length
list.map(s => (s, s.length))
// COMMAND ----------
// - find count of all strings which contain alphabet ‘m’
list.map(s => s.count(_ == 'm')).count(s => s != 0)
// COMMAND ----------
// - find the count of all strings which start with the alphabet ‘a’
list.map(s => s(0) == 'a').count(s => s == true)
// COMMAND ----------