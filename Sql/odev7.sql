################### SORULAR ######################

1-) film tablosunda bulunan filmleri rating deðerlerine göre gruplayýnýz.
2-) film tablosunda bulunan filmleri replacement_cost sütununa göre grupladýðýmýzda film sayýsý 50 den fazla olan replacement_cost deðerini ve karþýlýk gelen film sayýsýný sýralayýnýz.
3-) customer tablosunda bulunan store_id deðerlerine karþýlýk gelen müþteri sayýlarýný nelerdir? 
4-) city tablosunda bulunan þehir verilerini country_id sütununa göre gruplandýrdýktan sonra en fazla þehir sayýsý barýndýran country_id bilgisini ve þehir sayýsýný paylaþýnýz.

################### ÇÖZÜMLER ######################

1-) SELECT rating FROM film GROUP BY rating
2-) SELECT replacement_cost, COUNT(DISTINCT title) FROM film GROUP BY replacement_cost HAVING COUNT(DISTINCT title) > 50
3-) SELECT store_id, COUNT(*) FROM customer GROUP BY store_id
4-) SELECT country_id, COUNT(*) FROM city GROUP BY country_id ORDER BY COUNT(*) DESC LIMIT 1
