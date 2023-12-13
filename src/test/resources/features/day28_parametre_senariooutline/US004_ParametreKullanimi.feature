@US004
Feature: US004 Amazon Testi
  Background: Amazon sayfasina gidilir
    Given kullanici "https://amazon.com" amazon sayfasına gider

  Scenario: TC01 Arama Kutusunda nokia aratilir
    And arama kutusunda "nokia" aratir
    And sayfayi kapatir


  Scenario: TC01 Arama Kutusunda nokia aratilir
    And arama kutusunda "java" aratir
    And sayfayi kapatir



  Scenario: TC01 Arama Kutusunda nokia aratilir
    And arama kutusunda "selenium" aratir
    And sayfayi kapatir