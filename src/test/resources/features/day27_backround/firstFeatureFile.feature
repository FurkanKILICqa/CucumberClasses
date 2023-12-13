@US001
Feature: US001 Amazon Home Page Test(Her test feature altında kullanılır)

  Scenario: TC01 Arama kutusunda iphone aratılır

  (Given When And vb. isimleri naming convention açısından önemlidir yoksa isimlerin ne olduğunun bir önemi yoktur)

    Given kullanici amazon sayfasına gider
    When arama kutusunda iphone aratir
    And sayfayi kapatir

    Scenario: TC02 Arama kutusunda samsung aratilir

      Given kullanici amazon sayfasına gider
      When arama kutusunda samsung aratir
      And sayfayi kapatir