################## SORULAR ###################

1-) city tablosu ile country tablosunda bulunan þehir (city) ve ülke (country) isimlerini birlikte görebileceðimiz LEFT JOIN sorgusunu yazýnýz.
2-) customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceðimiz RIGHT JOIN sorgusunu yazýnýz.
3-) customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceðimiz FULL JOIN sorgusunu yazýnýz.

################## ÇÖZÜMLER ###################

1-)
SELECT city.city, country.country FROM city LEFT JOIN country
ON city.country_id = country.country_id

2-)
SELECT payment.payment_id, customer.first_name, customer.last_name FROM payment RIGHT JOIN customer
ON customer.customer_id = payment.customer_id

3-)
SELECT rental.rental_id, customer.first_name, customer.last_name FROM rental FULL JOIN customer
ON rental.customer_id = customer.customer_id