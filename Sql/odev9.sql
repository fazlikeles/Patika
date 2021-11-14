################### SORULAR ########################

1-)city tablosu ile country tablosunda bulunan þehir (city) ve ülke (country) isimlerini birlikte görebileceðimiz INNER JOIN sorgusunu yazýnýz.
2-)customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceðimiz INNER JOIN sorgusunu yazýnýz.
3-)customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceðimiz INNER JOIN sorgusunu yazýnýz.

################### ÇÖZÜMLER ########################

1-)
SELECT city.city, country.country FROM city 
INNER JOIN country ON country.country_id = city.country_id


2-)
SELECT customer.first_name, customer.last_name FROM payment INNER JOIN customer
ON payment.customer_id = customer.customer_id


3-)
SELECT rental.rental_id, customer.first_name, customer.last_name FROM rental INNER JOIN customer
ON customer.customer_id = rental.customer_id