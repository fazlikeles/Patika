#################### SORULAR #######################
1-) film tablosunda bulunan replacement_cost s�tununda bulunan birbirinden farkl� de�erleri s�ralay�n�z.
2-) film tablosunda bulunan replacement_cost s�tununda birbirinden farkl� ka� tane veri vard�r?
3-) film tablosunda bulunan film isimlerinde (title) ka� tanesini T karakteri ile ba�lar ve ayn� zamanda rating 'G' ye e�ittir?
4-) country tablosunda bulunan �lke isimlerinden (country) ka� tanesi 5 karakterden olu�maktad�r?
5-) city tablosundaki �ehir isimlerinin ka� tanesi 'R' veya r karakteri ile biter?

#################### ��Z�MLER #######################

1-) SELECT DISTINCT replacement_cost FROM film 

2-) SELECT COUNT(DISTINCT replacement_cost) FROM film

3-) SELECT COUNT(*) FROM film WHERE title LIKE'T%' AND rating = 'G'

4-) SELECT COUNT(*) FROM country WHERE country LIKE'______'

5-) SELECT COUNT(*) FROM city WHERE city LIKE '%R' OR city LIKE '%r'