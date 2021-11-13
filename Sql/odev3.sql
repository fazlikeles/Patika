####################### SORULAR ######################
1-) country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile baþlayýp 'a' karakteri ile sonlananlarý sýralayýnýz.
2-) country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluþan ve sonu 'n' karakteri ile sonlananlarý sýralayýnýz.
3-) film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin 'T' karakteri içeren film isimlerini sýralayýnýz.
4-) film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile baþlayan ve uzunluðu (length) 90 dan büyük olan ve rental_rate 2.99 olan verileri sýralayýnýz.

####################### ÇÖZÜMLER ######################

1-) SELECT country FROM country WHERE country LIKE 'A%a'

2-) SELECT country FROM country WHERE country LIKE '_____%n'

3-) SELECT title FROM film WHERE title ILKE '%T%T%T%T%'

4-) SELECT  * FROM film WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99