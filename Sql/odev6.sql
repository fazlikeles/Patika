################### SORULAR ###################

1-) film tablosunda bulunan rental_rate s�tunundaki de�erlerin ortalamas� nedir?
2-) film tablosunda bulunan filmlerden ka� tanesi 'C' karakteri ile ba�lar?
3-) film tablosunda bulunan filmlerden rental_rate de�eri 0.99 a e�it olan en uzun (length) film ka� dakikad�r?
4-) film tablosunda bulunan filmlerin uzunlu�u 150 dakikadan b�y�k olanlar�na ait ka� farkl� replacement_cost de�eri vard�r?

################### ��Z�MLER ###################

1-) SELECT AVG (rental_rate) FROM film
2-) SELECT COUNT(*) FROM FILM WHERE title LIKE 'C%'
3-) SELECT MAX(length) FROM film WHERE rental_rate = 0.99
4-) SELECT COUNT(DISTINCT replacement_cost) FROM FILM WHERE length > 150 
